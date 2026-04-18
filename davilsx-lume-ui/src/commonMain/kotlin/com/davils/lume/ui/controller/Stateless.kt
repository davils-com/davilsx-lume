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

public abstract class LumeStatelessController : ViewModel() {
    private val isInitialized = atomic(false)

    internal fun init() {
        if (isInitialized.compareAndSet(expect = false, update = true)) {
            onInit()
        }
    }

    internal fun dispose() {
        if (isInitialized.compareAndSet(expect = true, update = false)) {
            onDispose()
        }
    }

    override fun onCleared() {
        dispose()
        super.onCleared()
    }

    protected open fun onInit() {}
    protected open fun onDispose() {}
}

@Composable
public fun LumeStatelessController.rememberLifecycle() {
    DisposableEffect(this) {
        init()
        onDispose { dispose() }
    }
}
