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

package com.slapps.cupertino.adaptive

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import com.slapps.cupertino.CupertinoIcon
import com.slapps.cupertino.CupertinoText
import com.slapps.cupertino.LocalContentColorProvider
import com.slapps.cupertino.LocalTextStyleProvider
import com.slapps.cupertino.theme.CupertinoTheme
import androidx.compose.material3.ColorScheme as MaterialColorScheme
import androidx.compose.material3.LocalContentColor as MaterialLocalContentColor
import androidx.compose.material3.LocalTextStyle as MaterialLocalTextStyle
import androidx.compose.material3.Shapes as MaterialShapes
import androidx.compose.material3.Typography as MaterialTypography
import androidx.compose.material3.lightColorScheme as materialLightColorScheme
import com.slapps.cupertino.theme.ColorScheme as CupertinoColorScheme
import com.slapps.cupertino.theme.Shapes as CupertinoShapes
import com.slapps.cupertino.theme.Typography as CupertinoTypography
import com.slapps.cupertino.theme.lightColorScheme as cupertinoLightColorScheme

enum class Theme {
    Cupertino,
    Material3,
}

/**
 * Adaptive theme depending on [target]. It allows to seamlessly use Material and Cupertino widgets.
 *
 * This theme also make [Text] <-> [CupertinoText] and [Icon] <-> [CupertinoIcon] behave identically
 *
 * Current theme target can be accessed inside the [content] using [currentTheme] property
 *
 * @param target theme for adaptive widgets
 * @param material [MaterialTheme] specification
 * @param cupertino [CupertinoTheme] specification
 * @param content themed content
 * */
@ExperimentalAdaptiveApi
@Composable
fun AdaptiveTheme(
    target: Theme = DefaultTheme,
    material: MaterialThemeSpec = MaterialThemeSpec.Default(),
    cupertino: CupertinoThemeSpec = CupertinoThemeSpec.Default(),
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalTheme provides target,
        LocalContentColorProvider provides MaterialLocalContentColor,
        LocalTextStyleProvider provides MaterialLocalTextStyle,
    ) {
        when (LocalTheme.current) {
            Theme.Cupertino -> {
                MaterialTheme(
                    colorScheme = material.colorScheme,
                    shapes = material.shapes,
                    typography = material.typography,
                ) {
                    CupertinoTheme(
                        colorScheme = cupertino.colorScheme,
                        shapes = cupertino.shapes,
                        typography = cupertino.typography,
                        content = content,
                    )
                }
            }

            Theme.Material3 -> {
                CupertinoTheme(
                    colorScheme = cupertino.colorScheme,
                    shapes = cupertino.shapes,
                    typography = cupertino.typography,
                ) {
                    MaterialTheme(
                        colorScheme = material.colorScheme,
                        shapes = material.shapes,
                        typography = material.typography,
                        content = content,
                    )
                }
            }
        }
    }
}

@Immutable
@ExperimentalAdaptiveApi
class MaterialThemeSpec(
    val colorScheme: MaterialColorScheme = materialLightColorScheme(),
    val shapes: MaterialShapes = MaterialShapes(),
    val typography: MaterialTypography = MaterialTypography(),
) {
    fun copy(
        colorScheme: MaterialColorScheme = this.colorScheme,
        shapes: MaterialShapes = this.shapes,
        typography: MaterialTypography = this.typography,
    ) = MaterialThemeSpec(
        colorScheme = colorScheme,
        shapes = shapes,
        typography = typography,
    )

    override fun toString(): String =
        "MaterialThemeSpec(colorScheme=$colorScheme, shapes=$shapes, typography=$typography)"

    companion object {
        @Composable
        fun Default(
            colorScheme: MaterialColorScheme = MaterialTheme.colorScheme,
            shapes: MaterialShapes = MaterialTheme.shapes,
            typography: MaterialTypography = MaterialTheme.typography,
        ) = MaterialThemeSpec(colorScheme, shapes, typography)
    }
}

@Immutable
@ExperimentalAdaptiveApi
class CupertinoThemeSpec(
    val colorScheme: CupertinoColorScheme = cupertinoLightColorScheme(),
    val shapes: CupertinoShapes = CupertinoShapes(),
    val typography: CupertinoTypography = CupertinoTypography(),
) {
    fun copy(
        colorScheme: CupertinoColorScheme = this.colorScheme,
        shapes: CupertinoShapes = this.shapes,
        typography: CupertinoTypography = this.typography,
    ) = CupertinoThemeSpec(
        colorScheme = colorScheme,
        shapes = shapes,
        typography = typography,
    )

    override fun toString(): String =
        "CupertinoThemeSpec(colorScheme=$colorScheme, shapes=$shapes, typography=$typography)"

    companion object {
        @Composable
        fun Default(
            colorScheme: CupertinoColorScheme = CupertinoTheme.colorScheme,
            shapes: CupertinoShapes = CupertinoTheme.shapes,
            typography: CupertinoTypography = CupertinoTheme.typography,
        ) = CupertinoThemeSpec(colorScheme, shapes, typography)
    }
}

/**
 * Theme declared as a target in [AdaptiveTheme]
 * */
@ExperimentalAdaptiveApi
val currentTheme: Theme
    @Composable
    get() = LocalTheme.current

internal expect val DefaultTheme: Theme

val LocalTheme =
    staticCompositionLocalOf<Theme> {
        error("Adaptive theme is not provided. Please add AdaptiveTheme { } to the root of your composable hierarchy")
    }
