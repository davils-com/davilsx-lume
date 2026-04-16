#!/usr/bin/env bash
set -Eeuo pipefail

usage() {
  cat <<USAGE
Usage:
  $(basename "$0") ICONS_DIR EXPORT_DIR

Arguments:
  ICONS_DIR   Verzeichnis mit allen SVG-Dateien (rekursiv)
  EXPORT_DIR  Zielverzeichnis für Android-VectorDrawable-XMLs

Example:
  $(basename "$0") ./icons ./app/src/main/res/drawable
USAGE
}

if [[ ${1:-} == "-h" || ${1:-} == "--help" || $# -lt 2 ]]; then
  usage
  exit 0
fi

ICONS_DIR="$(realpath "$1")"
EXPORT_DIR="$(realpath -m "$2")"

if [[ ! -d "$ICONS_DIR" ]]; then
  echo "Input directory does not exist: $ICONS_DIR" >&2
  exit 1
fi

for cmd in node npm npx find sed tr realpath; do
  if ! command -v "$cmd" >/dev/null 2>&1; then
    echo "Required command is missing: $cmd" >&2
    exit 1
  fi
done

mkdir -p "$EXPORT_DIR"

echo "Converting SVGs in: $ICONS_DIR"
echo "Output directory:   $EXPORT_DIR"
echo

if npx --yes svg2vd -d "$ICONS_DIR" -o "$EXPORT_DIR" 2>&1; then
  echo
  echo "Conversion done."
else
  echo
  echo "svg2vd exited with errors (see above)." >&2
  exit 1
fi

echo "Renaming XML files to Android-compatible names..."

sanitize_android_name() {
  local name="$1"
  name="$(printf '%s' "$name" \
    | tr '[:upper:]' '[:lower:]' \
    | sed -E 's/[^a-z0-9_]+/_/g; s/_+/_/g; s/^_+|_+$//g')"
  if [[ -z "$name" ]]; then name="vector"; fi
  if [[ "$name" =~ ^[0-9] ]]; then name="_$name"; fi
  printf '%s' "$name"
}

count_renamed=0
count_collision=0

while IFS= read -r -d '' xml; do
  base_file="${xml##*/}"
  base_no_ext="${base_file%.xml}"
  safe_name="$(sanitize_android_name "$base_no_ext")"

  if [[ "$base_no_ext" == "$safe_name" ]]; then
    continue
  fi

  target="$EXPORT_DIR/${safe_name}.xml"

  if [[ -e "$target" ]]; then
    i=1
    candidate="${safe_name}_${i}"
    while [[ -e "$EXPORT_DIR/${candidate}.xml" ]]; do
      ((i++))
      candidate="${safe_name}_${i}"
    done
    target="$EXPORT_DIR/${candidate}.xml"
    ((count_collision+=1))
    echo "COLLISION: $base_file -> ${candidate}.xml"
  fi

  mv "$xml" "$target"
  ((count_renamed+=1))
done < <(find "$EXPORT_DIR" -maxdepth 1 -type f -name '*.xml' -print0)

echo
echo "Renamed: $count_renamed, Collisions resolved: $count_collision"
echo "Done."
