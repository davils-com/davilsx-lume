// Copyright 2026 Davils
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.davils.lume.icons.lucide

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import com.davils.lume.icons.lucide.resources.LumeLucideResources
import com.davils.lume.icons.lucide.resources.`file`
import com.davils.lume.icons.lucide.resources.`import`
import com.davils.lume.icons.lucide.resources.`package`
import com.davils.lume.icons.lucide.resources.a_arrow_down
import com.davils.lume.icons.lucide.resources.a_arrow_up
import com.davils.lume.icons.lucide.resources.a_large_small
import com.davils.lume.icons.lucide.resources.accessibility
import com.davils.lume.icons.lucide.resources.activity
import com.davils.lume.icons.lucide.resources.air_vent
import com.davils.lume.icons.lucide.resources.airplay
import com.davils.lume.icons.lucide.resources.alarm_clock
import com.davils.lume.icons.lucide.resources.alarm_clock_check
import com.davils.lume.icons.lucide.resources.alarm_clock_minus
import com.davils.lume.icons.lucide.resources.alarm_clock_off
import com.davils.lume.icons.lucide.resources.alarm_clock_plus
import com.davils.lume.icons.lucide.resources.alarm_smoke
import com.davils.lume.icons.lucide.resources.album
import com.davils.lume.icons.lucide.resources.align_center_horizontal
import com.davils.lume.icons.lucide.resources.align_center_vertical
import com.davils.lume.icons.lucide.resources.align_end_horizontal
import com.davils.lume.icons.lucide.resources.align_end_vertical
import com.davils.lume.icons.lucide.resources.align_horizontal_distribute_center
import com.davils.lume.icons.lucide.resources.align_horizontal_distribute_end
import com.davils.lume.icons.lucide.resources.align_horizontal_distribute_start
import com.davils.lume.icons.lucide.resources.align_horizontal_justify_center
import com.davils.lume.icons.lucide.resources.align_horizontal_justify_end
import com.davils.lume.icons.lucide.resources.align_horizontal_justify_start
import com.davils.lume.icons.lucide.resources.align_horizontal_space_around
import com.davils.lume.icons.lucide.resources.align_horizontal_space_between
import com.davils.lume.icons.lucide.resources.align_start_horizontal
import com.davils.lume.icons.lucide.resources.align_start_vertical
import com.davils.lume.icons.lucide.resources.align_vertical_distribute_center
import com.davils.lume.icons.lucide.resources.align_vertical_distribute_end
import com.davils.lume.icons.lucide.resources.align_vertical_distribute_start
import com.davils.lume.icons.lucide.resources.align_vertical_justify_center
import com.davils.lume.icons.lucide.resources.align_vertical_justify_end
import com.davils.lume.icons.lucide.resources.align_vertical_justify_start
import com.davils.lume.icons.lucide.resources.align_vertical_space_around
import com.davils.lume.icons.lucide.resources.align_vertical_space_between
import com.davils.lume.icons.lucide.resources.ambulance
import com.davils.lume.icons.lucide.resources.ampersand
import com.davils.lume.icons.lucide.resources.ampersands
import com.davils.lume.icons.lucide.resources.amphora
import com.davils.lume.icons.lucide.resources.anchor
import com.davils.lume.icons.lucide.resources.angry
import com.davils.lume.icons.lucide.resources.annoyed
import com.davils.lume.icons.lucide.resources.antenna
import com.davils.lume.icons.lucide.resources.anvil
import com.davils.lume.icons.lucide.resources.aperture
import com.davils.lume.icons.lucide.resources.app_window
import com.davils.lume.icons.lucide.resources.app_window_mac
import com.davils.lume.icons.lucide.resources.apple
import com.davils.lume.icons.lucide.resources.archive
import com.davils.lume.icons.lucide.resources.archive_restore
import com.davils.lume.icons.lucide.resources.archive_x
import com.davils.lume.icons.lucide.resources.armchair
import com.davils.lume.icons.lucide.resources.arrow_big_down
import com.davils.lume.icons.lucide.resources.arrow_big_down_dash
import com.davils.lume.icons.lucide.resources.arrow_big_left
import com.davils.lume.icons.lucide.resources.arrow_big_left_dash
import com.davils.lume.icons.lucide.resources.arrow_big_right
import com.davils.lume.icons.lucide.resources.arrow_big_right_dash
import com.davils.lume.icons.lucide.resources.arrow_big_up
import com.davils.lume.icons.lucide.resources.arrow_big_up_dash
import com.davils.lume.icons.lucide.resources.arrow_down
import com.davils.lume.icons.lucide.resources.arrow_down_0_1
import com.davils.lume.icons.lucide.resources.arrow_down_1_0
import com.davils.lume.icons.lucide.resources.arrow_down_a_z
import com.davils.lume.icons.lucide.resources.arrow_down_from_line
import com.davils.lume.icons.lucide.resources.arrow_down_left
import com.davils.lume.icons.lucide.resources.arrow_down_narrow_wide
import com.davils.lume.icons.lucide.resources.arrow_down_right
import com.davils.lume.icons.lucide.resources.arrow_down_to_dot
import com.davils.lume.icons.lucide.resources.arrow_down_to_line
import com.davils.lume.icons.lucide.resources.arrow_down_up
import com.davils.lume.icons.lucide.resources.arrow_down_wide_narrow
import com.davils.lume.icons.lucide.resources.arrow_down_z_a
import com.davils.lume.icons.lucide.resources.arrow_left
import com.davils.lume.icons.lucide.resources.arrow_left_from_line
import com.davils.lume.icons.lucide.resources.arrow_left_right
import com.davils.lume.icons.lucide.resources.arrow_left_to_line
import com.davils.lume.icons.lucide.resources.arrow_right
import com.davils.lume.icons.lucide.resources.arrow_right_from_line
import com.davils.lume.icons.lucide.resources.arrow_right_left
import com.davils.lume.icons.lucide.resources.arrow_right_to_line
import com.davils.lume.icons.lucide.resources.arrow_up
import com.davils.lume.icons.lucide.resources.arrow_up_0_1
import com.davils.lume.icons.lucide.resources.arrow_up_1_0
import com.davils.lume.icons.lucide.resources.arrow_up_a_z
import com.davils.lume.icons.lucide.resources.arrow_up_down
import com.davils.lume.icons.lucide.resources.arrow_up_from_dot
import com.davils.lume.icons.lucide.resources.arrow_up_from_line
import com.davils.lume.icons.lucide.resources.arrow_up_left
import com.davils.lume.icons.lucide.resources.arrow_up_narrow_wide
import com.davils.lume.icons.lucide.resources.arrow_up_right
import com.davils.lume.icons.lucide.resources.arrow_up_to_line
import com.davils.lume.icons.lucide.resources.arrow_up_wide_narrow
import com.davils.lume.icons.lucide.resources.arrow_up_z_a
import com.davils.lume.icons.lucide.resources.arrows_up_from_line
import com.davils.lume.icons.lucide.resources.asterisk
import com.davils.lume.icons.lucide.resources.at_sign
import com.davils.lume.icons.lucide.resources.atom
import com.davils.lume.icons.lucide.resources.audio_lines
import com.davils.lume.icons.lucide.resources.audio_waveform
import com.davils.lume.icons.lucide.resources.award
import com.davils.lume.icons.lucide.resources.axe
import com.davils.lume.icons.lucide.resources.axis_3d
import com.davils.lume.icons.lucide.resources.baby
import com.davils.lume.icons.lucide.resources.backpack
import com.davils.lume.icons.lucide.resources.badge
import com.davils.lume.icons.lucide.resources.badge_alert
import com.davils.lume.icons.lucide.resources.badge_cent
import com.davils.lume.icons.lucide.resources.badge_check
import com.davils.lume.icons.lucide.resources.badge_dollar_sign
import com.davils.lume.icons.lucide.resources.badge_euro
import com.davils.lume.icons.lucide.resources.badge_indian_rupee
import com.davils.lume.icons.lucide.resources.badge_info
import com.davils.lume.icons.lucide.resources.badge_japanese_yen
import com.davils.lume.icons.lucide.resources.badge_minus
import com.davils.lume.icons.lucide.resources.badge_percent
import com.davils.lume.icons.lucide.resources.badge_plus
import com.davils.lume.icons.lucide.resources.badge_pound_sterling
import com.davils.lume.icons.lucide.resources.badge_question_mark
import com.davils.lume.icons.lucide.resources.badge_russian_ruble
import com.davils.lume.icons.lucide.resources.badge_swiss_franc
import com.davils.lume.icons.lucide.resources.badge_turkish_lira
import com.davils.lume.icons.lucide.resources.badge_x
import com.davils.lume.icons.lucide.resources.baggage_claim
import com.davils.lume.icons.lucide.resources.balloon
import com.davils.lume.icons.lucide.resources.ban
import com.davils.lume.icons.lucide.resources.banana
import com.davils.lume.icons.lucide.resources.bandage
import com.davils.lume.icons.lucide.resources.banknote
import com.davils.lume.icons.lucide.resources.banknote_arrow_down
import com.davils.lume.icons.lucide.resources.banknote_arrow_up
import com.davils.lume.icons.lucide.resources.banknote_x
import com.davils.lume.icons.lucide.resources.barcode
import com.davils.lume.icons.lucide.resources.barrel
import com.davils.lume.icons.lucide.resources.baseline
import com.davils.lume.icons.lucide.resources.bath
import com.davils.lume.icons.lucide.resources.battery
import com.davils.lume.icons.lucide.resources.battery_charging
import com.davils.lume.icons.lucide.resources.battery_full
import com.davils.lume.icons.lucide.resources.battery_low
import com.davils.lume.icons.lucide.resources.battery_medium
import com.davils.lume.icons.lucide.resources.battery_plus
import com.davils.lume.icons.lucide.resources.battery_warning
import com.davils.lume.icons.lucide.resources.beaker
import com.davils.lume.icons.lucide.resources.bean
import com.davils.lume.icons.lucide.resources.bean_off
import com.davils.lume.icons.lucide.resources.bed
import com.davils.lume.icons.lucide.resources.bed_double
import com.davils.lume.icons.lucide.resources.bed_single
import com.davils.lume.icons.lucide.resources.beef
import com.davils.lume.icons.lucide.resources.beef_off
import com.davils.lume.icons.lucide.resources.beer
import com.davils.lume.icons.lucide.resources.beer_off
import com.davils.lume.icons.lucide.resources.bell
import com.davils.lume.icons.lucide.resources.bell_dot
import com.davils.lume.icons.lucide.resources.bell_electric
import com.davils.lume.icons.lucide.resources.bell_minus
import com.davils.lume.icons.lucide.resources.bell_off
import com.davils.lume.icons.lucide.resources.bell_plus
import com.davils.lume.icons.lucide.resources.bell_ring
import com.davils.lume.icons.lucide.resources.between_horizontal_end
import com.davils.lume.icons.lucide.resources.between_horizontal_start
import com.davils.lume.icons.lucide.resources.between_vertical_end
import com.davils.lume.icons.lucide.resources.between_vertical_start
import com.davils.lume.icons.lucide.resources.biceps_flexed
import com.davils.lume.icons.lucide.resources.bike
import com.davils.lume.icons.lucide.resources.binary
import com.davils.lume.icons.lucide.resources.binoculars
import com.davils.lume.icons.lucide.resources.biohazard
import com.davils.lume.icons.lucide.resources.bird
import com.davils.lume.icons.lucide.resources.birdhouse
import com.davils.lume.icons.lucide.resources.bitcoin
import com.davils.lume.icons.lucide.resources.blend
import com.davils.lume.icons.lucide.resources.blinds
import com.davils.lume.icons.lucide.resources.blocks
import com.davils.lume.icons.lucide.resources.bluetooth
import com.davils.lume.icons.lucide.resources.bluetooth_connected
import com.davils.lume.icons.lucide.resources.bluetooth_off
import com.davils.lume.icons.lucide.resources.bluetooth_searching
import com.davils.lume.icons.lucide.resources.bold
import com.davils.lume.icons.lucide.resources.bolt
import com.davils.lume.icons.lucide.resources.bomb
import com.davils.lume.icons.lucide.resources.bone
import com.davils.lume.icons.lucide.resources.book
import com.davils.lume.icons.lucide.resources.book_a
import com.davils.lume.icons.lucide.resources.book_alert
import com.davils.lume.icons.lucide.resources.book_audio
import com.davils.lume.icons.lucide.resources.book_check
import com.davils.lume.icons.lucide.resources.book_copy
import com.davils.lume.icons.lucide.resources.book_dashed
import com.davils.lume.icons.lucide.resources.book_down
import com.davils.lume.icons.lucide.resources.book_headphones
import com.davils.lume.icons.lucide.resources.book_heart
import com.davils.lume.icons.lucide.resources.book_image
import com.davils.lume.icons.lucide.resources.book_key
import com.davils.lume.icons.lucide.resources.book_lock
import com.davils.lume.icons.lucide.resources.book_marked
import com.davils.lume.icons.lucide.resources.book_minus
import com.davils.lume.icons.lucide.resources.book_open
import com.davils.lume.icons.lucide.resources.book_open_check
import com.davils.lume.icons.lucide.resources.book_open_text
import com.davils.lume.icons.lucide.resources.book_plus
import com.davils.lume.icons.lucide.resources.book_search
import com.davils.lume.icons.lucide.resources.book_text
import com.davils.lume.icons.lucide.resources.book_type
import com.davils.lume.icons.lucide.resources.book_up
import com.davils.lume.icons.lucide.resources.book_up_2
import com.davils.lume.icons.lucide.resources.book_user
import com.davils.lume.icons.lucide.resources.book_x
import com.davils.lume.icons.lucide.resources.bookmark
import com.davils.lume.icons.lucide.resources.bookmark_check
import com.davils.lume.icons.lucide.resources.bookmark_minus
import com.davils.lume.icons.lucide.resources.bookmark_off
import com.davils.lume.icons.lucide.resources.bookmark_plus
import com.davils.lume.icons.lucide.resources.bookmark_x
import com.davils.lume.icons.lucide.resources.boom_box
import com.davils.lume.icons.lucide.resources.bot
import com.davils.lume.icons.lucide.resources.bot_message_square
import com.davils.lume.icons.lucide.resources.bot_off
import com.davils.lume.icons.lucide.resources.bottle_wine
import com.davils.lume.icons.lucide.resources.bow_arrow
import com.davils.lume.icons.lucide.resources.box
import com.davils.lume.icons.lucide.resources.boxes
import com.davils.lume.icons.lucide.resources.braces
import com.davils.lume.icons.lucide.resources.brackets
import com.davils.lume.icons.lucide.resources.brain
import com.davils.lume.icons.lucide.resources.brain_circuit
import com.davils.lume.icons.lucide.resources.brain_cog
import com.davils.lume.icons.lucide.resources.brick_wall
import com.davils.lume.icons.lucide.resources.brick_wall_fire
import com.davils.lume.icons.lucide.resources.brick_wall_shield
import com.davils.lume.icons.lucide.resources.briefcase
import com.davils.lume.icons.lucide.resources.briefcase_business
import com.davils.lume.icons.lucide.resources.briefcase_conveyor_belt
import com.davils.lume.icons.lucide.resources.briefcase_medical
import com.davils.lume.icons.lucide.resources.bring_to_front
import com.davils.lume.icons.lucide.resources.brush
import com.davils.lume.icons.lucide.resources.brush_cleaning
import com.davils.lume.icons.lucide.resources.bubbles
import com.davils.lume.icons.lucide.resources.bug
import com.davils.lume.icons.lucide.resources.bug_off
import com.davils.lume.icons.lucide.resources.bug_play
import com.davils.lume.icons.lucide.resources.building
import com.davils.lume.icons.lucide.resources.building_2
import com.davils.lume.icons.lucide.resources.bus
import com.davils.lume.icons.lucide.resources.bus_front
import com.davils.lume.icons.lucide.resources.cable
import com.davils.lume.icons.lucide.resources.cable_car
import com.davils.lume.icons.lucide.resources.cake
import com.davils.lume.icons.lucide.resources.cake_slice
import com.davils.lume.icons.lucide.resources.calculator
import com.davils.lume.icons.lucide.resources.calendar
import com.davils.lume.icons.lucide.resources.calendar_1
import com.davils.lume.icons.lucide.resources.calendar_arrow_down
import com.davils.lume.icons.lucide.resources.calendar_arrow_up
import com.davils.lume.icons.lucide.resources.calendar_check
import com.davils.lume.icons.lucide.resources.calendar_check_2
import com.davils.lume.icons.lucide.resources.calendar_clock
import com.davils.lume.icons.lucide.resources.calendar_cog
import com.davils.lume.icons.lucide.resources.calendar_days
import com.davils.lume.icons.lucide.resources.calendar_fold
import com.davils.lume.icons.lucide.resources.calendar_heart
import com.davils.lume.icons.lucide.resources.calendar_minus
import com.davils.lume.icons.lucide.resources.calendar_minus_2
import com.davils.lume.icons.lucide.resources.calendar_off
import com.davils.lume.icons.lucide.resources.calendar_plus
import com.davils.lume.icons.lucide.resources.calendar_plus_2
import com.davils.lume.icons.lucide.resources.calendar_range
import com.davils.lume.icons.lucide.resources.calendar_search
import com.davils.lume.icons.lucide.resources.calendar_sync
import com.davils.lume.icons.lucide.resources.calendar_x
import com.davils.lume.icons.lucide.resources.calendar_x_2
import com.davils.lume.icons.lucide.resources.calendars
import com.davils.lume.icons.lucide.resources.camera
import com.davils.lume.icons.lucide.resources.camera_off
import com.davils.lume.icons.lucide.resources.candy
import com.davils.lume.icons.lucide.resources.candy_cane
import com.davils.lume.icons.lucide.resources.candy_off
import com.davils.lume.icons.lucide.resources.cannabis
import com.davils.lume.icons.lucide.resources.cannabis_off
import com.davils.lume.icons.lucide.resources.captions
import com.davils.lume.icons.lucide.resources.captions_off
import com.davils.lume.icons.lucide.resources.car
import com.davils.lume.icons.lucide.resources.car_front
import com.davils.lume.icons.lucide.resources.car_taxi_front
import com.davils.lume.icons.lucide.resources.caravan
import com.davils.lume.icons.lucide.resources.card_sim
import com.davils.lume.icons.lucide.resources.carrot
import com.davils.lume.icons.lucide.resources.case_lower
import com.davils.lume.icons.lucide.resources.case_sensitive
import com.davils.lume.icons.lucide.resources.case_upper
import com.davils.lume.icons.lucide.resources.cassette_tape
import com.davils.lume.icons.lucide.resources.cast
import com.davils.lume.icons.lucide.resources.castle
import com.davils.lume.icons.lucide.resources.cat
import com.davils.lume.icons.lucide.resources.cctv
import com.davils.lume.icons.lucide.resources.cctv_off
import com.davils.lume.icons.lucide.resources.chart_area
import com.davils.lume.icons.lucide.resources.chart_bar
import com.davils.lume.icons.lucide.resources.chart_bar_big
import com.davils.lume.icons.lucide.resources.chart_bar_decreasing
import com.davils.lume.icons.lucide.resources.chart_bar_increasing
import com.davils.lume.icons.lucide.resources.chart_bar_stacked
import com.davils.lume.icons.lucide.resources.chart_candlestick
import com.davils.lume.icons.lucide.resources.chart_column
import com.davils.lume.icons.lucide.resources.chart_column_big
import com.davils.lume.icons.lucide.resources.chart_column_decreasing
import com.davils.lume.icons.lucide.resources.chart_column_increasing
import com.davils.lume.icons.lucide.resources.chart_column_stacked
import com.davils.lume.icons.lucide.resources.chart_gantt
import com.davils.lume.icons.lucide.resources.chart_line
import com.davils.lume.icons.lucide.resources.chart_network
import com.davils.lume.icons.lucide.resources.chart_no_axes_column
import com.davils.lume.icons.lucide.resources.chart_no_axes_column_decreasing
import com.davils.lume.icons.lucide.resources.chart_no_axes_column_increasing
import com.davils.lume.icons.lucide.resources.chart_no_axes_combined
import com.davils.lume.icons.lucide.resources.chart_no_axes_gantt
import com.davils.lume.icons.lucide.resources.chart_pie
import com.davils.lume.icons.lucide.resources.chart_scatter
import com.davils.lume.icons.lucide.resources.chart_spline
import com.davils.lume.icons.lucide.resources.check
import com.davils.lume.icons.lucide.resources.check_check
import com.davils.lume.icons.lucide.resources.check_line
import com.davils.lume.icons.lucide.resources.chef_hat
import com.davils.lume.icons.lucide.resources.cherry
import com.davils.lume.icons.lucide.resources.chess_bishop
import com.davils.lume.icons.lucide.resources.chess_king
import com.davils.lume.icons.lucide.resources.chess_knight
import com.davils.lume.icons.lucide.resources.chess_pawn
import com.davils.lume.icons.lucide.resources.chess_queen
import com.davils.lume.icons.lucide.resources.chess_rook
import com.davils.lume.icons.lucide.resources.chevron_down
import com.davils.lume.icons.lucide.resources.chevron_first
import com.davils.lume.icons.lucide.resources.chevron_last
import com.davils.lume.icons.lucide.resources.chevron_left
import com.davils.lume.icons.lucide.resources.chevron_right
import com.davils.lume.icons.lucide.resources.chevron_up
import com.davils.lume.icons.lucide.resources.chevrons_down
import com.davils.lume.icons.lucide.resources.chevrons_down_up
import com.davils.lume.icons.lucide.resources.chevrons_left
import com.davils.lume.icons.lucide.resources.chevrons_left_right
import com.davils.lume.icons.lucide.resources.chevrons_left_right_ellipsis
import com.davils.lume.icons.lucide.resources.chevrons_right
import com.davils.lume.icons.lucide.resources.chevrons_right_left
import com.davils.lume.icons.lucide.resources.chevrons_up
import com.davils.lume.icons.lucide.resources.chevrons_up_down
import com.davils.lume.icons.lucide.resources.church
import com.davils.lume.icons.lucide.resources.cigarette
import com.davils.lume.icons.lucide.resources.cigarette_off
import com.davils.lume.icons.lucide.resources.circle
import com.davils.lume.icons.lucide.resources.circle_alert
import com.davils.lume.icons.lucide.resources.circle_arrow_down
import com.davils.lume.icons.lucide.resources.circle_arrow_left
import com.davils.lume.icons.lucide.resources.circle_arrow_out_down_left
import com.davils.lume.icons.lucide.resources.circle_arrow_out_down_right
import com.davils.lume.icons.lucide.resources.circle_arrow_out_up_left
import com.davils.lume.icons.lucide.resources.circle_arrow_out_up_right
import com.davils.lume.icons.lucide.resources.circle_arrow_right
import com.davils.lume.icons.lucide.resources.circle_arrow_up
import com.davils.lume.icons.lucide.resources.circle_check
import com.davils.lume.icons.lucide.resources.circle_check_big
import com.davils.lume.icons.lucide.resources.circle_chevron_down
import com.davils.lume.icons.lucide.resources.circle_chevron_left
import com.davils.lume.icons.lucide.resources.circle_chevron_right
import com.davils.lume.icons.lucide.resources.circle_chevron_up
import com.davils.lume.icons.lucide.resources.circle_dashed
import com.davils.lume.icons.lucide.resources.circle_divide
import com.davils.lume.icons.lucide.resources.circle_dollar_sign
import com.davils.lume.icons.lucide.resources.circle_dot
import com.davils.lume.icons.lucide.resources.circle_dot_dashed
import com.davils.lume.icons.lucide.resources.circle_ellipsis
import com.davils.lume.icons.lucide.resources.circle_equal
import com.davils.lume.icons.lucide.resources.circle_fading_arrow_up
import com.davils.lume.icons.lucide.resources.circle_fading_plus
import com.davils.lume.icons.lucide.resources.circle_gauge
import com.davils.lume.icons.lucide.resources.circle_minus
import com.davils.lume.icons.lucide.resources.circle_off
import com.davils.lume.icons.lucide.resources.circle_parking
import com.davils.lume.icons.lucide.resources.circle_parking_off
import com.davils.lume.icons.lucide.resources.circle_pause
import com.davils.lume.icons.lucide.resources.circle_percent
import com.davils.lume.icons.lucide.resources.circle_pile
import com.davils.lume.icons.lucide.resources.circle_play
import com.davils.lume.icons.lucide.resources.circle_plus
import com.davils.lume.icons.lucide.resources.circle_pound_sterling
import com.davils.lume.icons.lucide.resources.circle_power
import com.davils.lume.icons.lucide.resources.circle_question_mark
import com.davils.lume.icons.lucide.resources.circle_slash
import com.davils.lume.icons.lucide.resources.circle_slash_2
import com.davils.lume.icons.lucide.resources.circle_small
import com.davils.lume.icons.lucide.resources.circle_star
import com.davils.lume.icons.lucide.resources.circle_stop
import com.davils.lume.icons.lucide.resources.circle_user
import com.davils.lume.icons.lucide.resources.circle_user_round
import com.davils.lume.icons.lucide.resources.circle_x
import com.davils.lume.icons.lucide.resources.circuit_board
import com.davils.lume.icons.lucide.resources.citrus
import com.davils.lume.icons.lucide.resources.clapperboard
import com.davils.lume.icons.lucide.resources.clipboard
import com.davils.lume.icons.lucide.resources.clipboard_check
import com.davils.lume.icons.lucide.resources.clipboard_clock
import com.davils.lume.icons.lucide.resources.clipboard_copy
import com.davils.lume.icons.lucide.resources.clipboard_list
import com.davils.lume.icons.lucide.resources.clipboard_minus
import com.davils.lume.icons.lucide.resources.clipboard_paste
import com.davils.lume.icons.lucide.resources.clipboard_pen
import com.davils.lume.icons.lucide.resources.clipboard_pen_line
import com.davils.lume.icons.lucide.resources.clipboard_plus
import com.davils.lume.icons.lucide.resources.clipboard_type
import com.davils.lume.icons.lucide.resources.clipboard_x
import com.davils.lume.icons.lucide.resources.clock
import com.davils.lume.icons.lucide.resources.clock_1
import com.davils.lume.icons.lucide.resources.clock_10
import com.davils.lume.icons.lucide.resources.clock_11
import com.davils.lume.icons.lucide.resources.clock_12
import com.davils.lume.icons.lucide.resources.clock_2
import com.davils.lume.icons.lucide.resources.clock_3
import com.davils.lume.icons.lucide.resources.clock_4
import com.davils.lume.icons.lucide.resources.clock_5
import com.davils.lume.icons.lucide.resources.clock_6
import com.davils.lume.icons.lucide.resources.clock_7
import com.davils.lume.icons.lucide.resources.clock_8
import com.davils.lume.icons.lucide.resources.clock_9
import com.davils.lume.icons.lucide.resources.clock_alert
import com.davils.lume.icons.lucide.resources.clock_arrow_down
import com.davils.lume.icons.lucide.resources.clock_arrow_up
import com.davils.lume.icons.lucide.resources.clock_check
import com.davils.lume.icons.lucide.resources.clock_fading
import com.davils.lume.icons.lucide.resources.clock_plus
import com.davils.lume.icons.lucide.resources.closed_caption
import com.davils.lume.icons.lucide.resources.cloud
import com.davils.lume.icons.lucide.resources.cloud_alert
import com.davils.lume.icons.lucide.resources.cloud_backup
import com.davils.lume.icons.lucide.resources.cloud_check
import com.davils.lume.icons.lucide.resources.cloud_cog
import com.davils.lume.icons.lucide.resources.cloud_download
import com.davils.lume.icons.lucide.resources.cloud_drizzle
import com.davils.lume.icons.lucide.resources.cloud_fog
import com.davils.lume.icons.lucide.resources.cloud_hail
import com.davils.lume.icons.lucide.resources.cloud_lightning
import com.davils.lume.icons.lucide.resources.cloud_moon
import com.davils.lume.icons.lucide.resources.cloud_moon_rain
import com.davils.lume.icons.lucide.resources.cloud_off
import com.davils.lume.icons.lucide.resources.cloud_rain
import com.davils.lume.icons.lucide.resources.cloud_rain_wind
import com.davils.lume.icons.lucide.resources.cloud_snow
import com.davils.lume.icons.lucide.resources.cloud_sun
import com.davils.lume.icons.lucide.resources.cloud_sun_rain
import com.davils.lume.icons.lucide.resources.cloud_sync
import com.davils.lume.icons.lucide.resources.cloud_upload
import com.davils.lume.icons.lucide.resources.cloudy
import com.davils.lume.icons.lucide.resources.clover
import com.davils.lume.icons.lucide.resources.club
import com.davils.lume.icons.lucide.resources.code
import com.davils.lume.icons.lucide.resources.code_xml
import com.davils.lume.icons.lucide.resources.coffee
import com.davils.lume.icons.lucide.resources.cog
import com.davils.lume.icons.lucide.resources.coins
import com.davils.lume.icons.lucide.resources.columns_2
import com.davils.lume.icons.lucide.resources.columns_3
import com.davils.lume.icons.lucide.resources.columns_3_cog
import com.davils.lume.icons.lucide.resources.columns_4
import com.davils.lume.icons.lucide.resources.combine
import com.davils.lume.icons.lucide.resources.command
import com.davils.lume.icons.lucide.resources.compass
import com.davils.lume.icons.lucide.resources.component
import com.davils.lume.icons.lucide.resources.computer
import com.davils.lume.icons.lucide.resources.concierge_bell
import com.davils.lume.icons.lucide.resources.cone
import com.davils.lume.icons.lucide.resources.construction
import com.davils.lume.icons.lucide.resources.contact
import com.davils.lume.icons.lucide.resources.contact_round
import com.davils.lume.icons.lucide.resources.container
import com.davils.lume.icons.lucide.resources.contrast
import com.davils.lume.icons.lucide.resources.cookie
import com.davils.lume.icons.lucide.resources.cooking_pot
import com.davils.lume.icons.lucide.resources.copy
import com.davils.lume.icons.lucide.resources.copy_check
import com.davils.lume.icons.lucide.resources.copy_minus
import com.davils.lume.icons.lucide.resources.copy_plus
import com.davils.lume.icons.lucide.resources.copy_slash
import com.davils.lume.icons.lucide.resources.copy_x
import com.davils.lume.icons.lucide.resources.copyleft
import com.davils.lume.icons.lucide.resources.copyright
import com.davils.lume.icons.lucide.resources.corner_down_left
import com.davils.lume.icons.lucide.resources.corner_down_right
import com.davils.lume.icons.lucide.resources.corner_left_down
import com.davils.lume.icons.lucide.resources.corner_left_up
import com.davils.lume.icons.lucide.resources.corner_right_down
import com.davils.lume.icons.lucide.resources.corner_right_up
import com.davils.lume.icons.lucide.resources.corner_up_left
import com.davils.lume.icons.lucide.resources.corner_up_right
import com.davils.lume.icons.lucide.resources.cpu
import com.davils.lume.icons.lucide.resources.creative_commons
import com.davils.lume.icons.lucide.resources.credit_card
import com.davils.lume.icons.lucide.resources.croissant
import com.davils.lume.icons.lucide.resources.crop
import com.davils.lume.icons.lucide.resources.cross
import com.davils.lume.icons.lucide.resources.crosshair
import com.davils.lume.icons.lucide.resources.crown
import com.davils.lume.icons.lucide.resources.cuboid
import com.davils.lume.icons.lucide.resources.cup_soda
import com.davils.lume.icons.lucide.resources.currency
import com.davils.lume.icons.lucide.resources.cylinder
import com.davils.lume.icons.lucide.resources.dam
import com.davils.lume.icons.lucide.resources.database
import com.davils.lume.icons.lucide.resources.database_backup
import com.davils.lume.icons.lucide.resources.database_search
import com.davils.lume.icons.lucide.resources.database_zap
import com.davils.lume.icons.lucide.resources.decimals_arrow_left
import com.davils.lume.icons.lucide.resources.decimals_arrow_right
import com.davils.lume.icons.lucide.resources.delete
import com.davils.lume.icons.lucide.resources.dessert
import com.davils.lume.icons.lucide.resources.diameter
import com.davils.lume.icons.lucide.resources.diamond
import com.davils.lume.icons.lucide.resources.diamond_minus
import com.davils.lume.icons.lucide.resources.diamond_percent
import com.davils.lume.icons.lucide.resources.diamond_plus
import com.davils.lume.icons.lucide.resources.dice_1
import com.davils.lume.icons.lucide.resources.dice_2
import com.davils.lume.icons.lucide.resources.dice_3
import com.davils.lume.icons.lucide.resources.dice_4
import com.davils.lume.icons.lucide.resources.dice_5
import com.davils.lume.icons.lucide.resources.dice_6
import com.davils.lume.icons.lucide.resources.dices
import com.davils.lume.icons.lucide.resources.diff
import com.davils.lume.icons.lucide.resources.disc
import com.davils.lume.icons.lucide.resources.disc_2
import com.davils.lume.icons.lucide.resources.disc_3
import com.davils.lume.icons.lucide.resources.disc_album
import com.davils.lume.icons.lucide.resources.divide
import com.davils.lume.icons.lucide.resources.dna
import com.davils.lume.icons.lucide.resources.dna_off
import com.davils.lume.icons.lucide.resources.dock
import com.davils.lume.icons.lucide.resources.dog
import com.davils.lume.icons.lucide.resources.dollar_sign
import com.davils.lume.icons.lucide.resources.donut
import com.davils.lume.icons.lucide.resources.door_closed
import com.davils.lume.icons.lucide.resources.door_closed_locked
import com.davils.lume.icons.lucide.resources.door_open
import com.davils.lume.icons.lucide.resources.dot
import com.davils.lume.icons.lucide.resources.download
import com.davils.lume.icons.lucide.resources.drafting_compass
import com.davils.lume.icons.lucide.resources.drama
import com.davils.lume.icons.lucide.resources.drill
import com.davils.lume.icons.lucide.resources.drone
import com.davils.lume.icons.lucide.resources.droplet
import com.davils.lume.icons.lucide.resources.droplet_off
import com.davils.lume.icons.lucide.resources.droplets
import com.davils.lume.icons.lucide.resources.drum
import com.davils.lume.icons.lucide.resources.drumstick
import com.davils.lume.icons.lucide.resources.dumbbell
import com.davils.lume.icons.lucide.resources.ear
import com.davils.lume.icons.lucide.resources.ear_off
import com.davils.lume.icons.lucide.resources.earth
import com.davils.lume.icons.lucide.resources.earth_lock
import com.davils.lume.icons.lucide.resources.eclipse
import com.davils.lume.icons.lucide.resources.egg
import com.davils.lume.icons.lucide.resources.egg_fried
import com.davils.lume.icons.lucide.resources.egg_off
import com.davils.lume.icons.lucide.resources.ellipse
import com.davils.lume.icons.lucide.resources.ellipsis
import com.davils.lume.icons.lucide.resources.ellipsis_vertical
import com.davils.lume.icons.lucide.resources.equal
import com.davils.lume.icons.lucide.resources.equal_approximately
import com.davils.lume.icons.lucide.resources.equal_not
import com.davils.lume.icons.lucide.resources.eraser
import com.davils.lume.icons.lucide.resources.ethernet_port
import com.davils.lume.icons.lucide.resources.euro
import com.davils.lume.icons.lucide.resources.ev_charger
import com.davils.lume.icons.lucide.resources.expand
import com.davils.lume.icons.lucide.resources.external_link
import com.davils.lume.icons.lucide.resources.eye
import com.davils.lume.icons.lucide.resources.eye_closed
import com.davils.lume.icons.lucide.resources.eye_off
import com.davils.lume.icons.lucide.resources.factory
import com.davils.lume.icons.lucide.resources.fan
import com.davils.lume.icons.lucide.resources.fast_forward
import com.davils.lume.icons.lucide.resources.feather
import com.davils.lume.icons.lucide.resources.fence
import com.davils.lume.icons.lucide.resources.ferris_wheel
import com.davils.lume.icons.lucide.resources.file_archive
import com.davils.lume.icons.lucide.resources.file_axis_3d
import com.davils.lume.icons.lucide.resources.file_badge
import com.davils.lume.icons.lucide.resources.file_box
import com.davils.lume.icons.lucide.resources.file_braces
import com.davils.lume.icons.lucide.resources.file_braces_corner
import com.davils.lume.icons.lucide.resources.file_chart_column
import com.davils.lume.icons.lucide.resources.file_chart_column_increasing
import com.davils.lume.icons.lucide.resources.file_chart_line
import com.davils.lume.icons.lucide.resources.file_chart_pie
import com.davils.lume.icons.lucide.resources.file_check
import com.davils.lume.icons.lucide.resources.file_check_corner
import com.davils.lume.icons.lucide.resources.file_clock
import com.davils.lume.icons.lucide.resources.file_code
import com.davils.lume.icons.lucide.resources.file_code_corner
import com.davils.lume.icons.lucide.resources.file_cog
import com.davils.lume.icons.lucide.resources.file_diff
import com.davils.lume.icons.lucide.resources.file_digit
import com.davils.lume.icons.lucide.resources.file_down
import com.davils.lume.icons.lucide.resources.file_exclamation_point
import com.davils.lume.icons.lucide.resources.file_headphone
import com.davils.lume.icons.lucide.resources.file_heart
import com.davils.lume.icons.lucide.resources.file_image
import com.davils.lume.icons.lucide.resources.file_input
import com.davils.lume.icons.lucide.resources.file_key
import com.davils.lume.icons.lucide.resources.file_lock
import com.davils.lume.icons.lucide.resources.file_minus
import com.davils.lume.icons.lucide.resources.file_minus_corner
import com.davils.lume.icons.lucide.resources.file_music
import com.davils.lume.icons.lucide.resources.file_output
import com.davils.lume.icons.lucide.resources.file_pen
import com.davils.lume.icons.lucide.resources.file_pen_line
import com.davils.lume.icons.lucide.resources.file_play
import com.davils.lume.icons.lucide.resources.file_plus
import com.davils.lume.icons.lucide.resources.file_plus_corner
import com.davils.lume.icons.lucide.resources.file_question_mark
import com.davils.lume.icons.lucide.resources.file_scan
import com.davils.lume.icons.lucide.resources.file_search
import com.davils.lume.icons.lucide.resources.file_search_corner
import com.davils.lume.icons.lucide.resources.file_signal
import com.davils.lume.icons.lucide.resources.file_sliders
import com.davils.lume.icons.lucide.resources.file_spreadsheet
import com.davils.lume.icons.lucide.resources.file_stack
import com.davils.lume.icons.lucide.resources.file_symlink
import com.davils.lume.icons.lucide.resources.file_terminal
import com.davils.lume.icons.lucide.resources.file_text
import com.davils.lume.icons.lucide.resources.file_type
import com.davils.lume.icons.lucide.resources.file_type_corner
import com.davils.lume.icons.lucide.resources.file_up
import com.davils.lume.icons.lucide.resources.file_user
import com.davils.lume.icons.lucide.resources.file_video_camera
import com.davils.lume.icons.lucide.resources.file_volume
import com.davils.lume.icons.lucide.resources.file_x
import com.davils.lume.icons.lucide.resources.file_x_corner
import com.davils.lume.icons.lucide.resources.files
import com.davils.lume.icons.lucide.resources.film
import com.davils.lume.icons.lucide.resources.fingerprint_pattern
import com.davils.lume.icons.lucide.resources.fire_extinguisher
import com.davils.lume.icons.lucide.resources.fish
import com.davils.lume.icons.lucide.resources.fish_off
import com.davils.lume.icons.lucide.resources.fish_symbol
import com.davils.lume.icons.lucide.resources.fishing_hook
import com.davils.lume.icons.lucide.resources.fishing_rod
import com.davils.lume.icons.lucide.resources.flag
import com.davils.lume.icons.lucide.resources.flag_off
import com.davils.lume.icons.lucide.resources.flag_triangle_left
import com.davils.lume.icons.lucide.resources.flag_triangle_right
import com.davils.lume.icons.lucide.resources.flame
import com.davils.lume.icons.lucide.resources.flame_kindling
import com.davils.lume.icons.lucide.resources.flashlight
import com.davils.lume.icons.lucide.resources.flashlight_off
import com.davils.lume.icons.lucide.resources.flask_conical
import com.davils.lume.icons.lucide.resources.flask_conical_off
import com.davils.lume.icons.lucide.resources.flask_round
import com.davils.lume.icons.lucide.resources.flip_horizontal_2
import com.davils.lume.icons.lucide.resources.flip_vertical_2
import com.davils.lume.icons.lucide.resources.flower
import com.davils.lume.icons.lucide.resources.flower_2
import com.davils.lume.icons.lucide.resources.focus
import com.davils.lume.icons.lucide.resources.fold_horizontal
import com.davils.lume.icons.lucide.resources.fold_vertical
import com.davils.lume.icons.lucide.resources.folder
import com.davils.lume.icons.lucide.resources.folder_archive
import com.davils.lume.icons.lucide.resources.folder_check
import com.davils.lume.icons.lucide.resources.folder_clock
import com.davils.lume.icons.lucide.resources.folder_closed
import com.davils.lume.icons.lucide.resources.folder_code
import com.davils.lume.icons.lucide.resources.folder_cog
import com.davils.lume.icons.lucide.resources.folder_dot
import com.davils.lume.icons.lucide.resources.folder_down
import com.davils.lume.icons.lucide.resources.folder_git
import com.davils.lume.icons.lucide.resources.folder_git_2
import com.davils.lume.icons.lucide.resources.folder_heart
import com.davils.lume.icons.lucide.resources.folder_input
import com.davils.lume.icons.lucide.resources.folder_kanban
import com.davils.lume.icons.lucide.resources.folder_key
import com.davils.lume.icons.lucide.resources.folder_lock
import com.davils.lume.icons.lucide.resources.folder_minus
import com.davils.lume.icons.lucide.resources.folder_open
import com.davils.lume.icons.lucide.resources.folder_open_dot
import com.davils.lume.icons.lucide.resources.folder_output
import com.davils.lume.icons.lucide.resources.folder_pen
import com.davils.lume.icons.lucide.resources.folder_plus
import com.davils.lume.icons.lucide.resources.folder_root
import com.davils.lume.icons.lucide.resources.folder_search
import com.davils.lume.icons.lucide.resources.folder_search_2
import com.davils.lume.icons.lucide.resources.folder_symlink
import com.davils.lume.icons.lucide.resources.folder_sync
import com.davils.lume.icons.lucide.resources.folder_tree
import com.davils.lume.icons.lucide.resources.folder_up
import com.davils.lume.icons.lucide.resources.folder_x
import com.davils.lume.icons.lucide.resources.folders
import com.davils.lume.icons.lucide.resources.footprints
import com.davils.lume.icons.lucide.resources.forklift
import com.davils.lume.icons.lucide.resources.form
import com.davils.lume.icons.lucide.resources.forward
import com.davils.lume.icons.lucide.resources.frame
import com.davils.lume.icons.lucide.resources.frown
import com.davils.lume.icons.lucide.resources.fuel
import com.davils.lume.icons.lucide.resources.fullscreen
import com.davils.lume.icons.lucide.resources.funnel
import com.davils.lume.icons.lucide.resources.funnel_plus
import com.davils.lume.icons.lucide.resources.funnel_x
import com.davils.lume.icons.lucide.resources.gallery_horizontal
import com.davils.lume.icons.lucide.resources.gallery_horizontal_end
import com.davils.lume.icons.lucide.resources.gallery_thumbnails
import com.davils.lume.icons.lucide.resources.gallery_vertical
import com.davils.lume.icons.lucide.resources.gallery_vertical_end
import com.davils.lume.icons.lucide.resources.gamepad
import com.davils.lume.icons.lucide.resources.gamepad_2
import com.davils.lume.icons.lucide.resources.gamepad_directional
import com.davils.lume.icons.lucide.resources.gauge
import com.davils.lume.icons.lucide.resources.gavel
import com.davils.lume.icons.lucide.resources.gem
import com.davils.lume.icons.lucide.resources.georgian_lari
import com.davils.lume.icons.lucide.resources.ghost
import com.davils.lume.icons.lucide.resources.gift
import com.davils.lume.icons.lucide.resources.git_branch
import com.davils.lume.icons.lucide.resources.git_branch_minus
import com.davils.lume.icons.lucide.resources.git_branch_plus
import com.davils.lume.icons.lucide.resources.git_commit_horizontal
import com.davils.lume.icons.lucide.resources.git_commit_vertical
import com.davils.lume.icons.lucide.resources.git_compare
import com.davils.lume.icons.lucide.resources.git_compare_arrows
import com.davils.lume.icons.lucide.resources.git_fork
import com.davils.lume.icons.lucide.resources.git_graph
import com.davils.lume.icons.lucide.resources.git_merge
import com.davils.lume.icons.lucide.resources.git_merge_conflict
import com.davils.lume.icons.lucide.resources.git_pull_request
import com.davils.lume.icons.lucide.resources.git_pull_request_arrow
import com.davils.lume.icons.lucide.resources.git_pull_request_closed
import com.davils.lume.icons.lucide.resources.git_pull_request_create
import com.davils.lume.icons.lucide.resources.git_pull_request_create_arrow
import com.davils.lume.icons.lucide.resources.git_pull_request_draft
import com.davils.lume.icons.lucide.resources.glass_water
import com.davils.lume.icons.lucide.resources.glasses
import com.davils.lume.icons.lucide.resources.globe
import com.davils.lume.icons.lucide.resources.globe_lock
import com.davils.lume.icons.lucide.resources.globe_off
import com.davils.lume.icons.lucide.resources.globe_x
import com.davils.lume.icons.lucide.resources.goal
import com.davils.lume.icons.lucide.resources.gpu
import com.davils.lume.icons.lucide.resources.graduation_cap
import com.davils.lume.icons.lucide.resources.grape
import com.davils.lume.icons.lucide.resources.grid_2x2
import com.davils.lume.icons.lucide.resources.grid_2x2_check
import com.davils.lume.icons.lucide.resources.grid_2x2_plus
import com.davils.lume.icons.lucide.resources.grid_2x2_x
import com.davils.lume.icons.lucide.resources.grid_3x2
import com.davils.lume.icons.lucide.resources.grid_3x3
import com.davils.lume.icons.lucide.resources.grip
import com.davils.lume.icons.lucide.resources.grip_horizontal
import com.davils.lume.icons.lucide.resources.grip_vertical
import com.davils.lume.icons.lucide.resources.group
import com.davils.lume.icons.lucide.resources.guitar
import com.davils.lume.icons.lucide.resources.ham
import com.davils.lume.icons.lucide.resources.hamburger
import com.davils.lume.icons.lucide.resources.hammer
import com.davils.lume.icons.lucide.resources.hand
import com.davils.lume.icons.lucide.resources.hand_coins
import com.davils.lume.icons.lucide.resources.hand_fist
import com.davils.lume.icons.lucide.resources.hand_grab
import com.davils.lume.icons.lucide.resources.hand_heart
import com.davils.lume.icons.lucide.resources.hand_helping
import com.davils.lume.icons.lucide.resources.hand_metal
import com.davils.lume.icons.lucide.resources.hand_platter
import com.davils.lume.icons.lucide.resources.handbag
import com.davils.lume.icons.lucide.resources.handshake
import com.davils.lume.icons.lucide.resources.hard_drive
import com.davils.lume.icons.lucide.resources.hard_drive_download
import com.davils.lume.icons.lucide.resources.hard_drive_upload
import com.davils.lume.icons.lucide.resources.hard_hat
import com.davils.lume.icons.lucide.resources.hash
import com.davils.lume.icons.lucide.resources.hat_glasses
import com.davils.lume.icons.lucide.resources.haze
import com.davils.lume.icons.lucide.resources.hd
import com.davils.lume.icons.lucide.resources.hdmi_port
import com.davils.lume.icons.lucide.resources.heading
import com.davils.lume.icons.lucide.resources.heading_1
import com.davils.lume.icons.lucide.resources.heading_2
import com.davils.lume.icons.lucide.resources.heading_3
import com.davils.lume.icons.lucide.resources.heading_4
import com.davils.lume.icons.lucide.resources.heading_5
import com.davils.lume.icons.lucide.resources.heading_6
import com.davils.lume.icons.lucide.resources.headphone_off
import com.davils.lume.icons.lucide.resources.headphones
import com.davils.lume.icons.lucide.resources.headset
import com.davils.lume.icons.lucide.resources.heart
import com.davils.lume.icons.lucide.resources.heart_crack
import com.davils.lume.icons.lucide.resources.heart_handshake
import com.davils.lume.icons.lucide.resources.heart_minus
import com.davils.lume.icons.lucide.resources.heart_off
import com.davils.lume.icons.lucide.resources.heart_plus
import com.davils.lume.icons.lucide.resources.heart_pulse
import com.davils.lume.icons.lucide.resources.heater
import com.davils.lume.icons.lucide.resources.helicopter
import com.davils.lume.icons.lucide.resources.hexagon
import com.davils.lume.icons.lucide.resources.highlighter
import com.davils.lume.icons.lucide.resources.history
import com.davils.lume.icons.lucide.resources.hop
import com.davils.lume.icons.lucide.resources.hop_off
import com.davils.lume.icons.lucide.resources.hospital
import com.davils.lume.icons.lucide.resources.hotel
import com.davils.lume.icons.lucide.resources.hourglass
import com.davils.lume.icons.lucide.resources.house
import com.davils.lume.icons.lucide.resources.house_heart
import com.davils.lume.icons.lucide.resources.house_plug
import com.davils.lume.icons.lucide.resources.house_plus
import com.davils.lume.icons.lucide.resources.house_wifi
import com.davils.lume.icons.lucide.resources.ice_cream_bowl
import com.davils.lume.icons.lucide.resources.ice_cream_cone
import com.davils.lume.icons.lucide.resources.id_card
import com.davils.lume.icons.lucide.resources.id_card_lanyard
import com.davils.lume.icons.lucide.resources.image
import com.davils.lume.icons.lucide.resources.image_down
import com.davils.lume.icons.lucide.resources.image_minus
import com.davils.lume.icons.lucide.resources.image_off
import com.davils.lume.icons.lucide.resources.image_play
import com.davils.lume.icons.lucide.resources.image_plus
import com.davils.lume.icons.lucide.resources.image_up
import com.davils.lume.icons.lucide.resources.image_upscale
import com.davils.lume.icons.lucide.resources.images
import com.davils.lume.icons.lucide.resources.inbox
import com.davils.lume.icons.lucide.resources.indian_rupee
import com.davils.lume.icons.lucide.resources.infinity
import com.davils.lume.icons.lucide.resources.info
import com.davils.lume.icons.lucide.resources.inspection_panel
import com.davils.lume.icons.lucide.resources.italic
import com.davils.lume.icons.lucide.resources.iteration_ccw
import com.davils.lume.icons.lucide.resources.iteration_cw
import com.davils.lume.icons.lucide.resources.japanese_yen
import com.davils.lume.icons.lucide.resources.joystick
import com.davils.lume.icons.lucide.resources.kanban
import com.davils.lume.icons.lucide.resources.kayak
import com.davils.lume.icons.lucide.resources.key
import com.davils.lume.icons.lucide.resources.key_round
import com.davils.lume.icons.lucide.resources.key_square
import com.davils.lume.icons.lucide.resources.keyboard
import com.davils.lume.icons.lucide.resources.keyboard_music
import com.davils.lume.icons.lucide.resources.keyboard_off
import com.davils.lume.icons.lucide.resources.lamp
import com.davils.lume.icons.lucide.resources.lamp_ceiling
import com.davils.lume.icons.lucide.resources.lamp_desk
import com.davils.lume.icons.lucide.resources.lamp_floor
import com.davils.lume.icons.lucide.resources.lamp_wall_down
import com.davils.lume.icons.lucide.resources.lamp_wall_up
import com.davils.lume.icons.lucide.resources.land_plot
import com.davils.lume.icons.lucide.resources.landmark
import com.davils.lume.icons.lucide.resources.languages
import com.davils.lume.icons.lucide.resources.laptop
import com.davils.lume.icons.lucide.resources.laptop_minimal
import com.davils.lume.icons.lucide.resources.laptop_minimal_check
import com.davils.lume.icons.lucide.resources.lasso
import com.davils.lume.icons.lucide.resources.lasso_select
import com.davils.lume.icons.lucide.resources.laugh
import com.davils.lume.icons.lucide.resources.layers
import com.davils.lume.icons.lucide.resources.layers_2
import com.davils.lume.icons.lucide.resources.layers_plus
import com.davils.lume.icons.lucide.resources.layout_dashboard
import com.davils.lume.icons.lucide.resources.layout_grid
import com.davils.lume.icons.lucide.resources.layout_list
import com.davils.lume.icons.lucide.resources.layout_panel_left
import com.davils.lume.icons.lucide.resources.layout_panel_top
import com.davils.lume.icons.lucide.resources.layout_template
import com.davils.lume.icons.lucide.resources.leaf
import com.davils.lume.icons.lucide.resources.leafy_green
import com.davils.lume.icons.lucide.resources.lectern
import com.davils.lume.icons.lucide.resources.lens_concave
import com.davils.lume.icons.lucide.resources.lens_convex
import com.davils.lume.icons.lucide.resources.library
import com.davils.lume.icons.lucide.resources.library_big
import com.davils.lume.icons.lucide.resources.life_buoy
import com.davils.lume.icons.lucide.resources.ligature
import com.davils.lume.icons.lucide.resources.lightbulb
import com.davils.lume.icons.lucide.resources.lightbulb_off
import com.davils.lume.icons.lucide.resources.line_dot_right_horizontal
import com.davils.lume.icons.lucide.resources.line_squiggle
import com.davils.lume.icons.lucide.resources.line_style
import com.davils.lume.icons.lucide.resources.link
import com.davils.lume.icons.lucide.resources.link_2
import com.davils.lume.icons.lucide.resources.link_2_off
import com.davils.lume.icons.lucide.resources.list
import com.davils.lume.icons.lucide.resources.list_check
import com.davils.lume.icons.lucide.resources.list_checks
import com.davils.lume.icons.lucide.resources.list_chevrons_down_up
import com.davils.lume.icons.lucide.resources.list_chevrons_up_down
import com.davils.lume.icons.lucide.resources.list_collapse
import com.davils.lume.icons.lucide.resources.list_end
import com.davils.lume.icons.lucide.resources.list_filter
import com.davils.lume.icons.lucide.resources.list_filter_plus
import com.davils.lume.icons.lucide.resources.list_indent_decrease
import com.davils.lume.icons.lucide.resources.list_indent_increase
import com.davils.lume.icons.lucide.resources.list_minus
import com.davils.lume.icons.lucide.resources.list_music
import com.davils.lume.icons.lucide.resources.list_ordered
import com.davils.lume.icons.lucide.resources.list_plus
import com.davils.lume.icons.lucide.resources.list_restart
import com.davils.lume.icons.lucide.resources.list_start
import com.davils.lume.icons.lucide.resources.list_todo
import com.davils.lume.icons.lucide.resources.list_tree
import com.davils.lume.icons.lucide.resources.list_video
import com.davils.lume.icons.lucide.resources.list_x
import com.davils.lume.icons.lucide.resources.loader
import com.davils.lume.icons.lucide.resources.loader_circle
import com.davils.lume.icons.lucide.resources.loader_pinwheel
import com.davils.lume.icons.lucide.resources.locate
import com.davils.lume.icons.lucide.resources.locate_fixed
import com.davils.lume.icons.lucide.resources.locate_off
import com.davils.lume.icons.lucide.resources.lock
import com.davils.lume.icons.lucide.resources.lock_keyhole
import com.davils.lume.icons.lucide.resources.lock_keyhole_open
import com.davils.lume.icons.lucide.resources.lock_open
import com.davils.lume.icons.lucide.resources.log_in
import com.davils.lume.icons.lucide.resources.log_out
import com.davils.lume.icons.lucide.resources.logs
import com.davils.lume.icons.lucide.resources.lollipop
import com.davils.lume.icons.lucide.resources.luggage
import com.davils.lume.icons.lucide.resources.magnet
import com.davils.lume.icons.lucide.resources.mail
import com.davils.lume.icons.lucide.resources.mail_check
import com.davils.lume.icons.lucide.resources.mail_minus
import com.davils.lume.icons.lucide.resources.mail_open
import com.davils.lume.icons.lucide.resources.mail_plus
import com.davils.lume.icons.lucide.resources.mail_question_mark
import com.davils.lume.icons.lucide.resources.mail_search
import com.davils.lume.icons.lucide.resources.mail_warning
import com.davils.lume.icons.lucide.resources.mail_x
import com.davils.lume.icons.lucide.resources.mailbox
import com.davils.lume.icons.lucide.resources.mails
import com.davils.lume.icons.lucide.resources.map
import com.davils.lume.icons.lucide.resources.map_minus
import com.davils.lume.icons.lucide.resources.map_pin
import com.davils.lume.icons.lucide.resources.map_pin_check
import com.davils.lume.icons.lucide.resources.map_pin_check_inside
import com.davils.lume.icons.lucide.resources.map_pin_house
import com.davils.lume.icons.lucide.resources.map_pin_minus
import com.davils.lume.icons.lucide.resources.map_pin_minus_inside
import com.davils.lume.icons.lucide.resources.map_pin_off
import com.davils.lume.icons.lucide.resources.map_pin_pen
import com.davils.lume.icons.lucide.resources.map_pin_plus
import com.davils.lume.icons.lucide.resources.map_pin_plus_inside
import com.davils.lume.icons.lucide.resources.map_pin_search
import com.davils.lume.icons.lucide.resources.map_pin_x
import com.davils.lume.icons.lucide.resources.map_pin_x_inside
import com.davils.lume.icons.lucide.resources.map_pinned
import com.davils.lume.icons.lucide.resources.map_plus
import com.davils.lume.icons.lucide.resources.mars
import com.davils.lume.icons.lucide.resources.mars_stroke
import com.davils.lume.icons.lucide.resources.martini
import com.davils.lume.icons.lucide.resources.maximize
import com.davils.lume.icons.lucide.resources.maximize_2
import com.davils.lume.icons.lucide.resources.medal
import com.davils.lume.icons.lucide.resources.megaphone
import com.davils.lume.icons.lucide.resources.megaphone_off
import com.davils.lume.icons.lucide.resources.meh
import com.davils.lume.icons.lucide.resources.memory_stick
import com.davils.lume.icons.lucide.resources.menu
import com.davils.lume.icons.lucide.resources.merge
import com.davils.lume.icons.lucide.resources.message_circle
import com.davils.lume.icons.lucide.resources.message_circle_check
import com.davils.lume.icons.lucide.resources.message_circle_code
import com.davils.lume.icons.lucide.resources.message_circle_dashed
import com.davils.lume.icons.lucide.resources.message_circle_heart
import com.davils.lume.icons.lucide.resources.message_circle_more
import com.davils.lume.icons.lucide.resources.message_circle_off
import com.davils.lume.icons.lucide.resources.message_circle_plus
import com.davils.lume.icons.lucide.resources.message_circle_question_mark
import com.davils.lume.icons.lucide.resources.message_circle_reply
import com.davils.lume.icons.lucide.resources.message_circle_warning
import com.davils.lume.icons.lucide.resources.message_circle_x
import com.davils.lume.icons.lucide.resources.message_square
import com.davils.lume.icons.lucide.resources.message_square_check
import com.davils.lume.icons.lucide.resources.message_square_code
import com.davils.lume.icons.lucide.resources.message_square_dashed
import com.davils.lume.icons.lucide.resources.message_square_diff
import com.davils.lume.icons.lucide.resources.message_square_dot
import com.davils.lume.icons.lucide.resources.message_square_heart
import com.davils.lume.icons.lucide.resources.message_square_lock
import com.davils.lume.icons.lucide.resources.message_square_more
import com.davils.lume.icons.lucide.resources.message_square_off
import com.davils.lume.icons.lucide.resources.message_square_plus
import com.davils.lume.icons.lucide.resources.message_square_quote
import com.davils.lume.icons.lucide.resources.message_square_reply
import com.davils.lume.icons.lucide.resources.message_square_share
import com.davils.lume.icons.lucide.resources.message_square_text
import com.davils.lume.icons.lucide.resources.message_square_warning
import com.davils.lume.icons.lucide.resources.message_square_x
import com.davils.lume.icons.lucide.resources.messages_square
import com.davils.lume.icons.lucide.resources.metronome
import com.davils.lume.icons.lucide.resources.mic
import com.davils.lume.icons.lucide.resources.mic_off
import com.davils.lume.icons.lucide.resources.mic_vocal
import com.davils.lume.icons.lucide.resources.microchip
import com.davils.lume.icons.lucide.resources.microscope
import com.davils.lume.icons.lucide.resources.microwave
import com.davils.lume.icons.lucide.resources.milestone
import com.davils.lume.icons.lucide.resources.milk
import com.davils.lume.icons.lucide.resources.milk_off
import com.davils.lume.icons.lucide.resources.minimize
import com.davils.lume.icons.lucide.resources.minimize_2
import com.davils.lume.icons.lucide.resources.minus
import com.davils.lume.icons.lucide.resources.mirror_rectangular
import com.davils.lume.icons.lucide.resources.mirror_round
import com.davils.lume.icons.lucide.resources.monitor
import com.davils.lume.icons.lucide.resources.monitor_check
import com.davils.lume.icons.lucide.resources.monitor_cloud
import com.davils.lume.icons.lucide.resources.monitor_cog
import com.davils.lume.icons.lucide.resources.monitor_dot
import com.davils.lume.icons.lucide.resources.monitor_down
import com.davils.lume.icons.lucide.resources.monitor_off
import com.davils.lume.icons.lucide.resources.monitor_pause
import com.davils.lume.icons.lucide.resources.monitor_play
import com.davils.lume.icons.lucide.resources.monitor_smartphone
import com.davils.lume.icons.lucide.resources.monitor_speaker
import com.davils.lume.icons.lucide.resources.monitor_stop
import com.davils.lume.icons.lucide.resources.monitor_up
import com.davils.lume.icons.lucide.resources.monitor_x
import com.davils.lume.icons.lucide.resources.moon
import com.davils.lume.icons.lucide.resources.moon_star
import com.davils.lume.icons.lucide.resources.motorbike
import com.davils.lume.icons.lucide.resources.mountain
import com.davils.lume.icons.lucide.resources.mountain_snow
import com.davils.lume.icons.lucide.resources.mouse
import com.davils.lume.icons.lucide.resources.mouse_left
import com.davils.lume.icons.lucide.resources.mouse_off
import com.davils.lume.icons.lucide.resources.mouse_pointer
import com.davils.lume.icons.lucide.resources.mouse_pointer_2
import com.davils.lume.icons.lucide.resources.mouse_pointer_2_off
import com.davils.lume.icons.lucide.resources.mouse_pointer_ban
import com.davils.lume.icons.lucide.resources.mouse_pointer_click
import com.davils.lume.icons.lucide.resources.mouse_right
import com.davils.lume.icons.lucide.resources.move
import com.davils.lume.icons.lucide.resources.move_3d
import com.davils.lume.icons.lucide.resources.move_diagonal
import com.davils.lume.icons.lucide.resources.move_diagonal_2
import com.davils.lume.icons.lucide.resources.move_down
import com.davils.lume.icons.lucide.resources.move_down_left
import com.davils.lume.icons.lucide.resources.move_down_right
import com.davils.lume.icons.lucide.resources.move_horizontal
import com.davils.lume.icons.lucide.resources.move_left
import com.davils.lume.icons.lucide.resources.move_right
import com.davils.lume.icons.lucide.resources.move_up
import com.davils.lume.icons.lucide.resources.move_up_left
import com.davils.lume.icons.lucide.resources.move_up_right
import com.davils.lume.icons.lucide.resources.move_vertical
import com.davils.lume.icons.lucide.resources.music
import com.davils.lume.icons.lucide.resources.music_2
import com.davils.lume.icons.lucide.resources.music_3
import com.davils.lume.icons.lucide.resources.music_4
import com.davils.lume.icons.lucide.resources.navigation
import com.davils.lume.icons.lucide.resources.navigation_2
import com.davils.lume.icons.lucide.resources.navigation_2_off
import com.davils.lume.icons.lucide.resources.navigation_off
import com.davils.lume.icons.lucide.resources.network
import com.davils.lume.icons.lucide.resources.newspaper
import com.davils.lume.icons.lucide.resources.nfc
import com.davils.lume.icons.lucide.resources.non_binary
import com.davils.lume.icons.lucide.resources.notebook
import com.davils.lume.icons.lucide.resources.notebook_pen
import com.davils.lume.icons.lucide.resources.notebook_tabs
import com.davils.lume.icons.lucide.resources.notebook_text
import com.davils.lume.icons.lucide.resources.notepad_text
import com.davils.lume.icons.lucide.resources.notepad_text_dashed
import com.davils.lume.icons.lucide.resources.nut
import com.davils.lume.icons.lucide.resources.nut_off
import com.davils.lume.icons.lucide.resources.octagon
import com.davils.lume.icons.lucide.resources.octagon_alert
import com.davils.lume.icons.lucide.resources.octagon_minus
import com.davils.lume.icons.lucide.resources.octagon_pause
import com.davils.lume.icons.lucide.resources.octagon_x
import com.davils.lume.icons.lucide.resources.omega
import com.davils.lume.icons.lucide.resources.option
import com.davils.lume.icons.lucide.resources.orbit
import com.davils.lume.icons.lucide.resources.origami
import com.davils.lume.icons.lucide.resources.package_2
import com.davils.lume.icons.lucide.resources.package_check
import com.davils.lume.icons.lucide.resources.package_minus
import com.davils.lume.icons.lucide.resources.package_open
import com.davils.lume.icons.lucide.resources.package_plus
import com.davils.lume.icons.lucide.resources.package_search
import com.davils.lume.icons.lucide.resources.package_x
import com.davils.lume.icons.lucide.resources.paint_bucket
import com.davils.lume.icons.lucide.resources.paint_roller
import com.davils.lume.icons.lucide.resources.paintbrush
import com.davils.lume.icons.lucide.resources.paintbrush_vertical
import com.davils.lume.icons.lucide.resources.palette
import com.davils.lume.icons.lucide.resources.panda
import com.davils.lume.icons.lucide.resources.panel_bottom
import com.davils.lume.icons.lucide.resources.panel_bottom_close
import com.davils.lume.icons.lucide.resources.panel_bottom_dashed
import com.davils.lume.icons.lucide.resources.panel_bottom_open
import com.davils.lume.icons.lucide.resources.panel_left
import com.davils.lume.icons.lucide.resources.panel_left_close
import com.davils.lume.icons.lucide.resources.panel_left_dashed
import com.davils.lume.icons.lucide.resources.panel_left_open
import com.davils.lume.icons.lucide.resources.panel_left_right_dashed
import com.davils.lume.icons.lucide.resources.panel_right
import com.davils.lume.icons.lucide.resources.panel_right_close
import com.davils.lume.icons.lucide.resources.panel_right_dashed
import com.davils.lume.icons.lucide.resources.panel_right_open
import com.davils.lume.icons.lucide.resources.panel_top
import com.davils.lume.icons.lucide.resources.panel_top_bottom_dashed
import com.davils.lume.icons.lucide.resources.panel_top_close
import com.davils.lume.icons.lucide.resources.panel_top_dashed
import com.davils.lume.icons.lucide.resources.panel_top_open
import com.davils.lume.icons.lucide.resources.panels_left_bottom
import com.davils.lume.icons.lucide.resources.panels_right_bottom
import com.davils.lume.icons.lucide.resources.panels_top_left
import com.davils.lume.icons.lucide.resources.paperclip
import com.davils.lume.icons.lucide.resources.parentheses
import com.davils.lume.icons.lucide.resources.parking_meter
import com.davils.lume.icons.lucide.resources.party_popper
import com.davils.lume.icons.lucide.resources.pause
import com.davils.lume.icons.lucide.resources.paw_print
import com.davils.lume.icons.lucide.resources.pc_case
import com.davils.lume.icons.lucide.resources.pen
import com.davils.lume.icons.lucide.resources.pen_line
import com.davils.lume.icons.lucide.resources.pen_off
import com.davils.lume.icons.lucide.resources.pen_tool
import com.davils.lume.icons.lucide.resources.pencil
import com.davils.lume.icons.lucide.resources.pencil_line
import com.davils.lume.icons.lucide.resources.pencil_off
import com.davils.lume.icons.lucide.resources.pencil_ruler
import com.davils.lume.icons.lucide.resources.pentagon
import com.davils.lume.icons.lucide.resources.percent
import com.davils.lume.icons.lucide.resources.person_standing
import com.davils.lume.icons.lucide.resources.philippine_peso
import com.davils.lume.icons.lucide.resources.phone
import com.davils.lume.icons.lucide.resources.phone_call
import com.davils.lume.icons.lucide.resources.phone_forwarded
import com.davils.lume.icons.lucide.resources.phone_incoming
import com.davils.lume.icons.lucide.resources.phone_missed
import com.davils.lume.icons.lucide.resources.phone_off
import com.davils.lume.icons.lucide.resources.phone_outgoing
import com.davils.lume.icons.lucide.resources.pi
import com.davils.lume.icons.lucide.resources.piano
import com.davils.lume.icons.lucide.resources.pickaxe
import com.davils.lume.icons.lucide.resources.picture_in_picture
import com.davils.lume.icons.lucide.resources.picture_in_picture_2
import com.davils.lume.icons.lucide.resources.piggy_bank
import com.davils.lume.icons.lucide.resources.pilcrow
import com.davils.lume.icons.lucide.resources.pilcrow_left
import com.davils.lume.icons.lucide.resources.pilcrow_right
import com.davils.lume.icons.lucide.resources.pill
import com.davils.lume.icons.lucide.resources.pill_bottle
import com.davils.lume.icons.lucide.resources.pin
import com.davils.lume.icons.lucide.resources.pin_off
import com.davils.lume.icons.lucide.resources.pipette
import com.davils.lume.icons.lucide.resources.pizza
import com.davils.lume.icons.lucide.resources.plane
import com.davils.lume.icons.lucide.resources.plane_landing
import com.davils.lume.icons.lucide.resources.plane_takeoff
import com.davils.lume.icons.lucide.resources.play
import com.davils.lume.icons.lucide.resources.plug
import com.davils.lume.icons.lucide.resources.plug_2
import com.davils.lume.icons.lucide.resources.plug_zap
import com.davils.lume.icons.lucide.resources.plus
import com.davils.lume.icons.lucide.resources.pocket_knife
import com.davils.lume.icons.lucide.resources.podcast
import com.davils.lume.icons.lucide.resources.pointer
import com.davils.lume.icons.lucide.resources.pointer_off
import com.davils.lume.icons.lucide.resources.popcorn
import com.davils.lume.icons.lucide.resources.popsicle
import com.davils.lume.icons.lucide.resources.pound_sterling
import com.davils.lume.icons.lucide.resources.power
import com.davils.lume.icons.lucide.resources.power_off
import com.davils.lume.icons.lucide.resources.presentation
import com.davils.lume.icons.lucide.resources.printer
import com.davils.lume.icons.lucide.resources.printer_check
import com.davils.lume.icons.lucide.resources.printer_x
import com.davils.lume.icons.lucide.resources.projector
import com.davils.lume.icons.lucide.resources.proportions
import com.davils.lume.icons.lucide.resources.puzzle
import com.davils.lume.icons.lucide.resources.pyramid
import com.davils.lume.icons.lucide.resources.qr_code
import com.davils.lume.icons.lucide.resources.quote
import com.davils.lume.icons.lucide.resources.rabbit
import com.davils.lume.icons.lucide.resources.radar
import com.davils.lume.icons.lucide.resources.radiation
import com.davils.lume.icons.lucide.resources.radical
import com.davils.lume.icons.lucide.resources.radio
import com.davils.lume.icons.lucide.resources.radio_off
import com.davils.lume.icons.lucide.resources.radio_receiver
import com.davils.lume.icons.lucide.resources.radio_tower
import com.davils.lume.icons.lucide.resources.radius
import com.davils.lume.icons.lucide.resources.rainbow
import com.davils.lume.icons.lucide.resources.rat
import com.davils.lume.icons.lucide.resources.ratio
import com.davils.lume.icons.lucide.resources.receipt
import com.davils.lume.icons.lucide.resources.receipt_cent
import com.davils.lume.icons.lucide.resources.receipt_euro
import com.davils.lume.icons.lucide.resources.receipt_indian_rupee
import com.davils.lume.icons.lucide.resources.receipt_japanese_yen
import com.davils.lume.icons.lucide.resources.receipt_pound_sterling
import com.davils.lume.icons.lucide.resources.receipt_russian_ruble
import com.davils.lume.icons.lucide.resources.receipt_swiss_franc
import com.davils.lume.icons.lucide.resources.receipt_text
import com.davils.lume.icons.lucide.resources.receipt_turkish_lira
import com.davils.lume.icons.lucide.resources.rectangle_circle
import com.davils.lume.icons.lucide.resources.rectangle_ellipsis
import com.davils.lume.icons.lucide.resources.rectangle_goggles
import com.davils.lume.icons.lucide.resources.rectangle_horizontal
import com.davils.lume.icons.lucide.resources.rectangle_vertical
import com.davils.lume.icons.lucide.resources.recycle
import com.davils.lume.icons.lucide.resources.redo
import com.davils.lume.icons.lucide.resources.redo_2
import com.davils.lume.icons.lucide.resources.redo_dot
import com.davils.lume.icons.lucide.resources.refresh_ccw
import com.davils.lume.icons.lucide.resources.refresh_ccw_dot
import com.davils.lume.icons.lucide.resources.refresh_cw
import com.davils.lume.icons.lucide.resources.refresh_cw_off
import com.davils.lume.icons.lucide.resources.refrigerator
import com.davils.lume.icons.lucide.resources.regex
import com.davils.lume.icons.lucide.resources.remove_formatting
import com.davils.lume.icons.lucide.resources.repeat
import com.davils.lume.icons.lucide.resources.repeat_1
import com.davils.lume.icons.lucide.resources.repeat_2
import com.davils.lume.icons.lucide.resources.replace
import com.davils.lume.icons.lucide.resources.replace_all
import com.davils.lume.icons.lucide.resources.reply
import com.davils.lume.icons.lucide.resources.reply_all
import com.davils.lume.icons.lucide.resources.rewind
import com.davils.lume.icons.lucide.resources.ribbon
import com.davils.lume.icons.lucide.resources.road
import com.davils.lume.icons.lucide.resources.rocket
import com.davils.lume.icons.lucide.resources.rocking_chair
import com.davils.lume.icons.lucide.resources.roller_coaster
import com.davils.lume.icons.lucide.resources.rose
import com.davils.lume.icons.lucide.resources.rotate_3d
import com.davils.lume.icons.lucide.resources.rotate_ccw
import com.davils.lume.icons.lucide.resources.rotate_ccw_key
import com.davils.lume.icons.lucide.resources.rotate_ccw_square
import com.davils.lume.icons.lucide.resources.rotate_cw
import com.davils.lume.icons.lucide.resources.rotate_cw_square
import com.davils.lume.icons.lucide.resources.route
import com.davils.lume.icons.lucide.resources.route_off
import com.davils.lume.icons.lucide.resources.router
import com.davils.lume.icons.lucide.resources.rows_2
import com.davils.lume.icons.lucide.resources.rows_3
import com.davils.lume.icons.lucide.resources.rows_4
import com.davils.lume.icons.lucide.resources.rss
import com.davils.lume.icons.lucide.resources.ruler
import com.davils.lume.icons.lucide.resources.ruler_dimension_line
import com.davils.lume.icons.lucide.resources.russian_ruble
import com.davils.lume.icons.lucide.resources.sailboat
import com.davils.lume.icons.lucide.resources.salad
import com.davils.lume.icons.lucide.resources.sandwich
import com.davils.lume.icons.lucide.resources.satellite
import com.davils.lume.icons.lucide.resources.satellite_dish
import com.davils.lume.icons.lucide.resources.saudi_riyal
import com.davils.lume.icons.lucide.resources.save
import com.davils.lume.icons.lucide.resources.save_all
import com.davils.lume.icons.lucide.resources.save_off
import com.davils.lume.icons.lucide.resources.scale
import com.davils.lume.icons.lucide.resources.scale_3d
import com.davils.lume.icons.lucide.resources.scaling
import com.davils.lume.icons.lucide.resources.scan
import com.davils.lume.icons.lucide.resources.scan_barcode
import com.davils.lume.icons.lucide.resources.scan_eye
import com.davils.lume.icons.lucide.resources.scan_face
import com.davils.lume.icons.lucide.resources.scan_heart
import com.davils.lume.icons.lucide.resources.scan_line
import com.davils.lume.icons.lucide.resources.scan_qr_code
import com.davils.lume.icons.lucide.resources.scan_search
import com.davils.lume.icons.lucide.resources.scan_text
import com.davils.lume.icons.lucide.resources.school
import com.davils.lume.icons.lucide.resources.scissors
import com.davils.lume.icons.lucide.resources.scissors_line_dashed
import com.davils.lume.icons.lucide.resources.scooter
import com.davils.lume.icons.lucide.resources.screen_share
import com.davils.lume.icons.lucide.resources.screen_share_off
import com.davils.lume.icons.lucide.resources.scroll
import com.davils.lume.icons.lucide.resources.scroll_text
import com.davils.lume.icons.lucide.resources.search
import com.davils.lume.icons.lucide.resources.search_alert
import com.davils.lume.icons.lucide.resources.search_check
import com.davils.lume.icons.lucide.resources.search_code
import com.davils.lume.icons.lucide.resources.search_slash
import com.davils.lume.icons.lucide.resources.search_x
import com.davils.lume.icons.lucide.resources.section
import com.davils.lume.icons.lucide.resources.send
import com.davils.lume.icons.lucide.resources.send_horizontal
import com.davils.lume.icons.lucide.resources.send_to_back
import com.davils.lume.icons.lucide.resources.separator_horizontal
import com.davils.lume.icons.lucide.resources.separator_vertical
import com.davils.lume.icons.lucide.resources.server
import com.davils.lume.icons.lucide.resources.server_cog
import com.davils.lume.icons.lucide.resources.server_crash
import com.davils.lume.icons.lucide.resources.server_off
import com.davils.lume.icons.lucide.resources.settings
import com.davils.lume.icons.lucide.resources.settings_2
import com.davils.lume.icons.lucide.resources.shapes
import com.davils.lume.icons.lucide.resources.share
import com.davils.lume.icons.lucide.resources.share_2
import com.davils.lume.icons.lucide.resources.sheet
import com.davils.lume.icons.lucide.resources.shell
import com.davils.lume.icons.lucide.resources.shelving_unit
import com.davils.lume.icons.lucide.resources.shield
import com.davils.lume.icons.lucide.resources.shield_alert
import com.davils.lume.icons.lucide.resources.shield_ban
import com.davils.lume.icons.lucide.resources.shield_check
import com.davils.lume.icons.lucide.resources.shield_cog
import com.davils.lume.icons.lucide.resources.shield_cog_corner
import com.davils.lume.icons.lucide.resources.shield_ellipsis
import com.davils.lume.icons.lucide.resources.shield_half
import com.davils.lume.icons.lucide.resources.shield_minus
import com.davils.lume.icons.lucide.resources.shield_off
import com.davils.lume.icons.lucide.resources.shield_plus
import com.davils.lume.icons.lucide.resources.shield_question_mark
import com.davils.lume.icons.lucide.resources.shield_user
import com.davils.lume.icons.lucide.resources.shield_x
import com.davils.lume.icons.lucide.resources.ship
import com.davils.lume.icons.lucide.resources.ship_wheel
import com.davils.lume.icons.lucide.resources.shirt
import com.davils.lume.icons.lucide.resources.shopping_bag
import com.davils.lume.icons.lucide.resources.shopping_basket
import com.davils.lume.icons.lucide.resources.shopping_cart
import com.davils.lume.icons.lucide.resources.shovel
import com.davils.lume.icons.lucide.resources.shower_head
import com.davils.lume.icons.lucide.resources.shredder
import com.davils.lume.icons.lucide.resources.shrimp
import com.davils.lume.icons.lucide.resources.shrink
import com.davils.lume.icons.lucide.resources.shrub
import com.davils.lume.icons.lucide.resources.shuffle
import com.davils.lume.icons.lucide.resources.sigma
import com.davils.lume.icons.lucide.resources.signal
import com.davils.lume.icons.lucide.resources.signal_high
import com.davils.lume.icons.lucide.resources.signal_low
import com.davils.lume.icons.lucide.resources.signal_medium
import com.davils.lume.icons.lucide.resources.signal_zero
import com.davils.lume.icons.lucide.resources.signature
import com.davils.lume.icons.lucide.resources.signpost
import com.davils.lume.icons.lucide.resources.signpost_big
import com.davils.lume.icons.lucide.resources.siren
import com.davils.lume.icons.lucide.resources.skip_back
import com.davils.lume.icons.lucide.resources.skip_forward
import com.davils.lume.icons.lucide.resources.skull
import com.davils.lume.icons.lucide.resources.slash
import com.davils.lume.icons.lucide.resources.slice
import com.davils.lume.icons.lucide.resources.sliders_horizontal
import com.davils.lume.icons.lucide.resources.sliders_vertical
import com.davils.lume.icons.lucide.resources.smartphone
import com.davils.lume.icons.lucide.resources.smartphone_charging
import com.davils.lume.icons.lucide.resources.smartphone_nfc
import com.davils.lume.icons.lucide.resources.smile
import com.davils.lume.icons.lucide.resources.smile_plus
import com.davils.lume.icons.lucide.resources.snail
import com.davils.lume.icons.lucide.resources.snowflake
import com.davils.lume.icons.lucide.resources.soap_dispenser_droplet
import com.davils.lume.icons.lucide.resources.sofa
import com.davils.lume.icons.lucide.resources.solar_panel
import com.davils.lume.icons.lucide.resources.soup
import com.davils.lume.icons.lucide.resources.space
import com.davils.lume.icons.lucide.resources.spade
import com.davils.lume.icons.lucide.resources.sparkle
import com.davils.lume.icons.lucide.resources.sparkles
import com.davils.lume.icons.lucide.resources.speaker
import com.davils.lume.icons.lucide.resources.speech
import com.davils.lume.icons.lucide.resources.spell_check
import com.davils.lume.icons.lucide.resources.spell_check_2
import com.davils.lume.icons.lucide.resources.spline
import com.davils.lume.icons.lucide.resources.spline_pointer
import com.davils.lume.icons.lucide.resources.split
import com.davils.lume.icons.lucide.resources.spool
import com.davils.lume.icons.lucide.resources.sport_shoe
import com.davils.lume.icons.lucide.resources.spotlight
import com.davils.lume.icons.lucide.resources.spray_can
import com.davils.lume.icons.lucide.resources.sprout
import com.davils.lume.icons.lucide.resources.square
import com.davils.lume.icons.lucide.resources.square_activity
import com.davils.lume.icons.lucide.resources.square_arrow_down
import com.davils.lume.icons.lucide.resources.square_arrow_down_left
import com.davils.lume.icons.lucide.resources.square_arrow_down_right
import com.davils.lume.icons.lucide.resources.square_arrow_left
import com.davils.lume.icons.lucide.resources.square_arrow_out_down_left
import com.davils.lume.icons.lucide.resources.square_arrow_out_down_right
import com.davils.lume.icons.lucide.resources.square_arrow_out_up_left
import com.davils.lume.icons.lucide.resources.square_arrow_out_up_right
import com.davils.lume.icons.lucide.resources.square_arrow_right
import com.davils.lume.icons.lucide.resources.square_arrow_right_enter
import com.davils.lume.icons.lucide.resources.square_arrow_right_exit
import com.davils.lume.icons.lucide.resources.square_arrow_up
import com.davils.lume.icons.lucide.resources.square_arrow_up_left
import com.davils.lume.icons.lucide.resources.square_arrow_up_right
import com.davils.lume.icons.lucide.resources.square_asterisk
import com.davils.lume.icons.lucide.resources.square_bottom_dashed_scissors
import com.davils.lume.icons.lucide.resources.square_centerline_dashed_horizontal
import com.davils.lume.icons.lucide.resources.square_centerline_dashed_vertical
import com.davils.lume.icons.lucide.resources.square_chart_gantt
import com.davils.lume.icons.lucide.resources.square_check
import com.davils.lume.icons.lucide.resources.square_check_big
import com.davils.lume.icons.lucide.resources.square_chevron_down
import com.davils.lume.icons.lucide.resources.square_chevron_left
import com.davils.lume.icons.lucide.resources.square_chevron_right
import com.davils.lume.icons.lucide.resources.square_chevron_up
import com.davils.lume.icons.lucide.resources.square_code
import com.davils.lume.icons.lucide.resources.square_dashed
import com.davils.lume.icons.lucide.resources.square_dashed_bottom
import com.davils.lume.icons.lucide.resources.square_dashed_bottom_code
import com.davils.lume.icons.lucide.resources.square_dashed_kanban
import com.davils.lume.icons.lucide.resources.square_dashed_mouse_pointer
import com.davils.lume.icons.lucide.resources.square_dashed_text
import com.davils.lume.icons.lucide.resources.square_dashed_top_solid
import com.davils.lume.icons.lucide.resources.square_divide
import com.davils.lume.icons.lucide.resources.square_dot
import com.davils.lume.icons.lucide.resources.square_equal
import com.davils.lume.icons.lucide.resources.square_function
import com.davils.lume.icons.lucide.resources.square_kanban
import com.davils.lume.icons.lucide.resources.square_library
import com.davils.lume.icons.lucide.resources.square_m
import com.davils.lume.icons.lucide.resources.square_menu
import com.davils.lume.icons.lucide.resources.square_minus
import com.davils.lume.icons.lucide.resources.square_mouse_pointer
import com.davils.lume.icons.lucide.resources.square_parking
import com.davils.lume.icons.lucide.resources.square_parking_off
import com.davils.lume.icons.lucide.resources.square_pause
import com.davils.lume.icons.lucide.resources.square_pen
import com.davils.lume.icons.lucide.resources.square_percent
import com.davils.lume.icons.lucide.resources.square_pi
import com.davils.lume.icons.lucide.resources.square_pilcrow
import com.davils.lume.icons.lucide.resources.square_play
import com.davils.lume.icons.lucide.resources.square_plus
import com.davils.lume.icons.lucide.resources.square_power
import com.davils.lume.icons.lucide.resources.square_radical
import com.davils.lume.icons.lucide.resources.square_round_corner
import com.davils.lume.icons.lucide.resources.square_scissors
import com.davils.lume.icons.lucide.resources.square_sigma
import com.davils.lume.icons.lucide.resources.square_slash
import com.davils.lume.icons.lucide.resources.square_split_horizontal
import com.davils.lume.icons.lucide.resources.square_split_vertical
import com.davils.lume.icons.lucide.resources.square_square
import com.davils.lume.icons.lucide.resources.square_stack
import com.davils.lume.icons.lucide.resources.square_star
import com.davils.lume.icons.lucide.resources.square_stop
import com.davils.lume.icons.lucide.resources.square_terminal
import com.davils.lume.icons.lucide.resources.square_user
import com.davils.lume.icons.lucide.resources.square_user_round
import com.davils.lume.icons.lucide.resources.square_x
import com.davils.lume.icons.lucide.resources.squares_exclude
import com.davils.lume.icons.lucide.resources.squares_intersect
import com.davils.lume.icons.lucide.resources.squares_subtract
import com.davils.lume.icons.lucide.resources.squares_unite
import com.davils.lume.icons.lucide.resources.squircle
import com.davils.lume.icons.lucide.resources.squircle_dashed
import com.davils.lume.icons.lucide.resources.squirrel
import com.davils.lume.icons.lucide.resources.stamp
import com.davils.lume.icons.lucide.resources.star
import com.davils.lume.icons.lucide.resources.star_half
import com.davils.lume.icons.lucide.resources.star_off
import com.davils.lume.icons.lucide.resources.step_back
import com.davils.lume.icons.lucide.resources.step_forward
import com.davils.lume.icons.lucide.resources.stethoscope
import com.davils.lume.icons.lucide.resources.sticker
import com.davils.lume.icons.lucide.resources.sticky_note
import com.davils.lume.icons.lucide.resources.stone
import com.davils.lume.icons.lucide.resources.store
import com.davils.lume.icons.lucide.resources.stretch_horizontal
import com.davils.lume.icons.lucide.resources.stretch_vertical
import com.davils.lume.icons.lucide.resources.strikethrough
import com.davils.lume.icons.lucide.resources.subscript
import com.davils.lume.icons.lucide.resources.sun
import com.davils.lume.icons.lucide.resources.sun_dim
import com.davils.lume.icons.lucide.resources.sun_medium
import com.davils.lume.icons.lucide.resources.sun_moon
import com.davils.lume.icons.lucide.resources.sun_snow
import com.davils.lume.icons.lucide.resources.sunrise
import com.davils.lume.icons.lucide.resources.sunset
import com.davils.lume.icons.lucide.resources.superscript
import com.davils.lume.icons.lucide.resources.swatch_book
import com.davils.lume.icons.lucide.resources.swiss_franc
import com.davils.lume.icons.lucide.resources.switch_camera
import com.davils.lume.icons.lucide.resources.sword
import com.davils.lume.icons.lucide.resources.swords
import com.davils.lume.icons.lucide.resources.syringe
import com.davils.lume.icons.lucide.resources.table
import com.davils.lume.icons.lucide.resources.table_2
import com.davils.lume.icons.lucide.resources.table_cells_merge
import com.davils.lume.icons.lucide.resources.table_cells_split
import com.davils.lume.icons.lucide.resources.table_columns_split
import com.davils.lume.icons.lucide.resources.table_of_contents
import com.davils.lume.icons.lucide.resources.table_properties
import com.davils.lume.icons.lucide.resources.table_rows_split
import com.davils.lume.icons.lucide.resources.tablet
import com.davils.lume.icons.lucide.resources.tablet_smartphone
import com.davils.lume.icons.lucide.resources.tablets
import com.davils.lume.icons.lucide.resources.tag
import com.davils.lume.icons.lucide.resources.tags
import com.davils.lume.icons.lucide.resources.tally_1
import com.davils.lume.icons.lucide.resources.tally_2
import com.davils.lume.icons.lucide.resources.tally_3
import com.davils.lume.icons.lucide.resources.tally_4
import com.davils.lume.icons.lucide.resources.tally_5
import com.davils.lume.icons.lucide.resources.tangent
import com.davils.lume.icons.lucide.resources.target
import com.davils.lume.icons.lucide.resources.telescope
import com.davils.lume.icons.lucide.resources.tent
import com.davils.lume.icons.lucide.resources.tent_tree
import com.davils.lume.icons.lucide.resources.terminal
import com.davils.lume.icons.lucide.resources.test_tube
import com.davils.lume.icons.lucide.resources.test_tube_diagonal
import com.davils.lume.icons.lucide.resources.test_tubes
import com.davils.lume.icons.lucide.resources.text_align_center
import com.davils.lume.icons.lucide.resources.text_align_end
import com.davils.lume.icons.lucide.resources.text_align_justify
import com.davils.lume.icons.lucide.resources.text_align_start
import com.davils.lume.icons.lucide.resources.text_cursor
import com.davils.lume.icons.lucide.resources.text_cursor_input
import com.davils.lume.icons.lucide.resources.text_initial
import com.davils.lume.icons.lucide.resources.text_quote
import com.davils.lume.icons.lucide.resources.text_search
import com.davils.lume.icons.lucide.resources.text_wrap
import com.davils.lume.icons.lucide.resources.theater
import com.davils.lume.icons.lucide.resources.thermometer
import com.davils.lume.icons.lucide.resources.thermometer_snowflake
import com.davils.lume.icons.lucide.resources.thermometer_sun
import com.davils.lume.icons.lucide.resources.thumbs_down
import com.davils.lume.icons.lucide.resources.thumbs_up
import com.davils.lume.icons.lucide.resources.ticket
import com.davils.lume.icons.lucide.resources.ticket_check
import com.davils.lume.icons.lucide.resources.ticket_minus
import com.davils.lume.icons.lucide.resources.ticket_percent
import com.davils.lume.icons.lucide.resources.ticket_plus
import com.davils.lume.icons.lucide.resources.ticket_slash
import com.davils.lume.icons.lucide.resources.ticket_x
import com.davils.lume.icons.lucide.resources.tickets
import com.davils.lume.icons.lucide.resources.tickets_plane
import com.davils.lume.icons.lucide.resources.timer
import com.davils.lume.icons.lucide.resources.timer_off
import com.davils.lume.icons.lucide.resources.timer_reset
import com.davils.lume.icons.lucide.resources.toggle_left
import com.davils.lume.icons.lucide.resources.toggle_right
import com.davils.lume.icons.lucide.resources.toilet
import com.davils.lume.icons.lucide.resources.tool_case
import com.davils.lume.icons.lucide.resources.toolbox
import com.davils.lume.icons.lucide.resources.tornado
import com.davils.lume.icons.lucide.resources.torus
import com.davils.lume.icons.lucide.resources.touchpad
import com.davils.lume.icons.lucide.resources.touchpad_off
import com.davils.lume.icons.lucide.resources.towel_rack
import com.davils.lume.icons.lucide.resources.tower_control
import com.davils.lume.icons.lucide.resources.toy_brick
import com.davils.lume.icons.lucide.resources.tractor
import com.davils.lume.icons.lucide.resources.traffic_cone
import com.davils.lume.icons.lucide.resources.train_front
import com.davils.lume.icons.lucide.resources.train_front_tunnel
import com.davils.lume.icons.lucide.resources.train_track
import com.davils.lume.icons.lucide.resources.tram_front
import com.davils.lume.icons.lucide.resources.transgender
import com.davils.lume.icons.lucide.resources.trash
import com.davils.lume.icons.lucide.resources.trash_2
import com.davils.lume.icons.lucide.resources.tree_deciduous
import com.davils.lume.icons.lucide.resources.tree_palm
import com.davils.lume.icons.lucide.resources.tree_pine
import com.davils.lume.icons.lucide.resources.trees
import com.davils.lume.icons.lucide.resources.trending_down
import com.davils.lume.icons.lucide.resources.trending_up
import com.davils.lume.icons.lucide.resources.trending_up_down
import com.davils.lume.icons.lucide.resources.triangle
import com.davils.lume.icons.lucide.resources.triangle_alert
import com.davils.lume.icons.lucide.resources.triangle_dashed
import com.davils.lume.icons.lucide.resources.triangle_right
import com.davils.lume.icons.lucide.resources.trophy
import com.davils.lume.icons.lucide.resources.truck
import com.davils.lume.icons.lucide.resources.truck_electric
import com.davils.lume.icons.lucide.resources.turkish_lira
import com.davils.lume.icons.lucide.resources.turntable
import com.davils.lume.icons.lucide.resources.turtle
import com.davils.lume.icons.lucide.resources.tv
import com.davils.lume.icons.lucide.resources.tv_minimal
import com.davils.lume.icons.lucide.resources.tv_minimal_play
import com.davils.lume.icons.lucide.resources.type
import com.davils.lume.icons.lucide.resources.type_outline
import com.davils.lume.icons.lucide.resources.umbrella
import com.davils.lume.icons.lucide.resources.umbrella_off
import com.davils.lume.icons.lucide.resources.underline
import com.davils.lume.icons.lucide.resources.undo
import com.davils.lume.icons.lucide.resources.undo_2
import com.davils.lume.icons.lucide.resources.undo_dot
import com.davils.lume.icons.lucide.resources.unfold_horizontal
import com.davils.lume.icons.lucide.resources.unfold_vertical
import com.davils.lume.icons.lucide.resources.ungroup
import com.davils.lume.icons.lucide.resources.university
import com.davils.lume.icons.lucide.resources.unlink
import com.davils.lume.icons.lucide.resources.unlink_2
import com.davils.lume.icons.lucide.resources.unplug
import com.davils.lume.icons.lucide.resources.upload
import com.davils.lume.icons.lucide.resources.usb
import com.davils.lume.icons.lucide.resources.user
import com.davils.lume.icons.lucide.resources.user_check
import com.davils.lume.icons.lucide.resources.user_cog
import com.davils.lume.icons.lucide.resources.user_key
import com.davils.lume.icons.lucide.resources.user_lock
import com.davils.lume.icons.lucide.resources.user_minus
import com.davils.lume.icons.lucide.resources.user_pen
import com.davils.lume.icons.lucide.resources.user_plus
import com.davils.lume.icons.lucide.resources.user_round
import com.davils.lume.icons.lucide.resources.user_round_check
import com.davils.lume.icons.lucide.resources.user_round_cog
import com.davils.lume.icons.lucide.resources.user_round_key
import com.davils.lume.icons.lucide.resources.user_round_minus
import com.davils.lume.icons.lucide.resources.user_round_pen
import com.davils.lume.icons.lucide.resources.user_round_plus
import com.davils.lume.icons.lucide.resources.user_round_search
import com.davils.lume.icons.lucide.resources.user_round_x
import com.davils.lume.icons.lucide.resources.user_search
import com.davils.lume.icons.lucide.resources.user_star
import com.davils.lume.icons.lucide.resources.user_x
import com.davils.lume.icons.lucide.resources.users
import com.davils.lume.icons.lucide.resources.users_round
import com.davils.lume.icons.lucide.resources.utensils
import com.davils.lume.icons.lucide.resources.utensils_crossed
import com.davils.lume.icons.lucide.resources.utility_pole
import com.davils.lume.icons.lucide.resources.van
import com.davils.lume.icons.lucide.resources.variable
import com.davils.lume.icons.lucide.resources.vault
import com.davils.lume.icons.lucide.resources.vector_square
import com.davils.lume.icons.lucide.resources.vegan
import com.davils.lume.icons.lucide.resources.venetian_mask
import com.davils.lume.icons.lucide.resources.venus
import com.davils.lume.icons.lucide.resources.venus_and_mars
import com.davils.lume.icons.lucide.resources.vibrate
import com.davils.lume.icons.lucide.resources.vibrate_off
import com.davils.lume.icons.lucide.resources.video
import com.davils.lume.icons.lucide.resources.video_off
import com.davils.lume.icons.lucide.resources.videotape
import com.davils.lume.icons.lucide.resources.view
import com.davils.lume.icons.lucide.resources.voicemail
import com.davils.lume.icons.lucide.resources.volleyball
import com.davils.lume.icons.lucide.resources.volume
import com.davils.lume.icons.lucide.resources.volume_1
import com.davils.lume.icons.lucide.resources.volume_2
import com.davils.lume.icons.lucide.resources.volume_off
import com.davils.lume.icons.lucide.resources.volume_x
import com.davils.lume.icons.lucide.resources.vote
import com.davils.lume.icons.lucide.resources.wallet
import com.davils.lume.icons.lucide.resources.wallet_cards
import com.davils.lume.icons.lucide.resources.wallet_minimal
import com.davils.lume.icons.lucide.resources.wallpaper
import com.davils.lume.icons.lucide.resources.wand
import com.davils.lume.icons.lucide.resources.wand_sparkles
import com.davils.lume.icons.lucide.resources.warehouse
import com.davils.lume.icons.lucide.resources.washing_machine
import com.davils.lume.icons.lucide.resources.watch
import com.davils.lume.icons.lucide.resources.waves
import com.davils.lume.icons.lucide.resources.waves_arrow_down
import com.davils.lume.icons.lucide.resources.waves_arrow_up
import com.davils.lume.icons.lucide.resources.waves_ladder
import com.davils.lume.icons.lucide.resources.waypoints
import com.davils.lume.icons.lucide.resources.webcam
import com.davils.lume.icons.lucide.resources.webhook
import com.davils.lume.icons.lucide.resources.webhook_off
import com.davils.lume.icons.lucide.resources.weight
import com.davils.lume.icons.lucide.resources.weight_tilde
import com.davils.lume.icons.lucide.resources.wheat
import com.davils.lume.icons.lucide.resources.wheat_off
import com.davils.lume.icons.lucide.resources.whole_word
import com.davils.lume.icons.lucide.resources.wifi
import com.davils.lume.icons.lucide.resources.wifi_cog
import com.davils.lume.icons.lucide.resources.wifi_high
import com.davils.lume.icons.lucide.resources.wifi_low
import com.davils.lume.icons.lucide.resources.wifi_off
import com.davils.lume.icons.lucide.resources.wifi_pen
import com.davils.lume.icons.lucide.resources.wifi_sync
import com.davils.lume.icons.lucide.resources.wifi_zero
import com.davils.lume.icons.lucide.resources.wind
import com.davils.lume.icons.lucide.resources.wind_arrow_down
import com.davils.lume.icons.lucide.resources.wine
import com.davils.lume.icons.lucide.resources.wine_off
import com.davils.lume.icons.lucide.resources.workflow
import com.davils.lume.icons.lucide.resources.worm
import com.davils.lume.icons.lucide.resources.wrench
import com.davils.lume.icons.lucide.resources.x
import com.davils.lume.icons.lucide.resources.x_line_top
import com.davils.lume.icons.lucide.resources.zap
import com.davils.lume.icons.lucide.resources.zap_off
import com.davils.lume.icons.lucide.resources.zodiac_aquarius
import com.davils.lume.icons.lucide.resources.zodiac_aries
import com.davils.lume.icons.lucide.resources.zodiac_cancer
import com.davils.lume.icons.lucide.resources.zodiac_capricorn
import com.davils.lume.icons.lucide.resources.zodiac_gemini
import com.davils.lume.icons.lucide.resources.zodiac_leo
import com.davils.lume.icons.lucide.resources.zodiac_libra
import com.davils.lume.icons.lucide.resources.zodiac_ophiuchus
import com.davils.lume.icons.lucide.resources.zodiac_pisces
import com.davils.lume.icons.lucide.resources.zodiac_sagittarius
import com.davils.lume.icons.lucide.resources.zodiac_scorpio
import com.davils.lume.icons.lucide.resources.zodiac_taurus
import com.davils.lume.icons.lucide.resources.zodiac_virgo
import com.davils.lume.icons.lucide.resources.zoom_in
import com.davils.lume.icons.lucide.resources.zoom_out
import org.jetbrains.compose.resources.painterResource

public object LucidePainter {
  /**
   * Returns a `Painter` for the `a_arrow_down` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/a-arrow-down
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun aArrowDown(): Painter = painterResource(LumeLucideResources.drawable.a_arrow_down)

  /**
   * Returns a `Painter` for the `a_arrow_up` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/a-arrow-up
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun aArrowUp(): Painter = painterResource(LumeLucideResources.drawable.a_arrow_up)

  /**
   * Returns a `Painter` for the `a_large_small` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/a-large-small
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun aLargeSmall(): Painter = painterResource(LumeLucideResources.drawable.a_large_small)

  /**
   * Returns a `Painter` for the `accessibility` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/accessibility
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun accessibility(): Painter = painterResource(LumeLucideResources.drawable.accessibility)

  /**
   * Returns a `Painter` for the `activity` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/activity
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun activity(): Painter = painterResource(LumeLucideResources.drawable.activity)

  /**
   * Returns a `Painter` for the `air_vent` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/air-vent
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun airVent(): Painter = painterResource(LumeLucideResources.drawable.air_vent)

  /**
   * Returns a `Painter` for the `airplay` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/airplay
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun airplay(): Painter = painterResource(LumeLucideResources.drawable.airplay)

  /**
   * Returns a `Painter` for the `alarm_clock` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/alarm-clock
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun alarmClock(): Painter = painterResource(LumeLucideResources.drawable.alarm_clock)

  /**
   * Returns a `Painter` for the `alarm_clock_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/alarm-clock-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun alarmClockCheck(): Painter = painterResource(LumeLucideResources.drawable.alarm_clock_check)

  /**
   * Returns a `Painter` for the `alarm_clock_minus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/alarm-clock-minus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun alarmClockMinus(): Painter = painterResource(LumeLucideResources.drawable.alarm_clock_minus)

  /**
   * Returns a `Painter` for the `alarm_clock_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/alarm-clock-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun alarmClockOff(): Painter = painterResource(LumeLucideResources.drawable.alarm_clock_off)

  /**
   * Returns a `Painter` for the `alarm_clock_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/alarm-clock-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun alarmClockPlus(): Painter = painterResource(LumeLucideResources.drawable.alarm_clock_plus)

  /**
   * Returns a `Painter` for the `alarm_smoke` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/alarm-smoke
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun alarmSmoke(): Painter = painterResource(LumeLucideResources.drawable.alarm_smoke)

  /**
   * Returns a `Painter` for the `album` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/album
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun album(): Painter = painterResource(LumeLucideResources.drawable.album)

  /**
   * Returns a `Painter` for the `align_center_horizontal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/align-center-horizontal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun alignCenterHorizontal(): Painter = painterResource(LumeLucideResources.drawable.align_center_horizontal)

  /**
   * Returns a `Painter` for the `align_center_vertical` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/align-center-vertical
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun alignCenterVertical(): Painter = painterResource(LumeLucideResources.drawable.align_center_vertical)

  /**
   * Returns a `Painter` for the `align_end_horizontal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/align-end-horizontal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun alignEndHorizontal(): Painter = painterResource(LumeLucideResources.drawable.align_end_horizontal)

  /**
   * Returns a `Painter` for the `align_end_vertical` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/align-end-vertical
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun alignEndVertical(): Painter = painterResource(LumeLucideResources.drawable.align_end_vertical)

  /**
   * Returns a `Painter` for the `align_horizontal_distribute_center` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/align-horizontal-distribute-center
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun alignHorizontalDistributeCenter(): Painter = painterResource(LumeLucideResources.drawable.align_horizontal_distribute_center)

  /**
   * Returns a `Painter` for the `align_horizontal_distribute_end` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/align-horizontal-distribute-end
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun alignHorizontalDistributeEnd(): Painter = painterResource(LumeLucideResources.drawable.align_horizontal_distribute_end)

  /**
   * Returns a `Painter` for the `align_horizontal_distribute_start` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/align-horizontal-distribute-start
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun alignHorizontalDistributeStart(): Painter = painterResource(LumeLucideResources.drawable.align_horizontal_distribute_start)

  /**
   * Returns a `Painter` for the `align_horizontal_justify_center` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/align-horizontal-justify-center
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun alignHorizontalJustifyCenter(): Painter = painterResource(LumeLucideResources.drawable.align_horizontal_justify_center)

  /**
   * Returns a `Painter` for the `align_horizontal_justify_end` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/align-horizontal-justify-end
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun alignHorizontalJustifyEnd(): Painter = painterResource(LumeLucideResources.drawable.align_horizontal_justify_end)

  /**
   * Returns a `Painter` for the `align_horizontal_justify_start` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/align-horizontal-justify-start
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun alignHorizontalJustifyStart(): Painter = painterResource(LumeLucideResources.drawable.align_horizontal_justify_start)

  /**
   * Returns a `Painter` for the `align_horizontal_space_around` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/align-horizontal-space-around
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun alignHorizontalSpaceAround(): Painter = painterResource(LumeLucideResources.drawable.align_horizontal_space_around)

  /**
   * Returns a `Painter` for the `align_horizontal_space_between` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/align-horizontal-space-between
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun alignHorizontalSpaceBetween(): Painter = painterResource(LumeLucideResources.drawable.align_horizontal_space_between)

  /**
   * Returns a `Painter` for the `align_start_horizontal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/align-start-horizontal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun alignStartHorizontal(): Painter = painterResource(LumeLucideResources.drawable.align_start_horizontal)

  /**
   * Returns a `Painter` for the `align_start_vertical` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/align-start-vertical
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun alignStartVertical(): Painter = painterResource(LumeLucideResources.drawable.align_start_vertical)

  /**
   * Returns a `Painter` for the `align_vertical_distribute_center` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/align-vertical-distribute-center
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun alignVerticalDistributeCenter(): Painter = painterResource(LumeLucideResources.drawable.align_vertical_distribute_center)

  /**
   * Returns a `Painter` for the `align_vertical_distribute_end` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/align-vertical-distribute-end
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun alignVerticalDistributeEnd(): Painter = painterResource(LumeLucideResources.drawable.align_vertical_distribute_end)

  /**
   * Returns a `Painter` for the `align_vertical_distribute_start` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/align-vertical-distribute-start
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun alignVerticalDistributeStart(): Painter = painterResource(LumeLucideResources.drawable.align_vertical_distribute_start)

  /**
   * Returns a `Painter` for the `align_vertical_justify_center` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/align-vertical-justify-center
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun alignVerticalJustifyCenter(): Painter = painterResource(LumeLucideResources.drawable.align_vertical_justify_center)

  /**
   * Returns a `Painter` for the `align_vertical_justify_end` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/align-vertical-justify-end
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun alignVerticalJustifyEnd(): Painter = painterResource(LumeLucideResources.drawable.align_vertical_justify_end)

  /**
   * Returns a `Painter` for the `align_vertical_justify_start` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/align-vertical-justify-start
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun alignVerticalJustifyStart(): Painter = painterResource(LumeLucideResources.drawable.align_vertical_justify_start)

  /**
   * Returns a `Painter` for the `align_vertical_space_around` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/align-vertical-space-around
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun alignVerticalSpaceAround(): Painter = painterResource(LumeLucideResources.drawable.align_vertical_space_around)

  /**
   * Returns a `Painter` for the `align_vertical_space_between` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/align-vertical-space-between
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun alignVerticalSpaceBetween(): Painter = painterResource(LumeLucideResources.drawable.align_vertical_space_between)

  /**
   * Returns a `Painter` for the `ambulance` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ambulance
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun ambulance(): Painter = painterResource(LumeLucideResources.drawable.ambulance)

  /**
   * Returns a `Painter` for the `ampersand` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ampersand
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun ampersand(): Painter = painterResource(LumeLucideResources.drawable.ampersand)

  /**
   * Returns a `Painter` for the `ampersands` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ampersands
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun ampersands(): Painter = painterResource(LumeLucideResources.drawable.ampersands)

  /**
   * Returns a `Painter` for the `amphora` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/amphora
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun amphora(): Painter = painterResource(LumeLucideResources.drawable.amphora)

  /**
   * Returns a `Painter` for the `anchor` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/anchor
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun anchor(): Painter = painterResource(LumeLucideResources.drawable.anchor)

  /**
   * Returns a `Painter` for the `angry` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/angry
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun angry(): Painter = painterResource(LumeLucideResources.drawable.angry)

  /**
   * Returns a `Painter` for the `annoyed` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/annoyed
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun annoyed(): Painter = painterResource(LumeLucideResources.drawable.annoyed)

  /**
   * Returns a `Painter` for the `antenna` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/antenna
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun antenna(): Painter = painterResource(LumeLucideResources.drawable.antenna)

  /**
   * Returns a `Painter` for the `anvil` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/anvil
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun anvil(): Painter = painterResource(LumeLucideResources.drawable.anvil)

  /**
   * Returns a `Painter` for the `aperture` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/aperture
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun aperture(): Painter = painterResource(LumeLucideResources.drawable.aperture)

  /**
   * Returns a `Painter` for the `app_window` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/app-window
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun appWindow(): Painter = painterResource(LumeLucideResources.drawable.app_window)

  /**
   * Returns a `Painter` for the `app_window_mac` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/app-window-mac
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun appWindowMac(): Painter = painterResource(LumeLucideResources.drawable.app_window_mac)

  /**
   * Returns a `Painter` for the `apple` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/apple
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun apple(): Painter = painterResource(LumeLucideResources.drawable.apple)

  /**
   * Returns a `Painter` for the `archive` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/archive
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun archive(): Painter = painterResource(LumeLucideResources.drawable.archive)

  /**
   * Returns a `Painter` for the `archive_restore` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/archive-restore
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun archiveRestore(): Painter = painterResource(LumeLucideResources.drawable.archive_restore)

  /**
   * Returns a `Painter` for the `archive_x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/archive-x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun archiveX(): Painter = painterResource(LumeLucideResources.drawable.archive_x)

  /**
   * Returns a `Painter` for the `armchair` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/armchair
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun armchair(): Painter = painterResource(LumeLucideResources.drawable.armchair)

  /**
   * Returns a `Painter` for the `arrow_big_down` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-big-down
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowBigDown(): Painter = painterResource(LumeLucideResources.drawable.arrow_big_down)

  /**
   * Returns a `Painter` for the `arrow_big_down_dash` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-big-down-dash
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowBigDownDash(): Painter = painterResource(LumeLucideResources.drawable.arrow_big_down_dash)

  /**
   * Returns a `Painter` for the `arrow_big_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-big-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowBigLeft(): Painter = painterResource(LumeLucideResources.drawable.arrow_big_left)

  /**
   * Returns a `Painter` for the `arrow_big_left_dash` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-big-left-dash
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowBigLeftDash(): Painter = painterResource(LumeLucideResources.drawable.arrow_big_left_dash)

  /**
   * Returns a `Painter` for the `arrow_big_right` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-big-right
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowBigRight(): Painter = painterResource(LumeLucideResources.drawable.arrow_big_right)

  /**
   * Returns a `Painter` for the `arrow_big_right_dash` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-big-right-dash
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowBigRightDash(): Painter = painterResource(LumeLucideResources.drawable.arrow_big_right_dash)

  /**
   * Returns a `Painter` for the `arrow_big_up` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-big-up
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowBigUp(): Painter = painterResource(LumeLucideResources.drawable.arrow_big_up)

  /**
   * Returns a `Painter` for the `arrow_big_up_dash` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-big-up-dash
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowBigUpDash(): Painter = painterResource(LumeLucideResources.drawable.arrow_big_up_dash)

  /**
   * Returns a `Painter` for the `arrow_down` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-down
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowDown(): Painter = painterResource(LumeLucideResources.drawable.arrow_down)

  /**
   * Returns a `Painter` for the `arrow_down_0_1` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-down-0-1
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowDown01(): Painter = painterResource(LumeLucideResources.drawable.arrow_down_0_1)

  /**
   * Returns a `Painter` for the `arrow_down_1_0` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-down-1-0
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowDown10(): Painter = painterResource(LumeLucideResources.drawable.arrow_down_1_0)

  /**
   * Returns a `Painter` for the `arrow_down_a_z` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-down-a-z
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowDownAZ(): Painter = painterResource(LumeLucideResources.drawable.arrow_down_a_z)

  /**
   * Returns a `Painter` for the `arrow_down_from_line` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-down-from-line
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowDownFromLine(): Painter = painterResource(LumeLucideResources.drawable.arrow_down_from_line)

  /**
   * Returns a `Painter` for the `arrow_down_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-down-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowDownLeft(): Painter = painterResource(LumeLucideResources.drawable.arrow_down_left)

  /**
   * Returns a `Painter` for the `arrow_down_narrow_wide` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-down-narrow-wide
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowDownNarrowWide(): Painter = painterResource(LumeLucideResources.drawable.arrow_down_narrow_wide)

  /**
   * Returns a `Painter` for the `arrow_down_right` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-down-right
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowDownRight(): Painter = painterResource(LumeLucideResources.drawable.arrow_down_right)

  /**
   * Returns a `Painter` for the `arrow_down_to_dot` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-down-to-dot
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowDownToDot(): Painter = painterResource(LumeLucideResources.drawable.arrow_down_to_dot)

  /**
   * Returns a `Painter` for the `arrow_down_to_line` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-down-to-line
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowDownToLine(): Painter = painterResource(LumeLucideResources.drawable.arrow_down_to_line)

  /**
   * Returns a `Painter` for the `arrow_down_up` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-down-up
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowDownUp(): Painter = painterResource(LumeLucideResources.drawable.arrow_down_up)

  /**
   * Returns a `Painter` for the `arrow_down_wide_narrow` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-down-wide-narrow
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowDownWideNarrow(): Painter = painterResource(LumeLucideResources.drawable.arrow_down_wide_narrow)

  /**
   * Returns a `Painter` for the `arrow_down_z_a` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-down-z-a
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowDownZA(): Painter = painterResource(LumeLucideResources.drawable.arrow_down_z_a)

  /**
   * Returns a `Painter` for the `arrow_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowLeft(): Painter = painterResource(LumeLucideResources.drawable.arrow_left)

  /**
   * Returns a `Painter` for the `arrow_left_from_line` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-left-from-line
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowLeftFromLine(): Painter = painterResource(LumeLucideResources.drawable.arrow_left_from_line)

  /**
   * Returns a `Painter` for the `arrow_left_right` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-left-right
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowLeftRight(): Painter = painterResource(LumeLucideResources.drawable.arrow_left_right)

  /**
   * Returns a `Painter` for the `arrow_left_to_line` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-left-to-line
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowLeftToLine(): Painter = painterResource(LumeLucideResources.drawable.arrow_left_to_line)

  /**
   * Returns a `Painter` for the `arrow_right` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-right
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowRight(): Painter = painterResource(LumeLucideResources.drawable.arrow_right)

  /**
   * Returns a `Painter` for the `arrow_right_from_line` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-right-from-line
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowRightFromLine(): Painter = painterResource(LumeLucideResources.drawable.arrow_right_from_line)

  /**
   * Returns a `Painter` for the `arrow_right_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-right-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowRightLeft(): Painter = painterResource(LumeLucideResources.drawable.arrow_right_left)

  /**
   * Returns a `Painter` for the `arrow_right_to_line` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-right-to-line
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowRightToLine(): Painter = painterResource(LumeLucideResources.drawable.arrow_right_to_line)

  /**
   * Returns a `Painter` for the `arrow_up` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-up
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowUp(): Painter = painterResource(LumeLucideResources.drawable.arrow_up)

  /**
   * Returns a `Painter` for the `arrow_up_0_1` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-up-0-1
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowUp01(): Painter = painterResource(LumeLucideResources.drawable.arrow_up_0_1)

  /**
   * Returns a `Painter` for the `arrow_up_1_0` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-up-1-0
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowUp10(): Painter = painterResource(LumeLucideResources.drawable.arrow_up_1_0)

  /**
   * Returns a `Painter` for the `arrow_up_a_z` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-up-a-z
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowUpAZ(): Painter = painterResource(LumeLucideResources.drawable.arrow_up_a_z)

  /**
   * Returns a `Painter` for the `arrow_up_down` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-up-down
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowUpDown(): Painter = painterResource(LumeLucideResources.drawable.arrow_up_down)

  /**
   * Returns a `Painter` for the `arrow_up_from_dot` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-up-from-dot
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowUpFromDot(): Painter = painterResource(LumeLucideResources.drawable.arrow_up_from_dot)

  /**
   * Returns a `Painter` for the `arrow_up_from_line` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-up-from-line
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowUpFromLine(): Painter = painterResource(LumeLucideResources.drawable.arrow_up_from_line)

  /**
   * Returns a `Painter` for the `arrow_up_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-up-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowUpLeft(): Painter = painterResource(LumeLucideResources.drawable.arrow_up_left)

  /**
   * Returns a `Painter` for the `arrow_up_narrow_wide` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-up-narrow-wide
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowUpNarrowWide(): Painter = painterResource(LumeLucideResources.drawable.arrow_up_narrow_wide)

  /**
   * Returns a `Painter` for the `arrow_up_right` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-up-right
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowUpRight(): Painter = painterResource(LumeLucideResources.drawable.arrow_up_right)

  /**
   * Returns a `Painter` for the `arrow_up_to_line` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-up-to-line
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowUpToLine(): Painter = painterResource(LumeLucideResources.drawable.arrow_up_to_line)

  /**
   * Returns a `Painter` for the `arrow_up_wide_narrow` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-up-wide-narrow
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowUpWideNarrow(): Painter = painterResource(LumeLucideResources.drawable.arrow_up_wide_narrow)

  /**
   * Returns a `Painter` for the `arrow_up_z_a` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrow-up-z-a
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowUpZA(): Painter = painterResource(LumeLucideResources.drawable.arrow_up_z_a)

  /**
   * Returns a `Painter` for the `arrows_up_from_line` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/arrows-up-from-line
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun arrowsUpFromLine(): Painter = painterResource(LumeLucideResources.drawable.arrows_up_from_line)

  /**
   * Returns a `Painter` for the `asterisk` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/asterisk
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun asterisk(): Painter = painterResource(LumeLucideResources.drawable.asterisk)

  /**
   * Returns a `Painter` for the `at_sign` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/at-sign
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun atSign(): Painter = painterResource(LumeLucideResources.drawable.at_sign)

  /**
   * Returns a `Painter` for the `atom` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/atom
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun atom(): Painter = painterResource(LumeLucideResources.drawable.atom)

  /**
   * Returns a `Painter` for the `audio_lines` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/audio-lines
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun audioLines(): Painter = painterResource(LumeLucideResources.drawable.audio_lines)

  /**
   * Returns a `Painter` for the `audio_waveform` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/audio-waveform
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun audioWaveform(): Painter = painterResource(LumeLucideResources.drawable.audio_waveform)

  /**
   * Returns a `Painter` for the `award` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/award
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun award(): Painter = painterResource(LumeLucideResources.drawable.award)

  /**
   * Returns a `Painter` for the `axe` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/axe
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun axe(): Painter = painterResource(LumeLucideResources.drawable.axe)

  /**
   * Returns a `Painter` for the `axis_3d` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/axis-3d
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun axis3d(): Painter = painterResource(LumeLucideResources.drawable.axis_3d)

  /**
   * Returns a `Painter` for the `baby` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/baby
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun baby(): Painter = painterResource(LumeLucideResources.drawable.baby)

  /**
   * Returns a `Painter` for the `backpack` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/backpack
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun backpack(): Painter = painterResource(LumeLucideResources.drawable.backpack)

  /**
   * Returns a `Painter` for the `badge` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/badge
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun badge(): Painter = painterResource(LumeLucideResources.drawable.badge)

  /**
   * Returns a `Painter` for the `badge_alert` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/badge-alert
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun badgeAlert(): Painter = painterResource(LumeLucideResources.drawable.badge_alert)

  /**
   * Returns a `Painter` for the `badge_cent` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/badge-cent
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun badgeCent(): Painter = painterResource(LumeLucideResources.drawable.badge_cent)

  /**
   * Returns a `Painter` for the `badge_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/badge-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun badgeCheck(): Painter = painterResource(LumeLucideResources.drawable.badge_check)

  /**
   * Returns a `Painter` for the `badge_dollar_sign` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/badge-dollar-sign
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun badgeDollarSign(): Painter = painterResource(LumeLucideResources.drawable.badge_dollar_sign)

  /**
   * Returns a `Painter` for the `badge_euro` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/badge-euro
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun badgeEuro(): Painter = painterResource(LumeLucideResources.drawable.badge_euro)

  /**
   * Returns a `Painter` for the `badge_indian_rupee` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/badge-indian-rupee
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun badgeIndianRupee(): Painter = painterResource(LumeLucideResources.drawable.badge_indian_rupee)

  /**
   * Returns a `Painter` for the `badge_info` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/badge-info
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun badgeInfo(): Painter = painterResource(LumeLucideResources.drawable.badge_info)

  /**
   * Returns a `Painter` for the `badge_japanese_yen` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/badge-japanese-yen
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun badgeJapaneseYen(): Painter = painterResource(LumeLucideResources.drawable.badge_japanese_yen)

  /**
   * Returns a `Painter` for the `badge_minus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/badge-minus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun badgeMinus(): Painter = painterResource(LumeLucideResources.drawable.badge_minus)

  /**
   * Returns a `Painter` for the `badge_percent` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/badge-percent
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun badgePercent(): Painter = painterResource(LumeLucideResources.drawable.badge_percent)

  /**
   * Returns a `Painter` for the `badge_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/badge-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun badgePlus(): Painter = painterResource(LumeLucideResources.drawable.badge_plus)

  /**
   * Returns a `Painter` for the `badge_pound_sterling` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/badge-pound-sterling
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun badgePoundSterling(): Painter = painterResource(LumeLucideResources.drawable.badge_pound_sterling)

  /**
   * Returns a `Painter` for the `badge_question_mark` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/badge-question-mark
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun badgeQuestionMark(): Painter = painterResource(LumeLucideResources.drawable.badge_question_mark)

  /**
   * Returns a `Painter` for the `badge_russian_ruble` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/badge-russian-ruble
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun badgeRussianRuble(): Painter = painterResource(LumeLucideResources.drawable.badge_russian_ruble)

  /**
   * Returns a `Painter` for the `badge_swiss_franc` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/badge-swiss-franc
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun badgeSwissFranc(): Painter = painterResource(LumeLucideResources.drawable.badge_swiss_franc)

  /**
   * Returns a `Painter` for the `badge_turkish_lira` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/badge-turkish-lira
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun badgeTurkishLira(): Painter = painterResource(LumeLucideResources.drawable.badge_turkish_lira)

  /**
   * Returns a `Painter` for the `badge_x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/badge-x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun badgeX(): Painter = painterResource(LumeLucideResources.drawable.badge_x)

  /**
   * Returns a `Painter` for the `baggage_claim` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/baggage-claim
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun baggageClaim(): Painter = painterResource(LumeLucideResources.drawable.baggage_claim)

  /**
   * Returns a `Painter` for the `balloon` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/balloon
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun balloon(): Painter = painterResource(LumeLucideResources.drawable.balloon)

  /**
   * Returns a `Painter` for the `ban` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ban
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun ban(): Painter = painterResource(LumeLucideResources.drawable.ban)

  /**
   * Returns a `Painter` for the `banana` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/banana
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun banana(): Painter = painterResource(LumeLucideResources.drawable.banana)

  /**
   * Returns a `Painter` for the `bandage` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bandage
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bandage(): Painter = painterResource(LumeLucideResources.drawable.bandage)

  /**
   * Returns a `Painter` for the `banknote` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/banknote
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun banknote(): Painter = painterResource(LumeLucideResources.drawable.banknote)

  /**
   * Returns a `Painter` for the `banknote_arrow_down` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/banknote-arrow-down
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun banknoteArrowDown(): Painter = painterResource(LumeLucideResources.drawable.banknote_arrow_down)

  /**
   * Returns a `Painter` for the `banknote_arrow_up` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/banknote-arrow-up
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun banknoteArrowUp(): Painter = painterResource(LumeLucideResources.drawable.banknote_arrow_up)

  /**
   * Returns a `Painter` for the `banknote_x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/banknote-x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun banknoteX(): Painter = painterResource(LumeLucideResources.drawable.banknote_x)

  /**
   * Returns a `Painter` for the `barcode` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/barcode
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun barcode(): Painter = painterResource(LumeLucideResources.drawable.barcode)

  /**
   * Returns a `Painter` for the `barrel` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/barrel
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun barrel(): Painter = painterResource(LumeLucideResources.drawable.barrel)

  /**
   * Returns a `Painter` for the `baseline` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/baseline
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun baseline(): Painter = painterResource(LumeLucideResources.drawable.baseline)

  /**
   * Returns a `Painter` for the `bath` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bath
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bath(): Painter = painterResource(LumeLucideResources.drawable.bath)

  /**
   * Returns a `Painter` for the `battery` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/battery
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun battery(): Painter = painterResource(LumeLucideResources.drawable.battery)

  /**
   * Returns a `Painter` for the `battery_charging` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/battery-charging
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun batteryCharging(): Painter = painterResource(LumeLucideResources.drawable.battery_charging)

  /**
   * Returns a `Painter` for the `battery_full` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/battery-full
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun batteryFull(): Painter = painterResource(LumeLucideResources.drawable.battery_full)

  /**
   * Returns a `Painter` for the `battery_low` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/battery-low
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun batteryLow(): Painter = painterResource(LumeLucideResources.drawable.battery_low)

  /**
   * Returns a `Painter` for the `battery_medium` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/battery-medium
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun batteryMedium(): Painter = painterResource(LumeLucideResources.drawable.battery_medium)

  /**
   * Returns a `Painter` for the `battery_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/battery-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun batteryPlus(): Painter = painterResource(LumeLucideResources.drawable.battery_plus)

  /**
   * Returns a `Painter` for the `battery_warning` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/battery-warning
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun batteryWarning(): Painter = painterResource(LumeLucideResources.drawable.battery_warning)

  /**
   * Returns a `Painter` for the `beaker` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/beaker
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun beaker(): Painter = painterResource(LumeLucideResources.drawable.beaker)

  /**
   * Returns a `Painter` for the `bean` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bean
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bean(): Painter = painterResource(LumeLucideResources.drawable.bean)

  /**
   * Returns a `Painter` for the `bean_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bean-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun beanOff(): Painter = painterResource(LumeLucideResources.drawable.bean_off)

  /**
   * Returns a `Painter` for the `bed` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bed
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bed(): Painter = painterResource(LumeLucideResources.drawable.bed)

  /**
   * Returns a `Painter` for the `bed_double` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bed-double
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bedDouble(): Painter = painterResource(LumeLucideResources.drawable.bed_double)

  /**
   * Returns a `Painter` for the `bed_single` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bed-single
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bedSingle(): Painter = painterResource(LumeLucideResources.drawable.bed_single)

  /**
   * Returns a `Painter` for the `beef` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/beef
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun beef(): Painter = painterResource(LumeLucideResources.drawable.beef)

  /**
   * Returns a `Painter` for the `beef_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/beef-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun beefOff(): Painter = painterResource(LumeLucideResources.drawable.beef_off)

  /**
   * Returns a `Painter` for the `beer` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/beer
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun beer(): Painter = painterResource(LumeLucideResources.drawable.beer)

  /**
   * Returns a `Painter` for the `beer_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/beer-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun beerOff(): Painter = painterResource(LumeLucideResources.drawable.beer_off)

  /**
   * Returns a `Painter` for the `bell` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bell
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bell(): Painter = painterResource(LumeLucideResources.drawable.bell)

  /**
   * Returns a `Painter` for the `bell_dot` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bell-dot
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bellDot(): Painter = painterResource(LumeLucideResources.drawable.bell_dot)

  /**
   * Returns a `Painter` for the `bell_electric` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bell-electric
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bellElectric(): Painter = painterResource(LumeLucideResources.drawable.bell_electric)

  /**
   * Returns a `Painter` for the `bell_minus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bell-minus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bellMinus(): Painter = painterResource(LumeLucideResources.drawable.bell_minus)

  /**
   * Returns a `Painter` for the `bell_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bell-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bellOff(): Painter = painterResource(LumeLucideResources.drawable.bell_off)

  /**
   * Returns a `Painter` for the `bell_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bell-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bellPlus(): Painter = painterResource(LumeLucideResources.drawable.bell_plus)

  /**
   * Returns a `Painter` for the `bell_ring` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bell-ring
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bellRing(): Painter = painterResource(LumeLucideResources.drawable.bell_ring)

  /**
   * Returns a `Painter` for the `between_horizontal_end` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/between-horizontal-end
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun betweenHorizontalEnd(): Painter = painterResource(LumeLucideResources.drawable.between_horizontal_end)

  /**
   * Returns a `Painter` for the `between_horizontal_start` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/between-horizontal-start
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun betweenHorizontalStart(): Painter = painterResource(LumeLucideResources.drawable.between_horizontal_start)

  /**
   * Returns a `Painter` for the `between_vertical_end` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/between-vertical-end
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun betweenVerticalEnd(): Painter = painterResource(LumeLucideResources.drawable.between_vertical_end)

  /**
   * Returns a `Painter` for the `between_vertical_start` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/between-vertical-start
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun betweenVerticalStart(): Painter = painterResource(LumeLucideResources.drawable.between_vertical_start)

  /**
   * Returns a `Painter` for the `biceps_flexed` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/biceps-flexed
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bicepsFlexed(): Painter = painterResource(LumeLucideResources.drawable.biceps_flexed)

  /**
   * Returns a `Painter` for the `bike` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bike
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bike(): Painter = painterResource(LumeLucideResources.drawable.bike)

  /**
   * Returns a `Painter` for the `binary` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/binary
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun binary(): Painter = painterResource(LumeLucideResources.drawable.binary)

  /**
   * Returns a `Painter` for the `binoculars` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/binoculars
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun binoculars(): Painter = painterResource(LumeLucideResources.drawable.binoculars)

  /**
   * Returns a `Painter` for the `biohazard` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/biohazard
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun biohazard(): Painter = painterResource(LumeLucideResources.drawable.biohazard)

  /**
   * Returns a `Painter` for the `bird` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bird
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bird(): Painter = painterResource(LumeLucideResources.drawable.bird)

  /**
   * Returns a `Painter` for the `birdhouse` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/birdhouse
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun birdhouse(): Painter = painterResource(LumeLucideResources.drawable.birdhouse)

  /**
   * Returns a `Painter` for the `bitcoin` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bitcoin
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bitcoin(): Painter = painterResource(LumeLucideResources.drawable.bitcoin)

  /**
   * Returns a `Painter` for the `blend` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/blend
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun blend(): Painter = painterResource(LumeLucideResources.drawable.blend)

  /**
   * Returns a `Painter` for the `blinds` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/blinds
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun blinds(): Painter = painterResource(LumeLucideResources.drawable.blinds)

  /**
   * Returns a `Painter` for the `blocks` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/blocks
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun blocks(): Painter = painterResource(LumeLucideResources.drawable.blocks)

  /**
   * Returns a `Painter` for the `bluetooth` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bluetooth
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bluetooth(): Painter = painterResource(LumeLucideResources.drawable.bluetooth)

  /**
   * Returns a `Painter` for the `bluetooth_connected` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bluetooth-connected
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bluetoothConnected(): Painter = painterResource(LumeLucideResources.drawable.bluetooth_connected)

  /**
   * Returns a `Painter` for the `bluetooth_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bluetooth-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bluetoothOff(): Painter = painterResource(LumeLucideResources.drawable.bluetooth_off)

  /**
   * Returns a `Painter` for the `bluetooth_searching` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bluetooth-searching
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bluetoothSearching(): Painter = painterResource(LumeLucideResources.drawable.bluetooth_searching)

  /**
   * Returns a `Painter` for the `bold` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bold
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bold(): Painter = painterResource(LumeLucideResources.drawable.bold)

  /**
   * Returns a `Painter` for the `bolt` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bolt
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bolt(): Painter = painterResource(LumeLucideResources.drawable.bolt)

  /**
   * Returns a `Painter` for the `bomb` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bomb
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bomb(): Painter = painterResource(LumeLucideResources.drawable.bomb)

  /**
   * Returns a `Painter` for the `bone` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bone
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bone(): Painter = painterResource(LumeLucideResources.drawable.bone)

  /**
   * Returns a `Painter` for the `book` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/book
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun book(): Painter = painterResource(LumeLucideResources.drawable.book)

  /**
   * Returns a `Painter` for the `book_a` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/book-a
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookA(): Painter = painterResource(LumeLucideResources.drawable.book_a)

  /**
   * Returns a `Painter` for the `book_alert` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/book-alert
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookAlert(): Painter = painterResource(LumeLucideResources.drawable.book_alert)

  /**
   * Returns a `Painter` for the `book_audio` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/book-audio
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookAudio(): Painter = painterResource(LumeLucideResources.drawable.book_audio)

  /**
   * Returns a `Painter` for the `book_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/book-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookCheck(): Painter = painterResource(LumeLucideResources.drawable.book_check)

  /**
   * Returns a `Painter` for the `book_copy` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/book-copy
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookCopy(): Painter = painterResource(LumeLucideResources.drawable.book_copy)

  /**
   * Returns a `Painter` for the `book_dashed` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/book-dashed
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookDashed(): Painter = painterResource(LumeLucideResources.drawable.book_dashed)

  /**
   * Returns a `Painter` for the `book_down` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/book-down
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookDown(): Painter = painterResource(LumeLucideResources.drawable.book_down)

  /**
   * Returns a `Painter` for the `book_headphones` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/book-headphones
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookHeadphones(): Painter = painterResource(LumeLucideResources.drawable.book_headphones)

  /**
   * Returns a `Painter` for the `book_heart` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/book-heart
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookHeart(): Painter = painterResource(LumeLucideResources.drawable.book_heart)

  /**
   * Returns a `Painter` for the `book_image` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/book-image
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookImage(): Painter = painterResource(LumeLucideResources.drawable.book_image)

  /**
   * Returns a `Painter` for the `book_key` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/book-key
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookKey(): Painter = painterResource(LumeLucideResources.drawable.book_key)

  /**
   * Returns a `Painter` for the `book_lock` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/book-lock
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookLock(): Painter = painterResource(LumeLucideResources.drawable.book_lock)

  /**
   * Returns a `Painter` for the `book_marked` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/book-marked
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookMarked(): Painter = painterResource(LumeLucideResources.drawable.book_marked)

  /**
   * Returns a `Painter` for the `book_minus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/book-minus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookMinus(): Painter = painterResource(LumeLucideResources.drawable.book_minus)

  /**
   * Returns a `Painter` for the `book_open` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/book-open
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookOpen(): Painter = painterResource(LumeLucideResources.drawable.book_open)

  /**
   * Returns a `Painter` for the `book_open_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/book-open-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookOpenCheck(): Painter = painterResource(LumeLucideResources.drawable.book_open_check)

  /**
   * Returns a `Painter` for the `book_open_text` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/book-open-text
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookOpenText(): Painter = painterResource(LumeLucideResources.drawable.book_open_text)

  /**
   * Returns a `Painter` for the `book_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/book-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookPlus(): Painter = painterResource(LumeLucideResources.drawable.book_plus)

  /**
   * Returns a `Painter` for the `book_search` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/book-search
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookSearch(): Painter = painterResource(LumeLucideResources.drawable.book_search)

  /**
   * Returns a `Painter` for the `book_text` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/book-text
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookText(): Painter = painterResource(LumeLucideResources.drawable.book_text)

  /**
   * Returns a `Painter` for the `book_type` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/book-type
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookType(): Painter = painterResource(LumeLucideResources.drawable.book_type)

  /**
   * Returns a `Painter` for the `book_up` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/book-up
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookUp(): Painter = painterResource(LumeLucideResources.drawable.book_up)

  /**
   * Returns a `Painter` for the `book_up_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/book-up-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookUp2(): Painter = painterResource(LumeLucideResources.drawable.book_up_2)

  /**
   * Returns a `Painter` for the `book_user` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/book-user
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookUser(): Painter = painterResource(LumeLucideResources.drawable.book_user)

  /**
   * Returns a `Painter` for the `book_x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/book-x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookX(): Painter = painterResource(LumeLucideResources.drawable.book_x)

  /**
   * Returns a `Painter` for the `bookmark` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bookmark
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookmark(): Painter = painterResource(LumeLucideResources.drawable.bookmark)

  /**
   * Returns a `Painter` for the `bookmark_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bookmark-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookmarkCheck(): Painter = painterResource(LumeLucideResources.drawable.bookmark_check)

  /**
   * Returns a `Painter` for the `bookmark_minus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bookmark-minus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookmarkMinus(): Painter = painterResource(LumeLucideResources.drawable.bookmark_minus)

  /**
   * Returns a `Painter` for the `bookmark_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bookmark-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookmarkOff(): Painter = painterResource(LumeLucideResources.drawable.bookmark_off)

  /**
   * Returns a `Painter` for the `bookmark_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bookmark-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookmarkPlus(): Painter = painterResource(LumeLucideResources.drawable.bookmark_plus)

  /**
   * Returns a `Painter` for the `bookmark_x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bookmark-x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bookmarkX(): Painter = painterResource(LumeLucideResources.drawable.bookmark_x)

  /**
   * Returns a `Painter` for the `boom_box` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/boom-box
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun boomBox(): Painter = painterResource(LumeLucideResources.drawable.boom_box)

  /**
   * Returns a `Painter` for the `bot` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bot
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bot(): Painter = painterResource(LumeLucideResources.drawable.bot)

  /**
   * Returns a `Painter` for the `bot_message_square` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bot-message-square
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun botMessageSquare(): Painter = painterResource(LumeLucideResources.drawable.bot_message_square)

  /**
   * Returns a `Painter` for the `bot_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bot-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun botOff(): Painter = painterResource(LumeLucideResources.drawable.bot_off)

  /**
   * Returns a `Painter` for the `bottle_wine` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bottle-wine
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bottleWine(): Painter = painterResource(LumeLucideResources.drawable.bottle_wine)

  /**
   * Returns a `Painter` for the `bow_arrow` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bow-arrow
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bowArrow(): Painter = painterResource(LumeLucideResources.drawable.bow_arrow)

  /**
   * Returns a `Painter` for the `box` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/box
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun box(): Painter = painterResource(LumeLucideResources.drawable.box)

  /**
   * Returns a `Painter` for the `boxes` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/boxes
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun boxes(): Painter = painterResource(LumeLucideResources.drawable.boxes)

  /**
   * Returns a `Painter` for the `braces` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/braces
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun braces(): Painter = painterResource(LumeLucideResources.drawable.braces)

  /**
   * Returns a `Painter` for the `brackets` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/brackets
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun brackets(): Painter = painterResource(LumeLucideResources.drawable.brackets)

  /**
   * Returns a `Painter` for the `brain` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/brain
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun brain(): Painter = painterResource(LumeLucideResources.drawable.brain)

  /**
   * Returns a `Painter` for the `brain_circuit` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/brain-circuit
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun brainCircuit(): Painter = painterResource(LumeLucideResources.drawable.brain_circuit)

  /**
   * Returns a `Painter` for the `brain_cog` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/brain-cog
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun brainCog(): Painter = painterResource(LumeLucideResources.drawable.brain_cog)

  /**
   * Returns a `Painter` for the `brick_wall` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/brick-wall
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun brickWall(): Painter = painterResource(LumeLucideResources.drawable.brick_wall)

  /**
   * Returns a `Painter` for the `brick_wall_fire` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/brick-wall-fire
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun brickWallFire(): Painter = painterResource(LumeLucideResources.drawable.brick_wall_fire)

  /**
   * Returns a `Painter` for the `brick_wall_shield` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/brick-wall-shield
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun brickWallShield(): Painter = painterResource(LumeLucideResources.drawable.brick_wall_shield)

  /**
   * Returns a `Painter` for the `briefcase` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/briefcase
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun briefcase(): Painter = painterResource(LumeLucideResources.drawable.briefcase)

  /**
   * Returns a `Painter` for the `briefcase_business` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/briefcase-business
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun briefcaseBusiness(): Painter = painterResource(LumeLucideResources.drawable.briefcase_business)

  /**
   * Returns a `Painter` for the `briefcase_conveyor_belt` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/briefcase-conveyor-belt
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun briefcaseConveyorBelt(): Painter = painterResource(LumeLucideResources.drawable.briefcase_conveyor_belt)

  /**
   * Returns a `Painter` for the `briefcase_medical` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/briefcase-medical
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun briefcaseMedical(): Painter = painterResource(LumeLucideResources.drawable.briefcase_medical)

  /**
   * Returns a `Painter` for the `bring_to_front` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bring-to-front
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bringToFront(): Painter = painterResource(LumeLucideResources.drawable.bring_to_front)

  /**
   * Returns a `Painter` for the `brush` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/brush
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun brush(): Painter = painterResource(LumeLucideResources.drawable.brush)

  /**
   * Returns a `Painter` for the `brush_cleaning` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/brush-cleaning
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun brushCleaning(): Painter = painterResource(LumeLucideResources.drawable.brush_cleaning)

  /**
   * Returns a `Painter` for the `bubbles` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bubbles
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bubbles(): Painter = painterResource(LumeLucideResources.drawable.bubbles)

  /**
   * Returns a `Painter` for the `bug` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bug
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bug(): Painter = painterResource(LumeLucideResources.drawable.bug)

  /**
   * Returns a `Painter` for the `bug_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bug-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bugOff(): Painter = painterResource(LumeLucideResources.drawable.bug_off)

  /**
   * Returns a `Painter` for the `bug_play` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bug-play
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bugPlay(): Painter = painterResource(LumeLucideResources.drawable.bug_play)

  /**
   * Returns a `Painter` for the `building` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/building
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun building(): Painter = painterResource(LumeLucideResources.drawable.building)

  /**
   * Returns a `Painter` for the `building_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/building-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun building2(): Painter = painterResource(LumeLucideResources.drawable.building_2)

  /**
   * Returns a `Painter` for the `bus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun bus(): Painter = painterResource(LumeLucideResources.drawable.bus)

  /**
   * Returns a `Painter` for the `bus_front` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/bus-front
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun busFront(): Painter = painterResource(LumeLucideResources.drawable.bus_front)

  /**
   * Returns a `Painter` for the `cable` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cable
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cable(): Painter = painterResource(LumeLucideResources.drawable.cable)

  /**
   * Returns a `Painter` for the `cable_car` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cable-car
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cableCar(): Painter = painterResource(LumeLucideResources.drawable.cable_car)

  /**
   * Returns a `Painter` for the `cake` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cake
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cake(): Painter = painterResource(LumeLucideResources.drawable.cake)

  /**
   * Returns a `Painter` for the `cake_slice` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cake-slice
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cakeSlice(): Painter = painterResource(LumeLucideResources.drawable.cake_slice)

  /**
   * Returns a `Painter` for the `calculator` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/calculator
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun calculator(): Painter = painterResource(LumeLucideResources.drawable.calculator)

  /**
   * Returns a `Painter` for the `calendar` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/calendar
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun calendar(): Painter = painterResource(LumeLucideResources.drawable.calendar)

  /**
   * Returns a `Painter` for the `calendar_1` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/calendar-1
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun calendar1(): Painter = painterResource(LumeLucideResources.drawable.calendar_1)

  /**
   * Returns a `Painter` for the `calendar_arrow_down` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/calendar-arrow-down
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun calendarArrowDown(): Painter = painterResource(LumeLucideResources.drawable.calendar_arrow_down)

  /**
   * Returns a `Painter` for the `calendar_arrow_up` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/calendar-arrow-up
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun calendarArrowUp(): Painter = painterResource(LumeLucideResources.drawable.calendar_arrow_up)

  /**
   * Returns a `Painter` for the `calendar_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/calendar-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun calendarCheck(): Painter = painterResource(LumeLucideResources.drawable.calendar_check)

  /**
   * Returns a `Painter` for the `calendar_check_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/calendar-check-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun calendarCheck2(): Painter = painterResource(LumeLucideResources.drawable.calendar_check_2)

  /**
   * Returns a `Painter` for the `calendar_clock` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/calendar-clock
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun calendarClock(): Painter = painterResource(LumeLucideResources.drawable.calendar_clock)

  /**
   * Returns a `Painter` for the `calendar_cog` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/calendar-cog
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun calendarCog(): Painter = painterResource(LumeLucideResources.drawable.calendar_cog)

  /**
   * Returns a `Painter` for the `calendar_days` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/calendar-days
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun calendarDays(): Painter = painterResource(LumeLucideResources.drawable.calendar_days)

  /**
   * Returns a `Painter` for the `calendar_fold` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/calendar-fold
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun calendarFold(): Painter = painterResource(LumeLucideResources.drawable.calendar_fold)

  /**
   * Returns a `Painter` for the `calendar_heart` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/calendar-heart
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun calendarHeart(): Painter = painterResource(LumeLucideResources.drawable.calendar_heart)

  /**
   * Returns a `Painter` for the `calendar_minus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/calendar-minus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun calendarMinus(): Painter = painterResource(LumeLucideResources.drawable.calendar_minus)

  /**
   * Returns a `Painter` for the `calendar_minus_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/calendar-minus-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun calendarMinus2(): Painter = painterResource(LumeLucideResources.drawable.calendar_minus_2)

  /**
   * Returns a `Painter` for the `calendar_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/calendar-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun calendarOff(): Painter = painterResource(LumeLucideResources.drawable.calendar_off)

  /**
   * Returns a `Painter` for the `calendar_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/calendar-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun calendarPlus(): Painter = painterResource(LumeLucideResources.drawable.calendar_plus)

  /**
   * Returns a `Painter` for the `calendar_plus_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/calendar-plus-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun calendarPlus2(): Painter = painterResource(LumeLucideResources.drawable.calendar_plus_2)

  /**
   * Returns a `Painter` for the `calendar_range` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/calendar-range
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun calendarRange(): Painter = painterResource(LumeLucideResources.drawable.calendar_range)

  /**
   * Returns a `Painter` for the `calendar_search` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/calendar-search
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun calendarSearch(): Painter = painterResource(LumeLucideResources.drawable.calendar_search)

  /**
   * Returns a `Painter` for the `calendar_sync` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/calendar-sync
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun calendarSync(): Painter = painterResource(LumeLucideResources.drawable.calendar_sync)

  /**
   * Returns a `Painter` for the `calendar_x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/calendar-x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun calendarX(): Painter = painterResource(LumeLucideResources.drawable.calendar_x)

  /**
   * Returns a `Painter` for the `calendar_x_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/calendar-x-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun calendarX2(): Painter = painterResource(LumeLucideResources.drawable.calendar_x_2)

  /**
   * Returns a `Painter` for the `calendars` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/calendars
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun calendars(): Painter = painterResource(LumeLucideResources.drawable.calendars)

  /**
   * Returns a `Painter` for the `camera` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/camera
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun camera(): Painter = painterResource(LumeLucideResources.drawable.camera)

  /**
   * Returns a `Painter` for the `camera_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/camera-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cameraOff(): Painter = painterResource(LumeLucideResources.drawable.camera_off)

  /**
   * Returns a `Painter` for the `candy` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/candy
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun candy(): Painter = painterResource(LumeLucideResources.drawable.candy)

  /**
   * Returns a `Painter` for the `candy_cane` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/candy-cane
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun candyCane(): Painter = painterResource(LumeLucideResources.drawable.candy_cane)

  /**
   * Returns a `Painter` for the `candy_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/candy-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun candyOff(): Painter = painterResource(LumeLucideResources.drawable.candy_off)

  /**
   * Returns a `Painter` for the `cannabis` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cannabis
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cannabis(): Painter = painterResource(LumeLucideResources.drawable.cannabis)

  /**
   * Returns a `Painter` for the `cannabis_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cannabis-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cannabisOff(): Painter = painterResource(LumeLucideResources.drawable.cannabis_off)

  /**
   * Returns a `Painter` for the `captions` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/captions
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun captions(): Painter = painterResource(LumeLucideResources.drawable.captions)

  /**
   * Returns a `Painter` for the `captions_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/captions-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun captionsOff(): Painter = painterResource(LumeLucideResources.drawable.captions_off)

  /**
   * Returns a `Painter` for the `car` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/car
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun car(): Painter = painterResource(LumeLucideResources.drawable.car)

  /**
   * Returns a `Painter` for the `car_front` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/car-front
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun carFront(): Painter = painterResource(LumeLucideResources.drawable.car_front)

  /**
   * Returns a `Painter` for the `car_taxi_front` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/car-taxi-front
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun carTaxiFront(): Painter = painterResource(LumeLucideResources.drawable.car_taxi_front)

  /**
   * Returns a `Painter` for the `caravan` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/caravan
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun caravan(): Painter = painterResource(LumeLucideResources.drawable.caravan)

  /**
   * Returns a `Painter` for the `card_sim` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/card-sim
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cardSim(): Painter = painterResource(LumeLucideResources.drawable.card_sim)

  /**
   * Returns a `Painter` for the `carrot` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/carrot
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun carrot(): Painter = painterResource(LumeLucideResources.drawable.carrot)

  /**
   * Returns a `Painter` for the `case_lower` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/case-lower
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun caseLower(): Painter = painterResource(LumeLucideResources.drawable.case_lower)

  /**
   * Returns a `Painter` for the `case_sensitive` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/case-sensitive
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun caseSensitive(): Painter = painterResource(LumeLucideResources.drawable.case_sensitive)

  /**
   * Returns a `Painter` for the `case_upper` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/case-upper
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun caseUpper(): Painter = painterResource(LumeLucideResources.drawable.case_upper)

  /**
   * Returns a `Painter` for the `cassette_tape` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cassette-tape
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cassetteTape(): Painter = painterResource(LumeLucideResources.drawable.cassette_tape)

  /**
   * Returns a `Painter` for the `cast` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cast
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cast(): Painter = painterResource(LumeLucideResources.drawable.cast)

  /**
   * Returns a `Painter` for the `castle` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/castle
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun castle(): Painter = painterResource(LumeLucideResources.drawable.castle)

  /**
   * Returns a `Painter` for the `cat` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cat
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cat(): Painter = painterResource(LumeLucideResources.drawable.cat)

  /**
   * Returns a `Painter` for the `cctv` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cctv
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cctv(): Painter = painterResource(LumeLucideResources.drawable.cctv)

  /**
   * Returns a `Painter` for the `cctv_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cctv-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cctvOff(): Painter = painterResource(LumeLucideResources.drawable.cctv_off)

  /**
   * Returns a `Painter` for the `chart_area` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chart-area
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chartArea(): Painter = painterResource(LumeLucideResources.drawable.chart_area)

  /**
   * Returns a `Painter` for the `chart_bar` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chart-bar
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chartBar(): Painter = painterResource(LumeLucideResources.drawable.chart_bar)

  /**
   * Returns a `Painter` for the `chart_bar_big` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chart-bar-big
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chartBarBig(): Painter = painterResource(LumeLucideResources.drawable.chart_bar_big)

  /**
   * Returns a `Painter` for the `chart_bar_decreasing` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chart-bar-decreasing
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chartBarDecreasing(): Painter = painterResource(LumeLucideResources.drawable.chart_bar_decreasing)

  /**
   * Returns a `Painter` for the `chart_bar_increasing` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chart-bar-increasing
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chartBarIncreasing(): Painter = painterResource(LumeLucideResources.drawable.chart_bar_increasing)

  /**
   * Returns a `Painter` for the `chart_bar_stacked` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chart-bar-stacked
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chartBarStacked(): Painter = painterResource(LumeLucideResources.drawable.chart_bar_stacked)

  /**
   * Returns a `Painter` for the `chart_candlestick` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chart-candlestick
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chartCandlestick(): Painter = painterResource(LumeLucideResources.drawable.chart_candlestick)

  /**
   * Returns a `Painter` for the `chart_column` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chart-column
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chartColumn(): Painter = painterResource(LumeLucideResources.drawable.chart_column)

  /**
   * Returns a `Painter` for the `chart_column_big` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chart-column-big
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chartColumnBig(): Painter = painterResource(LumeLucideResources.drawable.chart_column_big)

  /**
   * Returns a `Painter` for the `chart_column_decreasing` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chart-column-decreasing
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chartColumnDecreasing(): Painter = painterResource(LumeLucideResources.drawable.chart_column_decreasing)

  /**
   * Returns a `Painter` for the `chart_column_increasing` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chart-column-increasing
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chartColumnIncreasing(): Painter = painterResource(LumeLucideResources.drawable.chart_column_increasing)

  /**
   * Returns a `Painter` for the `chart_column_stacked` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chart-column-stacked
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chartColumnStacked(): Painter = painterResource(LumeLucideResources.drawable.chart_column_stacked)

  /**
   * Returns a `Painter` for the `chart_gantt` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chart-gantt
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chartGantt(): Painter = painterResource(LumeLucideResources.drawable.chart_gantt)

  /**
   * Returns a `Painter` for the `chart_line` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chart-line
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chartLine(): Painter = painterResource(LumeLucideResources.drawable.chart_line)

  /**
   * Returns a `Painter` for the `chart_network` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chart-network
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chartNetwork(): Painter = painterResource(LumeLucideResources.drawable.chart_network)

  /**
   * Returns a `Painter` for the `chart_no_axes_column` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chart-no-axes-column
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chartNoAxesColumn(): Painter = painterResource(LumeLucideResources.drawable.chart_no_axes_column)

  /**
   * Returns a `Painter` for the `chart_no_axes_column_decreasing` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chart-no-axes-column-decreasing
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chartNoAxesColumnDecreasing(): Painter = painterResource(LumeLucideResources.drawable.chart_no_axes_column_decreasing)

  /**
   * Returns a `Painter` for the `chart_no_axes_column_increasing` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chart-no-axes-column-increasing
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chartNoAxesColumnIncreasing(): Painter = painterResource(LumeLucideResources.drawable.chart_no_axes_column_increasing)

  /**
   * Returns a `Painter` for the `chart_no_axes_combined` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chart-no-axes-combined
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chartNoAxesCombined(): Painter = painterResource(LumeLucideResources.drawable.chart_no_axes_combined)

  /**
   * Returns a `Painter` for the `chart_no_axes_gantt` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chart-no-axes-gantt
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chartNoAxesGantt(): Painter = painterResource(LumeLucideResources.drawable.chart_no_axes_gantt)

  /**
   * Returns a `Painter` for the `chart_pie` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chart-pie
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chartPie(): Painter = painterResource(LumeLucideResources.drawable.chart_pie)

  /**
   * Returns a `Painter` for the `chart_scatter` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chart-scatter
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chartScatter(): Painter = painterResource(LumeLucideResources.drawable.chart_scatter)

  /**
   * Returns a `Painter` for the `chart_spline` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chart-spline
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chartSpline(): Painter = painterResource(LumeLucideResources.drawable.chart_spline)

  /**
   * Returns a `Painter` for the `check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun check(): Painter = painterResource(LumeLucideResources.drawable.check)

  /**
   * Returns a `Painter` for the `check_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/check-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun checkCheck(): Painter = painterResource(LumeLucideResources.drawable.check_check)

  /**
   * Returns a `Painter` for the `check_line` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/check-line
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun checkLine(): Painter = painterResource(LumeLucideResources.drawable.check_line)

  /**
   * Returns a `Painter` for the `chef_hat` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chef-hat
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chefHat(): Painter = painterResource(LumeLucideResources.drawable.chef_hat)

  /**
   * Returns a `Painter` for the `cherry` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cherry
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cherry(): Painter = painterResource(LumeLucideResources.drawable.cherry)

  /**
   * Returns a `Painter` for the `chess_bishop` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chess-bishop
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chessBishop(): Painter = painterResource(LumeLucideResources.drawable.chess_bishop)

  /**
   * Returns a `Painter` for the `chess_king` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chess-king
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chessKing(): Painter = painterResource(LumeLucideResources.drawable.chess_king)

  /**
   * Returns a `Painter` for the `chess_knight` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chess-knight
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chessKnight(): Painter = painterResource(LumeLucideResources.drawable.chess_knight)

  /**
   * Returns a `Painter` for the `chess_pawn` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chess-pawn
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chessPawn(): Painter = painterResource(LumeLucideResources.drawable.chess_pawn)

  /**
   * Returns a `Painter` for the `chess_queen` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chess-queen
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chessQueen(): Painter = painterResource(LumeLucideResources.drawable.chess_queen)

  /**
   * Returns a `Painter` for the `chess_rook` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chess-rook
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chessRook(): Painter = painterResource(LumeLucideResources.drawable.chess_rook)

  /**
   * Returns a `Painter` for the `chevron_down` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chevron-down
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chevronDown(): Painter = painterResource(LumeLucideResources.drawable.chevron_down)

  /**
   * Returns a `Painter` for the `chevron_first` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chevron-first
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chevronFirst(): Painter = painterResource(LumeLucideResources.drawable.chevron_first)

  /**
   * Returns a `Painter` for the `chevron_last` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chevron-last
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chevronLast(): Painter = painterResource(LumeLucideResources.drawable.chevron_last)

  /**
   * Returns a `Painter` for the `chevron_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chevron-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chevronLeft(): Painter = painterResource(LumeLucideResources.drawable.chevron_left)

  /**
   * Returns a `Painter` for the `chevron_right` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chevron-right
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chevronRight(): Painter = painterResource(LumeLucideResources.drawable.chevron_right)

  /**
   * Returns a `Painter` for the `chevron_up` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chevron-up
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chevronUp(): Painter = painterResource(LumeLucideResources.drawable.chevron_up)

  /**
   * Returns a `Painter` for the `chevrons_down` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chevrons-down
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chevronsDown(): Painter = painterResource(LumeLucideResources.drawable.chevrons_down)

  /**
   * Returns a `Painter` for the `chevrons_down_up` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chevrons-down-up
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chevronsDownUp(): Painter = painterResource(LumeLucideResources.drawable.chevrons_down_up)

  /**
   * Returns a `Painter` for the `chevrons_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chevrons-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chevronsLeft(): Painter = painterResource(LumeLucideResources.drawable.chevrons_left)

  /**
   * Returns a `Painter` for the `chevrons_left_right` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chevrons-left-right
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chevronsLeftRight(): Painter = painterResource(LumeLucideResources.drawable.chevrons_left_right)

  /**
   * Returns a `Painter` for the `chevrons_left_right_ellipsis` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chevrons-left-right-ellipsis
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chevronsLeftRightEllipsis(): Painter = painterResource(LumeLucideResources.drawable.chevrons_left_right_ellipsis)

  /**
   * Returns a `Painter` for the `chevrons_right` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chevrons-right
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chevronsRight(): Painter = painterResource(LumeLucideResources.drawable.chevrons_right)

  /**
   * Returns a `Painter` for the `chevrons_right_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chevrons-right-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chevronsRightLeft(): Painter = painterResource(LumeLucideResources.drawable.chevrons_right_left)

  /**
   * Returns a `Painter` for the `chevrons_up` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chevrons-up
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chevronsUp(): Painter = painterResource(LumeLucideResources.drawable.chevrons_up)

  /**
   * Returns a `Painter` for the `chevrons_up_down` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/chevrons-up-down
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun chevronsUpDown(): Painter = painterResource(LumeLucideResources.drawable.chevrons_up_down)

  /**
   * Returns a `Painter` for the `church` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/church
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun church(): Painter = painterResource(LumeLucideResources.drawable.church)

  /**
   * Returns a `Painter` for the `cigarette` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cigarette
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cigarette(): Painter = painterResource(LumeLucideResources.drawable.cigarette)

  /**
   * Returns a `Painter` for the `cigarette_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cigarette-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cigaretteOff(): Painter = painterResource(LumeLucideResources.drawable.cigarette_off)

  /**
   * Returns a `Painter` for the `circle` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circle(): Painter = painterResource(LumeLucideResources.drawable.circle)

  /**
   * Returns a `Painter` for the `circle_alert` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-alert
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleAlert(): Painter = painterResource(LumeLucideResources.drawable.circle_alert)

  /**
   * Returns a `Painter` for the `circle_arrow_down` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-arrow-down
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleArrowDown(): Painter = painterResource(LumeLucideResources.drawable.circle_arrow_down)

  /**
   * Returns a `Painter` for the `circle_arrow_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-arrow-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleArrowLeft(): Painter = painterResource(LumeLucideResources.drawable.circle_arrow_left)

  /**
   * Returns a `Painter` for the `circle_arrow_out_down_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-arrow-out-down-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleArrowOutDownLeft(): Painter = painterResource(LumeLucideResources.drawable.circle_arrow_out_down_left)

  /**
   * Returns a `Painter` for the `circle_arrow_out_down_right` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-arrow-out-down-right
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleArrowOutDownRight(): Painter = painterResource(LumeLucideResources.drawable.circle_arrow_out_down_right)

  /**
   * Returns a `Painter` for the `circle_arrow_out_up_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-arrow-out-up-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleArrowOutUpLeft(): Painter = painterResource(LumeLucideResources.drawable.circle_arrow_out_up_left)

  /**
   * Returns a `Painter` for the `circle_arrow_out_up_right` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-arrow-out-up-right
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleArrowOutUpRight(): Painter = painterResource(LumeLucideResources.drawable.circle_arrow_out_up_right)

  /**
   * Returns a `Painter` for the `circle_arrow_right` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-arrow-right
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleArrowRight(): Painter = painterResource(LumeLucideResources.drawable.circle_arrow_right)

  /**
   * Returns a `Painter` for the `circle_arrow_up` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-arrow-up
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleArrowUp(): Painter = painterResource(LumeLucideResources.drawable.circle_arrow_up)

  /**
   * Returns a `Painter` for the `circle_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleCheck(): Painter = painterResource(LumeLucideResources.drawable.circle_check)

  /**
   * Returns a `Painter` for the `circle_check_big` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-check-big
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleCheckBig(): Painter = painterResource(LumeLucideResources.drawable.circle_check_big)

  /**
   * Returns a `Painter` for the `circle_chevron_down` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-chevron-down
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleChevronDown(): Painter = painterResource(LumeLucideResources.drawable.circle_chevron_down)

  /**
   * Returns a `Painter` for the `circle_chevron_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-chevron-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleChevronLeft(): Painter = painterResource(LumeLucideResources.drawable.circle_chevron_left)

  /**
   * Returns a `Painter` for the `circle_chevron_right` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-chevron-right
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleChevronRight(): Painter = painterResource(LumeLucideResources.drawable.circle_chevron_right)

  /**
   * Returns a `Painter` for the `circle_chevron_up` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-chevron-up
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleChevronUp(): Painter = painterResource(LumeLucideResources.drawable.circle_chevron_up)

  /**
   * Returns a `Painter` for the `circle_dashed` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-dashed
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleDashed(): Painter = painterResource(LumeLucideResources.drawable.circle_dashed)

  /**
   * Returns a `Painter` for the `circle_divide` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-divide
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleDivide(): Painter = painterResource(LumeLucideResources.drawable.circle_divide)

  /**
   * Returns a `Painter` for the `circle_dollar_sign` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-dollar-sign
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleDollarSign(): Painter = painterResource(LumeLucideResources.drawable.circle_dollar_sign)

  /**
   * Returns a `Painter` for the `circle_dot` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-dot
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleDot(): Painter = painterResource(LumeLucideResources.drawable.circle_dot)

  /**
   * Returns a `Painter` for the `circle_dot_dashed` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-dot-dashed
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleDotDashed(): Painter = painterResource(LumeLucideResources.drawable.circle_dot_dashed)

  /**
   * Returns a `Painter` for the `circle_ellipsis` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-ellipsis
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleEllipsis(): Painter = painterResource(LumeLucideResources.drawable.circle_ellipsis)

  /**
   * Returns a `Painter` for the `circle_equal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-equal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleEqual(): Painter = painterResource(LumeLucideResources.drawable.circle_equal)

  /**
   * Returns a `Painter` for the `circle_fading_arrow_up` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-fading-arrow-up
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleFadingArrowUp(): Painter = painterResource(LumeLucideResources.drawable.circle_fading_arrow_up)

  /**
   * Returns a `Painter` for the `circle_fading_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-fading-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleFadingPlus(): Painter = painterResource(LumeLucideResources.drawable.circle_fading_plus)

  /**
   * Returns a `Painter` for the `circle_gauge` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-gauge
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleGauge(): Painter = painterResource(LumeLucideResources.drawable.circle_gauge)

  /**
   * Returns a `Painter` for the `circle_minus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-minus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleMinus(): Painter = painterResource(LumeLucideResources.drawable.circle_minus)

  /**
   * Returns a `Painter` for the `circle_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleOff(): Painter = painterResource(LumeLucideResources.drawable.circle_off)

  /**
   * Returns a `Painter` for the `circle_parking` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-parking
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleParking(): Painter = painterResource(LumeLucideResources.drawable.circle_parking)

  /**
   * Returns a `Painter` for the `circle_parking_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-parking-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleParkingOff(): Painter = painterResource(LumeLucideResources.drawable.circle_parking_off)

  /**
   * Returns a `Painter` for the `circle_pause` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-pause
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circlePause(): Painter = painterResource(LumeLucideResources.drawable.circle_pause)

  /**
   * Returns a `Painter` for the `circle_percent` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-percent
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circlePercent(): Painter = painterResource(LumeLucideResources.drawable.circle_percent)

  /**
   * Returns a `Painter` for the `circle_pile` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-pile
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circlePile(): Painter = painterResource(LumeLucideResources.drawable.circle_pile)

  /**
   * Returns a `Painter` for the `circle_play` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-play
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circlePlay(): Painter = painterResource(LumeLucideResources.drawable.circle_play)

  /**
   * Returns a `Painter` for the `circle_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circlePlus(): Painter = painterResource(LumeLucideResources.drawable.circle_plus)

  /**
   * Returns a `Painter` for the `circle_pound_sterling` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-pound-sterling
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circlePoundSterling(): Painter = painterResource(LumeLucideResources.drawable.circle_pound_sterling)

  /**
   * Returns a `Painter` for the `circle_power` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-power
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circlePower(): Painter = painterResource(LumeLucideResources.drawable.circle_power)

  /**
   * Returns a `Painter` for the `circle_question_mark` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-question-mark
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleQuestionMark(): Painter = painterResource(LumeLucideResources.drawable.circle_question_mark)

  /**
   * Returns a `Painter` for the `circle_slash` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-slash
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleSlash(): Painter = painterResource(LumeLucideResources.drawable.circle_slash)

  /**
   * Returns a `Painter` for the `circle_slash_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-slash-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleSlash2(): Painter = painterResource(LumeLucideResources.drawable.circle_slash_2)

  /**
   * Returns a `Painter` for the `circle_small` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-small
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleSmall(): Painter = painterResource(LumeLucideResources.drawable.circle_small)

  /**
   * Returns a `Painter` for the `circle_star` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-star
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleStar(): Painter = painterResource(LumeLucideResources.drawable.circle_star)

  /**
   * Returns a `Painter` for the `circle_stop` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-stop
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleStop(): Painter = painterResource(LumeLucideResources.drawable.circle_stop)

  /**
   * Returns a `Painter` for the `circle_user` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-user
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleUser(): Painter = painterResource(LumeLucideResources.drawable.circle_user)

  /**
   * Returns a `Painter` for the `circle_user_round` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-user-round
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleUserRound(): Painter = painterResource(LumeLucideResources.drawable.circle_user_round)

  /**
   * Returns a `Painter` for the `circle_x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circle-x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circleX(): Painter = painterResource(LumeLucideResources.drawable.circle_x)

  /**
   * Returns a `Painter` for the `circuit_board` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/circuit-board
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun circuitBoard(): Painter = painterResource(LumeLucideResources.drawable.circuit_board)

  /**
   * Returns a `Painter` for the `citrus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/citrus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun citrus(): Painter = painterResource(LumeLucideResources.drawable.citrus)

  /**
   * Returns a `Painter` for the `clapperboard` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clapperboard
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clapperboard(): Painter = painterResource(LumeLucideResources.drawable.clapperboard)

  /**
   * Returns a `Painter` for the `clipboard` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clipboard
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clipboard(): Painter = painterResource(LumeLucideResources.drawable.clipboard)

  /**
   * Returns a `Painter` for the `clipboard_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clipboard-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clipboardCheck(): Painter = painterResource(LumeLucideResources.drawable.clipboard_check)

  /**
   * Returns a `Painter` for the `clipboard_clock` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clipboard-clock
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clipboardClock(): Painter = painterResource(LumeLucideResources.drawable.clipboard_clock)

  /**
   * Returns a `Painter` for the `clipboard_copy` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clipboard-copy
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clipboardCopy(): Painter = painterResource(LumeLucideResources.drawable.clipboard_copy)

  /**
   * Returns a `Painter` for the `clipboard_list` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clipboard-list
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clipboardList(): Painter = painterResource(LumeLucideResources.drawable.clipboard_list)

  /**
   * Returns a `Painter` for the `clipboard_minus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clipboard-minus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clipboardMinus(): Painter = painterResource(LumeLucideResources.drawable.clipboard_minus)

  /**
   * Returns a `Painter` for the `clipboard_paste` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clipboard-paste
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clipboardPaste(): Painter = painterResource(LumeLucideResources.drawable.clipboard_paste)

  /**
   * Returns a `Painter` for the `clipboard_pen` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clipboard-pen
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clipboardPen(): Painter = painterResource(LumeLucideResources.drawable.clipboard_pen)

  /**
   * Returns a `Painter` for the `clipboard_pen_line` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clipboard-pen-line
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clipboardPenLine(): Painter = painterResource(LumeLucideResources.drawable.clipboard_pen_line)

  /**
   * Returns a `Painter` for the `clipboard_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clipboard-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clipboardPlus(): Painter = painterResource(LumeLucideResources.drawable.clipboard_plus)

  /**
   * Returns a `Painter` for the `clipboard_type` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clipboard-type
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clipboardType(): Painter = painterResource(LumeLucideResources.drawable.clipboard_type)

  /**
   * Returns a `Painter` for the `clipboard_x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clipboard-x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clipboardX(): Painter = painterResource(LumeLucideResources.drawable.clipboard_x)

  /**
   * Returns a `Painter` for the `clock` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clock
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clock(): Painter = painterResource(LumeLucideResources.drawable.clock)

  /**
   * Returns a `Painter` for the `clock_1` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clock-1
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clock1(): Painter = painterResource(LumeLucideResources.drawable.clock_1)

  /**
   * Returns a `Painter` for the `clock_10` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clock-10
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clock10(): Painter = painterResource(LumeLucideResources.drawable.clock_10)

  /**
   * Returns a `Painter` for the `clock_11` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clock-11
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clock11(): Painter = painterResource(LumeLucideResources.drawable.clock_11)

  /**
   * Returns a `Painter` for the `clock_12` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clock-12
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clock12(): Painter = painterResource(LumeLucideResources.drawable.clock_12)

  /**
   * Returns a `Painter` for the `clock_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clock-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clock2(): Painter = painterResource(LumeLucideResources.drawable.clock_2)

  /**
   * Returns a `Painter` for the `clock_3` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clock-3
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clock3(): Painter = painterResource(LumeLucideResources.drawable.clock_3)

  /**
   * Returns a `Painter` for the `clock_4` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clock-4
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clock4(): Painter = painterResource(LumeLucideResources.drawable.clock_4)

  /**
   * Returns a `Painter` for the `clock_5` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clock-5
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clock5(): Painter = painterResource(LumeLucideResources.drawable.clock_5)

  /**
   * Returns a `Painter` for the `clock_6` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clock-6
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clock6(): Painter = painterResource(LumeLucideResources.drawable.clock_6)

  /**
   * Returns a `Painter` for the `clock_7` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clock-7
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clock7(): Painter = painterResource(LumeLucideResources.drawable.clock_7)

  /**
   * Returns a `Painter` for the `clock_8` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clock-8
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clock8(): Painter = painterResource(LumeLucideResources.drawable.clock_8)

  /**
   * Returns a `Painter` for the `clock_9` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clock-9
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clock9(): Painter = painterResource(LumeLucideResources.drawable.clock_9)

  /**
   * Returns a `Painter` for the `clock_alert` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clock-alert
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clockAlert(): Painter = painterResource(LumeLucideResources.drawable.clock_alert)

  /**
   * Returns a `Painter` for the `clock_arrow_down` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clock-arrow-down
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clockArrowDown(): Painter = painterResource(LumeLucideResources.drawable.clock_arrow_down)

  /**
   * Returns a `Painter` for the `clock_arrow_up` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clock-arrow-up
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clockArrowUp(): Painter = painterResource(LumeLucideResources.drawable.clock_arrow_up)

  /**
   * Returns a `Painter` for the `clock_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clock-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clockCheck(): Painter = painterResource(LumeLucideResources.drawable.clock_check)

  /**
   * Returns a `Painter` for the `clock_fading` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clock-fading
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clockFading(): Painter = painterResource(LumeLucideResources.drawable.clock_fading)

  /**
   * Returns a `Painter` for the `clock_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clock-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clockPlus(): Painter = painterResource(LumeLucideResources.drawable.clock_plus)

  /**
   * Returns a `Painter` for the `closed_caption` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/closed-caption
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun closedCaption(): Painter = painterResource(LumeLucideResources.drawable.closed_caption)

  /**
   * Returns a `Painter` for the `cloud` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cloud
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cloud(): Painter = painterResource(LumeLucideResources.drawable.cloud)

  /**
   * Returns a `Painter` for the `cloud_alert` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cloud-alert
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cloudAlert(): Painter = painterResource(LumeLucideResources.drawable.cloud_alert)

  /**
   * Returns a `Painter` for the `cloud_backup` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cloud-backup
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cloudBackup(): Painter = painterResource(LumeLucideResources.drawable.cloud_backup)

  /**
   * Returns a `Painter` for the `cloud_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cloud-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cloudCheck(): Painter = painterResource(LumeLucideResources.drawable.cloud_check)

  /**
   * Returns a `Painter` for the `cloud_cog` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cloud-cog
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cloudCog(): Painter = painterResource(LumeLucideResources.drawable.cloud_cog)

  /**
   * Returns a `Painter` for the `cloud_download` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cloud-download
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cloudDownload(): Painter = painterResource(LumeLucideResources.drawable.cloud_download)

  /**
   * Returns a `Painter` for the `cloud_drizzle` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cloud-drizzle
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cloudDrizzle(): Painter = painterResource(LumeLucideResources.drawable.cloud_drizzle)

  /**
   * Returns a `Painter` for the `cloud_fog` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cloud-fog
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cloudFog(): Painter = painterResource(LumeLucideResources.drawable.cloud_fog)

  /**
   * Returns a `Painter` for the `cloud_hail` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cloud-hail
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cloudHail(): Painter = painterResource(LumeLucideResources.drawable.cloud_hail)

  /**
   * Returns a `Painter` for the `cloud_lightning` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cloud-lightning
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cloudLightning(): Painter = painterResource(LumeLucideResources.drawable.cloud_lightning)

  /**
   * Returns a `Painter` for the `cloud_moon` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cloud-moon
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cloudMoon(): Painter = painterResource(LumeLucideResources.drawable.cloud_moon)

  /**
   * Returns a `Painter` for the `cloud_moon_rain` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cloud-moon-rain
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cloudMoonRain(): Painter = painterResource(LumeLucideResources.drawable.cloud_moon_rain)

  /**
   * Returns a `Painter` for the `cloud_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cloud-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cloudOff(): Painter = painterResource(LumeLucideResources.drawable.cloud_off)

  /**
   * Returns a `Painter` for the `cloud_rain` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cloud-rain
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cloudRain(): Painter = painterResource(LumeLucideResources.drawable.cloud_rain)

  /**
   * Returns a `Painter` for the `cloud_rain_wind` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cloud-rain-wind
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cloudRainWind(): Painter = painterResource(LumeLucideResources.drawable.cloud_rain_wind)

  /**
   * Returns a `Painter` for the `cloud_snow` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cloud-snow
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cloudSnow(): Painter = painterResource(LumeLucideResources.drawable.cloud_snow)

  /**
   * Returns a `Painter` for the `cloud_sun` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cloud-sun
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cloudSun(): Painter = painterResource(LumeLucideResources.drawable.cloud_sun)

  /**
   * Returns a `Painter` for the `cloud_sun_rain` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cloud-sun-rain
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cloudSunRain(): Painter = painterResource(LumeLucideResources.drawable.cloud_sun_rain)

  /**
   * Returns a `Painter` for the `cloud_sync` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cloud-sync
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cloudSync(): Painter = painterResource(LumeLucideResources.drawable.cloud_sync)

  /**
   * Returns a `Painter` for the `cloud_upload` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cloud-upload
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cloudUpload(): Painter = painterResource(LumeLucideResources.drawable.cloud_upload)

  /**
   * Returns a `Painter` for the `cloudy` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cloudy
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cloudy(): Painter = painterResource(LumeLucideResources.drawable.cloudy)

  /**
   * Returns a `Painter` for the `clover` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/clover
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun clover(): Painter = painterResource(LumeLucideResources.drawable.clover)

  /**
   * Returns a `Painter` for the `club` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/club
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun club(): Painter = painterResource(LumeLucideResources.drawable.club)

  /**
   * Returns a `Painter` for the `code` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/code
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun code(): Painter = painterResource(LumeLucideResources.drawable.code)

  /**
   * Returns a `Painter` for the `code_xml` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/code-xml
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun codeXml(): Painter = painterResource(LumeLucideResources.drawable.code_xml)

  /**
   * Returns a `Painter` for the `coffee` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/coffee
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun coffee(): Painter = painterResource(LumeLucideResources.drawable.coffee)

  /**
   * Returns a `Painter` for the `cog` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cog
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cog(): Painter = painterResource(LumeLucideResources.drawable.cog)

  /**
   * Returns a `Painter` for the `coins` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/coins
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun coins(): Painter = painterResource(LumeLucideResources.drawable.coins)

  /**
   * Returns a `Painter` for the `columns_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/columns-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun columns2(): Painter = painterResource(LumeLucideResources.drawable.columns_2)

  /**
   * Returns a `Painter` for the `columns_3` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/columns-3
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun columns3(): Painter = painterResource(LumeLucideResources.drawable.columns_3)

  /**
   * Returns a `Painter` for the `columns_3_cog` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/columns-3-cog
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun columns3Cog(): Painter = painterResource(LumeLucideResources.drawable.columns_3_cog)

  /**
   * Returns a `Painter` for the `columns_4` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/columns-4
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun columns4(): Painter = painterResource(LumeLucideResources.drawable.columns_4)

  /**
   * Returns a `Painter` for the `combine` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/combine
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun combine(): Painter = painterResource(LumeLucideResources.drawable.combine)

  /**
   * Returns a `Painter` for the `command` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/command
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun command(): Painter = painterResource(LumeLucideResources.drawable.command)

  /**
   * Returns a `Painter` for the `compass` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/compass
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun compass(): Painter = painterResource(LumeLucideResources.drawable.compass)

  /**
   * Returns a `Painter` for the `component` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/component
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun component(): Painter = painterResource(LumeLucideResources.drawable.component)

  /**
   * Returns a `Painter` for the `computer` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/computer
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun computer(): Painter = painterResource(LumeLucideResources.drawable.computer)

  /**
   * Returns a `Painter` for the `concierge_bell` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/concierge-bell
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun conciergeBell(): Painter = painterResource(LumeLucideResources.drawable.concierge_bell)

  /**
   * Returns a `Painter` for the `cone` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cone
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cone(): Painter = painterResource(LumeLucideResources.drawable.cone)

  /**
   * Returns a `Painter` for the `construction` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/construction
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun construction(): Painter = painterResource(LumeLucideResources.drawable.construction)

  /**
   * Returns a `Painter` for the `contact` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/contact
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun contact(): Painter = painterResource(LumeLucideResources.drawable.contact)

  /**
   * Returns a `Painter` for the `contact_round` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/contact-round
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun contactRound(): Painter = painterResource(LumeLucideResources.drawable.contact_round)

  /**
   * Returns a `Painter` for the `container` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/container
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun container(): Painter = painterResource(LumeLucideResources.drawable.container)

  /**
   * Returns a `Painter` for the `contrast` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/contrast
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun contrast(): Painter = painterResource(LumeLucideResources.drawable.contrast)

  /**
   * Returns a `Painter` for the `cookie` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cookie
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cookie(): Painter = painterResource(LumeLucideResources.drawable.cookie)

  /**
   * Returns a `Painter` for the `cooking_pot` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cooking-pot
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cookingPot(): Painter = painterResource(LumeLucideResources.drawable.cooking_pot)

  /**
   * Returns a `Painter` for the `copy` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/copy
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun copy(): Painter = painterResource(LumeLucideResources.drawable.copy)

  /**
   * Returns a `Painter` for the `copy_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/copy-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun copyCheck(): Painter = painterResource(LumeLucideResources.drawable.copy_check)

  /**
   * Returns a `Painter` for the `copy_minus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/copy-minus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun copyMinus(): Painter = painterResource(LumeLucideResources.drawable.copy_minus)

  /**
   * Returns a `Painter` for the `copy_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/copy-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun copyPlus(): Painter = painterResource(LumeLucideResources.drawable.copy_plus)

  /**
   * Returns a `Painter` for the `copy_slash` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/copy-slash
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun copySlash(): Painter = painterResource(LumeLucideResources.drawable.copy_slash)

  /**
   * Returns a `Painter` for the `copy_x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/copy-x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun copyX(): Painter = painterResource(LumeLucideResources.drawable.copy_x)

  /**
   * Returns a `Painter` for the `copyleft` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/copyleft
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun copyleft(): Painter = painterResource(LumeLucideResources.drawable.copyleft)

  /**
   * Returns a `Painter` for the `copyright` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/copyright
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun copyright(): Painter = painterResource(LumeLucideResources.drawable.copyright)

  /**
   * Returns a `Painter` for the `corner_down_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/corner-down-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cornerDownLeft(): Painter = painterResource(LumeLucideResources.drawable.corner_down_left)

  /**
   * Returns a `Painter` for the `corner_down_right` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/corner-down-right
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cornerDownRight(): Painter = painterResource(LumeLucideResources.drawable.corner_down_right)

  /**
   * Returns a `Painter` for the `corner_left_down` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/corner-left-down
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cornerLeftDown(): Painter = painterResource(LumeLucideResources.drawable.corner_left_down)

  /**
   * Returns a `Painter` for the `corner_left_up` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/corner-left-up
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cornerLeftUp(): Painter = painterResource(LumeLucideResources.drawable.corner_left_up)

  /**
   * Returns a `Painter` for the `corner_right_down` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/corner-right-down
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cornerRightDown(): Painter = painterResource(LumeLucideResources.drawable.corner_right_down)

  /**
   * Returns a `Painter` for the `corner_right_up` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/corner-right-up
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cornerRightUp(): Painter = painterResource(LumeLucideResources.drawable.corner_right_up)

  /**
   * Returns a `Painter` for the `corner_up_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/corner-up-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cornerUpLeft(): Painter = painterResource(LumeLucideResources.drawable.corner_up_left)

  /**
   * Returns a `Painter` for the `corner_up_right` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/corner-up-right
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cornerUpRight(): Painter = painterResource(LumeLucideResources.drawable.corner_up_right)

  /**
   * Returns a `Painter` for the `cpu` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cpu
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cpu(): Painter = painterResource(LumeLucideResources.drawable.cpu)

  /**
   * Returns a `Painter` for the `creative_commons` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/creative-commons
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun creativeCommons(): Painter = painterResource(LumeLucideResources.drawable.creative_commons)

  /**
   * Returns a `Painter` for the `credit_card` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/credit-card
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun creditCard(): Painter = painterResource(LumeLucideResources.drawable.credit_card)

  /**
   * Returns a `Painter` for the `croissant` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/croissant
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun croissant(): Painter = painterResource(LumeLucideResources.drawable.croissant)

  /**
   * Returns a `Painter` for the `crop` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/crop
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun crop(): Painter = painterResource(LumeLucideResources.drawable.crop)

  /**
   * Returns a `Painter` for the `cross` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cross
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cross(): Painter = painterResource(LumeLucideResources.drawable.cross)

  /**
   * Returns a `Painter` for the `crosshair` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/crosshair
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun crosshair(): Painter = painterResource(LumeLucideResources.drawable.crosshair)

  /**
   * Returns a `Painter` for the `crown` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/crown
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun crown(): Painter = painterResource(LumeLucideResources.drawable.crown)

  /**
   * Returns a `Painter` for the `cuboid` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cuboid
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cuboid(): Painter = painterResource(LumeLucideResources.drawable.cuboid)

  /**
   * Returns a `Painter` for the `cup_soda` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cup-soda
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cupSoda(): Painter = painterResource(LumeLucideResources.drawable.cup_soda)

  /**
   * Returns a `Painter` for the `currency` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/currency
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun currency(): Painter = painterResource(LumeLucideResources.drawable.currency)

  /**
   * Returns a `Painter` for the `cylinder` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/cylinder
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun cylinder(): Painter = painterResource(LumeLucideResources.drawable.cylinder)

  /**
   * Returns a `Painter` for the `dam` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/dam
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun dam(): Painter = painterResource(LumeLucideResources.drawable.dam)

  /**
   * Returns a `Painter` for the `database` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/database
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun database(): Painter = painterResource(LumeLucideResources.drawable.database)

  /**
   * Returns a `Painter` for the `database_backup` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/database-backup
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun databaseBackup(): Painter = painterResource(LumeLucideResources.drawable.database_backup)

  /**
   * Returns a `Painter` for the `database_search` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/database-search
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun databaseSearch(): Painter = painterResource(LumeLucideResources.drawable.database_search)

  /**
   * Returns a `Painter` for the `database_zap` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/database-zap
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun databaseZap(): Painter = painterResource(LumeLucideResources.drawable.database_zap)

  /**
   * Returns a `Painter` for the `decimals_arrow_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/decimals-arrow-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun decimalsArrowLeft(): Painter = painterResource(LumeLucideResources.drawable.decimals_arrow_left)

  /**
   * Returns a `Painter` for the `decimals_arrow_right` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/decimals-arrow-right
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun decimalsArrowRight(): Painter = painterResource(LumeLucideResources.drawable.decimals_arrow_right)

  /**
   * Returns a `Painter` for the `delete` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/delete
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun delete(): Painter = painterResource(LumeLucideResources.drawable.delete)

  /**
   * Returns a `Painter` for the `dessert` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/dessert
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun dessert(): Painter = painterResource(LumeLucideResources.drawable.dessert)

  /**
   * Returns a `Painter` for the `diameter` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/diameter
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun diameter(): Painter = painterResource(LumeLucideResources.drawable.diameter)

  /**
   * Returns a `Painter` for the `diamond` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/diamond
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun diamond(): Painter = painterResource(LumeLucideResources.drawable.diamond)

  /**
   * Returns a `Painter` for the `diamond_minus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/diamond-minus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun diamondMinus(): Painter = painterResource(LumeLucideResources.drawable.diamond_minus)

  /**
   * Returns a `Painter` for the `diamond_percent` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/diamond-percent
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun diamondPercent(): Painter = painterResource(LumeLucideResources.drawable.diamond_percent)

  /**
   * Returns a `Painter` for the `diamond_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/diamond-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun diamondPlus(): Painter = painterResource(LumeLucideResources.drawable.diamond_plus)

  /**
   * Returns a `Painter` for the `dice_1` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/dice-1
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun dice1(): Painter = painterResource(LumeLucideResources.drawable.dice_1)

  /**
   * Returns a `Painter` for the `dice_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/dice-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun dice2(): Painter = painterResource(LumeLucideResources.drawable.dice_2)

  /**
   * Returns a `Painter` for the `dice_3` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/dice-3
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun dice3(): Painter = painterResource(LumeLucideResources.drawable.dice_3)

  /**
   * Returns a `Painter` for the `dice_4` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/dice-4
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun dice4(): Painter = painterResource(LumeLucideResources.drawable.dice_4)

  /**
   * Returns a `Painter` for the `dice_5` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/dice-5
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun dice5(): Painter = painterResource(LumeLucideResources.drawable.dice_5)

  /**
   * Returns a `Painter` for the `dice_6` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/dice-6
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun dice6(): Painter = painterResource(LumeLucideResources.drawable.dice_6)

  /**
   * Returns a `Painter` for the `dices` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/dices
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun dices(): Painter = painterResource(LumeLucideResources.drawable.dices)

  /**
   * Returns a `Painter` for the `diff` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/diff
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun diff(): Painter = painterResource(LumeLucideResources.drawable.diff)

  /**
   * Returns a `Painter` for the `disc` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/disc
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun disc(): Painter = painterResource(LumeLucideResources.drawable.disc)

  /**
   * Returns a `Painter` for the `disc_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/disc-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun disc2(): Painter = painterResource(LumeLucideResources.drawable.disc_2)

  /**
   * Returns a `Painter` for the `disc_3` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/disc-3
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun disc3(): Painter = painterResource(LumeLucideResources.drawable.disc_3)

  /**
   * Returns a `Painter` for the `disc_album` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/disc-album
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun discAlbum(): Painter = painterResource(LumeLucideResources.drawable.disc_album)

  /**
   * Returns a `Painter` for the `divide` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/divide
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun divide(): Painter = painterResource(LumeLucideResources.drawable.divide)

  /**
   * Returns a `Painter` for the `dna` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/dna
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun dna(): Painter = painterResource(LumeLucideResources.drawable.dna)

  /**
   * Returns a `Painter` for the `dna_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/dna-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun dnaOff(): Painter = painterResource(LumeLucideResources.drawable.dna_off)

  /**
   * Returns a `Painter` for the `dock` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/dock
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun dock(): Painter = painterResource(LumeLucideResources.drawable.dock)

  /**
   * Returns a `Painter` for the `dog` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/dog
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun dog(): Painter = painterResource(LumeLucideResources.drawable.dog)

  /**
   * Returns a `Painter` for the `dollar_sign` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/dollar-sign
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun dollarSign(): Painter = painterResource(LumeLucideResources.drawable.dollar_sign)

  /**
   * Returns a `Painter` for the `donut` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/donut
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun donut(): Painter = painterResource(LumeLucideResources.drawable.donut)

  /**
   * Returns a `Painter` for the `door_closed` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/door-closed
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun doorClosed(): Painter = painterResource(LumeLucideResources.drawable.door_closed)

  /**
   * Returns a `Painter` for the `door_closed_locked` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/door-closed-locked
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun doorClosedLocked(): Painter = painterResource(LumeLucideResources.drawable.door_closed_locked)

  /**
   * Returns a `Painter` for the `door_open` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/door-open
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun doorOpen(): Painter = painterResource(LumeLucideResources.drawable.door_open)

  /**
   * Returns a `Painter` for the `dot` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/dot
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun dot(): Painter = painterResource(LumeLucideResources.drawable.dot)

  /**
   * Returns a `Painter` for the `download` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/download
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun download(): Painter = painterResource(LumeLucideResources.drawable.download)

  /**
   * Returns a `Painter` for the `drafting_compass` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/drafting-compass
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun draftingCompass(): Painter = painterResource(LumeLucideResources.drawable.drafting_compass)

  /**
   * Returns a `Painter` for the `drama` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/drama
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun drama(): Painter = painterResource(LumeLucideResources.drawable.drama)

  /**
   * Returns a `Painter` for the `drill` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/drill
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun drill(): Painter = painterResource(LumeLucideResources.drawable.drill)

  /**
   * Returns a `Painter` for the `drone` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/drone
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun drone(): Painter = painterResource(LumeLucideResources.drawable.drone)

  /**
   * Returns a `Painter` for the `droplet` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/droplet
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun droplet(): Painter = painterResource(LumeLucideResources.drawable.droplet)

  /**
   * Returns a `Painter` for the `droplet_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/droplet-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun dropletOff(): Painter = painterResource(LumeLucideResources.drawable.droplet_off)

  /**
   * Returns a `Painter` for the `droplets` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/droplets
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun droplets(): Painter = painterResource(LumeLucideResources.drawable.droplets)

  /**
   * Returns a `Painter` for the `drum` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/drum
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun drum(): Painter = painterResource(LumeLucideResources.drawable.drum)

  /**
   * Returns a `Painter` for the `drumstick` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/drumstick
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun drumstick(): Painter = painterResource(LumeLucideResources.drawable.drumstick)

  /**
   * Returns a `Painter` for the `dumbbell` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/dumbbell
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun dumbbell(): Painter = painterResource(LumeLucideResources.drawable.dumbbell)

  /**
   * Returns a `Painter` for the `ear` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ear
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun ear(): Painter = painterResource(LumeLucideResources.drawable.ear)

  /**
   * Returns a `Painter` for the `ear_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ear-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun earOff(): Painter = painterResource(LumeLucideResources.drawable.ear_off)

  /**
   * Returns a `Painter` for the `earth` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/earth
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun earth(): Painter = painterResource(LumeLucideResources.drawable.earth)

  /**
   * Returns a `Painter` for the `earth_lock` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/earth-lock
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun earthLock(): Painter = painterResource(LumeLucideResources.drawable.earth_lock)

  /**
   * Returns a `Painter` for the `eclipse` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/eclipse
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun eclipse(): Painter = painterResource(LumeLucideResources.drawable.eclipse)

  /**
   * Returns a `Painter` for the `egg` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/egg
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun egg(): Painter = painterResource(LumeLucideResources.drawable.egg)

  /**
   * Returns a `Painter` for the `egg_fried` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/egg-fried
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun eggFried(): Painter = painterResource(LumeLucideResources.drawable.egg_fried)

  /**
   * Returns a `Painter` for the `egg_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/egg-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun eggOff(): Painter = painterResource(LumeLucideResources.drawable.egg_off)

  /**
   * Returns a `Painter` for the `ellipse` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ellipse
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun ellipse(): Painter = painterResource(LumeLucideResources.drawable.ellipse)

  /**
   * Returns a `Painter` for the `ellipsis` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ellipsis
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun ellipsis(): Painter = painterResource(LumeLucideResources.drawable.ellipsis)

  /**
   * Returns a `Painter` for the `ellipsis_vertical` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ellipsis-vertical
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun ellipsisVertical(): Painter = painterResource(LumeLucideResources.drawable.ellipsis_vertical)

  /**
   * Returns a `Painter` for the `equal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/equal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun equal(): Painter = painterResource(LumeLucideResources.drawable.equal)

  /**
   * Returns a `Painter` for the `equal_approximately` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/equal-approximately
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun equalApproximately(): Painter = painterResource(LumeLucideResources.drawable.equal_approximately)

  /**
   * Returns a `Painter` for the `equal_not` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/equal-not
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun equalNot(): Painter = painterResource(LumeLucideResources.drawable.equal_not)

  /**
   * Returns a `Painter` for the `eraser` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/eraser
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun eraser(): Painter = painterResource(LumeLucideResources.drawable.eraser)

  /**
   * Returns a `Painter` for the `ethernet_port` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ethernet-port
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun ethernetPort(): Painter = painterResource(LumeLucideResources.drawable.ethernet_port)

  /**
   * Returns a `Painter` for the `euro` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/euro
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun euro(): Painter = painterResource(LumeLucideResources.drawable.euro)

  /**
   * Returns a `Painter` for the `ev_charger` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ev-charger
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun evCharger(): Painter = painterResource(LumeLucideResources.drawable.ev_charger)

  /**
   * Returns a `Painter` for the `expand` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/expand
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun expand(): Painter = painterResource(LumeLucideResources.drawable.expand)

  /**
   * Returns a `Painter` for the `external_link` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/external-link
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun externalLink(): Painter = painterResource(LumeLucideResources.drawable.external_link)

  /**
   * Returns a `Painter` for the `eye` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/eye
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun eye(): Painter = painterResource(LumeLucideResources.drawable.eye)

  /**
   * Returns a `Painter` for the `eye_closed` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/eye-closed
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun eyeClosed(): Painter = painterResource(LumeLucideResources.drawable.eye_closed)

  /**
   * Returns a `Painter` for the `eye_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/eye-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun eyeOff(): Painter = painterResource(LumeLucideResources.drawable.eye_off)

  /**
   * Returns a `Painter` for the `factory` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/factory
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun factory(): Painter = painterResource(LumeLucideResources.drawable.factory)

  /**
   * Returns a `Painter` for the `fan` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/fan
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fan(): Painter = painterResource(LumeLucideResources.drawable.fan)

  /**
   * Returns a `Painter` for the `fast_forward` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/fast-forward
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fastForward(): Painter = painterResource(LumeLucideResources.drawable.fast_forward)

  /**
   * Returns a `Painter` for the `feather` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/feather
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun feather(): Painter = painterResource(LumeLucideResources.drawable.feather)

  /**
   * Returns a `Painter` for the `fence` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/fence
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fence(): Painter = painterResource(LumeLucideResources.drawable.fence)

  /**
   * Returns a `Painter` for the `ferris_wheel` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ferris-wheel
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun ferrisWheel(): Painter = painterResource(LumeLucideResources.drawable.ferris_wheel)

  /**
   * Returns a `Painter` for the `file` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun `file`(): Painter = painterResource(LumeLucideResources.drawable.file)

  /**
   * Returns a `Painter` for the `file_archive` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-archive
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileArchive(): Painter = painterResource(LumeLucideResources.drawable.file_archive)

  /**
   * Returns a `Painter` for the `file_axis_3d` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-axis-3d
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileAxis3d(): Painter = painterResource(LumeLucideResources.drawable.file_axis_3d)

  /**
   * Returns a `Painter` for the `file_badge` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-badge
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileBadge(): Painter = painterResource(LumeLucideResources.drawable.file_badge)

  /**
   * Returns a `Painter` for the `file_box` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-box
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileBox(): Painter = painterResource(LumeLucideResources.drawable.file_box)

  /**
   * Returns a `Painter` for the `file_braces` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-braces
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileBraces(): Painter = painterResource(LumeLucideResources.drawable.file_braces)

  /**
   * Returns a `Painter` for the `file_braces_corner` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-braces-corner
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileBracesCorner(): Painter = painterResource(LumeLucideResources.drawable.file_braces_corner)

  /**
   * Returns a `Painter` for the `file_chart_column` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-chart-column
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileChartColumn(): Painter = painterResource(LumeLucideResources.drawable.file_chart_column)

  /**
   * Returns a `Painter` for the `file_chart_column_increasing` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-chart-column-increasing
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileChartColumnIncreasing(): Painter = painterResource(LumeLucideResources.drawable.file_chart_column_increasing)

  /**
   * Returns a `Painter` for the `file_chart_line` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-chart-line
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileChartLine(): Painter = painterResource(LumeLucideResources.drawable.file_chart_line)

  /**
   * Returns a `Painter` for the `file_chart_pie` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-chart-pie
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileChartPie(): Painter = painterResource(LumeLucideResources.drawable.file_chart_pie)

  /**
   * Returns a `Painter` for the `file_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileCheck(): Painter = painterResource(LumeLucideResources.drawable.file_check)

  /**
   * Returns a `Painter` for the `file_check_corner` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-check-corner
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileCheckCorner(): Painter = painterResource(LumeLucideResources.drawable.file_check_corner)

  /**
   * Returns a `Painter` for the `file_clock` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-clock
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileClock(): Painter = painterResource(LumeLucideResources.drawable.file_clock)

  /**
   * Returns a `Painter` for the `file_code` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-code
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileCode(): Painter = painterResource(LumeLucideResources.drawable.file_code)

  /**
   * Returns a `Painter` for the `file_code_corner` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-code-corner
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileCodeCorner(): Painter = painterResource(LumeLucideResources.drawable.file_code_corner)

  /**
   * Returns a `Painter` for the `file_cog` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-cog
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileCog(): Painter = painterResource(LumeLucideResources.drawable.file_cog)

  /**
   * Returns a `Painter` for the `file_diff` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-diff
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileDiff(): Painter = painterResource(LumeLucideResources.drawable.file_diff)

  /**
   * Returns a `Painter` for the `file_digit` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-digit
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileDigit(): Painter = painterResource(LumeLucideResources.drawable.file_digit)

  /**
   * Returns a `Painter` for the `file_down` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-down
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileDown(): Painter = painterResource(LumeLucideResources.drawable.file_down)

  /**
   * Returns a `Painter` for the `file_exclamation_point` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-exclamation-point
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileExclamationPoint(): Painter = painterResource(LumeLucideResources.drawable.file_exclamation_point)

  /**
   * Returns a `Painter` for the `file_headphone` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-headphone
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileHeadphone(): Painter = painterResource(LumeLucideResources.drawable.file_headphone)

  /**
   * Returns a `Painter` for the `file_heart` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-heart
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileHeart(): Painter = painterResource(LumeLucideResources.drawable.file_heart)

  /**
   * Returns a `Painter` for the `file_image` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-image
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileImage(): Painter = painterResource(LumeLucideResources.drawable.file_image)

  /**
   * Returns a `Painter` for the `file_input` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-input
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileInput(): Painter = painterResource(LumeLucideResources.drawable.file_input)

  /**
   * Returns a `Painter` for the `file_key` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-key
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileKey(): Painter = painterResource(LumeLucideResources.drawable.file_key)

  /**
   * Returns a `Painter` for the `file_lock` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-lock
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileLock(): Painter = painterResource(LumeLucideResources.drawable.file_lock)

  /**
   * Returns a `Painter` for the `file_minus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-minus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileMinus(): Painter = painterResource(LumeLucideResources.drawable.file_minus)

  /**
   * Returns a `Painter` for the `file_minus_corner` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-minus-corner
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileMinusCorner(): Painter = painterResource(LumeLucideResources.drawable.file_minus_corner)

  /**
   * Returns a `Painter` for the `file_music` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-music
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileMusic(): Painter = painterResource(LumeLucideResources.drawable.file_music)

  /**
   * Returns a `Painter` for the `file_output` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-output
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileOutput(): Painter = painterResource(LumeLucideResources.drawable.file_output)

  /**
   * Returns a `Painter` for the `file_pen` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-pen
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun filePen(): Painter = painterResource(LumeLucideResources.drawable.file_pen)

  /**
   * Returns a `Painter` for the `file_pen_line` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-pen-line
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun filePenLine(): Painter = painterResource(LumeLucideResources.drawable.file_pen_line)

  /**
   * Returns a `Painter` for the `file_play` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-play
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun filePlay(): Painter = painterResource(LumeLucideResources.drawable.file_play)

  /**
   * Returns a `Painter` for the `file_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun filePlus(): Painter = painterResource(LumeLucideResources.drawable.file_plus)

  /**
   * Returns a `Painter` for the `file_plus_corner` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-plus-corner
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun filePlusCorner(): Painter = painterResource(LumeLucideResources.drawable.file_plus_corner)

  /**
   * Returns a `Painter` for the `file_question_mark` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-question-mark
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileQuestionMark(): Painter = painterResource(LumeLucideResources.drawable.file_question_mark)

  /**
   * Returns a `Painter` for the `file_scan` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-scan
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileScan(): Painter = painterResource(LumeLucideResources.drawable.file_scan)

  /**
   * Returns a `Painter` for the `file_search` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-search
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileSearch(): Painter = painterResource(LumeLucideResources.drawable.file_search)

  /**
   * Returns a `Painter` for the `file_search_corner` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-search-corner
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileSearchCorner(): Painter = painterResource(LumeLucideResources.drawable.file_search_corner)

  /**
   * Returns a `Painter` for the `file_signal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-signal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileSignal(): Painter = painterResource(LumeLucideResources.drawable.file_signal)

  /**
   * Returns a `Painter` for the `file_sliders` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-sliders
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileSliders(): Painter = painterResource(LumeLucideResources.drawable.file_sliders)

  /**
   * Returns a `Painter` for the `file_spreadsheet` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-spreadsheet
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileSpreadsheet(): Painter = painterResource(LumeLucideResources.drawable.file_spreadsheet)

  /**
   * Returns a `Painter` for the `file_stack` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-stack
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileStack(): Painter = painterResource(LumeLucideResources.drawable.file_stack)

  /**
   * Returns a `Painter` for the `file_symlink` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-symlink
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileSymlink(): Painter = painterResource(LumeLucideResources.drawable.file_symlink)

  /**
   * Returns a `Painter` for the `file_terminal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-terminal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileTerminal(): Painter = painterResource(LumeLucideResources.drawable.file_terminal)

  /**
   * Returns a `Painter` for the `file_text` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-text
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileText(): Painter = painterResource(LumeLucideResources.drawable.file_text)

  /**
   * Returns a `Painter` for the `file_type` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-type
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileType(): Painter = painterResource(LumeLucideResources.drawable.file_type)

  /**
   * Returns a `Painter` for the `file_type_corner` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-type-corner
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileTypeCorner(): Painter = painterResource(LumeLucideResources.drawable.file_type_corner)

  /**
   * Returns a `Painter` for the `file_up` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-up
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileUp(): Painter = painterResource(LumeLucideResources.drawable.file_up)

  /**
   * Returns a `Painter` for the `file_user` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-user
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileUser(): Painter = painterResource(LumeLucideResources.drawable.file_user)

  /**
   * Returns a `Painter` for the `file_video_camera` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-video-camera
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileVideoCamera(): Painter = painterResource(LumeLucideResources.drawable.file_video_camera)

  /**
   * Returns a `Painter` for the `file_volume` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-volume
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileVolume(): Painter = painterResource(LumeLucideResources.drawable.file_volume)

  /**
   * Returns a `Painter` for the `file_x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileX(): Painter = painterResource(LumeLucideResources.drawable.file_x)

  /**
   * Returns a `Painter` for the `file_x_corner` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/file-x-corner
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fileXCorner(): Painter = painterResource(LumeLucideResources.drawable.file_x_corner)

  /**
   * Returns a `Painter` for the `files` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/files
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun files(): Painter = painterResource(LumeLucideResources.drawable.files)

  /**
   * Returns a `Painter` for the `film` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/film
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun film(): Painter = painterResource(LumeLucideResources.drawable.film)

  /**
   * Returns a `Painter` for the `fingerprint_pattern` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/fingerprint-pattern
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fingerprintPattern(): Painter = painterResource(LumeLucideResources.drawable.fingerprint_pattern)

  /**
   * Returns a `Painter` for the `fire_extinguisher` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/fire-extinguisher
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fireExtinguisher(): Painter = painterResource(LumeLucideResources.drawable.fire_extinguisher)

  /**
   * Returns a `Painter` for the `fish` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/fish
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fish(): Painter = painterResource(LumeLucideResources.drawable.fish)

  /**
   * Returns a `Painter` for the `fish_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/fish-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fishOff(): Painter = painterResource(LumeLucideResources.drawable.fish_off)

  /**
   * Returns a `Painter` for the `fish_symbol` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/fish-symbol
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fishSymbol(): Painter = painterResource(LumeLucideResources.drawable.fish_symbol)

  /**
   * Returns a `Painter` for the `fishing_hook` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/fishing-hook
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fishingHook(): Painter = painterResource(LumeLucideResources.drawable.fishing_hook)

  /**
   * Returns a `Painter` for the `fishing_rod` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/fishing-rod
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fishingRod(): Painter = painterResource(LumeLucideResources.drawable.fishing_rod)

  /**
   * Returns a `Painter` for the `flag` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/flag
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun flag(): Painter = painterResource(LumeLucideResources.drawable.flag)

  /**
   * Returns a `Painter` for the `flag_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/flag-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun flagOff(): Painter = painterResource(LumeLucideResources.drawable.flag_off)

  /**
   * Returns a `Painter` for the `flag_triangle_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/flag-triangle-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun flagTriangleLeft(): Painter = painterResource(LumeLucideResources.drawable.flag_triangle_left)

  /**
   * Returns a `Painter` for the `flag_triangle_right` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/flag-triangle-right
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun flagTriangleRight(): Painter = painterResource(LumeLucideResources.drawable.flag_triangle_right)

  /**
   * Returns a `Painter` for the `flame` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/flame
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun flame(): Painter = painterResource(LumeLucideResources.drawable.flame)

  /**
   * Returns a `Painter` for the `flame_kindling` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/flame-kindling
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun flameKindling(): Painter = painterResource(LumeLucideResources.drawable.flame_kindling)

  /**
   * Returns a `Painter` for the `flashlight` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/flashlight
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun flashlight(): Painter = painterResource(LumeLucideResources.drawable.flashlight)

  /**
   * Returns a `Painter` for the `flashlight_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/flashlight-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun flashlightOff(): Painter = painterResource(LumeLucideResources.drawable.flashlight_off)

  /**
   * Returns a `Painter` for the `flask_conical` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/flask-conical
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun flaskConical(): Painter = painterResource(LumeLucideResources.drawable.flask_conical)

  /**
   * Returns a `Painter` for the `flask_conical_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/flask-conical-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun flaskConicalOff(): Painter = painterResource(LumeLucideResources.drawable.flask_conical_off)

  /**
   * Returns a `Painter` for the `flask_round` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/flask-round
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun flaskRound(): Painter = painterResource(LumeLucideResources.drawable.flask_round)

  /**
   * Returns a `Painter` for the `flip_horizontal_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/flip-horizontal-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun flipHorizontal2(): Painter = painterResource(LumeLucideResources.drawable.flip_horizontal_2)

  /**
   * Returns a `Painter` for the `flip_vertical_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/flip-vertical-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun flipVertical2(): Painter = painterResource(LumeLucideResources.drawable.flip_vertical_2)

  /**
   * Returns a `Painter` for the `flower` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/flower
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun flower(): Painter = painterResource(LumeLucideResources.drawable.flower)

  /**
   * Returns a `Painter` for the `flower_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/flower-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun flower2(): Painter = painterResource(LumeLucideResources.drawable.flower_2)

  /**
   * Returns a `Painter` for the `focus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/focus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun focus(): Painter = painterResource(LumeLucideResources.drawable.focus)

  /**
   * Returns a `Painter` for the `fold_horizontal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/fold-horizontal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun foldHorizontal(): Painter = painterResource(LumeLucideResources.drawable.fold_horizontal)

  /**
   * Returns a `Painter` for the `fold_vertical` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/fold-vertical
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun foldVertical(): Painter = painterResource(LumeLucideResources.drawable.fold_vertical)

  /**
   * Returns a `Painter` for the `folder` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folder
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folder(): Painter = painterResource(LumeLucideResources.drawable.folder)

  /**
   * Returns a `Painter` for the `folder_archive` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folder-archive
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folderArchive(): Painter = painterResource(LumeLucideResources.drawable.folder_archive)

  /**
   * Returns a `Painter` for the `folder_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folder-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folderCheck(): Painter = painterResource(LumeLucideResources.drawable.folder_check)

  /**
   * Returns a `Painter` for the `folder_clock` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folder-clock
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folderClock(): Painter = painterResource(LumeLucideResources.drawable.folder_clock)

  /**
   * Returns a `Painter` for the `folder_closed` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folder-closed
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folderClosed(): Painter = painterResource(LumeLucideResources.drawable.folder_closed)

  /**
   * Returns a `Painter` for the `folder_code` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folder-code
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folderCode(): Painter = painterResource(LumeLucideResources.drawable.folder_code)

  /**
   * Returns a `Painter` for the `folder_cog` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folder-cog
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folderCog(): Painter = painterResource(LumeLucideResources.drawable.folder_cog)

  /**
   * Returns a `Painter` for the `folder_dot` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folder-dot
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folderDot(): Painter = painterResource(LumeLucideResources.drawable.folder_dot)

  /**
   * Returns a `Painter` for the `folder_down` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folder-down
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folderDown(): Painter = painterResource(LumeLucideResources.drawable.folder_down)

  /**
   * Returns a `Painter` for the `folder_git` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folder-git
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folderGit(): Painter = painterResource(LumeLucideResources.drawable.folder_git)

  /**
   * Returns a `Painter` for the `folder_git_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folder-git-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folderGit2(): Painter = painterResource(LumeLucideResources.drawable.folder_git_2)

  /**
   * Returns a `Painter` for the `folder_heart` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folder-heart
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folderHeart(): Painter = painterResource(LumeLucideResources.drawable.folder_heart)

  /**
   * Returns a `Painter` for the `folder_input` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folder-input
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folderInput(): Painter = painterResource(LumeLucideResources.drawable.folder_input)

  /**
   * Returns a `Painter` for the `folder_kanban` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folder-kanban
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folderKanban(): Painter = painterResource(LumeLucideResources.drawable.folder_kanban)

  /**
   * Returns a `Painter` for the `folder_key` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folder-key
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folderKey(): Painter = painterResource(LumeLucideResources.drawable.folder_key)

  /**
   * Returns a `Painter` for the `folder_lock` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folder-lock
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folderLock(): Painter = painterResource(LumeLucideResources.drawable.folder_lock)

  /**
   * Returns a `Painter` for the `folder_minus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folder-minus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folderMinus(): Painter = painterResource(LumeLucideResources.drawable.folder_minus)

  /**
   * Returns a `Painter` for the `folder_open` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folder-open
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folderOpen(): Painter = painterResource(LumeLucideResources.drawable.folder_open)

  /**
   * Returns a `Painter` for the `folder_open_dot` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folder-open-dot
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folderOpenDot(): Painter = painterResource(LumeLucideResources.drawable.folder_open_dot)

  /**
   * Returns a `Painter` for the `folder_output` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folder-output
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folderOutput(): Painter = painterResource(LumeLucideResources.drawable.folder_output)

  /**
   * Returns a `Painter` for the `folder_pen` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folder-pen
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folderPen(): Painter = painterResource(LumeLucideResources.drawable.folder_pen)

  /**
   * Returns a `Painter` for the `folder_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folder-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folderPlus(): Painter = painterResource(LumeLucideResources.drawable.folder_plus)

  /**
   * Returns a `Painter` for the `folder_root` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folder-root
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folderRoot(): Painter = painterResource(LumeLucideResources.drawable.folder_root)

  /**
   * Returns a `Painter` for the `folder_search` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folder-search
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folderSearch(): Painter = painterResource(LumeLucideResources.drawable.folder_search)

  /**
   * Returns a `Painter` for the `folder_search_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folder-search-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folderSearch2(): Painter = painterResource(LumeLucideResources.drawable.folder_search_2)

  /**
   * Returns a `Painter` for the `folder_symlink` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folder-symlink
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folderSymlink(): Painter = painterResource(LumeLucideResources.drawable.folder_symlink)

  /**
   * Returns a `Painter` for the `folder_sync` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folder-sync
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folderSync(): Painter = painterResource(LumeLucideResources.drawable.folder_sync)

  /**
   * Returns a `Painter` for the `folder_tree` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folder-tree
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folderTree(): Painter = painterResource(LumeLucideResources.drawable.folder_tree)

  /**
   * Returns a `Painter` for the `folder_up` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folder-up
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folderUp(): Painter = painterResource(LumeLucideResources.drawable.folder_up)

  /**
   * Returns a `Painter` for the `folder_x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folder-x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folderX(): Painter = painterResource(LumeLucideResources.drawable.folder_x)

  /**
   * Returns a `Painter` for the `folders` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/folders
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun folders(): Painter = painterResource(LumeLucideResources.drawable.folders)

  /**
   * Returns a `Painter` for the `footprints` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/footprints
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun footprints(): Painter = painterResource(LumeLucideResources.drawable.footprints)

  /**
   * Returns a `Painter` for the `forklift` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/forklift
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun forklift(): Painter = painterResource(LumeLucideResources.drawable.forklift)

  /**
   * Returns a `Painter` for the `form` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/form
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun form(): Painter = painterResource(LumeLucideResources.drawable.form)

  /**
   * Returns a `Painter` for the `forward` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/forward
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun forward(): Painter = painterResource(LumeLucideResources.drawable.forward)

  /**
   * Returns a `Painter` for the `frame` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/frame
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun frame(): Painter = painterResource(LumeLucideResources.drawable.frame)

  /**
   * Returns a `Painter` for the `frown` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/frown
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun frown(): Painter = painterResource(LumeLucideResources.drawable.frown)

  /**
   * Returns a `Painter` for the `fuel` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/fuel
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fuel(): Painter = painterResource(LumeLucideResources.drawable.fuel)

  /**
   * Returns a `Painter` for the `fullscreen` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/fullscreen
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun fullscreen(): Painter = painterResource(LumeLucideResources.drawable.fullscreen)

  /**
   * Returns a `Painter` for the `funnel` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/funnel
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun funnel(): Painter = painterResource(LumeLucideResources.drawable.funnel)

  /**
   * Returns a `Painter` for the `funnel_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/funnel-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun funnelPlus(): Painter = painterResource(LumeLucideResources.drawable.funnel_plus)

  /**
   * Returns a `Painter` for the `funnel_x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/funnel-x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun funnelX(): Painter = painterResource(LumeLucideResources.drawable.funnel_x)

  /**
   * Returns a `Painter` for the `gallery_horizontal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/gallery-horizontal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun galleryHorizontal(): Painter = painterResource(LumeLucideResources.drawable.gallery_horizontal)

  /**
   * Returns a `Painter` for the `gallery_horizontal_end` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/gallery-horizontal-end
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun galleryHorizontalEnd(): Painter = painterResource(LumeLucideResources.drawable.gallery_horizontal_end)

  /**
   * Returns a `Painter` for the `gallery_thumbnails` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/gallery-thumbnails
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun galleryThumbnails(): Painter = painterResource(LumeLucideResources.drawable.gallery_thumbnails)

  /**
   * Returns a `Painter` for the `gallery_vertical` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/gallery-vertical
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun galleryVertical(): Painter = painterResource(LumeLucideResources.drawable.gallery_vertical)

  /**
   * Returns a `Painter` for the `gallery_vertical_end` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/gallery-vertical-end
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun galleryVerticalEnd(): Painter = painterResource(LumeLucideResources.drawable.gallery_vertical_end)

  /**
   * Returns a `Painter` for the `gamepad` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/gamepad
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun gamepad(): Painter = painterResource(LumeLucideResources.drawable.gamepad)

  /**
   * Returns a `Painter` for the `gamepad_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/gamepad-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun gamepad2(): Painter = painterResource(LumeLucideResources.drawable.gamepad_2)

  /**
   * Returns a `Painter` for the `gamepad_directional` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/gamepad-directional
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun gamepadDirectional(): Painter = painterResource(LumeLucideResources.drawable.gamepad_directional)

  /**
   * Returns a `Painter` for the `gauge` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/gauge
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun gauge(): Painter = painterResource(LumeLucideResources.drawable.gauge)

  /**
   * Returns a `Painter` for the `gavel` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/gavel
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun gavel(): Painter = painterResource(LumeLucideResources.drawable.gavel)

  /**
   * Returns a `Painter` for the `gem` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/gem
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun gem(): Painter = painterResource(LumeLucideResources.drawable.gem)

  /**
   * Returns a `Painter` for the `georgian_lari` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/georgian-lari
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun georgianLari(): Painter = painterResource(LumeLucideResources.drawable.georgian_lari)

  /**
   * Returns a `Painter` for the `ghost` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ghost
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun ghost(): Painter = painterResource(LumeLucideResources.drawable.ghost)

  /**
   * Returns a `Painter` for the `gift` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/gift
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun gift(): Painter = painterResource(LumeLucideResources.drawable.gift)

  /**
   * Returns a `Painter` for the `git_branch` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/git-branch
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun gitBranch(): Painter = painterResource(LumeLucideResources.drawable.git_branch)

  /**
   * Returns a `Painter` for the `git_branch_minus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/git-branch-minus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun gitBranchMinus(): Painter = painterResource(LumeLucideResources.drawable.git_branch_minus)

  /**
   * Returns a `Painter` for the `git_branch_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/git-branch-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun gitBranchPlus(): Painter = painterResource(LumeLucideResources.drawable.git_branch_plus)

  /**
   * Returns a `Painter` for the `git_commit_horizontal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/git-commit-horizontal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun gitCommitHorizontal(): Painter = painterResource(LumeLucideResources.drawable.git_commit_horizontal)

  /**
   * Returns a `Painter` for the `git_commit_vertical` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/git-commit-vertical
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun gitCommitVertical(): Painter = painterResource(LumeLucideResources.drawable.git_commit_vertical)

  /**
   * Returns a `Painter` for the `git_compare` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/git-compare
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun gitCompare(): Painter = painterResource(LumeLucideResources.drawable.git_compare)

  /**
   * Returns a `Painter` for the `git_compare_arrows` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/git-compare-arrows
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun gitCompareArrows(): Painter = painterResource(LumeLucideResources.drawable.git_compare_arrows)

  /**
   * Returns a `Painter` for the `git_fork` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/git-fork
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun gitFork(): Painter = painterResource(LumeLucideResources.drawable.git_fork)

  /**
   * Returns a `Painter` for the `git_graph` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/git-graph
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun gitGraph(): Painter = painterResource(LumeLucideResources.drawable.git_graph)

  /**
   * Returns a `Painter` for the `git_merge` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/git-merge
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun gitMerge(): Painter = painterResource(LumeLucideResources.drawable.git_merge)

  /**
   * Returns a `Painter` for the `git_merge_conflict` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/git-merge-conflict
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun gitMergeConflict(): Painter = painterResource(LumeLucideResources.drawable.git_merge_conflict)

  /**
   * Returns a `Painter` for the `git_pull_request` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/git-pull-request
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun gitPullRequest(): Painter = painterResource(LumeLucideResources.drawable.git_pull_request)

  /**
   * Returns a `Painter` for the `git_pull_request_arrow` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/git-pull-request-arrow
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun gitPullRequestArrow(): Painter = painterResource(LumeLucideResources.drawable.git_pull_request_arrow)

  /**
   * Returns a `Painter` for the `git_pull_request_closed` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/git-pull-request-closed
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun gitPullRequestClosed(): Painter = painterResource(LumeLucideResources.drawable.git_pull_request_closed)

  /**
   * Returns a `Painter` for the `git_pull_request_create` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/git-pull-request-create
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun gitPullRequestCreate(): Painter = painterResource(LumeLucideResources.drawable.git_pull_request_create)

  /**
   * Returns a `Painter` for the `git_pull_request_create_arrow` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/git-pull-request-create-arrow
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun gitPullRequestCreateArrow(): Painter = painterResource(LumeLucideResources.drawable.git_pull_request_create_arrow)

  /**
   * Returns a `Painter` for the `git_pull_request_draft` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/git-pull-request-draft
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun gitPullRequestDraft(): Painter = painterResource(LumeLucideResources.drawable.git_pull_request_draft)

  /**
   * Returns a `Painter` for the `glass_water` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/glass-water
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun glassWater(): Painter = painterResource(LumeLucideResources.drawable.glass_water)

  /**
   * Returns a `Painter` for the `glasses` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/glasses
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun glasses(): Painter = painterResource(LumeLucideResources.drawable.glasses)

  /**
   * Returns a `Painter` for the `globe` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/globe
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun globe(): Painter = painterResource(LumeLucideResources.drawable.globe)

  /**
   * Returns a `Painter` for the `globe_lock` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/globe-lock
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun globeLock(): Painter = painterResource(LumeLucideResources.drawable.globe_lock)

  /**
   * Returns a `Painter` for the `globe_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/globe-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun globeOff(): Painter = painterResource(LumeLucideResources.drawable.globe_off)

  /**
   * Returns a `Painter` for the `globe_x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/globe-x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun globeX(): Painter = painterResource(LumeLucideResources.drawable.globe_x)

  /**
   * Returns a `Painter` for the `goal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/goal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun goal(): Painter = painterResource(LumeLucideResources.drawable.goal)

  /**
   * Returns a `Painter` for the `gpu` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/gpu
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun gpu(): Painter = painterResource(LumeLucideResources.drawable.gpu)

  /**
   * Returns a `Painter` for the `graduation_cap` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/graduation-cap
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun graduationCap(): Painter = painterResource(LumeLucideResources.drawable.graduation_cap)

  /**
   * Returns a `Painter` for the `grape` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/grape
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun grape(): Painter = painterResource(LumeLucideResources.drawable.grape)

  /**
   * Returns a `Painter` for the `grid_2x2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/grid-2x2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun grid2x2(): Painter = painterResource(LumeLucideResources.drawable.grid_2x2)

  /**
   * Returns a `Painter` for the `grid_2x2_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/grid-2x2-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun grid2x2Check(): Painter = painterResource(LumeLucideResources.drawable.grid_2x2_check)

  /**
   * Returns a `Painter` for the `grid_2x2_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/grid-2x2-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun grid2x2Plus(): Painter = painterResource(LumeLucideResources.drawable.grid_2x2_plus)

  /**
   * Returns a `Painter` for the `grid_2x2_x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/grid-2x2-x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun grid2x2X(): Painter = painterResource(LumeLucideResources.drawable.grid_2x2_x)

  /**
   * Returns a `Painter` for the `grid_3x2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/grid-3x2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun grid3x2(): Painter = painterResource(LumeLucideResources.drawable.grid_3x2)

  /**
   * Returns a `Painter` for the `grid_3x3` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/grid-3x3
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun grid3x3(): Painter = painterResource(LumeLucideResources.drawable.grid_3x3)

  /**
   * Returns a `Painter` for the `grip` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/grip
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun grip(): Painter = painterResource(LumeLucideResources.drawable.grip)

  /**
   * Returns a `Painter` for the `grip_horizontal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/grip-horizontal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun gripHorizontal(): Painter = painterResource(LumeLucideResources.drawable.grip_horizontal)

  /**
   * Returns a `Painter` for the `grip_vertical` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/grip-vertical
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun gripVertical(): Painter = painterResource(LumeLucideResources.drawable.grip_vertical)

  /**
   * Returns a `Painter` for the `group` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/group
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun group(): Painter = painterResource(LumeLucideResources.drawable.group)

  /**
   * Returns a `Painter` for the `guitar` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/guitar
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun guitar(): Painter = painterResource(LumeLucideResources.drawable.guitar)

  /**
   * Returns a `Painter` for the `ham` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ham
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun ham(): Painter = painterResource(LumeLucideResources.drawable.ham)

  /**
   * Returns a `Painter` for the `hamburger` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/hamburger
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun hamburger(): Painter = painterResource(LumeLucideResources.drawable.hamburger)

  /**
   * Returns a `Painter` for the `hammer` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/hammer
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun hammer(): Painter = painterResource(LumeLucideResources.drawable.hammer)

  /**
   * Returns a `Painter` for the `hand` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/hand
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun hand(): Painter = painterResource(LumeLucideResources.drawable.hand)

  /**
   * Returns a `Painter` for the `hand_coins` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/hand-coins
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun handCoins(): Painter = painterResource(LumeLucideResources.drawable.hand_coins)

  /**
   * Returns a `Painter` for the `hand_fist` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/hand-fist
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun handFist(): Painter = painterResource(LumeLucideResources.drawable.hand_fist)

  /**
   * Returns a `Painter` for the `hand_grab` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/hand-grab
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun handGrab(): Painter = painterResource(LumeLucideResources.drawable.hand_grab)

  /**
   * Returns a `Painter` for the `hand_heart` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/hand-heart
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun handHeart(): Painter = painterResource(LumeLucideResources.drawable.hand_heart)

  /**
   * Returns a `Painter` for the `hand_helping` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/hand-helping
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun handHelping(): Painter = painterResource(LumeLucideResources.drawable.hand_helping)

  /**
   * Returns a `Painter` for the `hand_metal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/hand-metal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun handMetal(): Painter = painterResource(LumeLucideResources.drawable.hand_metal)

  /**
   * Returns a `Painter` for the `hand_platter` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/hand-platter
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun handPlatter(): Painter = painterResource(LumeLucideResources.drawable.hand_platter)

  /**
   * Returns a `Painter` for the `handbag` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/handbag
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun handbag(): Painter = painterResource(LumeLucideResources.drawable.handbag)

  /**
   * Returns a `Painter` for the `handshake` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/handshake
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun handshake(): Painter = painterResource(LumeLucideResources.drawable.handshake)

  /**
   * Returns a `Painter` for the `hard_drive` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/hard-drive
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun hardDrive(): Painter = painterResource(LumeLucideResources.drawable.hard_drive)

  /**
   * Returns a `Painter` for the `hard_drive_download` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/hard-drive-download
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun hardDriveDownload(): Painter = painterResource(LumeLucideResources.drawable.hard_drive_download)

  /**
   * Returns a `Painter` for the `hard_drive_upload` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/hard-drive-upload
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun hardDriveUpload(): Painter = painterResource(LumeLucideResources.drawable.hard_drive_upload)

  /**
   * Returns a `Painter` for the `hard_hat` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/hard-hat
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun hardHat(): Painter = painterResource(LumeLucideResources.drawable.hard_hat)

  /**
   * Returns a `Painter` for the `hash` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/hash
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun hash(): Painter = painterResource(LumeLucideResources.drawable.hash)

  /**
   * Returns a `Painter` for the `hat_glasses` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/hat-glasses
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun hatGlasses(): Painter = painterResource(LumeLucideResources.drawable.hat_glasses)

  /**
   * Returns a `Painter` for the `haze` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/haze
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun haze(): Painter = painterResource(LumeLucideResources.drawable.haze)

  /**
   * Returns a `Painter` for the `hd` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/hd
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun hd(): Painter = painterResource(LumeLucideResources.drawable.hd)

  /**
   * Returns a `Painter` for the `hdmi_port` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/hdmi-port
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun hdmiPort(): Painter = painterResource(LumeLucideResources.drawable.hdmi_port)

  /**
   * Returns a `Painter` for the `heading` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/heading
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun heading(): Painter = painterResource(LumeLucideResources.drawable.heading)

  /**
   * Returns a `Painter` for the `heading_1` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/heading-1
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun heading1(): Painter = painterResource(LumeLucideResources.drawable.heading_1)

  /**
   * Returns a `Painter` for the `heading_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/heading-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun heading2(): Painter = painterResource(LumeLucideResources.drawable.heading_2)

  /**
   * Returns a `Painter` for the `heading_3` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/heading-3
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun heading3(): Painter = painterResource(LumeLucideResources.drawable.heading_3)

  /**
   * Returns a `Painter` for the `heading_4` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/heading-4
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun heading4(): Painter = painterResource(LumeLucideResources.drawable.heading_4)

  /**
   * Returns a `Painter` for the `heading_5` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/heading-5
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun heading5(): Painter = painterResource(LumeLucideResources.drawable.heading_5)

  /**
   * Returns a `Painter` for the `heading_6` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/heading-6
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun heading6(): Painter = painterResource(LumeLucideResources.drawable.heading_6)

  /**
   * Returns a `Painter` for the `headphone_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/headphone-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun headphoneOff(): Painter = painterResource(LumeLucideResources.drawable.headphone_off)

  /**
   * Returns a `Painter` for the `headphones` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/headphones
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun headphones(): Painter = painterResource(LumeLucideResources.drawable.headphones)

  /**
   * Returns a `Painter` for the `headset` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/headset
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun headset(): Painter = painterResource(LumeLucideResources.drawable.headset)

  /**
   * Returns a `Painter` for the `heart` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/heart
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun heart(): Painter = painterResource(LumeLucideResources.drawable.heart)

  /**
   * Returns a `Painter` for the `heart_crack` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/heart-crack
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun heartCrack(): Painter = painterResource(LumeLucideResources.drawable.heart_crack)

  /**
   * Returns a `Painter` for the `heart_handshake` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/heart-handshake
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun heartHandshake(): Painter = painterResource(LumeLucideResources.drawable.heart_handshake)

  /**
   * Returns a `Painter` for the `heart_minus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/heart-minus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun heartMinus(): Painter = painterResource(LumeLucideResources.drawable.heart_minus)

  /**
   * Returns a `Painter` for the `heart_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/heart-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun heartOff(): Painter = painterResource(LumeLucideResources.drawable.heart_off)

  /**
   * Returns a `Painter` for the `heart_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/heart-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun heartPlus(): Painter = painterResource(LumeLucideResources.drawable.heart_plus)

  /**
   * Returns a `Painter` for the `heart_pulse` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/heart-pulse
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun heartPulse(): Painter = painterResource(LumeLucideResources.drawable.heart_pulse)

  /**
   * Returns a `Painter` for the `heater` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/heater
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun heater(): Painter = painterResource(LumeLucideResources.drawable.heater)

  /**
   * Returns a `Painter` for the `helicopter` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/helicopter
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun helicopter(): Painter = painterResource(LumeLucideResources.drawable.helicopter)

  /**
   * Returns a `Painter` for the `hexagon` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/hexagon
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun hexagon(): Painter = painterResource(LumeLucideResources.drawable.hexagon)

  /**
   * Returns a `Painter` for the `highlighter` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/highlighter
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun highlighter(): Painter = painterResource(LumeLucideResources.drawable.highlighter)

  /**
   * Returns a `Painter` for the `history` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/history
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun history(): Painter = painterResource(LumeLucideResources.drawable.history)

  /**
   * Returns a `Painter` for the `hop` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/hop
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun hop(): Painter = painterResource(LumeLucideResources.drawable.hop)

  /**
   * Returns a `Painter` for the `hop_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/hop-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun hopOff(): Painter = painterResource(LumeLucideResources.drawable.hop_off)

  /**
   * Returns a `Painter` for the `hospital` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/hospital
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun hospital(): Painter = painterResource(LumeLucideResources.drawable.hospital)

  /**
   * Returns a `Painter` for the `hotel` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/hotel
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun hotel(): Painter = painterResource(LumeLucideResources.drawable.hotel)

  /**
   * Returns a `Painter` for the `hourglass` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/hourglass
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun hourglass(): Painter = painterResource(LumeLucideResources.drawable.hourglass)

  /**
   * Returns a `Painter` for the `house` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/house
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun house(): Painter = painterResource(LumeLucideResources.drawable.house)

  /**
   * Returns a `Painter` for the `house_heart` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/house-heart
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun houseHeart(): Painter = painterResource(LumeLucideResources.drawable.house_heart)

  /**
   * Returns a `Painter` for the `house_plug` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/house-plug
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun housePlug(): Painter = painterResource(LumeLucideResources.drawable.house_plug)

  /**
   * Returns a `Painter` for the `house_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/house-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun housePlus(): Painter = painterResource(LumeLucideResources.drawable.house_plus)

  /**
   * Returns a `Painter` for the `house_wifi` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/house-wifi
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun houseWifi(): Painter = painterResource(LumeLucideResources.drawable.house_wifi)

  /**
   * Returns a `Painter` for the `ice_cream_bowl` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ice-cream-bowl
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun iceCreamBowl(): Painter = painterResource(LumeLucideResources.drawable.ice_cream_bowl)

  /**
   * Returns a `Painter` for the `ice_cream_cone` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ice-cream-cone
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun iceCreamCone(): Painter = painterResource(LumeLucideResources.drawable.ice_cream_cone)

  /**
   * Returns a `Painter` for the `id_card` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/id-card
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun idCard(): Painter = painterResource(LumeLucideResources.drawable.id_card)

  /**
   * Returns a `Painter` for the `id_card_lanyard` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/id-card-lanyard
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun idCardLanyard(): Painter = painterResource(LumeLucideResources.drawable.id_card_lanyard)

  /**
   * Returns a `Painter` for the `image` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/image
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun image(): Painter = painterResource(LumeLucideResources.drawable.image)

  /**
   * Returns a `Painter` for the `image_down` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/image-down
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun imageDown(): Painter = painterResource(LumeLucideResources.drawable.image_down)

  /**
   * Returns a `Painter` for the `image_minus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/image-minus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun imageMinus(): Painter = painterResource(LumeLucideResources.drawable.image_minus)

  /**
   * Returns a `Painter` for the `image_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/image-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun imageOff(): Painter = painterResource(LumeLucideResources.drawable.image_off)

  /**
   * Returns a `Painter` for the `image_play` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/image-play
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun imagePlay(): Painter = painterResource(LumeLucideResources.drawable.image_play)

  /**
   * Returns a `Painter` for the `image_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/image-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun imagePlus(): Painter = painterResource(LumeLucideResources.drawable.image_plus)

  /**
   * Returns a `Painter` for the `image_up` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/image-up
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun imageUp(): Painter = painterResource(LumeLucideResources.drawable.image_up)

  /**
   * Returns a `Painter` for the `image_upscale` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/image-upscale
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun imageUpscale(): Painter = painterResource(LumeLucideResources.drawable.image_upscale)

  /**
   * Returns a `Painter` for the `images` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/images
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun images(): Painter = painterResource(LumeLucideResources.drawable.images)

  /**
   * Returns a `Painter` for the `import` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/import
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun `import`(): Painter = painterResource(LumeLucideResources.drawable.import)

  /**
   * Returns a `Painter` for the `inbox` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/inbox
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun inbox(): Painter = painterResource(LumeLucideResources.drawable.inbox)

  /**
   * Returns a `Painter` for the `indian_rupee` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/indian-rupee
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun indianRupee(): Painter = painterResource(LumeLucideResources.drawable.indian_rupee)

  /**
   * Returns a `Painter` for the `infinity` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/infinity
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun infinity(): Painter = painterResource(LumeLucideResources.drawable.infinity)

  /**
   * Returns a `Painter` for the `info` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/info
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun info(): Painter = painterResource(LumeLucideResources.drawable.info)

  /**
   * Returns a `Painter` for the `inspection_panel` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/inspection-panel
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun inspectionPanel(): Painter = painterResource(LumeLucideResources.drawable.inspection_panel)

  /**
   * Returns a `Painter` for the `italic` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/italic
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun italic(): Painter = painterResource(LumeLucideResources.drawable.italic)

  /**
   * Returns a `Painter` for the `iteration_ccw` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/iteration-ccw
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun iterationCcw(): Painter = painterResource(LumeLucideResources.drawable.iteration_ccw)

  /**
   * Returns a `Painter` for the `iteration_cw` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/iteration-cw
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun iterationCw(): Painter = painterResource(LumeLucideResources.drawable.iteration_cw)

  /**
   * Returns a `Painter` for the `japanese_yen` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/japanese-yen
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun japaneseYen(): Painter = painterResource(LumeLucideResources.drawable.japanese_yen)

  /**
   * Returns a `Painter` for the `joystick` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/joystick
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun joystick(): Painter = painterResource(LumeLucideResources.drawable.joystick)

  /**
   * Returns a `Painter` for the `kanban` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/kanban
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun kanban(): Painter = painterResource(LumeLucideResources.drawable.kanban)

  /**
   * Returns a `Painter` for the `kayak` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/kayak
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun kayak(): Painter = painterResource(LumeLucideResources.drawable.kayak)

  /**
   * Returns a `Painter` for the `key` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/key
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun key(): Painter = painterResource(LumeLucideResources.drawable.key)

  /**
   * Returns a `Painter` for the `key_round` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/key-round
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun keyRound(): Painter = painterResource(LumeLucideResources.drawable.key_round)

  /**
   * Returns a `Painter` for the `key_square` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/key-square
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun keySquare(): Painter = painterResource(LumeLucideResources.drawable.key_square)

  /**
   * Returns a `Painter` for the `keyboard` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/keyboard
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun keyboard(): Painter = painterResource(LumeLucideResources.drawable.keyboard)

  /**
   * Returns a `Painter` for the `keyboard_music` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/keyboard-music
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun keyboardMusic(): Painter = painterResource(LumeLucideResources.drawable.keyboard_music)

  /**
   * Returns a `Painter` for the `keyboard_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/keyboard-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun keyboardOff(): Painter = painterResource(LumeLucideResources.drawable.keyboard_off)

  /**
   * Returns a `Painter` for the `lamp` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/lamp
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun lamp(): Painter = painterResource(LumeLucideResources.drawable.lamp)

  /**
   * Returns a `Painter` for the `lamp_ceiling` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/lamp-ceiling
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun lampCeiling(): Painter = painterResource(LumeLucideResources.drawable.lamp_ceiling)

  /**
   * Returns a `Painter` for the `lamp_desk` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/lamp-desk
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun lampDesk(): Painter = painterResource(LumeLucideResources.drawable.lamp_desk)

  /**
   * Returns a `Painter` for the `lamp_floor` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/lamp-floor
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun lampFloor(): Painter = painterResource(LumeLucideResources.drawable.lamp_floor)

  /**
   * Returns a `Painter` for the `lamp_wall_down` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/lamp-wall-down
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun lampWallDown(): Painter = painterResource(LumeLucideResources.drawable.lamp_wall_down)

  /**
   * Returns a `Painter` for the `lamp_wall_up` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/lamp-wall-up
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun lampWallUp(): Painter = painterResource(LumeLucideResources.drawable.lamp_wall_up)

  /**
   * Returns a `Painter` for the `land_plot` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/land-plot
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun landPlot(): Painter = painterResource(LumeLucideResources.drawable.land_plot)

  /**
   * Returns a `Painter` for the `landmark` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/landmark
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun landmark(): Painter = painterResource(LumeLucideResources.drawable.landmark)

  /**
   * Returns a `Painter` for the `languages` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/languages
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun languages(): Painter = painterResource(LumeLucideResources.drawable.languages)

  /**
   * Returns a `Painter` for the `laptop` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/laptop
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun laptop(): Painter = painterResource(LumeLucideResources.drawable.laptop)

  /**
   * Returns a `Painter` for the `laptop_minimal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/laptop-minimal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun laptopMinimal(): Painter = painterResource(LumeLucideResources.drawable.laptop_minimal)

  /**
   * Returns a `Painter` for the `laptop_minimal_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/laptop-minimal-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun laptopMinimalCheck(): Painter = painterResource(LumeLucideResources.drawable.laptop_minimal_check)

  /**
   * Returns a `Painter` for the `lasso` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/lasso
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun lasso(): Painter = painterResource(LumeLucideResources.drawable.lasso)

  /**
   * Returns a `Painter` for the `lasso_select` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/lasso-select
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun lassoSelect(): Painter = painterResource(LumeLucideResources.drawable.lasso_select)

  /**
   * Returns a `Painter` for the `laugh` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/laugh
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun laugh(): Painter = painterResource(LumeLucideResources.drawable.laugh)

  /**
   * Returns a `Painter` for the `layers` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/layers
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun layers(): Painter = painterResource(LumeLucideResources.drawable.layers)

  /**
   * Returns a `Painter` for the `layers_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/layers-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun layers2(): Painter = painterResource(LumeLucideResources.drawable.layers_2)

  /**
   * Returns a `Painter` for the `layers_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/layers-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun layersPlus(): Painter = painterResource(LumeLucideResources.drawable.layers_plus)

  /**
   * Returns a `Painter` for the `layout_dashboard` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/layout-dashboard
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun layoutDashboard(): Painter = painterResource(LumeLucideResources.drawable.layout_dashboard)

  /**
   * Returns a `Painter` for the `layout_grid` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/layout-grid
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun layoutGrid(): Painter = painterResource(LumeLucideResources.drawable.layout_grid)

  /**
   * Returns a `Painter` for the `layout_list` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/layout-list
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun layoutList(): Painter = painterResource(LumeLucideResources.drawable.layout_list)

  /**
   * Returns a `Painter` for the `layout_panel_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/layout-panel-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun layoutPanelLeft(): Painter = painterResource(LumeLucideResources.drawable.layout_panel_left)

  /**
   * Returns a `Painter` for the `layout_panel_top` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/layout-panel-top
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun layoutPanelTop(): Painter = painterResource(LumeLucideResources.drawable.layout_panel_top)

  /**
   * Returns a `Painter` for the `layout_template` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/layout-template
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun layoutTemplate(): Painter = painterResource(LumeLucideResources.drawable.layout_template)

  /**
   * Returns a `Painter` for the `leaf` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/leaf
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun leaf(): Painter = painterResource(LumeLucideResources.drawable.leaf)

  /**
   * Returns a `Painter` for the `leafy_green` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/leafy-green
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun leafyGreen(): Painter = painterResource(LumeLucideResources.drawable.leafy_green)

  /**
   * Returns a `Painter` for the `lectern` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/lectern
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun lectern(): Painter = painterResource(LumeLucideResources.drawable.lectern)

  /**
   * Returns a `Painter` for the `lens_concave` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/lens-concave
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun lensConcave(): Painter = painterResource(LumeLucideResources.drawable.lens_concave)

  /**
   * Returns a `Painter` for the `lens_convex` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/lens-convex
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun lensConvex(): Painter = painterResource(LumeLucideResources.drawable.lens_convex)

  /**
   * Returns a `Painter` for the `library` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/library
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun library(): Painter = painterResource(LumeLucideResources.drawable.library)

  /**
   * Returns a `Painter` for the `library_big` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/library-big
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun libraryBig(): Painter = painterResource(LumeLucideResources.drawable.library_big)

  /**
   * Returns a `Painter` for the `life_buoy` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/life-buoy
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun lifeBuoy(): Painter = painterResource(LumeLucideResources.drawable.life_buoy)

  /**
   * Returns a `Painter` for the `ligature` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ligature
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun ligature(): Painter = painterResource(LumeLucideResources.drawable.ligature)

  /**
   * Returns a `Painter` for the `lightbulb` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/lightbulb
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun lightbulb(): Painter = painterResource(LumeLucideResources.drawable.lightbulb)

  /**
   * Returns a `Painter` for the `lightbulb_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/lightbulb-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun lightbulbOff(): Painter = painterResource(LumeLucideResources.drawable.lightbulb_off)

  /**
   * Returns a `Painter` for the `line_dot_right_horizontal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/line-dot-right-horizontal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun lineDotRightHorizontal(): Painter = painterResource(LumeLucideResources.drawable.line_dot_right_horizontal)

  /**
   * Returns a `Painter` for the `line_squiggle` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/line-squiggle
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun lineSquiggle(): Painter = painterResource(LumeLucideResources.drawable.line_squiggle)

  /**
   * Returns a `Painter` for the `line_style` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/line-style
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun lineStyle(): Painter = painterResource(LumeLucideResources.drawable.line_style)

  /**
   * Returns a `Painter` for the `link` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/link
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun link(): Painter = painterResource(LumeLucideResources.drawable.link)

  /**
   * Returns a `Painter` for the `link_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/link-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun link2(): Painter = painterResource(LumeLucideResources.drawable.link_2)

  /**
   * Returns a `Painter` for the `link_2_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/link-2-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun link2Off(): Painter = painterResource(LumeLucideResources.drawable.link_2_off)

  /**
   * Returns a `Painter` for the `list` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/list
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun list(): Painter = painterResource(LumeLucideResources.drawable.list)

  /**
   * Returns a `Painter` for the `list_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/list-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun listCheck(): Painter = painterResource(LumeLucideResources.drawable.list_check)

  /**
   * Returns a `Painter` for the `list_checks` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/list-checks
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun listChecks(): Painter = painterResource(LumeLucideResources.drawable.list_checks)

  /**
   * Returns a `Painter` for the `list_chevrons_down_up` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/list-chevrons-down-up
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun listChevronsDownUp(): Painter = painterResource(LumeLucideResources.drawable.list_chevrons_down_up)

  /**
   * Returns a `Painter` for the `list_chevrons_up_down` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/list-chevrons-up-down
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun listChevronsUpDown(): Painter = painterResource(LumeLucideResources.drawable.list_chevrons_up_down)

  /**
   * Returns a `Painter` for the `list_collapse` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/list-collapse
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun listCollapse(): Painter = painterResource(LumeLucideResources.drawable.list_collapse)

  /**
   * Returns a `Painter` for the `list_end` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/list-end
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun listEnd(): Painter = painterResource(LumeLucideResources.drawable.list_end)

  /**
   * Returns a `Painter` for the `list_filter` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/list-filter
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun listFilter(): Painter = painterResource(LumeLucideResources.drawable.list_filter)

  /**
   * Returns a `Painter` for the `list_filter_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/list-filter-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun listFilterPlus(): Painter = painterResource(LumeLucideResources.drawable.list_filter_plus)

  /**
   * Returns a `Painter` for the `list_indent_decrease` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/list-indent-decrease
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun listIndentDecrease(): Painter = painterResource(LumeLucideResources.drawable.list_indent_decrease)

  /**
   * Returns a `Painter` for the `list_indent_increase` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/list-indent-increase
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun listIndentIncrease(): Painter = painterResource(LumeLucideResources.drawable.list_indent_increase)

  /**
   * Returns a `Painter` for the `list_minus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/list-minus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun listMinus(): Painter = painterResource(LumeLucideResources.drawable.list_minus)

  /**
   * Returns a `Painter` for the `list_music` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/list-music
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun listMusic(): Painter = painterResource(LumeLucideResources.drawable.list_music)

  /**
   * Returns a `Painter` for the `list_ordered` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/list-ordered
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun listOrdered(): Painter = painterResource(LumeLucideResources.drawable.list_ordered)

  /**
   * Returns a `Painter` for the `list_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/list-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun listPlus(): Painter = painterResource(LumeLucideResources.drawable.list_plus)

  /**
   * Returns a `Painter` for the `list_restart` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/list-restart
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun listRestart(): Painter = painterResource(LumeLucideResources.drawable.list_restart)

  /**
   * Returns a `Painter` for the `list_start` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/list-start
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun listStart(): Painter = painterResource(LumeLucideResources.drawable.list_start)

  /**
   * Returns a `Painter` for the `list_todo` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/list-todo
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun listTodo(): Painter = painterResource(LumeLucideResources.drawable.list_todo)

  /**
   * Returns a `Painter` for the `list_tree` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/list-tree
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun listTree(): Painter = painterResource(LumeLucideResources.drawable.list_tree)

  /**
   * Returns a `Painter` for the `list_video` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/list-video
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun listVideo(): Painter = painterResource(LumeLucideResources.drawable.list_video)

  /**
   * Returns a `Painter` for the `list_x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/list-x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun listX(): Painter = painterResource(LumeLucideResources.drawable.list_x)

  /**
   * Returns a `Painter` for the `loader` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/loader
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun loader(): Painter = painterResource(LumeLucideResources.drawable.loader)

  /**
   * Returns a `Painter` for the `loader_circle` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/loader-circle
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun loaderCircle(): Painter = painterResource(LumeLucideResources.drawable.loader_circle)

  /**
   * Returns a `Painter` for the `loader_pinwheel` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/loader-pinwheel
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun loaderPinwheel(): Painter = painterResource(LumeLucideResources.drawable.loader_pinwheel)

  /**
   * Returns a `Painter` for the `locate` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/locate
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun locate(): Painter = painterResource(LumeLucideResources.drawable.locate)

  /**
   * Returns a `Painter` for the `locate_fixed` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/locate-fixed
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun locateFixed(): Painter = painterResource(LumeLucideResources.drawable.locate_fixed)

  /**
   * Returns a `Painter` for the `locate_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/locate-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun locateOff(): Painter = painterResource(LumeLucideResources.drawable.locate_off)

  /**
   * Returns a `Painter` for the `lock` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/lock
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun lock(): Painter = painterResource(LumeLucideResources.drawable.lock)

  /**
   * Returns a `Painter` for the `lock_keyhole` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/lock-keyhole
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun lockKeyhole(): Painter = painterResource(LumeLucideResources.drawable.lock_keyhole)

  /**
   * Returns a `Painter` for the `lock_keyhole_open` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/lock-keyhole-open
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun lockKeyholeOpen(): Painter = painterResource(LumeLucideResources.drawable.lock_keyhole_open)

  /**
   * Returns a `Painter` for the `lock_open` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/lock-open
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun lockOpen(): Painter = painterResource(LumeLucideResources.drawable.lock_open)

  /**
   * Returns a `Painter` for the `log_in` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/log-in
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun logIn(): Painter = painterResource(LumeLucideResources.drawable.log_in)

  /**
   * Returns a `Painter` for the `log_out` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/log-out
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun logOut(): Painter = painterResource(LumeLucideResources.drawable.log_out)

  /**
   * Returns a `Painter` for the `logs` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/logs
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun logs(): Painter = painterResource(LumeLucideResources.drawable.logs)

  /**
   * Returns a `Painter` for the `lollipop` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/lollipop
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun lollipop(): Painter = painterResource(LumeLucideResources.drawable.lollipop)

  /**
   * Returns a `Painter` for the `luggage` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/luggage
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun luggage(): Painter = painterResource(LumeLucideResources.drawable.luggage)

  /**
   * Returns a `Painter` for the `magnet` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/magnet
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun magnet(): Painter = painterResource(LumeLucideResources.drawable.magnet)

  /**
   * Returns a `Painter` for the `mail` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/mail
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mail(): Painter = painterResource(LumeLucideResources.drawable.mail)

  /**
   * Returns a `Painter` for the `mail_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/mail-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mailCheck(): Painter = painterResource(LumeLucideResources.drawable.mail_check)

  /**
   * Returns a `Painter` for the `mail_minus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/mail-minus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mailMinus(): Painter = painterResource(LumeLucideResources.drawable.mail_minus)

  /**
   * Returns a `Painter` for the `mail_open` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/mail-open
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mailOpen(): Painter = painterResource(LumeLucideResources.drawable.mail_open)

  /**
   * Returns a `Painter` for the `mail_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/mail-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mailPlus(): Painter = painterResource(LumeLucideResources.drawable.mail_plus)

  /**
   * Returns a `Painter` for the `mail_question_mark` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/mail-question-mark
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mailQuestionMark(): Painter = painterResource(LumeLucideResources.drawable.mail_question_mark)

  /**
   * Returns a `Painter` for the `mail_search` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/mail-search
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mailSearch(): Painter = painterResource(LumeLucideResources.drawable.mail_search)

  /**
   * Returns a `Painter` for the `mail_warning` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/mail-warning
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mailWarning(): Painter = painterResource(LumeLucideResources.drawable.mail_warning)

  /**
   * Returns a `Painter` for the `mail_x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/mail-x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mailX(): Painter = painterResource(LumeLucideResources.drawable.mail_x)

  /**
   * Returns a `Painter` for the `mailbox` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/mailbox
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mailbox(): Painter = painterResource(LumeLucideResources.drawable.mailbox)

  /**
   * Returns a `Painter` for the `mails` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/mails
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mails(): Painter = painterResource(LumeLucideResources.drawable.mails)

  /**
   * Returns a `Painter` for the `map` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/map
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun map(): Painter = painterResource(LumeLucideResources.drawable.map)

  /**
   * Returns a `Painter` for the `map_minus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/map-minus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mapMinus(): Painter = painterResource(LumeLucideResources.drawable.map_minus)

  /**
   * Returns a `Painter` for the `map_pin` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/map-pin
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mapPin(): Painter = painterResource(LumeLucideResources.drawable.map_pin)

  /**
   * Returns a `Painter` for the `map_pin_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/map-pin-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mapPinCheck(): Painter = painterResource(LumeLucideResources.drawable.map_pin_check)

  /**
   * Returns a `Painter` for the `map_pin_check_inside` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/map-pin-check-inside
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mapPinCheckInside(): Painter = painterResource(LumeLucideResources.drawable.map_pin_check_inside)

  /**
   * Returns a `Painter` for the `map_pin_house` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/map-pin-house
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mapPinHouse(): Painter = painterResource(LumeLucideResources.drawable.map_pin_house)

  /**
   * Returns a `Painter` for the `map_pin_minus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/map-pin-minus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mapPinMinus(): Painter = painterResource(LumeLucideResources.drawable.map_pin_minus)

  /**
   * Returns a `Painter` for the `map_pin_minus_inside` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/map-pin-minus-inside
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mapPinMinusInside(): Painter = painterResource(LumeLucideResources.drawable.map_pin_minus_inside)

  /**
   * Returns a `Painter` for the `map_pin_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/map-pin-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mapPinOff(): Painter = painterResource(LumeLucideResources.drawable.map_pin_off)

  /**
   * Returns a `Painter` for the `map_pin_pen` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/map-pin-pen
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mapPinPen(): Painter = painterResource(LumeLucideResources.drawable.map_pin_pen)

  /**
   * Returns a `Painter` for the `map_pin_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/map-pin-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mapPinPlus(): Painter = painterResource(LumeLucideResources.drawable.map_pin_plus)

  /**
   * Returns a `Painter` for the `map_pin_plus_inside` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/map-pin-plus-inside
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mapPinPlusInside(): Painter = painterResource(LumeLucideResources.drawable.map_pin_plus_inside)

  /**
   * Returns a `Painter` for the `map_pin_search` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/map-pin-search
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mapPinSearch(): Painter = painterResource(LumeLucideResources.drawable.map_pin_search)

  /**
   * Returns a `Painter` for the `map_pin_x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/map-pin-x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mapPinX(): Painter = painterResource(LumeLucideResources.drawable.map_pin_x)

  /**
   * Returns a `Painter` for the `map_pin_x_inside` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/map-pin-x-inside
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mapPinXInside(): Painter = painterResource(LumeLucideResources.drawable.map_pin_x_inside)

  /**
   * Returns a `Painter` for the `map_pinned` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/map-pinned
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mapPinned(): Painter = painterResource(LumeLucideResources.drawable.map_pinned)

  /**
   * Returns a `Painter` for the `map_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/map-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mapPlus(): Painter = painterResource(LumeLucideResources.drawable.map_plus)

  /**
   * Returns a `Painter` for the `mars` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/mars
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mars(): Painter = painterResource(LumeLucideResources.drawable.mars)

  /**
   * Returns a `Painter` for the `mars_stroke` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/mars-stroke
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun marsStroke(): Painter = painterResource(LumeLucideResources.drawable.mars_stroke)

  /**
   * Returns a `Painter` for the `martini` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/martini
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun martini(): Painter = painterResource(LumeLucideResources.drawable.martini)

  /**
   * Returns a `Painter` for the `maximize` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/maximize
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun maximize(): Painter = painterResource(LumeLucideResources.drawable.maximize)

  /**
   * Returns a `Painter` for the `maximize_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/maximize-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun maximize2(): Painter = painterResource(LumeLucideResources.drawable.maximize_2)

  /**
   * Returns a `Painter` for the `medal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/medal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun medal(): Painter = painterResource(LumeLucideResources.drawable.medal)

  /**
   * Returns a `Painter` for the `megaphone` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/megaphone
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun megaphone(): Painter = painterResource(LumeLucideResources.drawable.megaphone)

  /**
   * Returns a `Painter` for the `megaphone_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/megaphone-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun megaphoneOff(): Painter = painterResource(LumeLucideResources.drawable.megaphone_off)

  /**
   * Returns a `Painter` for the `meh` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/meh
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun meh(): Painter = painterResource(LumeLucideResources.drawable.meh)

  /**
   * Returns a `Painter` for the `memory_stick` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/memory-stick
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun memoryStick(): Painter = painterResource(LumeLucideResources.drawable.memory_stick)

  /**
   * Returns a `Painter` for the `menu` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/menu
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun menu(): Painter = painterResource(LumeLucideResources.drawable.menu)

  /**
   * Returns a `Painter` for the `merge` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/merge
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun merge(): Painter = painterResource(LumeLucideResources.drawable.merge)

  /**
   * Returns a `Painter` for the `message_circle` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/message-circle
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun messageCircle(): Painter = painterResource(LumeLucideResources.drawable.message_circle)

  /**
   * Returns a `Painter` for the `message_circle_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/message-circle-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun messageCircleCheck(): Painter = painterResource(LumeLucideResources.drawable.message_circle_check)

  /**
   * Returns a `Painter` for the `message_circle_code` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/message-circle-code
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun messageCircleCode(): Painter = painterResource(LumeLucideResources.drawable.message_circle_code)

  /**
   * Returns a `Painter` for the `message_circle_dashed` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/message-circle-dashed
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun messageCircleDashed(): Painter = painterResource(LumeLucideResources.drawable.message_circle_dashed)

  /**
   * Returns a `Painter` for the `message_circle_heart` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/message-circle-heart
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun messageCircleHeart(): Painter = painterResource(LumeLucideResources.drawable.message_circle_heart)

  /**
   * Returns a `Painter` for the `message_circle_more` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/message-circle-more
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun messageCircleMore(): Painter = painterResource(LumeLucideResources.drawable.message_circle_more)

  /**
   * Returns a `Painter` for the `message_circle_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/message-circle-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun messageCircleOff(): Painter = painterResource(LumeLucideResources.drawable.message_circle_off)

  /**
   * Returns a `Painter` for the `message_circle_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/message-circle-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun messageCirclePlus(): Painter = painterResource(LumeLucideResources.drawable.message_circle_plus)

  /**
   * Returns a `Painter` for the `message_circle_question_mark` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/message-circle-question-mark
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun messageCircleQuestionMark(): Painter = painterResource(LumeLucideResources.drawable.message_circle_question_mark)

  /**
   * Returns a `Painter` for the `message_circle_reply` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/message-circle-reply
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun messageCircleReply(): Painter = painterResource(LumeLucideResources.drawable.message_circle_reply)

  /**
   * Returns a `Painter` for the `message_circle_warning` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/message-circle-warning
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun messageCircleWarning(): Painter = painterResource(LumeLucideResources.drawable.message_circle_warning)

  /**
   * Returns a `Painter` for the `message_circle_x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/message-circle-x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun messageCircleX(): Painter = painterResource(LumeLucideResources.drawable.message_circle_x)

  /**
   * Returns a `Painter` for the `message_square` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/message-square
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun messageSquare(): Painter = painterResource(LumeLucideResources.drawable.message_square)

  /**
   * Returns a `Painter` for the `message_square_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/message-square-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun messageSquareCheck(): Painter = painterResource(LumeLucideResources.drawable.message_square_check)

  /**
   * Returns a `Painter` for the `message_square_code` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/message-square-code
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun messageSquareCode(): Painter = painterResource(LumeLucideResources.drawable.message_square_code)

  /**
   * Returns a `Painter` for the `message_square_dashed` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/message-square-dashed
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun messageSquareDashed(): Painter = painterResource(LumeLucideResources.drawable.message_square_dashed)

  /**
   * Returns a `Painter` for the `message_square_diff` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/message-square-diff
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun messageSquareDiff(): Painter = painterResource(LumeLucideResources.drawable.message_square_diff)

  /**
   * Returns a `Painter` for the `message_square_dot` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/message-square-dot
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun messageSquareDot(): Painter = painterResource(LumeLucideResources.drawable.message_square_dot)

  /**
   * Returns a `Painter` for the `message_square_heart` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/message-square-heart
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun messageSquareHeart(): Painter = painterResource(LumeLucideResources.drawable.message_square_heart)

  /**
   * Returns a `Painter` for the `message_square_lock` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/message-square-lock
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun messageSquareLock(): Painter = painterResource(LumeLucideResources.drawable.message_square_lock)

  /**
   * Returns a `Painter` for the `message_square_more` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/message-square-more
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun messageSquareMore(): Painter = painterResource(LumeLucideResources.drawable.message_square_more)

  /**
   * Returns a `Painter` for the `message_square_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/message-square-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun messageSquareOff(): Painter = painterResource(LumeLucideResources.drawable.message_square_off)

  /**
   * Returns a `Painter` for the `message_square_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/message-square-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun messageSquarePlus(): Painter = painterResource(LumeLucideResources.drawable.message_square_plus)

  /**
   * Returns a `Painter` for the `message_square_quote` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/message-square-quote
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun messageSquareQuote(): Painter = painterResource(LumeLucideResources.drawable.message_square_quote)

  /**
   * Returns a `Painter` for the `message_square_reply` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/message-square-reply
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun messageSquareReply(): Painter = painterResource(LumeLucideResources.drawable.message_square_reply)

  /**
   * Returns a `Painter` for the `message_square_share` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/message-square-share
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun messageSquareShare(): Painter = painterResource(LumeLucideResources.drawable.message_square_share)

  /**
   * Returns a `Painter` for the `message_square_text` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/message-square-text
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun messageSquareText(): Painter = painterResource(LumeLucideResources.drawable.message_square_text)

  /**
   * Returns a `Painter` for the `message_square_warning` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/message-square-warning
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun messageSquareWarning(): Painter = painterResource(LumeLucideResources.drawable.message_square_warning)

  /**
   * Returns a `Painter` for the `message_square_x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/message-square-x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun messageSquareX(): Painter = painterResource(LumeLucideResources.drawable.message_square_x)

  /**
   * Returns a `Painter` for the `messages_square` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/messages-square
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun messagesSquare(): Painter = painterResource(LumeLucideResources.drawable.messages_square)

  /**
   * Returns a `Painter` for the `metronome` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/metronome
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun metronome(): Painter = painterResource(LumeLucideResources.drawable.metronome)

  /**
   * Returns a `Painter` for the `mic` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/mic
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mic(): Painter = painterResource(LumeLucideResources.drawable.mic)

  /**
   * Returns a `Painter` for the `mic_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/mic-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun micOff(): Painter = painterResource(LumeLucideResources.drawable.mic_off)

  /**
   * Returns a `Painter` for the `mic_vocal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/mic-vocal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun micVocal(): Painter = painterResource(LumeLucideResources.drawable.mic_vocal)

  /**
   * Returns a `Painter` for the `microchip` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/microchip
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun microchip(): Painter = painterResource(LumeLucideResources.drawable.microchip)

  /**
   * Returns a `Painter` for the `microscope` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/microscope
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun microscope(): Painter = painterResource(LumeLucideResources.drawable.microscope)

  /**
   * Returns a `Painter` for the `microwave` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/microwave
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun microwave(): Painter = painterResource(LumeLucideResources.drawable.microwave)

  /**
   * Returns a `Painter` for the `milestone` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/milestone
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun milestone(): Painter = painterResource(LumeLucideResources.drawable.milestone)

  /**
   * Returns a `Painter` for the `milk` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/milk
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun milk(): Painter = painterResource(LumeLucideResources.drawable.milk)

  /**
   * Returns a `Painter` for the `milk_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/milk-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun milkOff(): Painter = painterResource(LumeLucideResources.drawable.milk_off)

  /**
   * Returns a `Painter` for the `minimize` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/minimize
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun minimize(): Painter = painterResource(LumeLucideResources.drawable.minimize)

  /**
   * Returns a `Painter` for the `minimize_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/minimize-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun minimize2(): Painter = painterResource(LumeLucideResources.drawable.minimize_2)

  /**
   * Returns a `Painter` for the `minus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/minus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun minus(): Painter = painterResource(LumeLucideResources.drawable.minus)

  /**
   * Returns a `Painter` for the `mirror_rectangular` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/mirror-rectangular
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mirrorRectangular(): Painter = painterResource(LumeLucideResources.drawable.mirror_rectangular)

  /**
   * Returns a `Painter` for the `mirror_round` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/mirror-round
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mirrorRound(): Painter = painterResource(LumeLucideResources.drawable.mirror_round)

  /**
   * Returns a `Painter` for the `monitor` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/monitor
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun monitor(): Painter = painterResource(LumeLucideResources.drawable.monitor)

  /**
   * Returns a `Painter` for the `monitor_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/monitor-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun monitorCheck(): Painter = painterResource(LumeLucideResources.drawable.monitor_check)

  /**
   * Returns a `Painter` for the `monitor_cloud` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/monitor-cloud
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun monitorCloud(): Painter = painterResource(LumeLucideResources.drawable.monitor_cloud)

  /**
   * Returns a `Painter` for the `monitor_cog` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/monitor-cog
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun monitorCog(): Painter = painterResource(LumeLucideResources.drawable.monitor_cog)

  /**
   * Returns a `Painter` for the `monitor_dot` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/monitor-dot
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun monitorDot(): Painter = painterResource(LumeLucideResources.drawable.monitor_dot)

  /**
   * Returns a `Painter` for the `monitor_down` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/monitor-down
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun monitorDown(): Painter = painterResource(LumeLucideResources.drawable.monitor_down)

  /**
   * Returns a `Painter` for the `monitor_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/monitor-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun monitorOff(): Painter = painterResource(LumeLucideResources.drawable.monitor_off)

  /**
   * Returns a `Painter` for the `monitor_pause` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/monitor-pause
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun monitorPause(): Painter = painterResource(LumeLucideResources.drawable.monitor_pause)

  /**
   * Returns a `Painter` for the `monitor_play` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/monitor-play
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun monitorPlay(): Painter = painterResource(LumeLucideResources.drawable.monitor_play)

  /**
   * Returns a `Painter` for the `monitor_smartphone` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/monitor-smartphone
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun monitorSmartphone(): Painter = painterResource(LumeLucideResources.drawable.monitor_smartphone)

  /**
   * Returns a `Painter` for the `monitor_speaker` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/monitor-speaker
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun monitorSpeaker(): Painter = painterResource(LumeLucideResources.drawable.monitor_speaker)

  /**
   * Returns a `Painter` for the `monitor_stop` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/monitor-stop
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun monitorStop(): Painter = painterResource(LumeLucideResources.drawable.monitor_stop)

  /**
   * Returns a `Painter` for the `monitor_up` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/monitor-up
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun monitorUp(): Painter = painterResource(LumeLucideResources.drawable.monitor_up)

  /**
   * Returns a `Painter` for the `monitor_x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/monitor-x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun monitorX(): Painter = painterResource(LumeLucideResources.drawable.monitor_x)

  /**
   * Returns a `Painter` for the `moon` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/moon
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun moon(): Painter = painterResource(LumeLucideResources.drawable.moon)

  /**
   * Returns a `Painter` for the `moon_star` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/moon-star
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun moonStar(): Painter = painterResource(LumeLucideResources.drawable.moon_star)

  /**
   * Returns a `Painter` for the `motorbike` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/motorbike
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun motorbike(): Painter = painterResource(LumeLucideResources.drawable.motorbike)

  /**
   * Returns a `Painter` for the `mountain` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/mountain
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mountain(): Painter = painterResource(LumeLucideResources.drawable.mountain)

  /**
   * Returns a `Painter` for the `mountain_snow` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/mountain-snow
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mountainSnow(): Painter = painterResource(LumeLucideResources.drawable.mountain_snow)

  /**
   * Returns a `Painter` for the `mouse` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/mouse
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mouse(): Painter = painterResource(LumeLucideResources.drawable.mouse)

  /**
   * Returns a `Painter` for the `mouse_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/mouse-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mouseLeft(): Painter = painterResource(LumeLucideResources.drawable.mouse_left)

  /**
   * Returns a `Painter` for the `mouse_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/mouse-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mouseOff(): Painter = painterResource(LumeLucideResources.drawable.mouse_off)

  /**
   * Returns a `Painter` for the `mouse_pointer` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/mouse-pointer
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mousePointer(): Painter = painterResource(LumeLucideResources.drawable.mouse_pointer)

  /**
   * Returns a `Painter` for the `mouse_pointer_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/mouse-pointer-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mousePointer2(): Painter = painterResource(LumeLucideResources.drawable.mouse_pointer_2)

  /**
   * Returns a `Painter` for the `mouse_pointer_2_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/mouse-pointer-2-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mousePointer2Off(): Painter = painterResource(LumeLucideResources.drawable.mouse_pointer_2_off)

  /**
   * Returns a `Painter` for the `mouse_pointer_ban` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/mouse-pointer-ban
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mousePointerBan(): Painter = painterResource(LumeLucideResources.drawable.mouse_pointer_ban)

  /**
   * Returns a `Painter` for the `mouse_pointer_click` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/mouse-pointer-click
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mousePointerClick(): Painter = painterResource(LumeLucideResources.drawable.mouse_pointer_click)

  /**
   * Returns a `Painter` for the `mouse_right` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/mouse-right
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun mouseRight(): Painter = painterResource(LumeLucideResources.drawable.mouse_right)

  /**
   * Returns a `Painter` for the `move` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/move
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun move(): Painter = painterResource(LumeLucideResources.drawable.move)

  /**
   * Returns a `Painter` for the `move_3d` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/move-3d
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun move3d(): Painter = painterResource(LumeLucideResources.drawable.move_3d)

  /**
   * Returns a `Painter` for the `move_diagonal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/move-diagonal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun moveDiagonal(): Painter = painterResource(LumeLucideResources.drawable.move_diagonal)

  /**
   * Returns a `Painter` for the `move_diagonal_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/move-diagonal-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun moveDiagonal2(): Painter = painterResource(LumeLucideResources.drawable.move_diagonal_2)

  /**
   * Returns a `Painter` for the `move_down` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/move-down
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun moveDown(): Painter = painterResource(LumeLucideResources.drawable.move_down)

  /**
   * Returns a `Painter` for the `move_down_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/move-down-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun moveDownLeft(): Painter = painterResource(LumeLucideResources.drawable.move_down_left)

  /**
   * Returns a `Painter` for the `move_down_right` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/move-down-right
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun moveDownRight(): Painter = painterResource(LumeLucideResources.drawable.move_down_right)

  /**
   * Returns a `Painter` for the `move_horizontal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/move-horizontal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun moveHorizontal(): Painter = painterResource(LumeLucideResources.drawable.move_horizontal)

  /**
   * Returns a `Painter` for the `move_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/move-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun moveLeft(): Painter = painterResource(LumeLucideResources.drawable.move_left)

  /**
   * Returns a `Painter` for the `move_right` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/move-right
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun moveRight(): Painter = painterResource(LumeLucideResources.drawable.move_right)

  /**
   * Returns a `Painter` for the `move_up` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/move-up
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun moveUp(): Painter = painterResource(LumeLucideResources.drawable.move_up)

  /**
   * Returns a `Painter` for the `move_up_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/move-up-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun moveUpLeft(): Painter = painterResource(LumeLucideResources.drawable.move_up_left)

  /**
   * Returns a `Painter` for the `move_up_right` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/move-up-right
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun moveUpRight(): Painter = painterResource(LumeLucideResources.drawable.move_up_right)

  /**
   * Returns a `Painter` for the `move_vertical` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/move-vertical
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun moveVertical(): Painter = painterResource(LumeLucideResources.drawable.move_vertical)

  /**
   * Returns a `Painter` for the `music` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/music
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun music(): Painter = painterResource(LumeLucideResources.drawable.music)

  /**
   * Returns a `Painter` for the `music_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/music-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun music2(): Painter = painterResource(LumeLucideResources.drawable.music_2)

  /**
   * Returns a `Painter` for the `music_3` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/music-3
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun music3(): Painter = painterResource(LumeLucideResources.drawable.music_3)

  /**
   * Returns a `Painter` for the `music_4` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/music-4
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun music4(): Painter = painterResource(LumeLucideResources.drawable.music_4)

  /**
   * Returns a `Painter` for the `navigation` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/navigation
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun navigation(): Painter = painterResource(LumeLucideResources.drawable.navigation)

  /**
   * Returns a `Painter` for the `navigation_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/navigation-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun navigation2(): Painter = painterResource(LumeLucideResources.drawable.navigation_2)

  /**
   * Returns a `Painter` for the `navigation_2_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/navigation-2-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun navigation2Off(): Painter = painterResource(LumeLucideResources.drawable.navigation_2_off)

  /**
   * Returns a `Painter` for the `navigation_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/navigation-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun navigationOff(): Painter = painterResource(LumeLucideResources.drawable.navigation_off)

  /**
   * Returns a `Painter` for the `network` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/network
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun network(): Painter = painterResource(LumeLucideResources.drawable.network)

  /**
   * Returns a `Painter` for the `newspaper` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/newspaper
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun newspaper(): Painter = painterResource(LumeLucideResources.drawable.newspaper)

  /**
   * Returns a `Painter` for the `nfc` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/nfc
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun nfc(): Painter = painterResource(LumeLucideResources.drawable.nfc)

  /**
   * Returns a `Painter` for the `non_binary` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/non-binary
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun nonBinary(): Painter = painterResource(LumeLucideResources.drawable.non_binary)

  /**
   * Returns a `Painter` for the `notebook` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/notebook
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun notebook(): Painter = painterResource(LumeLucideResources.drawable.notebook)

  /**
   * Returns a `Painter` for the `notebook_pen` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/notebook-pen
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun notebookPen(): Painter = painterResource(LumeLucideResources.drawable.notebook_pen)

  /**
   * Returns a `Painter` for the `notebook_tabs` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/notebook-tabs
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun notebookTabs(): Painter = painterResource(LumeLucideResources.drawable.notebook_tabs)

  /**
   * Returns a `Painter` for the `notebook_text` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/notebook-text
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun notebookText(): Painter = painterResource(LumeLucideResources.drawable.notebook_text)

  /**
   * Returns a `Painter` for the `notepad_text` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/notepad-text
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun notepadText(): Painter = painterResource(LumeLucideResources.drawable.notepad_text)

  /**
   * Returns a `Painter` for the `notepad_text_dashed` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/notepad-text-dashed
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun notepadTextDashed(): Painter = painterResource(LumeLucideResources.drawable.notepad_text_dashed)

  /**
   * Returns a `Painter` for the `nut` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/nut
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun nut(): Painter = painterResource(LumeLucideResources.drawable.nut)

  /**
   * Returns a `Painter` for the `nut_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/nut-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun nutOff(): Painter = painterResource(LumeLucideResources.drawable.nut_off)

  /**
   * Returns a `Painter` for the `octagon` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/octagon
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun octagon(): Painter = painterResource(LumeLucideResources.drawable.octagon)

  /**
   * Returns a `Painter` for the `octagon_alert` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/octagon-alert
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun octagonAlert(): Painter = painterResource(LumeLucideResources.drawable.octagon_alert)

  /**
   * Returns a `Painter` for the `octagon_minus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/octagon-minus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun octagonMinus(): Painter = painterResource(LumeLucideResources.drawable.octagon_minus)

  /**
   * Returns a `Painter` for the `octagon_pause` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/octagon-pause
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun octagonPause(): Painter = painterResource(LumeLucideResources.drawable.octagon_pause)

  /**
   * Returns a `Painter` for the `octagon_x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/octagon-x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun octagonX(): Painter = painterResource(LumeLucideResources.drawable.octagon_x)

  /**
   * Returns a `Painter` for the `omega` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/omega
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun omega(): Painter = painterResource(LumeLucideResources.drawable.omega)

  /**
   * Returns a `Painter` for the `option` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/option
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun option(): Painter = painterResource(LumeLucideResources.drawable.option)

  /**
   * Returns a `Painter` for the `orbit` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/orbit
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun orbit(): Painter = painterResource(LumeLucideResources.drawable.orbit)

  /**
   * Returns a `Painter` for the `origami` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/origami
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun origami(): Painter = painterResource(LumeLucideResources.drawable.origami)

  /**
   * Returns a `Painter` for the `package` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/package
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun package_(): Painter = painterResource(LumeLucideResources.drawable.`package`)

  /**
   * Returns a `Painter` for the `package_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/package-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun package2(): Painter = painterResource(LumeLucideResources.drawable.package_2)

  /**
   * Returns a `Painter` for the `package_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/package-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun packageCheck(): Painter = painterResource(LumeLucideResources.drawable.package_check)

  /**
   * Returns a `Painter` for the `package_minus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/package-minus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun packageMinus(): Painter = painterResource(LumeLucideResources.drawable.package_minus)

  /**
   * Returns a `Painter` for the `package_open` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/package-open
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun packageOpen(): Painter = painterResource(LumeLucideResources.drawable.package_open)

  /**
   * Returns a `Painter` for the `package_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/package-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun packagePlus(): Painter = painterResource(LumeLucideResources.drawable.package_plus)

  /**
   * Returns a `Painter` for the `package_search` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/package-search
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun packageSearch(): Painter = painterResource(LumeLucideResources.drawable.package_search)

  /**
   * Returns a `Painter` for the `package_x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/package-x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun packageX(): Painter = painterResource(LumeLucideResources.drawable.package_x)

  /**
   * Returns a `Painter` for the `paint_bucket` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/paint-bucket
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun paintBucket(): Painter = painterResource(LumeLucideResources.drawable.paint_bucket)

  /**
   * Returns a `Painter` for the `paint_roller` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/paint-roller
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun paintRoller(): Painter = painterResource(LumeLucideResources.drawable.paint_roller)

  /**
   * Returns a `Painter` for the `paintbrush` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/paintbrush
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun paintbrush(): Painter = painterResource(LumeLucideResources.drawable.paintbrush)

  /**
   * Returns a `Painter` for the `paintbrush_vertical` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/paintbrush-vertical
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun paintbrushVertical(): Painter = painterResource(LumeLucideResources.drawable.paintbrush_vertical)

  /**
   * Returns a `Painter` for the `palette` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/palette
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun palette(): Painter = painterResource(LumeLucideResources.drawable.palette)

  /**
   * Returns a `Painter` for the `panda` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/panda
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun panda(): Painter = painterResource(LumeLucideResources.drawable.panda)

  /**
   * Returns a `Painter` for the `panel_bottom` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/panel-bottom
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun panelBottom(): Painter = painterResource(LumeLucideResources.drawable.panel_bottom)

  /**
   * Returns a `Painter` for the `panel_bottom_close` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/panel-bottom-close
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun panelBottomClose(): Painter = painterResource(LumeLucideResources.drawable.panel_bottom_close)

  /**
   * Returns a `Painter` for the `panel_bottom_dashed` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/panel-bottom-dashed
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun panelBottomDashed(): Painter = painterResource(LumeLucideResources.drawable.panel_bottom_dashed)

  /**
   * Returns a `Painter` for the `panel_bottom_open` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/panel-bottom-open
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun panelBottomOpen(): Painter = painterResource(LumeLucideResources.drawable.panel_bottom_open)

  /**
   * Returns a `Painter` for the `panel_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/panel-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun panelLeft(): Painter = painterResource(LumeLucideResources.drawable.panel_left)

  /**
   * Returns a `Painter` for the `panel_left_close` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/panel-left-close
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun panelLeftClose(): Painter = painterResource(LumeLucideResources.drawable.panel_left_close)

  /**
   * Returns a `Painter` for the `panel_left_dashed` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/panel-left-dashed
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun panelLeftDashed(): Painter = painterResource(LumeLucideResources.drawable.panel_left_dashed)

  /**
   * Returns a `Painter` for the `panel_left_open` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/panel-left-open
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun panelLeftOpen(): Painter = painterResource(LumeLucideResources.drawable.panel_left_open)

  /**
   * Returns a `Painter` for the `panel_left_right_dashed` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/panel-left-right-dashed
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun panelLeftRightDashed(): Painter = painterResource(LumeLucideResources.drawable.panel_left_right_dashed)

  /**
   * Returns a `Painter` for the `panel_right` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/panel-right
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun panelRight(): Painter = painterResource(LumeLucideResources.drawable.panel_right)

  /**
   * Returns a `Painter` for the `panel_right_close` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/panel-right-close
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun panelRightClose(): Painter = painterResource(LumeLucideResources.drawable.panel_right_close)

  /**
   * Returns a `Painter` for the `panel_right_dashed` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/panel-right-dashed
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun panelRightDashed(): Painter = painterResource(LumeLucideResources.drawable.panel_right_dashed)

  /**
   * Returns a `Painter` for the `panel_right_open` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/panel-right-open
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun panelRightOpen(): Painter = painterResource(LumeLucideResources.drawable.panel_right_open)

  /**
   * Returns a `Painter` for the `panel_top` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/panel-top
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun panelTop(): Painter = painterResource(LumeLucideResources.drawable.panel_top)

  /**
   * Returns a `Painter` for the `panel_top_bottom_dashed` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/panel-top-bottom-dashed
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun panelTopBottomDashed(): Painter = painterResource(LumeLucideResources.drawable.panel_top_bottom_dashed)

  /**
   * Returns a `Painter` for the `panel_top_close` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/panel-top-close
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun panelTopClose(): Painter = painterResource(LumeLucideResources.drawable.panel_top_close)

  /**
   * Returns a `Painter` for the `panel_top_dashed` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/panel-top-dashed
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun panelTopDashed(): Painter = painterResource(LumeLucideResources.drawable.panel_top_dashed)

  /**
   * Returns a `Painter` for the `panel_top_open` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/panel-top-open
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun panelTopOpen(): Painter = painterResource(LumeLucideResources.drawable.panel_top_open)

  /**
   * Returns a `Painter` for the `panels_left_bottom` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/panels-left-bottom
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun panelsLeftBottom(): Painter = painterResource(LumeLucideResources.drawable.panels_left_bottom)

  /**
   * Returns a `Painter` for the `panels_right_bottom` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/panels-right-bottom
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun panelsRightBottom(): Painter = painterResource(LumeLucideResources.drawable.panels_right_bottom)

  /**
   * Returns a `Painter` for the `panels_top_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/panels-top-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun panelsTopLeft(): Painter = painterResource(LumeLucideResources.drawable.panels_top_left)

  /**
   * Returns a `Painter` for the `paperclip` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/paperclip
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun paperclip(): Painter = painterResource(LumeLucideResources.drawable.paperclip)

  /**
   * Returns a `Painter` for the `parentheses` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/parentheses
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun parentheses(): Painter = painterResource(LumeLucideResources.drawable.parentheses)

  /**
   * Returns a `Painter` for the `parking_meter` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/parking-meter
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun parkingMeter(): Painter = painterResource(LumeLucideResources.drawable.parking_meter)

  /**
   * Returns a `Painter` for the `party_popper` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/party-popper
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun partyPopper(): Painter = painterResource(LumeLucideResources.drawable.party_popper)

  /**
   * Returns a `Painter` for the `pause` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/pause
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun pause(): Painter = painterResource(LumeLucideResources.drawable.pause)

  /**
   * Returns a `Painter` for the `paw_print` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/paw-print
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun pawPrint(): Painter = painterResource(LumeLucideResources.drawable.paw_print)

  /**
   * Returns a `Painter` for the `pc_case` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/pc-case
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun pcCase(): Painter = painterResource(LumeLucideResources.drawable.pc_case)

  /**
   * Returns a `Painter` for the `pen` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/pen
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun pen(): Painter = painterResource(LumeLucideResources.drawable.pen)

  /**
   * Returns a `Painter` for the `pen_line` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/pen-line
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun penLine(): Painter = painterResource(LumeLucideResources.drawable.pen_line)

  /**
   * Returns a `Painter` for the `pen_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/pen-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun penOff(): Painter = painterResource(LumeLucideResources.drawable.pen_off)

  /**
   * Returns a `Painter` for the `pen_tool` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/pen-tool
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun penTool(): Painter = painterResource(LumeLucideResources.drawable.pen_tool)

  /**
   * Returns a `Painter` for the `pencil` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/pencil
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun pencil(): Painter = painterResource(LumeLucideResources.drawable.pencil)

  /**
   * Returns a `Painter` for the `pencil_line` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/pencil-line
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun pencilLine(): Painter = painterResource(LumeLucideResources.drawable.pencil_line)

  /**
   * Returns a `Painter` for the `pencil_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/pencil-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun pencilOff(): Painter = painterResource(LumeLucideResources.drawable.pencil_off)

  /**
   * Returns a `Painter` for the `pencil_ruler` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/pencil-ruler
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun pencilRuler(): Painter = painterResource(LumeLucideResources.drawable.pencil_ruler)

  /**
   * Returns a `Painter` for the `pentagon` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/pentagon
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun pentagon(): Painter = painterResource(LumeLucideResources.drawable.pentagon)

  /**
   * Returns a `Painter` for the `percent` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/percent
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun percent(): Painter = painterResource(LumeLucideResources.drawable.percent)

  /**
   * Returns a `Painter` for the `person_standing` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/person-standing
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun personStanding(): Painter = painterResource(LumeLucideResources.drawable.person_standing)

  /**
   * Returns a `Painter` for the `philippine_peso` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/philippine-peso
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun philippinePeso(): Painter = painterResource(LumeLucideResources.drawable.philippine_peso)

  /**
   * Returns a `Painter` for the `phone` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/phone
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun phone(): Painter = painterResource(LumeLucideResources.drawable.phone)

  /**
   * Returns a `Painter` for the `phone_call` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/phone-call
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun phoneCall(): Painter = painterResource(LumeLucideResources.drawable.phone_call)

  /**
   * Returns a `Painter` for the `phone_forwarded` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/phone-forwarded
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun phoneForwarded(): Painter = painterResource(LumeLucideResources.drawable.phone_forwarded)

  /**
   * Returns a `Painter` for the `phone_incoming` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/phone-incoming
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun phoneIncoming(): Painter = painterResource(LumeLucideResources.drawable.phone_incoming)

  /**
   * Returns a `Painter` for the `phone_missed` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/phone-missed
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun phoneMissed(): Painter = painterResource(LumeLucideResources.drawable.phone_missed)

  /**
   * Returns a `Painter` for the `phone_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/phone-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun phoneOff(): Painter = painterResource(LumeLucideResources.drawable.phone_off)

  /**
   * Returns a `Painter` for the `phone_outgoing` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/phone-outgoing
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun phoneOutgoing(): Painter = painterResource(LumeLucideResources.drawable.phone_outgoing)

  /**
   * Returns a `Painter` for the `pi` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/pi
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun pi(): Painter = painterResource(LumeLucideResources.drawable.pi)

  /**
   * Returns a `Painter` for the `piano` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/piano
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun piano(): Painter = painterResource(LumeLucideResources.drawable.piano)

  /**
   * Returns a `Painter` for the `pickaxe` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/pickaxe
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun pickaxe(): Painter = painterResource(LumeLucideResources.drawable.pickaxe)

  /**
   * Returns a `Painter` for the `picture_in_picture` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/picture-in-picture
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun pictureInPicture(): Painter = painterResource(LumeLucideResources.drawable.picture_in_picture)

  /**
   * Returns a `Painter` for the `picture_in_picture_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/picture-in-picture-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun pictureInPicture2(): Painter = painterResource(LumeLucideResources.drawable.picture_in_picture_2)

  /**
   * Returns a `Painter` for the `piggy_bank` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/piggy-bank
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun piggyBank(): Painter = painterResource(LumeLucideResources.drawable.piggy_bank)

  /**
   * Returns a `Painter` for the `pilcrow` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/pilcrow
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun pilcrow(): Painter = painterResource(LumeLucideResources.drawable.pilcrow)

  /**
   * Returns a `Painter` for the `pilcrow_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/pilcrow-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun pilcrowLeft(): Painter = painterResource(LumeLucideResources.drawable.pilcrow_left)

  /**
   * Returns a `Painter` for the `pilcrow_right` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/pilcrow-right
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun pilcrowRight(): Painter = painterResource(LumeLucideResources.drawable.pilcrow_right)

  /**
   * Returns a `Painter` for the `pill` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/pill
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun pill(): Painter = painterResource(LumeLucideResources.drawable.pill)

  /**
   * Returns a `Painter` for the `pill_bottle` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/pill-bottle
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun pillBottle(): Painter = painterResource(LumeLucideResources.drawable.pill_bottle)

  /**
   * Returns a `Painter` for the `pin` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/pin
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun pin(): Painter = painterResource(LumeLucideResources.drawable.pin)

  /**
   * Returns a `Painter` for the `pin_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/pin-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun pinOff(): Painter = painterResource(LumeLucideResources.drawable.pin_off)

  /**
   * Returns a `Painter` for the `pipette` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/pipette
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun pipette(): Painter = painterResource(LumeLucideResources.drawable.pipette)

  /**
   * Returns a `Painter` for the `pizza` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/pizza
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun pizza(): Painter = painterResource(LumeLucideResources.drawable.pizza)

  /**
   * Returns a `Painter` for the `plane` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/plane
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun plane(): Painter = painterResource(LumeLucideResources.drawable.plane)

  /**
   * Returns a `Painter` for the `plane_landing` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/plane-landing
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun planeLanding(): Painter = painterResource(LumeLucideResources.drawable.plane_landing)

  /**
   * Returns a `Painter` for the `plane_takeoff` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/plane-takeoff
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun planeTakeoff(): Painter = painterResource(LumeLucideResources.drawable.plane_takeoff)

  /**
   * Returns a `Painter` for the `play` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/play
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun play(): Painter = painterResource(LumeLucideResources.drawable.play)

  /**
   * Returns a `Painter` for the `plug` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/plug
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun plug(): Painter = painterResource(LumeLucideResources.drawable.plug)

  /**
   * Returns a `Painter` for the `plug_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/plug-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun plug2(): Painter = painterResource(LumeLucideResources.drawable.plug_2)

  /**
   * Returns a `Painter` for the `plug_zap` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/plug-zap
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun plugZap(): Painter = painterResource(LumeLucideResources.drawable.plug_zap)

  /**
   * Returns a `Painter` for the `plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun plus(): Painter = painterResource(LumeLucideResources.drawable.plus)

  /**
   * Returns a `Painter` for the `pocket_knife` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/pocket-knife
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun pocketKnife(): Painter = painterResource(LumeLucideResources.drawable.pocket_knife)

  /**
   * Returns a `Painter` for the `podcast` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/podcast
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun podcast(): Painter = painterResource(LumeLucideResources.drawable.podcast)

  /**
   * Returns a `Painter` for the `pointer` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/pointer
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun pointer(): Painter = painterResource(LumeLucideResources.drawable.pointer)

  /**
   * Returns a `Painter` for the `pointer_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/pointer-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun pointerOff(): Painter = painterResource(LumeLucideResources.drawable.pointer_off)

  /**
   * Returns a `Painter` for the `popcorn` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/popcorn
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun popcorn(): Painter = painterResource(LumeLucideResources.drawable.popcorn)

  /**
   * Returns a `Painter` for the `popsicle` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/popsicle
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun popsicle(): Painter = painterResource(LumeLucideResources.drawable.popsicle)

  /**
   * Returns a `Painter` for the `pound_sterling` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/pound-sterling
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun poundSterling(): Painter = painterResource(LumeLucideResources.drawable.pound_sterling)

  /**
   * Returns a `Painter` for the `power` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/power
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun power(): Painter = painterResource(LumeLucideResources.drawable.power)

  /**
   * Returns a `Painter` for the `power_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/power-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun powerOff(): Painter = painterResource(LumeLucideResources.drawable.power_off)

  /**
   * Returns a `Painter` for the `presentation` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/presentation
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun presentation(): Painter = painterResource(LumeLucideResources.drawable.presentation)

  /**
   * Returns a `Painter` for the `printer` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/printer
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun printer(): Painter = painterResource(LumeLucideResources.drawable.printer)

  /**
   * Returns a `Painter` for the `printer_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/printer-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun printerCheck(): Painter = painterResource(LumeLucideResources.drawable.printer_check)

  /**
   * Returns a `Painter` for the `printer_x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/printer-x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun printerX(): Painter = painterResource(LumeLucideResources.drawable.printer_x)

  /**
   * Returns a `Painter` for the `projector` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/projector
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun projector(): Painter = painterResource(LumeLucideResources.drawable.projector)

  /**
   * Returns a `Painter` for the `proportions` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/proportions
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun proportions(): Painter = painterResource(LumeLucideResources.drawable.proportions)

  /**
   * Returns a `Painter` for the `puzzle` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/puzzle
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun puzzle(): Painter = painterResource(LumeLucideResources.drawable.puzzle)

  /**
   * Returns a `Painter` for the `pyramid` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/pyramid
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun pyramid(): Painter = painterResource(LumeLucideResources.drawable.pyramid)

  /**
   * Returns a `Painter` for the `qr_code` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/qr-code
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun qrCode(): Painter = painterResource(LumeLucideResources.drawable.qr_code)

  /**
   * Returns a `Painter` for the `quote` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/quote
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun quote(): Painter = painterResource(LumeLucideResources.drawable.quote)

  /**
   * Returns a `Painter` for the `rabbit` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/rabbit
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun rabbit(): Painter = painterResource(LumeLucideResources.drawable.rabbit)

  /**
   * Returns a `Painter` for the `radar` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/radar
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun radar(): Painter = painterResource(LumeLucideResources.drawable.radar)

  /**
   * Returns a `Painter` for the `radiation` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/radiation
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun radiation(): Painter = painterResource(LumeLucideResources.drawable.radiation)

  /**
   * Returns a `Painter` for the `radical` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/radical
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun radical(): Painter = painterResource(LumeLucideResources.drawable.radical)

  /**
   * Returns a `Painter` for the `radio` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/radio
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun radio(): Painter = painterResource(LumeLucideResources.drawable.radio)

  /**
   * Returns a `Painter` for the `radio_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/radio-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun radioOff(): Painter = painterResource(LumeLucideResources.drawable.radio_off)

  /**
   * Returns a `Painter` for the `radio_receiver` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/radio-receiver
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun radioReceiver(): Painter = painterResource(LumeLucideResources.drawable.radio_receiver)

  /**
   * Returns a `Painter` for the `radio_tower` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/radio-tower
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun radioTower(): Painter = painterResource(LumeLucideResources.drawable.radio_tower)

  /**
   * Returns a `Painter` for the `radius` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/radius
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun radius(): Painter = painterResource(LumeLucideResources.drawable.radius)

  /**
   * Returns a `Painter` for the `rainbow` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/rainbow
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun rainbow(): Painter = painterResource(LumeLucideResources.drawable.rainbow)

  /**
   * Returns a `Painter` for the `rat` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/rat
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun rat(): Painter = painterResource(LumeLucideResources.drawable.rat)

  /**
   * Returns a `Painter` for the `ratio` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ratio
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun ratio(): Painter = painterResource(LumeLucideResources.drawable.ratio)

  /**
   * Returns a `Painter` for the `receipt` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/receipt
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun receipt(): Painter = painterResource(LumeLucideResources.drawable.receipt)

  /**
   * Returns a `Painter` for the `receipt_cent` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/receipt-cent
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun receiptCent(): Painter = painterResource(LumeLucideResources.drawable.receipt_cent)

  /**
   * Returns a `Painter` for the `receipt_euro` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/receipt-euro
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun receiptEuro(): Painter = painterResource(LumeLucideResources.drawable.receipt_euro)

  /**
   * Returns a `Painter` for the `receipt_indian_rupee` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/receipt-indian-rupee
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun receiptIndianRupee(): Painter = painterResource(LumeLucideResources.drawable.receipt_indian_rupee)

  /**
   * Returns a `Painter` for the `receipt_japanese_yen` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/receipt-japanese-yen
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun receiptJapaneseYen(): Painter = painterResource(LumeLucideResources.drawable.receipt_japanese_yen)

  /**
   * Returns a `Painter` for the `receipt_pound_sterling` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/receipt-pound-sterling
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun receiptPoundSterling(): Painter = painterResource(LumeLucideResources.drawable.receipt_pound_sterling)

  /**
   * Returns a `Painter` for the `receipt_russian_ruble` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/receipt-russian-ruble
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun receiptRussianRuble(): Painter = painterResource(LumeLucideResources.drawable.receipt_russian_ruble)

  /**
   * Returns a `Painter` for the `receipt_swiss_franc` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/receipt-swiss-franc
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun receiptSwissFranc(): Painter = painterResource(LumeLucideResources.drawable.receipt_swiss_franc)

  /**
   * Returns a `Painter` for the `receipt_text` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/receipt-text
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun receiptText(): Painter = painterResource(LumeLucideResources.drawable.receipt_text)

  /**
   * Returns a `Painter` for the `receipt_turkish_lira` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/receipt-turkish-lira
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun receiptTurkishLira(): Painter = painterResource(LumeLucideResources.drawable.receipt_turkish_lira)

  /**
   * Returns a `Painter` for the `rectangle_circle` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/rectangle-circle
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun rectangleCircle(): Painter = painterResource(LumeLucideResources.drawable.rectangle_circle)

  /**
   * Returns a `Painter` for the `rectangle_ellipsis` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/rectangle-ellipsis
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun rectangleEllipsis(): Painter = painterResource(LumeLucideResources.drawable.rectangle_ellipsis)

  /**
   * Returns a `Painter` for the `rectangle_goggles` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/rectangle-goggles
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun rectangleGoggles(): Painter = painterResource(LumeLucideResources.drawable.rectangle_goggles)

  /**
   * Returns a `Painter` for the `rectangle_horizontal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/rectangle-horizontal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun rectangleHorizontal(): Painter = painterResource(LumeLucideResources.drawable.rectangle_horizontal)

  /**
   * Returns a `Painter` for the `rectangle_vertical` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/rectangle-vertical
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun rectangleVertical(): Painter = painterResource(LumeLucideResources.drawable.rectangle_vertical)

  /**
   * Returns a `Painter` for the `recycle` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/recycle
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun recycle(): Painter = painterResource(LumeLucideResources.drawable.recycle)

  /**
   * Returns a `Painter` for the `redo` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/redo
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun redo(): Painter = painterResource(LumeLucideResources.drawable.redo)

  /**
   * Returns a `Painter` for the `redo_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/redo-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun redo2(): Painter = painterResource(LumeLucideResources.drawable.redo_2)

  /**
   * Returns a `Painter` for the `redo_dot` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/redo-dot
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun redoDot(): Painter = painterResource(LumeLucideResources.drawable.redo_dot)

  /**
   * Returns a `Painter` for the `refresh_ccw` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/refresh-ccw
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun refreshCcw(): Painter = painterResource(LumeLucideResources.drawable.refresh_ccw)

  /**
   * Returns a `Painter` for the `refresh_ccw_dot` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/refresh-ccw-dot
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun refreshCcwDot(): Painter = painterResource(LumeLucideResources.drawable.refresh_ccw_dot)

  /**
   * Returns a `Painter` for the `refresh_cw` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/refresh-cw
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun refreshCw(): Painter = painterResource(LumeLucideResources.drawable.refresh_cw)

  /**
   * Returns a `Painter` for the `refresh_cw_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/refresh-cw-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun refreshCwOff(): Painter = painterResource(LumeLucideResources.drawable.refresh_cw_off)

  /**
   * Returns a `Painter` for the `refrigerator` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/refrigerator
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun refrigerator(): Painter = painterResource(LumeLucideResources.drawable.refrigerator)

  /**
   * Returns a `Painter` for the `regex` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/regex
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun regex(): Painter = painterResource(LumeLucideResources.drawable.regex)

  /**
   * Returns a `Painter` for the `remove_formatting` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/remove-formatting
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun removeFormatting(): Painter = painterResource(LumeLucideResources.drawable.remove_formatting)

  /**
   * Returns a `Painter` for the `repeat` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/repeat
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun repeat(): Painter = painterResource(LumeLucideResources.drawable.repeat)

  /**
   * Returns a `Painter` for the `repeat_1` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/repeat-1
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun repeat1(): Painter = painterResource(LumeLucideResources.drawable.repeat_1)

  /**
   * Returns a `Painter` for the `repeat_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/repeat-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun repeat2(): Painter = painterResource(LumeLucideResources.drawable.repeat_2)

  /**
   * Returns a `Painter` for the `replace` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/replace
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun replace(): Painter = painterResource(LumeLucideResources.drawable.replace)

  /**
   * Returns a `Painter` for the `replace_all` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/replace-all
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun replaceAll(): Painter = painterResource(LumeLucideResources.drawable.replace_all)

  /**
   * Returns a `Painter` for the `reply` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/reply
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun reply(): Painter = painterResource(LumeLucideResources.drawable.reply)

  /**
   * Returns a `Painter` for the `reply_all` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/reply-all
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun replyAll(): Painter = painterResource(LumeLucideResources.drawable.reply_all)

  /**
   * Returns a `Painter` for the `rewind` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/rewind
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun rewind(): Painter = painterResource(LumeLucideResources.drawable.rewind)

  /**
   * Returns a `Painter` for the `ribbon` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ribbon
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun ribbon(): Painter = painterResource(LumeLucideResources.drawable.ribbon)

  /**
   * Returns a `Painter` for the `road` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/road
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun road(): Painter = painterResource(LumeLucideResources.drawable.road)

  /**
   * Returns a `Painter` for the `rocket` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/rocket
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun rocket(): Painter = painterResource(LumeLucideResources.drawable.rocket)

  /**
   * Returns a `Painter` for the `rocking_chair` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/rocking-chair
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun rockingChair(): Painter = painterResource(LumeLucideResources.drawable.rocking_chair)

  /**
   * Returns a `Painter` for the `roller_coaster` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/roller-coaster
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun rollerCoaster(): Painter = painterResource(LumeLucideResources.drawable.roller_coaster)

  /**
   * Returns a `Painter` for the `rose` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/rose
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun rose(): Painter = painterResource(LumeLucideResources.drawable.rose)

  /**
   * Returns a `Painter` for the `rotate_3d` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/rotate-3d
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun rotate3d(): Painter = painterResource(LumeLucideResources.drawable.rotate_3d)

  /**
   * Returns a `Painter` for the `rotate_ccw` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/rotate-ccw
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun rotateCcw(): Painter = painterResource(LumeLucideResources.drawable.rotate_ccw)

  /**
   * Returns a `Painter` for the `rotate_ccw_key` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/rotate-ccw-key
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun rotateCcwKey(): Painter = painterResource(LumeLucideResources.drawable.rotate_ccw_key)

  /**
   * Returns a `Painter` for the `rotate_ccw_square` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/rotate-ccw-square
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun rotateCcwSquare(): Painter = painterResource(LumeLucideResources.drawable.rotate_ccw_square)

  /**
   * Returns a `Painter` for the `rotate_cw` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/rotate-cw
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun rotateCw(): Painter = painterResource(LumeLucideResources.drawable.rotate_cw)

  /**
   * Returns a `Painter` for the `rotate_cw_square` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/rotate-cw-square
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun rotateCwSquare(): Painter = painterResource(LumeLucideResources.drawable.rotate_cw_square)

  /**
   * Returns a `Painter` for the `route` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/route
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun route(): Painter = painterResource(LumeLucideResources.drawable.route)

  /**
   * Returns a `Painter` for the `route_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/route-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun routeOff(): Painter = painterResource(LumeLucideResources.drawable.route_off)

  /**
   * Returns a `Painter` for the `router` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/router
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun router(): Painter = painterResource(LumeLucideResources.drawable.router)

  /**
   * Returns a `Painter` for the `rows_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/rows-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun rows2(): Painter = painterResource(LumeLucideResources.drawable.rows_2)

  /**
   * Returns a `Painter` for the `rows_3` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/rows-3
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun rows3(): Painter = painterResource(LumeLucideResources.drawable.rows_3)

  /**
   * Returns a `Painter` for the `rows_4` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/rows-4
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun rows4(): Painter = painterResource(LumeLucideResources.drawable.rows_4)

  /**
   * Returns a `Painter` for the `rss` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/rss
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun rss(): Painter = painterResource(LumeLucideResources.drawable.rss)

  /**
   * Returns a `Painter` for the `ruler` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ruler
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun ruler(): Painter = painterResource(LumeLucideResources.drawable.ruler)

  /**
   * Returns a `Painter` for the `ruler_dimension_line` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ruler-dimension-line
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun rulerDimensionLine(): Painter = painterResource(LumeLucideResources.drawable.ruler_dimension_line)

  /**
   * Returns a `Painter` for the `russian_ruble` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/russian-ruble
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun russianRuble(): Painter = painterResource(LumeLucideResources.drawable.russian_ruble)

  /**
   * Returns a `Painter` for the `sailboat` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/sailboat
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun sailboat(): Painter = painterResource(LumeLucideResources.drawable.sailboat)

  /**
   * Returns a `Painter` for the `salad` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/salad
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun salad(): Painter = painterResource(LumeLucideResources.drawable.salad)

  /**
   * Returns a `Painter` for the `sandwich` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/sandwich
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun sandwich(): Painter = painterResource(LumeLucideResources.drawable.sandwich)

  /**
   * Returns a `Painter` for the `satellite` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/satellite
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun satellite(): Painter = painterResource(LumeLucideResources.drawable.satellite)

  /**
   * Returns a `Painter` for the `satellite_dish` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/satellite-dish
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun satelliteDish(): Painter = painterResource(LumeLucideResources.drawable.satellite_dish)

  /**
   * Returns a `Painter` for the `saudi_riyal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/saudi-riyal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun saudiRiyal(): Painter = painterResource(LumeLucideResources.drawable.saudi_riyal)

  /**
   * Returns a `Painter` for the `save` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/save
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun save(): Painter = painterResource(LumeLucideResources.drawable.save)

  /**
   * Returns a `Painter` for the `save_all` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/save-all
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun saveAll(): Painter = painterResource(LumeLucideResources.drawable.save_all)

  /**
   * Returns a `Painter` for the `save_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/save-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun saveOff(): Painter = painterResource(LumeLucideResources.drawable.save_off)

  /**
   * Returns a `Painter` for the `scale` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/scale
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun scale(): Painter = painterResource(LumeLucideResources.drawable.scale)

  /**
   * Returns a `Painter` for the `scale_3d` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/scale-3d
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun scale3d(): Painter = painterResource(LumeLucideResources.drawable.scale_3d)

  /**
   * Returns a `Painter` for the `scaling` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/scaling
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun scaling(): Painter = painterResource(LumeLucideResources.drawable.scaling)

  /**
   * Returns a `Painter` for the `scan` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/scan
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun scan(): Painter = painterResource(LumeLucideResources.drawable.scan)

  /**
   * Returns a `Painter` for the `scan_barcode` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/scan-barcode
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun scanBarcode(): Painter = painterResource(LumeLucideResources.drawable.scan_barcode)

  /**
   * Returns a `Painter` for the `scan_eye` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/scan-eye
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun scanEye(): Painter = painterResource(LumeLucideResources.drawable.scan_eye)

  /**
   * Returns a `Painter` for the `scan_face` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/scan-face
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun scanFace(): Painter = painterResource(LumeLucideResources.drawable.scan_face)

  /**
   * Returns a `Painter` for the `scan_heart` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/scan-heart
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun scanHeart(): Painter = painterResource(LumeLucideResources.drawable.scan_heart)

  /**
   * Returns a `Painter` for the `scan_line` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/scan-line
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun scanLine(): Painter = painterResource(LumeLucideResources.drawable.scan_line)

  /**
   * Returns a `Painter` for the `scan_qr_code` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/scan-qr-code
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun scanQrCode(): Painter = painterResource(LumeLucideResources.drawable.scan_qr_code)

  /**
   * Returns a `Painter` for the `scan_search` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/scan-search
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun scanSearch(): Painter = painterResource(LumeLucideResources.drawable.scan_search)

  /**
   * Returns a `Painter` for the `scan_text` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/scan-text
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun scanText(): Painter = painterResource(LumeLucideResources.drawable.scan_text)

  /**
   * Returns a `Painter` for the `school` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/school
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun school(): Painter = painterResource(LumeLucideResources.drawable.school)

  /**
   * Returns a `Painter` for the `scissors` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/scissors
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun scissors(): Painter = painterResource(LumeLucideResources.drawable.scissors)

  /**
   * Returns a `Painter` for the `scissors_line_dashed` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/scissors-line-dashed
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun scissorsLineDashed(): Painter = painterResource(LumeLucideResources.drawable.scissors_line_dashed)

  /**
   * Returns a `Painter` for the `scooter` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/scooter
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun scooter(): Painter = painterResource(LumeLucideResources.drawable.scooter)

  /**
   * Returns a `Painter` for the `screen_share` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/screen-share
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun screenShare(): Painter = painterResource(LumeLucideResources.drawable.screen_share)

  /**
   * Returns a `Painter` for the `screen_share_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/screen-share-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun screenShareOff(): Painter = painterResource(LumeLucideResources.drawable.screen_share_off)

  /**
   * Returns a `Painter` for the `scroll` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/scroll
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun scroll(): Painter = painterResource(LumeLucideResources.drawable.scroll)

  /**
   * Returns a `Painter` for the `scroll_text` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/scroll-text
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun scrollText(): Painter = painterResource(LumeLucideResources.drawable.scroll_text)

  /**
   * Returns a `Painter` for the `search` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/search
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun search(): Painter = painterResource(LumeLucideResources.drawable.search)

  /**
   * Returns a `Painter` for the `search_alert` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/search-alert
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun searchAlert(): Painter = painterResource(LumeLucideResources.drawable.search_alert)

  /**
   * Returns a `Painter` for the `search_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/search-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun searchCheck(): Painter = painterResource(LumeLucideResources.drawable.search_check)

  /**
   * Returns a `Painter` for the `search_code` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/search-code
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun searchCode(): Painter = painterResource(LumeLucideResources.drawable.search_code)

  /**
   * Returns a `Painter` for the `search_slash` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/search-slash
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun searchSlash(): Painter = painterResource(LumeLucideResources.drawable.search_slash)

  /**
   * Returns a `Painter` for the `search_x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/search-x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun searchX(): Painter = painterResource(LumeLucideResources.drawable.search_x)

  /**
   * Returns a `Painter` for the `section` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/section
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun section(): Painter = painterResource(LumeLucideResources.drawable.section)

  /**
   * Returns a `Painter` for the `send` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/send
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun send(): Painter = painterResource(LumeLucideResources.drawable.send)

  /**
   * Returns a `Painter` for the `send_horizontal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/send-horizontal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun sendHorizontal(): Painter = painterResource(LumeLucideResources.drawable.send_horizontal)

  /**
   * Returns a `Painter` for the `send_to_back` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/send-to-back
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun sendToBack(): Painter = painterResource(LumeLucideResources.drawable.send_to_back)

  /**
   * Returns a `Painter` for the `separator_horizontal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/separator-horizontal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun separatorHorizontal(): Painter = painterResource(LumeLucideResources.drawable.separator_horizontal)

  /**
   * Returns a `Painter` for the `separator_vertical` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/separator-vertical
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun separatorVertical(): Painter = painterResource(LumeLucideResources.drawable.separator_vertical)

  /**
   * Returns a `Painter` for the `server` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/server
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun server(): Painter = painterResource(LumeLucideResources.drawable.server)

  /**
   * Returns a `Painter` for the `server_cog` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/server-cog
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun serverCog(): Painter = painterResource(LumeLucideResources.drawable.server_cog)

  /**
   * Returns a `Painter` for the `server_crash` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/server-crash
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun serverCrash(): Painter = painterResource(LumeLucideResources.drawable.server_crash)

  /**
   * Returns a `Painter` for the `server_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/server-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun serverOff(): Painter = painterResource(LumeLucideResources.drawable.server_off)

  /**
   * Returns a `Painter` for the `settings` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/settings
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun settings(): Painter = painterResource(LumeLucideResources.drawable.settings)

  /**
   * Returns a `Painter` for the `settings_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/settings-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun settings2(): Painter = painterResource(LumeLucideResources.drawable.settings_2)

  /**
   * Returns a `Painter` for the `shapes` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/shapes
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun shapes(): Painter = painterResource(LumeLucideResources.drawable.shapes)

  /**
   * Returns a `Painter` for the `share` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/share
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun share(): Painter = painterResource(LumeLucideResources.drawable.share)

  /**
   * Returns a `Painter` for the `share_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/share-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun share2(): Painter = painterResource(LumeLucideResources.drawable.share_2)

  /**
   * Returns a `Painter` for the `sheet` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/sheet
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun sheet(): Painter = painterResource(LumeLucideResources.drawable.sheet)

  /**
   * Returns a `Painter` for the `shell` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/shell
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun shell(): Painter = painterResource(LumeLucideResources.drawable.shell)

  /**
   * Returns a `Painter` for the `shelving_unit` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/shelving-unit
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun shelvingUnit(): Painter = painterResource(LumeLucideResources.drawable.shelving_unit)

  /**
   * Returns a `Painter` for the `shield` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/shield
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun shield(): Painter = painterResource(LumeLucideResources.drawable.shield)

  /**
   * Returns a `Painter` for the `shield_alert` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/shield-alert
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun shieldAlert(): Painter = painterResource(LumeLucideResources.drawable.shield_alert)

  /**
   * Returns a `Painter` for the `shield_ban` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/shield-ban
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun shieldBan(): Painter = painterResource(LumeLucideResources.drawable.shield_ban)

  /**
   * Returns a `Painter` for the `shield_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/shield-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun shieldCheck(): Painter = painterResource(LumeLucideResources.drawable.shield_check)

  /**
   * Returns a `Painter` for the `shield_cog` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/shield-cog
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun shieldCog(): Painter = painterResource(LumeLucideResources.drawable.shield_cog)

  /**
   * Returns a `Painter` for the `shield_cog_corner` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/shield-cog-corner
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun shieldCogCorner(): Painter = painterResource(LumeLucideResources.drawable.shield_cog_corner)

  /**
   * Returns a `Painter` for the `shield_ellipsis` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/shield-ellipsis
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun shieldEllipsis(): Painter = painterResource(LumeLucideResources.drawable.shield_ellipsis)

  /**
   * Returns a `Painter` for the `shield_half` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/shield-half
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun shieldHalf(): Painter = painterResource(LumeLucideResources.drawable.shield_half)

  /**
   * Returns a `Painter` for the `shield_minus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/shield-minus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun shieldMinus(): Painter = painterResource(LumeLucideResources.drawable.shield_minus)

  /**
   * Returns a `Painter` for the `shield_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/shield-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun shieldOff(): Painter = painterResource(LumeLucideResources.drawable.shield_off)

  /**
   * Returns a `Painter` for the `shield_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/shield-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun shieldPlus(): Painter = painterResource(LumeLucideResources.drawable.shield_plus)

  /**
   * Returns a `Painter` for the `shield_question_mark` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/shield-question-mark
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun shieldQuestionMark(): Painter = painterResource(LumeLucideResources.drawable.shield_question_mark)

  /**
   * Returns a `Painter` for the `shield_user` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/shield-user
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun shieldUser(): Painter = painterResource(LumeLucideResources.drawable.shield_user)

  /**
   * Returns a `Painter` for the `shield_x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/shield-x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun shieldX(): Painter = painterResource(LumeLucideResources.drawable.shield_x)

  /**
   * Returns a `Painter` for the `ship` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ship
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun ship(): Painter = painterResource(LumeLucideResources.drawable.ship)

  /**
   * Returns a `Painter` for the `ship_wheel` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ship-wheel
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun shipWheel(): Painter = painterResource(LumeLucideResources.drawable.ship_wheel)

  /**
   * Returns a `Painter` for the `shirt` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/shirt
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun shirt(): Painter = painterResource(LumeLucideResources.drawable.shirt)

  /**
   * Returns a `Painter` for the `shopping_bag` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/shopping-bag
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun shoppingBag(): Painter = painterResource(LumeLucideResources.drawable.shopping_bag)

  /**
   * Returns a `Painter` for the `shopping_basket` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/shopping-basket
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun shoppingBasket(): Painter = painterResource(LumeLucideResources.drawable.shopping_basket)

  /**
   * Returns a `Painter` for the `shopping_cart` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/shopping-cart
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun shoppingCart(): Painter = painterResource(LumeLucideResources.drawable.shopping_cart)

  /**
   * Returns a `Painter` for the `shovel` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/shovel
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun shovel(): Painter = painterResource(LumeLucideResources.drawable.shovel)

  /**
   * Returns a `Painter` for the `shower_head` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/shower-head
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun showerHead(): Painter = painterResource(LumeLucideResources.drawable.shower_head)

  /**
   * Returns a `Painter` for the `shredder` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/shredder
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun shredder(): Painter = painterResource(LumeLucideResources.drawable.shredder)

  /**
   * Returns a `Painter` for the `shrimp` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/shrimp
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun shrimp(): Painter = painterResource(LumeLucideResources.drawable.shrimp)

  /**
   * Returns a `Painter` for the `shrink` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/shrink
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun shrink(): Painter = painterResource(LumeLucideResources.drawable.shrink)

  /**
   * Returns a `Painter` for the `shrub` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/shrub
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun shrub(): Painter = painterResource(LumeLucideResources.drawable.shrub)

  /**
   * Returns a `Painter` for the `shuffle` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/shuffle
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun shuffle(): Painter = painterResource(LumeLucideResources.drawable.shuffle)

  /**
   * Returns a `Painter` for the `sigma` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/sigma
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun sigma(): Painter = painterResource(LumeLucideResources.drawable.sigma)

  /**
   * Returns a `Painter` for the `signal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/signal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun signal(): Painter = painterResource(LumeLucideResources.drawable.signal)

  /**
   * Returns a `Painter` for the `signal_high` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/signal-high
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun signalHigh(): Painter = painterResource(LumeLucideResources.drawable.signal_high)

  /**
   * Returns a `Painter` for the `signal_low` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/signal-low
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun signalLow(): Painter = painterResource(LumeLucideResources.drawable.signal_low)

  /**
   * Returns a `Painter` for the `signal_medium` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/signal-medium
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun signalMedium(): Painter = painterResource(LumeLucideResources.drawable.signal_medium)

  /**
   * Returns a `Painter` for the `signal_zero` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/signal-zero
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun signalZero(): Painter = painterResource(LumeLucideResources.drawable.signal_zero)

  /**
   * Returns a `Painter` for the `signature` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/signature
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun signature(): Painter = painterResource(LumeLucideResources.drawable.signature)

  /**
   * Returns a `Painter` for the `signpost` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/signpost
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun signpost(): Painter = painterResource(LumeLucideResources.drawable.signpost)

  /**
   * Returns a `Painter` for the `signpost_big` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/signpost-big
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun signpostBig(): Painter = painterResource(LumeLucideResources.drawable.signpost_big)

  /**
   * Returns a `Painter` for the `siren` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/siren
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun siren(): Painter = painterResource(LumeLucideResources.drawable.siren)

  /**
   * Returns a `Painter` for the `skip_back` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/skip-back
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun skipBack(): Painter = painterResource(LumeLucideResources.drawable.skip_back)

  /**
   * Returns a `Painter` for the `skip_forward` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/skip-forward
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun skipForward(): Painter = painterResource(LumeLucideResources.drawable.skip_forward)

  /**
   * Returns a `Painter` for the `skull` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/skull
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun skull(): Painter = painterResource(LumeLucideResources.drawable.skull)

  /**
   * Returns a `Painter` for the `slash` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/slash
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun slash(): Painter = painterResource(LumeLucideResources.drawable.slash)

  /**
   * Returns a `Painter` for the `slice` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/slice
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun slice(): Painter = painterResource(LumeLucideResources.drawable.slice)

  /**
   * Returns a `Painter` for the `sliders_horizontal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/sliders-horizontal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun slidersHorizontal(): Painter = painterResource(LumeLucideResources.drawable.sliders_horizontal)

  /**
   * Returns a `Painter` for the `sliders_vertical` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/sliders-vertical
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun slidersVertical(): Painter = painterResource(LumeLucideResources.drawable.sliders_vertical)

  /**
   * Returns a `Painter` for the `smartphone` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/smartphone
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun smartphone(): Painter = painterResource(LumeLucideResources.drawable.smartphone)

  /**
   * Returns a `Painter` for the `smartphone_charging` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/smartphone-charging
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun smartphoneCharging(): Painter = painterResource(LumeLucideResources.drawable.smartphone_charging)

  /**
   * Returns a `Painter` for the `smartphone_nfc` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/smartphone-nfc
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun smartphoneNfc(): Painter = painterResource(LumeLucideResources.drawable.smartphone_nfc)

  /**
   * Returns a `Painter` for the `smile` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/smile
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun smile(): Painter = painterResource(LumeLucideResources.drawable.smile)

  /**
   * Returns a `Painter` for the `smile_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/smile-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun smilePlus(): Painter = painterResource(LumeLucideResources.drawable.smile_plus)

  /**
   * Returns a `Painter` for the `snail` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/snail
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun snail(): Painter = painterResource(LumeLucideResources.drawable.snail)

  /**
   * Returns a `Painter` for the `snowflake` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/snowflake
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun snowflake(): Painter = painterResource(LumeLucideResources.drawable.snowflake)

  /**
   * Returns a `Painter` for the `soap_dispenser_droplet` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/soap-dispenser-droplet
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun soapDispenserDroplet(): Painter = painterResource(LumeLucideResources.drawable.soap_dispenser_droplet)

  /**
   * Returns a `Painter` for the `sofa` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/sofa
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun sofa(): Painter = painterResource(LumeLucideResources.drawable.sofa)

  /**
   * Returns a `Painter` for the `solar_panel` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/solar-panel
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun solarPanel(): Painter = painterResource(LumeLucideResources.drawable.solar_panel)

  /**
   * Returns a `Painter` for the `soup` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/soup
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun soup(): Painter = painterResource(LumeLucideResources.drawable.soup)

  /**
   * Returns a `Painter` for the `space` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/space
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun space(): Painter = painterResource(LumeLucideResources.drawable.space)

  /**
   * Returns a `Painter` for the `spade` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/spade
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun spade(): Painter = painterResource(LumeLucideResources.drawable.spade)

  /**
   * Returns a `Painter` for the `sparkle` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/sparkle
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun sparkle(): Painter = painterResource(LumeLucideResources.drawable.sparkle)

  /**
   * Returns a `Painter` for the `sparkles` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/sparkles
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun sparkles(): Painter = painterResource(LumeLucideResources.drawable.sparkles)

  /**
   * Returns a `Painter` for the `speaker` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/speaker
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun speaker(): Painter = painterResource(LumeLucideResources.drawable.speaker)

  /**
   * Returns a `Painter` for the `speech` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/speech
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun speech(): Painter = painterResource(LumeLucideResources.drawable.speech)

  /**
   * Returns a `Painter` for the `spell_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/spell-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun spellCheck(): Painter = painterResource(LumeLucideResources.drawable.spell_check)

  /**
   * Returns a `Painter` for the `spell_check_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/spell-check-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun spellCheck2(): Painter = painterResource(LumeLucideResources.drawable.spell_check_2)

  /**
   * Returns a `Painter` for the `spline` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/spline
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun spline(): Painter = painterResource(LumeLucideResources.drawable.spline)

  /**
   * Returns a `Painter` for the `spline_pointer` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/spline-pointer
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun splinePointer(): Painter = painterResource(LumeLucideResources.drawable.spline_pointer)

  /**
   * Returns a `Painter` for the `split` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/split
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun split(): Painter = painterResource(LumeLucideResources.drawable.split)

  /**
   * Returns a `Painter` for the `spool` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/spool
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun spool(): Painter = painterResource(LumeLucideResources.drawable.spool)

  /**
   * Returns a `Painter` for the `sport_shoe` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/sport-shoe
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun sportShoe(): Painter = painterResource(LumeLucideResources.drawable.sport_shoe)

  /**
   * Returns a `Painter` for the `spotlight` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/spotlight
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun spotlight(): Painter = painterResource(LumeLucideResources.drawable.spotlight)

  /**
   * Returns a `Painter` for the `spray_can` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/spray-can
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun sprayCan(): Painter = painterResource(LumeLucideResources.drawable.spray_can)

  /**
   * Returns a `Painter` for the `sprout` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/sprout
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun sprout(): Painter = painterResource(LumeLucideResources.drawable.sprout)

  /**
   * Returns a `Painter` for the `square` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun square(): Painter = painterResource(LumeLucideResources.drawable.square)

  /**
   * Returns a `Painter` for the `square_activity` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-activity
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareActivity(): Painter = painterResource(LumeLucideResources.drawable.square_activity)

  /**
   * Returns a `Painter` for the `square_arrow_down` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-arrow-down
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareArrowDown(): Painter = painterResource(LumeLucideResources.drawable.square_arrow_down)

  /**
   * Returns a `Painter` for the `square_arrow_down_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-arrow-down-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareArrowDownLeft(): Painter = painterResource(LumeLucideResources.drawable.square_arrow_down_left)

  /**
   * Returns a `Painter` for the `square_arrow_down_right` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-arrow-down-right
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareArrowDownRight(): Painter = painterResource(LumeLucideResources.drawable.square_arrow_down_right)

  /**
   * Returns a `Painter` for the `square_arrow_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-arrow-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareArrowLeft(): Painter = painterResource(LumeLucideResources.drawable.square_arrow_left)

  /**
   * Returns a `Painter` for the `square_arrow_out_down_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-arrow-out-down-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareArrowOutDownLeft(): Painter = painterResource(LumeLucideResources.drawable.square_arrow_out_down_left)

  /**
   * Returns a `Painter` for the `square_arrow_out_down_right` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-arrow-out-down-right
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareArrowOutDownRight(): Painter = painterResource(LumeLucideResources.drawable.square_arrow_out_down_right)

  /**
   * Returns a `Painter` for the `square_arrow_out_up_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-arrow-out-up-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareArrowOutUpLeft(): Painter = painterResource(LumeLucideResources.drawable.square_arrow_out_up_left)

  /**
   * Returns a `Painter` for the `square_arrow_out_up_right` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-arrow-out-up-right
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareArrowOutUpRight(): Painter = painterResource(LumeLucideResources.drawable.square_arrow_out_up_right)

  /**
   * Returns a `Painter` for the `square_arrow_right` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-arrow-right
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareArrowRight(): Painter = painterResource(LumeLucideResources.drawable.square_arrow_right)

  /**
   * Returns a `Painter` for the `square_arrow_right_enter` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-arrow-right-enter
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareArrowRightEnter(): Painter = painterResource(LumeLucideResources.drawable.square_arrow_right_enter)

  /**
   * Returns a `Painter` for the `square_arrow_right_exit` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-arrow-right-exit
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareArrowRightExit(): Painter = painterResource(LumeLucideResources.drawable.square_arrow_right_exit)

  /**
   * Returns a `Painter` for the `square_arrow_up` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-arrow-up
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareArrowUp(): Painter = painterResource(LumeLucideResources.drawable.square_arrow_up)

  /**
   * Returns a `Painter` for the `square_arrow_up_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-arrow-up-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareArrowUpLeft(): Painter = painterResource(LumeLucideResources.drawable.square_arrow_up_left)

  /**
   * Returns a `Painter` for the `square_arrow_up_right` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-arrow-up-right
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareArrowUpRight(): Painter = painterResource(LumeLucideResources.drawable.square_arrow_up_right)

  /**
   * Returns a `Painter` for the `square_asterisk` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-asterisk
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareAsterisk(): Painter = painterResource(LumeLucideResources.drawable.square_asterisk)

  /**
   * Returns a `Painter` for the `square_bottom_dashed_scissors` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-bottom-dashed-scissors
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareBottomDashedScissors(): Painter = painterResource(LumeLucideResources.drawable.square_bottom_dashed_scissors)

  /**
   * Returns a `Painter` for the `square_centerline_dashed_horizontal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-centerline-dashed-horizontal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareCenterlineDashedHorizontal(): Painter = painterResource(LumeLucideResources.drawable.square_centerline_dashed_horizontal)

  /**
   * Returns a `Painter` for the `square_centerline_dashed_vertical` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-centerline-dashed-vertical
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareCenterlineDashedVertical(): Painter = painterResource(LumeLucideResources.drawable.square_centerline_dashed_vertical)

  /**
   * Returns a `Painter` for the `square_chart_gantt` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-chart-gantt
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareChartGantt(): Painter = painterResource(LumeLucideResources.drawable.square_chart_gantt)

  /**
   * Returns a `Painter` for the `square_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareCheck(): Painter = painterResource(LumeLucideResources.drawable.square_check)

  /**
   * Returns a `Painter` for the `square_check_big` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-check-big
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareCheckBig(): Painter = painterResource(LumeLucideResources.drawable.square_check_big)

  /**
   * Returns a `Painter` for the `square_chevron_down` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-chevron-down
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareChevronDown(): Painter = painterResource(LumeLucideResources.drawable.square_chevron_down)

  /**
   * Returns a `Painter` for the `square_chevron_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-chevron-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareChevronLeft(): Painter = painterResource(LumeLucideResources.drawable.square_chevron_left)

  /**
   * Returns a `Painter` for the `square_chevron_right` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-chevron-right
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareChevronRight(): Painter = painterResource(LumeLucideResources.drawable.square_chevron_right)

  /**
   * Returns a `Painter` for the `square_chevron_up` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-chevron-up
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareChevronUp(): Painter = painterResource(LumeLucideResources.drawable.square_chevron_up)

  /**
   * Returns a `Painter` for the `square_code` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-code
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareCode(): Painter = painterResource(LumeLucideResources.drawable.square_code)

  /**
   * Returns a `Painter` for the `square_dashed` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-dashed
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareDashed(): Painter = painterResource(LumeLucideResources.drawable.square_dashed)

  /**
   * Returns a `Painter` for the `square_dashed_bottom` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-dashed-bottom
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareDashedBottom(): Painter = painterResource(LumeLucideResources.drawable.square_dashed_bottom)

  /**
   * Returns a `Painter` for the `square_dashed_bottom_code` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-dashed-bottom-code
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareDashedBottomCode(): Painter = painterResource(LumeLucideResources.drawable.square_dashed_bottom_code)

  /**
   * Returns a `Painter` for the `square_dashed_kanban` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-dashed-kanban
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareDashedKanban(): Painter = painterResource(LumeLucideResources.drawable.square_dashed_kanban)

  /**
   * Returns a `Painter` for the `square_dashed_mouse_pointer` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-dashed-mouse-pointer
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareDashedMousePointer(): Painter = painterResource(LumeLucideResources.drawable.square_dashed_mouse_pointer)

  /**
   * Returns a `Painter` for the `square_dashed_text` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-dashed-text
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareDashedText(): Painter = painterResource(LumeLucideResources.drawable.square_dashed_text)

  /**
   * Returns a `Painter` for the `square_dashed_top_solid` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-dashed-top-solid
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareDashedTopSolid(): Painter = painterResource(LumeLucideResources.drawable.square_dashed_top_solid)

  /**
   * Returns a `Painter` for the `square_divide` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-divide
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareDivide(): Painter = painterResource(LumeLucideResources.drawable.square_divide)

  /**
   * Returns a `Painter` for the `square_dot` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-dot
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareDot(): Painter = painterResource(LumeLucideResources.drawable.square_dot)

  /**
   * Returns a `Painter` for the `square_equal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-equal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareEqual(): Painter = painterResource(LumeLucideResources.drawable.square_equal)

  /**
   * Returns a `Painter` for the `square_function` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-function
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareFunction(): Painter = painterResource(LumeLucideResources.drawable.square_function)

  /**
   * Returns a `Painter` for the `square_kanban` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-kanban
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareKanban(): Painter = painterResource(LumeLucideResources.drawable.square_kanban)

  /**
   * Returns a `Painter` for the `square_library` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-library
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareLibrary(): Painter = painterResource(LumeLucideResources.drawable.square_library)

  /**
   * Returns a `Painter` for the `square_m` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-m
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareM(): Painter = painterResource(LumeLucideResources.drawable.square_m)

  /**
   * Returns a `Painter` for the `square_menu` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-menu
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareMenu(): Painter = painterResource(LumeLucideResources.drawable.square_menu)

  /**
   * Returns a `Painter` for the `square_minus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-minus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareMinus(): Painter = painterResource(LumeLucideResources.drawable.square_minus)

  /**
   * Returns a `Painter` for the `square_mouse_pointer` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-mouse-pointer
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareMousePointer(): Painter = painterResource(LumeLucideResources.drawable.square_mouse_pointer)

  /**
   * Returns a `Painter` for the `square_parking` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-parking
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareParking(): Painter = painterResource(LumeLucideResources.drawable.square_parking)

  /**
   * Returns a `Painter` for the `square_parking_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-parking-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareParkingOff(): Painter = painterResource(LumeLucideResources.drawable.square_parking_off)

  /**
   * Returns a `Painter` for the `square_pause` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-pause
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squarePause(): Painter = painterResource(LumeLucideResources.drawable.square_pause)

  /**
   * Returns a `Painter` for the `square_pen` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-pen
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squarePen(): Painter = painterResource(LumeLucideResources.drawable.square_pen)

  /**
   * Returns a `Painter` for the `square_percent` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-percent
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squarePercent(): Painter = painterResource(LumeLucideResources.drawable.square_percent)

  /**
   * Returns a `Painter` for the `square_pi` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-pi
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squarePi(): Painter = painterResource(LumeLucideResources.drawable.square_pi)

  /**
   * Returns a `Painter` for the `square_pilcrow` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-pilcrow
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squarePilcrow(): Painter = painterResource(LumeLucideResources.drawable.square_pilcrow)

  /**
   * Returns a `Painter` for the `square_play` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-play
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squarePlay(): Painter = painterResource(LumeLucideResources.drawable.square_play)

  /**
   * Returns a `Painter` for the `square_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squarePlus(): Painter = painterResource(LumeLucideResources.drawable.square_plus)

  /**
   * Returns a `Painter` for the `square_power` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-power
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squarePower(): Painter = painterResource(LumeLucideResources.drawable.square_power)

  /**
   * Returns a `Painter` for the `square_radical` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-radical
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareRadical(): Painter = painterResource(LumeLucideResources.drawable.square_radical)

  /**
   * Returns a `Painter` for the `square_round_corner` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-round-corner
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareRoundCorner(): Painter = painterResource(LumeLucideResources.drawable.square_round_corner)

  /**
   * Returns a `Painter` for the `square_scissors` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-scissors
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareScissors(): Painter = painterResource(LumeLucideResources.drawable.square_scissors)

  /**
   * Returns a `Painter` for the `square_sigma` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-sigma
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareSigma(): Painter = painterResource(LumeLucideResources.drawable.square_sigma)

  /**
   * Returns a `Painter` for the `square_slash` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-slash
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareSlash(): Painter = painterResource(LumeLucideResources.drawable.square_slash)

  /**
   * Returns a `Painter` for the `square_split_horizontal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-split-horizontal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareSplitHorizontal(): Painter = painterResource(LumeLucideResources.drawable.square_split_horizontal)

  /**
   * Returns a `Painter` for the `square_split_vertical` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-split-vertical
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareSplitVertical(): Painter = painterResource(LumeLucideResources.drawable.square_split_vertical)

  /**
   * Returns a `Painter` for the `square_square` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-square
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareSquare(): Painter = painterResource(LumeLucideResources.drawable.square_square)

  /**
   * Returns a `Painter` for the `square_stack` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-stack
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareStack(): Painter = painterResource(LumeLucideResources.drawable.square_stack)

  /**
   * Returns a `Painter` for the `square_star` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-star
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareStar(): Painter = painterResource(LumeLucideResources.drawable.square_star)

  /**
   * Returns a `Painter` for the `square_stop` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-stop
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareStop(): Painter = painterResource(LumeLucideResources.drawable.square_stop)

  /**
   * Returns a `Painter` for the `square_terminal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-terminal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareTerminal(): Painter = painterResource(LumeLucideResources.drawable.square_terminal)

  /**
   * Returns a `Painter` for the `square_user` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-user
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareUser(): Painter = painterResource(LumeLucideResources.drawable.square_user)

  /**
   * Returns a `Painter` for the `square_user_round` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-user-round
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareUserRound(): Painter = painterResource(LumeLucideResources.drawable.square_user_round)

  /**
   * Returns a `Painter` for the `square_x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/square-x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squareX(): Painter = painterResource(LumeLucideResources.drawable.square_x)

  /**
   * Returns a `Painter` for the `squares_exclude` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/squares-exclude
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squaresExclude(): Painter = painterResource(LumeLucideResources.drawable.squares_exclude)

  /**
   * Returns a `Painter` for the `squares_intersect` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/squares-intersect
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squaresIntersect(): Painter = painterResource(LumeLucideResources.drawable.squares_intersect)

  /**
   * Returns a `Painter` for the `squares_subtract` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/squares-subtract
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squaresSubtract(): Painter = painterResource(LumeLucideResources.drawable.squares_subtract)

  /**
   * Returns a `Painter` for the `squares_unite` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/squares-unite
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squaresUnite(): Painter = painterResource(LumeLucideResources.drawable.squares_unite)

  /**
   * Returns a `Painter` for the `squircle` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/squircle
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squircle(): Painter = painterResource(LumeLucideResources.drawable.squircle)

  /**
   * Returns a `Painter` for the `squircle_dashed` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/squircle-dashed
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squircleDashed(): Painter = painterResource(LumeLucideResources.drawable.squircle_dashed)

  /**
   * Returns a `Painter` for the `squirrel` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/squirrel
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun squirrel(): Painter = painterResource(LumeLucideResources.drawable.squirrel)

  /**
   * Returns a `Painter` for the `stamp` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/stamp
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun stamp(): Painter = painterResource(LumeLucideResources.drawable.stamp)

  /**
   * Returns a `Painter` for the `star` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/star
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun star(): Painter = painterResource(LumeLucideResources.drawable.star)

  /**
   * Returns a `Painter` for the `star_half` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/star-half
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun starHalf(): Painter = painterResource(LumeLucideResources.drawable.star_half)

  /**
   * Returns a `Painter` for the `star_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/star-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun starOff(): Painter = painterResource(LumeLucideResources.drawable.star_off)

  /**
   * Returns a `Painter` for the `step_back` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/step-back
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun stepBack(): Painter = painterResource(LumeLucideResources.drawable.step_back)

  /**
   * Returns a `Painter` for the `step_forward` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/step-forward
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun stepForward(): Painter = painterResource(LumeLucideResources.drawable.step_forward)

  /**
   * Returns a `Painter` for the `stethoscope` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/stethoscope
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun stethoscope(): Painter = painterResource(LumeLucideResources.drawable.stethoscope)

  /**
   * Returns a `Painter` for the `sticker` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/sticker
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun sticker(): Painter = painterResource(LumeLucideResources.drawable.sticker)

  /**
   * Returns a `Painter` for the `sticky_note` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/sticky-note
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun stickyNote(): Painter = painterResource(LumeLucideResources.drawable.sticky_note)

  /**
   * Returns a `Painter` for the `stone` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/stone
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun stone(): Painter = painterResource(LumeLucideResources.drawable.stone)

  /**
   * Returns a `Painter` for the `store` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/store
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun store(): Painter = painterResource(LumeLucideResources.drawable.store)

  /**
   * Returns a `Painter` for the `stretch_horizontal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/stretch-horizontal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun stretchHorizontal(): Painter = painterResource(LumeLucideResources.drawable.stretch_horizontal)

  /**
   * Returns a `Painter` for the `stretch_vertical` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/stretch-vertical
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun stretchVertical(): Painter = painterResource(LumeLucideResources.drawable.stretch_vertical)

  /**
   * Returns a `Painter` for the `strikethrough` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/strikethrough
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun strikethrough(): Painter = painterResource(LumeLucideResources.drawable.strikethrough)

  /**
   * Returns a `Painter` for the `subscript` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/subscript
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun subscript(): Painter = painterResource(LumeLucideResources.drawable.subscript)

  /**
   * Returns a `Painter` for the `sun` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/sun
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun sun(): Painter = painterResource(LumeLucideResources.drawable.sun)

  /**
   * Returns a `Painter` for the `sun_dim` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/sun-dim
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun sunDim(): Painter = painterResource(LumeLucideResources.drawable.sun_dim)

  /**
   * Returns a `Painter` for the `sun_medium` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/sun-medium
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun sunMedium(): Painter = painterResource(LumeLucideResources.drawable.sun_medium)

  /**
   * Returns a `Painter` for the `sun_moon` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/sun-moon
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun sunMoon(): Painter = painterResource(LumeLucideResources.drawable.sun_moon)

  /**
   * Returns a `Painter` for the `sun_snow` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/sun-snow
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun sunSnow(): Painter = painterResource(LumeLucideResources.drawable.sun_snow)

  /**
   * Returns a `Painter` for the `sunrise` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/sunrise
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun sunrise(): Painter = painterResource(LumeLucideResources.drawable.sunrise)

  /**
   * Returns a `Painter` for the `sunset` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/sunset
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun sunset(): Painter = painterResource(LumeLucideResources.drawable.sunset)

  /**
   * Returns a `Painter` for the `superscript` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/superscript
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun superscript(): Painter = painterResource(LumeLucideResources.drawable.superscript)

  /**
   * Returns a `Painter` for the `swatch_book` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/swatch-book
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun swatchBook(): Painter = painterResource(LumeLucideResources.drawable.swatch_book)

  /**
   * Returns a `Painter` for the `swiss_franc` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/swiss-franc
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun swissFranc(): Painter = painterResource(LumeLucideResources.drawable.swiss_franc)

  /**
   * Returns a `Painter` for the `switch_camera` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/switch-camera
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun switchCamera(): Painter = painterResource(LumeLucideResources.drawable.switch_camera)

  /**
   * Returns a `Painter` for the `sword` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/sword
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun sword(): Painter = painterResource(LumeLucideResources.drawable.sword)

  /**
   * Returns a `Painter` for the `swords` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/swords
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun swords(): Painter = painterResource(LumeLucideResources.drawable.swords)

  /**
   * Returns a `Painter` for the `syringe` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/syringe
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun syringe(): Painter = painterResource(LumeLucideResources.drawable.syringe)

  /**
   * Returns a `Painter` for the `table` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/table
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun table(): Painter = painterResource(LumeLucideResources.drawable.table)

  /**
   * Returns a `Painter` for the `table_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/table-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun table2(): Painter = painterResource(LumeLucideResources.drawable.table_2)

  /**
   * Returns a `Painter` for the `table_cells_merge` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/table-cells-merge
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun tableCellsMerge(): Painter = painterResource(LumeLucideResources.drawable.table_cells_merge)

  /**
   * Returns a `Painter` for the `table_cells_split` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/table-cells-split
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun tableCellsSplit(): Painter = painterResource(LumeLucideResources.drawable.table_cells_split)

  /**
   * Returns a `Painter` for the `table_columns_split` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/table-columns-split
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun tableColumnsSplit(): Painter = painterResource(LumeLucideResources.drawable.table_columns_split)

  /**
   * Returns a `Painter` for the `table_of_contents` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/table-of-contents
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun tableOfContents(): Painter = painterResource(LumeLucideResources.drawable.table_of_contents)

  /**
   * Returns a `Painter` for the `table_properties` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/table-properties
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun tableProperties(): Painter = painterResource(LumeLucideResources.drawable.table_properties)

  /**
   * Returns a `Painter` for the `table_rows_split` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/table-rows-split
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun tableRowsSplit(): Painter = painterResource(LumeLucideResources.drawable.table_rows_split)

  /**
   * Returns a `Painter` for the `tablet` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/tablet
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun tablet(): Painter = painterResource(LumeLucideResources.drawable.tablet)

  /**
   * Returns a `Painter` for the `tablet_smartphone` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/tablet-smartphone
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun tabletSmartphone(): Painter = painterResource(LumeLucideResources.drawable.tablet_smartphone)

  /**
   * Returns a `Painter` for the `tablets` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/tablets
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun tablets(): Painter = painterResource(LumeLucideResources.drawable.tablets)

  /**
   * Returns a `Painter` for the `tag` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/tag
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun tag(): Painter = painterResource(LumeLucideResources.drawable.tag)

  /**
   * Returns a `Painter` for the `tags` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/tags
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun tags(): Painter = painterResource(LumeLucideResources.drawable.tags)

  /**
   * Returns a `Painter` for the `tally_1` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/tally-1
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun tally1(): Painter = painterResource(LumeLucideResources.drawable.tally_1)

  /**
   * Returns a `Painter` for the `tally_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/tally-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun tally2(): Painter = painterResource(LumeLucideResources.drawable.tally_2)

  /**
   * Returns a `Painter` for the `tally_3` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/tally-3
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun tally3(): Painter = painterResource(LumeLucideResources.drawable.tally_3)

  /**
   * Returns a `Painter` for the `tally_4` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/tally-4
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun tally4(): Painter = painterResource(LumeLucideResources.drawable.tally_4)

  /**
   * Returns a `Painter` for the `tally_5` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/tally-5
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun tally5(): Painter = painterResource(LumeLucideResources.drawable.tally_5)

  /**
   * Returns a `Painter` for the `tangent` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/tangent
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun tangent(): Painter = painterResource(LumeLucideResources.drawable.tangent)

  /**
   * Returns a `Painter` for the `target` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/target
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun target(): Painter = painterResource(LumeLucideResources.drawable.target)

  /**
   * Returns a `Painter` for the `telescope` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/telescope
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun telescope(): Painter = painterResource(LumeLucideResources.drawable.telescope)

  /**
   * Returns a `Painter` for the `tent` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/tent
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun tent(): Painter = painterResource(LumeLucideResources.drawable.tent)

  /**
   * Returns a `Painter` for the `tent_tree` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/tent-tree
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun tentTree(): Painter = painterResource(LumeLucideResources.drawable.tent_tree)

  /**
   * Returns a `Painter` for the `terminal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/terminal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun terminal(): Painter = painterResource(LumeLucideResources.drawable.terminal)

  /**
   * Returns a `Painter` for the `test_tube` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/test-tube
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun testTube(): Painter = painterResource(LumeLucideResources.drawable.test_tube)

  /**
   * Returns a `Painter` for the `test_tube_diagonal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/test-tube-diagonal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun testTubeDiagonal(): Painter = painterResource(LumeLucideResources.drawable.test_tube_diagonal)

  /**
   * Returns a `Painter` for the `test_tubes` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/test-tubes
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun testTubes(): Painter = painterResource(LumeLucideResources.drawable.test_tubes)

  /**
   * Returns a `Painter` for the `text_align_center` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/text-align-center
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun textAlignCenter(): Painter = painterResource(LumeLucideResources.drawable.text_align_center)

  /**
   * Returns a `Painter` for the `text_align_end` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/text-align-end
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun textAlignEnd(): Painter = painterResource(LumeLucideResources.drawable.text_align_end)

  /**
   * Returns a `Painter` for the `text_align_justify` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/text-align-justify
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun textAlignJustify(): Painter = painterResource(LumeLucideResources.drawable.text_align_justify)

  /**
   * Returns a `Painter` for the `text_align_start` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/text-align-start
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun textAlignStart(): Painter = painterResource(LumeLucideResources.drawable.text_align_start)

  /**
   * Returns a `Painter` for the `text_cursor` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/text-cursor
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun textCursor(): Painter = painterResource(LumeLucideResources.drawable.text_cursor)

  /**
   * Returns a `Painter` for the `text_cursor_input` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/text-cursor-input
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun textCursorInput(): Painter = painterResource(LumeLucideResources.drawable.text_cursor_input)

  /**
   * Returns a `Painter` for the `text_initial` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/text-initial
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun textInitial(): Painter = painterResource(LumeLucideResources.drawable.text_initial)

  /**
   * Returns a `Painter` for the `text_quote` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/text-quote
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun textQuote(): Painter = painterResource(LumeLucideResources.drawable.text_quote)

  /**
   * Returns a `Painter` for the `text_search` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/text-search
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun textSearch(): Painter = painterResource(LumeLucideResources.drawable.text_search)

  /**
   * Returns a `Painter` for the `text_wrap` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/text-wrap
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun textWrap(): Painter = painterResource(LumeLucideResources.drawable.text_wrap)

  /**
   * Returns a `Painter` for the `theater` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/theater
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun theater(): Painter = painterResource(LumeLucideResources.drawable.theater)

  /**
   * Returns a `Painter` for the `thermometer` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/thermometer
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun thermometer(): Painter = painterResource(LumeLucideResources.drawable.thermometer)

  /**
   * Returns a `Painter` for the `thermometer_snowflake` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/thermometer-snowflake
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun thermometerSnowflake(): Painter = painterResource(LumeLucideResources.drawable.thermometer_snowflake)

  /**
   * Returns a `Painter` for the `thermometer_sun` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/thermometer-sun
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun thermometerSun(): Painter = painterResource(LumeLucideResources.drawable.thermometer_sun)

  /**
   * Returns a `Painter` for the `thumbs_down` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/thumbs-down
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun thumbsDown(): Painter = painterResource(LumeLucideResources.drawable.thumbs_down)

  /**
   * Returns a `Painter` for the `thumbs_up` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/thumbs-up
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun thumbsUp(): Painter = painterResource(LumeLucideResources.drawable.thumbs_up)

  /**
   * Returns a `Painter` for the `ticket` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ticket
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun ticket(): Painter = painterResource(LumeLucideResources.drawable.ticket)

  /**
   * Returns a `Painter` for the `ticket_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ticket-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun ticketCheck(): Painter = painterResource(LumeLucideResources.drawable.ticket_check)

  /**
   * Returns a `Painter` for the `ticket_minus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ticket-minus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun ticketMinus(): Painter = painterResource(LumeLucideResources.drawable.ticket_minus)

  /**
   * Returns a `Painter` for the `ticket_percent` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ticket-percent
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun ticketPercent(): Painter = painterResource(LumeLucideResources.drawable.ticket_percent)

  /**
   * Returns a `Painter` for the `ticket_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ticket-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun ticketPlus(): Painter = painterResource(LumeLucideResources.drawable.ticket_plus)

  /**
   * Returns a `Painter` for the `ticket_slash` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ticket-slash
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun ticketSlash(): Painter = painterResource(LumeLucideResources.drawable.ticket_slash)

  /**
   * Returns a `Painter` for the `ticket_x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ticket-x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun ticketX(): Painter = painterResource(LumeLucideResources.drawable.ticket_x)

  /**
   * Returns a `Painter` for the `tickets` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/tickets
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun tickets(): Painter = painterResource(LumeLucideResources.drawable.tickets)

  /**
   * Returns a `Painter` for the `tickets_plane` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/tickets-plane
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun ticketsPlane(): Painter = painterResource(LumeLucideResources.drawable.tickets_plane)

  /**
   * Returns a `Painter` for the `timer` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/timer
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun timer(): Painter = painterResource(LumeLucideResources.drawable.timer)

  /**
   * Returns a `Painter` for the `timer_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/timer-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun timerOff(): Painter = painterResource(LumeLucideResources.drawable.timer_off)

  /**
   * Returns a `Painter` for the `timer_reset` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/timer-reset
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun timerReset(): Painter = painterResource(LumeLucideResources.drawable.timer_reset)

  /**
   * Returns a `Painter` for the `toggle_left` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/toggle-left
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun toggleLeft(): Painter = painterResource(LumeLucideResources.drawable.toggle_left)

  /**
   * Returns a `Painter` for the `toggle_right` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/toggle-right
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun toggleRight(): Painter = painterResource(LumeLucideResources.drawable.toggle_right)

  /**
   * Returns a `Painter` for the `toilet` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/toilet
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun toilet(): Painter = painterResource(LumeLucideResources.drawable.toilet)

  /**
   * Returns a `Painter` for the `tool_case` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/tool-case
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun toolCase(): Painter = painterResource(LumeLucideResources.drawable.tool_case)

  /**
   * Returns a `Painter` for the `toolbox` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/toolbox
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun toolbox(): Painter = painterResource(LumeLucideResources.drawable.toolbox)

  /**
   * Returns a `Painter` for the `tornado` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/tornado
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun tornado(): Painter = painterResource(LumeLucideResources.drawable.tornado)

  /**
   * Returns a `Painter` for the `torus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/torus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun torus(): Painter = painterResource(LumeLucideResources.drawable.torus)

  /**
   * Returns a `Painter` for the `touchpad` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/touchpad
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun touchpad(): Painter = painterResource(LumeLucideResources.drawable.touchpad)

  /**
   * Returns a `Painter` for the `touchpad_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/touchpad-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun touchpadOff(): Painter = painterResource(LumeLucideResources.drawable.touchpad_off)

  /**
   * Returns a `Painter` for the `towel_rack` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/towel-rack
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun towelRack(): Painter = painterResource(LumeLucideResources.drawable.towel_rack)

  /**
   * Returns a `Painter` for the `tower_control` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/tower-control
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun towerControl(): Painter = painterResource(LumeLucideResources.drawable.tower_control)

  /**
   * Returns a `Painter` for the `toy_brick` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/toy-brick
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun toyBrick(): Painter = painterResource(LumeLucideResources.drawable.toy_brick)

  /**
   * Returns a `Painter` for the `tractor` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/tractor
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun tractor(): Painter = painterResource(LumeLucideResources.drawable.tractor)

  /**
   * Returns a `Painter` for the `traffic_cone` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/traffic-cone
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun trafficCone(): Painter = painterResource(LumeLucideResources.drawable.traffic_cone)

  /**
   * Returns a `Painter` for the `train_front` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/train-front
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun trainFront(): Painter = painterResource(LumeLucideResources.drawable.train_front)

  /**
   * Returns a `Painter` for the `train_front_tunnel` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/train-front-tunnel
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun trainFrontTunnel(): Painter = painterResource(LumeLucideResources.drawable.train_front_tunnel)

  /**
   * Returns a `Painter` for the `train_track` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/train-track
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun trainTrack(): Painter = painterResource(LumeLucideResources.drawable.train_track)

  /**
   * Returns a `Painter` for the `tram_front` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/tram-front
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun tramFront(): Painter = painterResource(LumeLucideResources.drawable.tram_front)

  /**
   * Returns a `Painter` for the `transgender` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/transgender
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun transgender(): Painter = painterResource(LumeLucideResources.drawable.transgender)

  /**
   * Returns a `Painter` for the `trash` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/trash
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun trash(): Painter = painterResource(LumeLucideResources.drawable.trash)

  /**
   * Returns a `Painter` for the `trash_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/trash-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun trash2(): Painter = painterResource(LumeLucideResources.drawable.trash_2)

  /**
   * Returns a `Painter` for the `tree_deciduous` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/tree-deciduous
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun treeDeciduous(): Painter = painterResource(LumeLucideResources.drawable.tree_deciduous)

  /**
   * Returns a `Painter` for the `tree_palm` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/tree-palm
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun treePalm(): Painter = painterResource(LumeLucideResources.drawable.tree_palm)

  /**
   * Returns a `Painter` for the `tree_pine` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/tree-pine
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun treePine(): Painter = painterResource(LumeLucideResources.drawable.tree_pine)

  /**
   * Returns a `Painter` for the `trees` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/trees
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun trees(): Painter = painterResource(LumeLucideResources.drawable.trees)

  /**
   * Returns a `Painter` for the `trending_down` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/trending-down
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun trendingDown(): Painter = painterResource(LumeLucideResources.drawable.trending_down)

  /**
   * Returns a `Painter` for the `trending_up` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/trending-up
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun trendingUp(): Painter = painterResource(LumeLucideResources.drawable.trending_up)

  /**
   * Returns a `Painter` for the `trending_up_down` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/trending-up-down
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun trendingUpDown(): Painter = painterResource(LumeLucideResources.drawable.trending_up_down)

  /**
   * Returns a `Painter` for the `triangle` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/triangle
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun triangle(): Painter = painterResource(LumeLucideResources.drawable.triangle)

  /**
   * Returns a `Painter` for the `triangle_alert` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/triangle-alert
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun triangleAlert(): Painter = painterResource(LumeLucideResources.drawable.triangle_alert)

  /**
   * Returns a `Painter` for the `triangle_dashed` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/triangle-dashed
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun triangleDashed(): Painter = painterResource(LumeLucideResources.drawable.triangle_dashed)

  /**
   * Returns a `Painter` for the `triangle_right` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/triangle-right
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun triangleRight(): Painter = painterResource(LumeLucideResources.drawable.triangle_right)

  /**
   * Returns a `Painter` for the `trophy` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/trophy
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun trophy(): Painter = painterResource(LumeLucideResources.drawable.trophy)

  /**
   * Returns a `Painter` for the `truck` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/truck
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun truck(): Painter = painterResource(LumeLucideResources.drawable.truck)

  /**
   * Returns a `Painter` for the `truck_electric` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/truck-electric
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun truckElectric(): Painter = painterResource(LumeLucideResources.drawable.truck_electric)

  /**
   * Returns a `Painter` for the `turkish_lira` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/turkish-lira
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun turkishLira(): Painter = painterResource(LumeLucideResources.drawable.turkish_lira)

  /**
   * Returns a `Painter` for the `turntable` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/turntable
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun turntable(): Painter = painterResource(LumeLucideResources.drawable.turntable)

  /**
   * Returns a `Painter` for the `turtle` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/turtle
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun turtle(): Painter = painterResource(LumeLucideResources.drawable.turtle)

  /**
   * Returns a `Painter` for the `tv` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/tv
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun tv(): Painter = painterResource(LumeLucideResources.drawable.tv)

  /**
   * Returns a `Painter` for the `tv_minimal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/tv-minimal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun tvMinimal(): Painter = painterResource(LumeLucideResources.drawable.tv_minimal)

  /**
   * Returns a `Painter` for the `tv_minimal_play` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/tv-minimal-play
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun tvMinimalPlay(): Painter = painterResource(LumeLucideResources.drawable.tv_minimal_play)

  /**
   * Returns a `Painter` for the `type` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/type
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun type(): Painter = painterResource(LumeLucideResources.drawable.type)

  /**
   * Returns a `Painter` for the `type_outline` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/type-outline
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun typeOutline(): Painter = painterResource(LumeLucideResources.drawable.type_outline)

  /**
   * Returns a `Painter` for the `umbrella` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/umbrella
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun umbrella(): Painter = painterResource(LumeLucideResources.drawable.umbrella)

  /**
   * Returns a `Painter` for the `umbrella_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/umbrella-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun umbrellaOff(): Painter = painterResource(LumeLucideResources.drawable.umbrella_off)

  /**
   * Returns a `Painter` for the `underline` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/underline
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun underline(): Painter = painterResource(LumeLucideResources.drawable.underline)

  /**
   * Returns a `Painter` for the `undo` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/undo
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun undo(): Painter = painterResource(LumeLucideResources.drawable.undo)

  /**
   * Returns a `Painter` for the `undo_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/undo-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun undo2(): Painter = painterResource(LumeLucideResources.drawable.undo_2)

  /**
   * Returns a `Painter` for the `undo_dot` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/undo-dot
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun undoDot(): Painter = painterResource(LumeLucideResources.drawable.undo_dot)

  /**
   * Returns a `Painter` for the `unfold_horizontal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/unfold-horizontal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun unfoldHorizontal(): Painter = painterResource(LumeLucideResources.drawable.unfold_horizontal)

  /**
   * Returns a `Painter` for the `unfold_vertical` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/unfold-vertical
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun unfoldVertical(): Painter = painterResource(LumeLucideResources.drawable.unfold_vertical)

  /**
   * Returns a `Painter` for the `ungroup` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/ungroup
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun ungroup(): Painter = painterResource(LumeLucideResources.drawable.ungroup)

  /**
   * Returns a `Painter` for the `university` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/university
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun university(): Painter = painterResource(LumeLucideResources.drawable.university)

  /**
   * Returns a `Painter` for the `unlink` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/unlink
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun unlink(): Painter = painterResource(LumeLucideResources.drawable.unlink)

  /**
   * Returns a `Painter` for the `unlink_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/unlink-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun unlink2(): Painter = painterResource(LumeLucideResources.drawable.unlink_2)

  /**
   * Returns a `Painter` for the `unplug` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/unplug
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun unplug(): Painter = painterResource(LumeLucideResources.drawable.unplug)

  /**
   * Returns a `Painter` for the `upload` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/upload
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun upload(): Painter = painterResource(LumeLucideResources.drawable.upload)

  /**
   * Returns a `Painter` for the `usb` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/usb
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun usb(): Painter = painterResource(LumeLucideResources.drawable.usb)

  /**
   * Returns a `Painter` for the `user` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/user
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun user(): Painter = painterResource(LumeLucideResources.drawable.user)

  /**
   * Returns a `Painter` for the `user_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/user-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun userCheck(): Painter = painterResource(LumeLucideResources.drawable.user_check)

  /**
   * Returns a `Painter` for the `user_cog` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/user-cog
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun userCog(): Painter = painterResource(LumeLucideResources.drawable.user_cog)

  /**
   * Returns a `Painter` for the `user_key` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/user-key
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun userKey(): Painter = painterResource(LumeLucideResources.drawable.user_key)

  /**
   * Returns a `Painter` for the `user_lock` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/user-lock
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun userLock(): Painter = painterResource(LumeLucideResources.drawable.user_lock)

  /**
   * Returns a `Painter` for the `user_minus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/user-minus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun userMinus(): Painter = painterResource(LumeLucideResources.drawable.user_minus)

  /**
   * Returns a `Painter` for the `user_pen` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/user-pen
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun userPen(): Painter = painterResource(LumeLucideResources.drawable.user_pen)

  /**
   * Returns a `Painter` for the `user_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/user-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun userPlus(): Painter = painterResource(LumeLucideResources.drawable.user_plus)

  /**
   * Returns a `Painter` for the `user_round` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/user-round
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun userRound(): Painter = painterResource(LumeLucideResources.drawable.user_round)

  /**
   * Returns a `Painter` for the `user_round_check` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/user-round-check
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun userRoundCheck(): Painter = painterResource(LumeLucideResources.drawable.user_round_check)

  /**
   * Returns a `Painter` for the `user_round_cog` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/user-round-cog
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun userRoundCog(): Painter = painterResource(LumeLucideResources.drawable.user_round_cog)

  /**
   * Returns a `Painter` for the `user_round_key` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/user-round-key
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun userRoundKey(): Painter = painterResource(LumeLucideResources.drawable.user_round_key)

  /**
   * Returns a `Painter` for the `user_round_minus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/user-round-minus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun userRoundMinus(): Painter = painterResource(LumeLucideResources.drawable.user_round_minus)

  /**
   * Returns a `Painter` for the `user_round_pen` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/user-round-pen
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun userRoundPen(): Painter = painterResource(LumeLucideResources.drawable.user_round_pen)

  /**
   * Returns a `Painter` for the `user_round_plus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/user-round-plus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun userRoundPlus(): Painter = painterResource(LumeLucideResources.drawable.user_round_plus)

  /**
   * Returns a `Painter` for the `user_round_search` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/user-round-search
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun userRoundSearch(): Painter = painterResource(LumeLucideResources.drawable.user_round_search)

  /**
   * Returns a `Painter` for the `user_round_x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/user-round-x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun userRoundX(): Painter = painterResource(LumeLucideResources.drawable.user_round_x)

  /**
   * Returns a `Painter` for the `user_search` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/user-search
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun userSearch(): Painter = painterResource(LumeLucideResources.drawable.user_search)

  /**
   * Returns a `Painter` for the `user_star` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/user-star
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun userStar(): Painter = painterResource(LumeLucideResources.drawable.user_star)

  /**
   * Returns a `Painter` for the `user_x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/user-x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun userX(): Painter = painterResource(LumeLucideResources.drawable.user_x)

  /**
   * Returns a `Painter` for the `users` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/users
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun users(): Painter = painterResource(LumeLucideResources.drawable.users)

  /**
   * Returns a `Painter` for the `users_round` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/users-round
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun usersRound(): Painter = painterResource(LumeLucideResources.drawable.users_round)

  /**
   * Returns a `Painter` for the `utensils` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/utensils
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun utensils(): Painter = painterResource(LumeLucideResources.drawable.utensils)

  /**
   * Returns a `Painter` for the `utensils_crossed` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/utensils-crossed
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun utensilsCrossed(): Painter = painterResource(LumeLucideResources.drawable.utensils_crossed)

  /**
   * Returns a `Painter` for the `utility_pole` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/utility-pole
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun utilityPole(): Painter = painterResource(LumeLucideResources.drawable.utility_pole)

  /**
   * Returns a `Painter` for the `van` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/van
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun van(): Painter = painterResource(LumeLucideResources.drawable.van)

  /**
   * Returns a `Painter` for the `variable` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/variable
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun variable(): Painter = painterResource(LumeLucideResources.drawable.variable)

  /**
   * Returns a `Painter` for the `vault` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/vault
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun vault(): Painter = painterResource(LumeLucideResources.drawable.vault)

  /**
   * Returns a `Painter` for the `vector_square` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/vector-square
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun vectorSquare(): Painter = painterResource(LumeLucideResources.drawable.vector_square)

  /**
   * Returns a `Painter` for the `vegan` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/vegan
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun vegan(): Painter = painterResource(LumeLucideResources.drawable.vegan)

  /**
   * Returns a `Painter` for the `venetian_mask` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/venetian-mask
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun venetianMask(): Painter = painterResource(LumeLucideResources.drawable.venetian_mask)

  /**
   * Returns a `Painter` for the `venus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/venus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun venus(): Painter = painterResource(LumeLucideResources.drawable.venus)

  /**
   * Returns a `Painter` for the `venus_and_mars` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/venus-and-mars
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun venusAndMars(): Painter = painterResource(LumeLucideResources.drawable.venus_and_mars)

  /**
   * Returns a `Painter` for the `vibrate` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/vibrate
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun vibrate(): Painter = painterResource(LumeLucideResources.drawable.vibrate)

  /**
   * Returns a `Painter` for the `vibrate_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/vibrate-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun vibrateOff(): Painter = painterResource(LumeLucideResources.drawable.vibrate_off)

  /**
   * Returns a `Painter` for the `video` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/video
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun video(): Painter = painterResource(LumeLucideResources.drawable.video)

  /**
   * Returns a `Painter` for the `video_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/video-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun videoOff(): Painter = painterResource(LumeLucideResources.drawable.video_off)

  /**
   * Returns a `Painter` for the `videotape` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/videotape
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun videotape(): Painter = painterResource(LumeLucideResources.drawable.videotape)

  /**
   * Returns a `Painter` for the `view` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/view
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun view(): Painter = painterResource(LumeLucideResources.drawable.view)

  /**
   * Returns a `Painter` for the `voicemail` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/voicemail
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun voicemail(): Painter = painterResource(LumeLucideResources.drawable.voicemail)

  /**
   * Returns a `Painter` for the `volleyball` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/volleyball
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun volleyball(): Painter = painterResource(LumeLucideResources.drawable.volleyball)

  /**
   * Returns a `Painter` for the `volume` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/volume
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun volume(): Painter = painterResource(LumeLucideResources.drawable.volume)

  /**
   * Returns a `Painter` for the `volume_1` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/volume-1
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun volume1(): Painter = painterResource(LumeLucideResources.drawable.volume_1)

  /**
   * Returns a `Painter` for the `volume_2` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/volume-2
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun volume2(): Painter = painterResource(LumeLucideResources.drawable.volume_2)

  /**
   * Returns a `Painter` for the `volume_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/volume-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun volumeOff(): Painter = painterResource(LumeLucideResources.drawable.volume_off)

  /**
   * Returns a `Painter` for the `volume_x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/volume-x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun volumeX(): Painter = painterResource(LumeLucideResources.drawable.volume_x)

  /**
   * Returns a `Painter` for the `vote` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/vote
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun vote(): Painter = painterResource(LumeLucideResources.drawable.vote)

  /**
   * Returns a `Painter` for the `wallet` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/wallet
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun wallet(): Painter = painterResource(LumeLucideResources.drawable.wallet)

  /**
   * Returns a `Painter` for the `wallet_cards` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/wallet-cards
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun walletCards(): Painter = painterResource(LumeLucideResources.drawable.wallet_cards)

  /**
   * Returns a `Painter` for the `wallet_minimal` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/wallet-minimal
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun walletMinimal(): Painter = painterResource(LumeLucideResources.drawable.wallet_minimal)

  /**
   * Returns a `Painter` for the `wallpaper` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/wallpaper
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun wallpaper(): Painter = painterResource(LumeLucideResources.drawable.wallpaper)

  /**
   * Returns a `Painter` for the `wand` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/wand
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun wand(): Painter = painterResource(LumeLucideResources.drawable.wand)

  /**
   * Returns a `Painter` for the `wand_sparkles` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/wand-sparkles
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun wandSparkles(): Painter = painterResource(LumeLucideResources.drawable.wand_sparkles)

  /**
   * Returns a `Painter` for the `warehouse` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/warehouse
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun warehouse(): Painter = painterResource(LumeLucideResources.drawable.warehouse)

  /**
   * Returns a `Painter` for the `washing_machine` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/washing-machine
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun washingMachine(): Painter = painterResource(LumeLucideResources.drawable.washing_machine)

  /**
   * Returns a `Painter` for the `watch` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/watch
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun watch(): Painter = painterResource(LumeLucideResources.drawable.watch)

  /**
   * Returns a `Painter` for the `waves` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/waves
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun waves(): Painter = painterResource(LumeLucideResources.drawable.waves)

  /**
   * Returns a `Painter` for the `waves_arrow_down` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/waves-arrow-down
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun wavesArrowDown(): Painter = painterResource(LumeLucideResources.drawable.waves_arrow_down)

  /**
   * Returns a `Painter` for the `waves_arrow_up` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/waves-arrow-up
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun wavesArrowUp(): Painter = painterResource(LumeLucideResources.drawable.waves_arrow_up)

  /**
   * Returns a `Painter` for the `waves_ladder` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/waves-ladder
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun wavesLadder(): Painter = painterResource(LumeLucideResources.drawable.waves_ladder)

  /**
   * Returns a `Painter` for the `waypoints` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/waypoints
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun waypoints(): Painter = painterResource(LumeLucideResources.drawable.waypoints)

  /**
   * Returns a `Painter` for the `webcam` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/webcam
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun webcam(): Painter = painterResource(LumeLucideResources.drawable.webcam)

  /**
   * Returns a `Painter` for the `webhook` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/webhook
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun webhook(): Painter = painterResource(LumeLucideResources.drawable.webhook)

  /**
   * Returns a `Painter` for the `webhook_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/webhook-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun webhookOff(): Painter = painterResource(LumeLucideResources.drawable.webhook_off)

  /**
   * Returns a `Painter` for the `weight` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/weight
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun weight(): Painter = painterResource(LumeLucideResources.drawable.weight)

  /**
   * Returns a `Painter` for the `weight_tilde` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/weight-tilde
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun weightTilde(): Painter = painterResource(LumeLucideResources.drawable.weight_tilde)

  /**
   * Returns a `Painter` for the `wheat` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/wheat
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun wheat(): Painter = painterResource(LumeLucideResources.drawable.wheat)

  /**
   * Returns a `Painter` for the `wheat_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/wheat-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun wheatOff(): Painter = painterResource(LumeLucideResources.drawable.wheat_off)

  /**
   * Returns a `Painter` for the `whole_word` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/whole-word
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun wholeWord(): Painter = painterResource(LumeLucideResources.drawable.whole_word)

  /**
   * Returns a `Painter` for the `wifi` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/wifi
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun wifi(): Painter = painterResource(LumeLucideResources.drawable.wifi)

  /**
   * Returns a `Painter` for the `wifi_cog` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/wifi-cog
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun wifiCog(): Painter = painterResource(LumeLucideResources.drawable.wifi_cog)

  /**
   * Returns a `Painter` for the `wifi_high` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/wifi-high
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun wifiHigh(): Painter = painterResource(LumeLucideResources.drawable.wifi_high)

  /**
   * Returns a `Painter` for the `wifi_low` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/wifi-low
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun wifiLow(): Painter = painterResource(LumeLucideResources.drawable.wifi_low)

  /**
   * Returns a `Painter` for the `wifi_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/wifi-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun wifiOff(): Painter = painterResource(LumeLucideResources.drawable.wifi_off)

  /**
   * Returns a `Painter` for the `wifi_pen` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/wifi-pen
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun wifiPen(): Painter = painterResource(LumeLucideResources.drawable.wifi_pen)

  /**
   * Returns a `Painter` for the `wifi_sync` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/wifi-sync
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun wifiSync(): Painter = painterResource(LumeLucideResources.drawable.wifi_sync)

  /**
   * Returns a `Painter` for the `wifi_zero` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/wifi-zero
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun wifiZero(): Painter = painterResource(LumeLucideResources.drawable.wifi_zero)

  /**
   * Returns a `Painter` for the `wind` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/wind
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun wind(): Painter = painterResource(LumeLucideResources.drawable.wind)

  /**
   * Returns a `Painter` for the `wind_arrow_down` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/wind-arrow-down
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun windArrowDown(): Painter = painterResource(LumeLucideResources.drawable.wind_arrow_down)

  /**
   * Returns a `Painter` for the `wine` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/wine
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun wine(): Painter = painterResource(LumeLucideResources.drawable.wine)

  /**
   * Returns a `Painter` for the `wine_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/wine-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun wineOff(): Painter = painterResource(LumeLucideResources.drawable.wine_off)

  /**
   * Returns a `Painter` for the `workflow` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/workflow
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun workflow(): Painter = painterResource(LumeLucideResources.drawable.workflow)

  /**
   * Returns a `Painter` for the `worm` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/worm
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun worm(): Painter = painterResource(LumeLucideResources.drawable.worm)

  /**
   * Returns a `Painter` for the `wrench` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/wrench
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun wrench(): Painter = painterResource(LumeLucideResources.drawable.wrench)

  /**
   * Returns a `Painter` for the `x` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/x
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun x(): Painter = painterResource(LumeLucideResources.drawable.x)

  /**
   * Returns a `Painter` for the `x_line_top` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/x-line-top
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun xLineTop(): Painter = painterResource(LumeLucideResources.drawable.x_line_top)

  /**
   * Returns a `Painter` for the `zap` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/zap
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun zap(): Painter = painterResource(LumeLucideResources.drawable.zap)

  /**
   * Returns a `Painter` for the `zap_off` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/zap-off
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun zapOff(): Painter = painterResource(LumeLucideResources.drawable.zap_off)

  /**
   * Returns a `Painter` for the `zodiac_aquarius` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/zodiac-aquarius
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun zodiacAquarius(): Painter = painterResource(LumeLucideResources.drawable.zodiac_aquarius)

  /**
   * Returns a `Painter` for the `zodiac_aries` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/zodiac-aries
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun zodiacAries(): Painter = painterResource(LumeLucideResources.drawable.zodiac_aries)

  /**
   * Returns a `Painter` for the `zodiac_cancer` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/zodiac-cancer
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun zodiacCancer(): Painter = painterResource(LumeLucideResources.drawable.zodiac_cancer)

  /**
   * Returns a `Painter` for the `zodiac_capricorn` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/zodiac-capricorn
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun zodiacCapricorn(): Painter = painterResource(LumeLucideResources.drawable.zodiac_capricorn)

  /**
   * Returns a `Painter` for the `zodiac_gemini` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/zodiac-gemini
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun zodiacGemini(): Painter = painterResource(LumeLucideResources.drawable.zodiac_gemini)

  /**
   * Returns a `Painter` for the `zodiac_leo` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/zodiac-leo
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun zodiacLeo(): Painter = painterResource(LumeLucideResources.drawable.zodiac_leo)

  /**
   * Returns a `Painter` for the `zodiac_libra` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/zodiac-libra
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun zodiacLibra(): Painter = painterResource(LumeLucideResources.drawable.zodiac_libra)

  /**
   * Returns a `Painter` for the `zodiac_ophiuchus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/zodiac-ophiuchus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun zodiacOphiuchus(): Painter = painterResource(LumeLucideResources.drawable.zodiac_ophiuchus)

  /**
   * Returns a `Painter` for the `zodiac_pisces` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/zodiac-pisces
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun zodiacPisces(): Painter = painterResource(LumeLucideResources.drawable.zodiac_pisces)

  /**
   * Returns a `Painter` for the `zodiac_sagittarius` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/zodiac-sagittarius
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun zodiacSagittarius(): Painter = painterResource(LumeLucideResources.drawable.zodiac_sagittarius)

  /**
   * Returns a `Painter` for the `zodiac_scorpio` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/zodiac-scorpio
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun zodiacScorpio(): Painter = painterResource(LumeLucideResources.drawable.zodiac_scorpio)

  /**
   * Returns a `Painter` for the `zodiac_taurus` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/zodiac-taurus
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun zodiacTaurus(): Painter = painterResource(LumeLucideResources.drawable.zodiac_taurus)

  /**
   * Returns a `Painter` for the `zodiac_virgo` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/zodiac-virgo
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun zodiacVirgo(): Painter = painterResource(LumeLucideResources.drawable.zodiac_virgo)

  /**
   * Returns a `Painter` for the `zoom_in` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/zoom-in
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun zoomIn(): Painter = painterResource(LumeLucideResources.drawable.zoom_in)

  /**
   * Returns a `Painter` for the `zoom_out` icon.
   *
   * For more information see the official icon documentation: https://lucide.dev/icons/zoom-out
   *
   * @return The `Painter` for the icon.
   * @since 1.0.0
   */
  @Composable
  public fun zoomOut(): Painter = painterResource(LumeLucideResources.drawable.zoom_out)
}
