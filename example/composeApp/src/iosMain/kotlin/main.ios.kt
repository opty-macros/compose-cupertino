/*
 * Copyright (c) 2023-2024. Compose Cupertino project and open source contributors.
 * Copyright (c) 2025. Scott Lanoue.
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



import androidx.compose.runtime.ExperimentalComposeApi
import androidx.compose.ui.uikit.OnFocusBehavior
import androidx.compose.ui.window.ComposeUIViewController
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.essenty.lifecycle.LifecycleRegistry
import platform.UIKit.UIViewController

actual val IsIos: Boolean
    get() = true

fun RootComponent(lifecycleRegistry: LifecycleRegistry): RootComponent = DefaultRootComponent(DefaultComponentContext(lifecycleRegistry))

@OptIn(ExperimentalComposeApi::class)
fun MainViewController(component: RootComponent): UIViewController =
    ComposeUIViewController(
        configure = {
            onFocusBehavior = OnFocusBehavior.DoNothing
            platformLayers = false
        },
    ) {
        App(component)
    }
