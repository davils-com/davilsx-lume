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

package com.davils.lume.ui.controller

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.lifecycle.ViewModel
import kotlinx.atomicfu.atomic

/**
 * Base class for stateless controllers in the Lume UI framework.
 *
 * This class extends [ViewModel] and provides basic lifecycle management for controllers
 * that do not maintain internal observable state but still need initialization and
 * disposal logic.
 *
 * @since 1.0.0
 */
public abstract class LumeStatelessController : ViewModel() {
    /**
     * Atomic flag indicating whether the controller has been initialized.
     *
     * @since 1.0.0
     */
    private val isInitialized = atomic(false)

    /**
     * Initializes the controller if it hasn't been initialized yet.
     *
     * This method is internal and should typically be called via [rememberLifecycle].
     *
     * @since 1.0.0
     */
    internal fun init() {
        if (isInitialized.compareAndSet(expect = false, update = true)) {
            onInit()
        }
    }

    /**
     * Disposes of the controller's resources if it was initialized.
     *
     * This method is internal and should typically be called via [rememberLifecycle]
     * or automatically when the [ViewModel] is cleared.
     *
     * @since 1.0.0
     */
    internal fun dispose() {
        if (isInitialized.compareAndSet(expect = true, update = false)) {
            onDispose()
        }
    }

    /**
     * Called when the ViewModel is being cleared.
     *
     * Triggers the [dispose] logic to ensure resources are cleaned up.
     *
     * @since 1.0.0
     */
    override fun onCleared() {
        dispose()
        super.onCleared()
    }

    /**
     * Hook for initialization logic.
     *
     * Subclasses should override this method to perform setup tasks.
     * It is called exactly once when the controller is initialized.
     *
     * @since 1.0.0
     */
    protected open fun onInit() {}

    /**
     * Hook for disposal logic.
     *
     * Subclasses should override this method to perform cleanup tasks.
     * It is called when the controller is disposed or cleared.
     *
     * @since 1.0.0
     */
    protected open fun onDispose() {}
}

/**
 * Binds the [LumeStatelessController] lifecycle to a Composable's lifecycle.
 *
 * Uses [DisposableEffect] to call [LumeStatelessController.init] when the
 * Composable enters the composition and [LumeStatelessController.dispose]
 * when it leaves.
 *
 * @since 1.0.0
 */
@Composable
public fun LumeStatelessController.rememberLifecycle() {
    DisposableEffect(this) {
        init()
        onDispose { dispose() }
    }
}
