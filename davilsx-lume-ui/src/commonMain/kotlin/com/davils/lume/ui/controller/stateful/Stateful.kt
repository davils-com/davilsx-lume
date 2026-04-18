/*
 * Copyright 2026 Davils
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.davils.lume.ui.controller.stateful

import com.davils.lume.ui.controller.LumeStatelessController
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

/**
 * Base class for stateful controllers in the Lume UI framework.
 *
 * This class extends [LumeStatelessController] and adds state management capabilities
 * using [MutableStateFlow]. It provides a reactive way to handle and update the
 * UI state.
 *
 * @param S The type of the state, which must implement [LumeControllerState].
 * @since 1.0.0
 */
public abstract class LumeStatefulController<S : LumeControllerState>(
    /**
     * The initial state of the controller.
     *
     * @since 1.0.0
     */
    private val initialState: S
) : LumeStatelessController() {
    /**
     * The internal mutable state flow.
     *
     * @since 1.0.0
     */
    private val _state: MutableStateFlow<S> = MutableStateFlow(initialState)

    /**
     * The public read-only state flow.
     *
     * UI components can collect this flow to reactively update when the state changes.
     *
     * @since 1.0.0
     */
    public val state: StateFlow<S> = _state.asStateFlow()

    /**
     * Returns the current state value.
     *
     * This is a snapshot of the current state held by the controller.
     *
     * @since 1.0.0
     */
    public val currentState: S
        get() = _state.value

    /**
     * Updates the state using a reducer function.
     *
     * The reducer takes the current state and returns a new state.
     * This operation is thread-safe.
     *
     * @param reducer A function that defines how to transform the current state into a new state.
     * @since 1.0.0
     */
    public fun update(reducer: (S) -> S) {
        _state.update(reducer)
    }

    /**
     * Updates the state to a specific new value.
     *
     * @param newState The new state to be set.
     * @since 1.0.0
     */
    public fun update(newState: S) {
        _state.value = newState
    }

    /**
     * Emits a new state to the flow.
     *
     * This is a suspending version of state update.
     *
     * @param newState The new state to emit.
     * @since 1.0.0
     */
    public suspend fun emit(newState: S) {
        _state.emit(newState)
    }

    /**
     * Updates the state using a reducer only if the predicate matches the current state.
     *
     * @param predicate A condition that must be met for the update to occur.
     * @param reducer A function that defines the state transformation.
     * @since 1.0.0
     */
    public fun updateIf(
        predicate: (S) -> Boolean,
        reducer: (S) -> S
    ) {
        update { current ->
            if (predicate(current)) reducer(current) else current
        }
    }

    /**
     * Updates the state to a new value only if the predicate matches the current state.
     *
     * @param predicate A condition that must be met for the update to occur.
     * @param newState The new state to be set.
     * @since 1.0.0
     */
    public fun updateIf(
        predicate: (S) -> Boolean,
        newState: S
    ) {
        updateIf(predicate) { newState }
    }

    /**
     * Resets the state to the [initialState].
     *
     * @since 1.0.0
     */
    public fun reset() {
        update { initialState }
    }
}
