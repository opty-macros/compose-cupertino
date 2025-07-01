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



package com.slapps.cupertino.theme

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.slapps.cupertino.InternalCupertinoApi

@Stable
class Shapes(
    val extraSmall: ScalableRoundedShape = ShapeDefaults.ExtraSmall,
    val small: ScalableRoundedShape = ShapeDefaults.Small,
    val medium: ScalableRoundedShape = ShapeDefaults.Medium,
    val large: ScalableRoundedShape = ShapeDefaults.Large,
    val extraLarge: ScalableRoundedShape = ShapeDefaults.ExtraLarge,
) {
    fun copy(
        extraSmall: ScalableRoundedShape = this.extraSmall,
        small: ScalableRoundedShape = this.small,
        medium: ScalableRoundedShape = this.medium,
        large: ScalableRoundedShape = this.large,
        extraLarge: ScalableRoundedShape = this.extraLarge,
    ) = Shapes(
        extraSmall = extraSmall,
        small = small,
        medium = medium,
        large = large,
        extraLarge = extraLarge,
    )
}

@InternalCupertinoApi
val LocalShapes = staticCompositionLocalOf { Shapes() }

@Immutable
object ShapeDefaults {
    /** Extra small sized corner shape */
    val ExtraSmall: ScalableRoundedShape = ScalableRoundedShape(4.dp)

    /** Small sized corner shape */
    val Small: ScalableRoundedShape = ScalableRoundedShape(8.dp)

    /** Medium sized corner shape */
    val Medium: ScalableRoundedShape = ScalableRoundedShape(12.dp)

    /** Large sized corner shape */
    val Large: ScalableRoundedShape = ScalableRoundedShape(16.dp)

    /** Extra large sized corner shape */
    val ExtraLarge: ScalableRoundedShape = ScalableRoundedShape(24.dp)
}


/**
 * A data class representing a scalable rounded shape with customizable corner radii.
 *
 * This class allows defining the corner radii values for all four corners of a shape
 * and provides a mechanism to scale these values proportionally using a scaling factor.
 *
 * @constructor Creates a [ScalableRoundedShape] with specific corner radius values for each corner.
 * - [topStart]: Top-start corner radius.
 * - [topEnd]: Top-end corner radius.
 * - [bottomEnd]: Bottom-end corner radius.
 * - [bottomStart]: Bottom-start corner radius.
 *
 * Alternatively, initializes all corner radii to the same value using the secondary constructor [constructor(all)].
 *
 * @property originalShape Returns the original [RoundedCornerShape] with scaling factor set to 1.
 */
data class ScalableRoundedShape(
    private val topStart: Dp,
    private val topEnd: Dp,
    private val bottomEnd: Dp,
    private val bottomStart: Dp,
) {
    constructor(all: Dp) : this(all, all, all, all)

    fun scaled(factor: Float): RoundedCornerShape {
        return RoundedCornerShape(
            topStart = topStart * factor,
            topEnd = topEnd * factor,
            bottomStart = bottomStart * factor,
            bottomEnd = bottomEnd * factor,
        )
    }

    val originalShape: RoundedCornerShape
        get() = scaled(1f)

    companion object {
        /**
         * Creates a [ScalableRoundedShape] with all corners having the same radius in Float.
         */
        fun fromFloat(all: Float): ScalableRoundedShape = ScalableRoundedShape(all.dp)

        /**
         * Creates a [ScalableRoundedShape] with specific corner radius values in Float.
         */
        fun fromFloat(
            topStart: Float,
            topEnd: Float,
            bottomEnd: Float,
            bottomStart: Float,
        ): ScalableRoundedShape = ScalableRoundedShape(
            topStart.dp,
            topEnd.dp,
            bottomEnd.dp,
            bottomStart.dp
        )
    }
}

@Composable
fun RoundedCornerShape.toScalableShape(
    size: Size = with(LocalDensity.current) { Size(100.dp.toPx(), 100.dp.toPx()) }
): ScalableRoundedShape {
    val density = LocalDensity.current

    return ScalableRoundedShape(
        topStart = topStart.toDp(size, density),
        topEnd = topEnd.toDp(size, density),
        bottomEnd = bottomEnd.toDp(size, density),
        bottomStart = bottomStart.toDp(size, density),
    )
}

/**
 * Non-composable version that requires explicit density.
 */
fun CornerBasedShape.toScalableShape(
    density: Density,
    size: Size = with(density) { Size(100.dp.toPx(), 100.dp.toPx()) }
): ScalableRoundedShape {
    return ScalableRoundedShape(
        topStart = topStart.toDp(size, density),
        topEnd = topEnd.toDp(size, density),
        bottomEnd = bottomEnd.toDp(size, density),
        bottomStart = bottomStart.toDp(size, density),
    )
}

/**
 * Helper extension to convert CornerSize to Dp
 */
private fun CornerSize.toDp(size: Size, density: Density): Dp {
    val pixels = this.toPx(size, density)
    return with(density) { pixels.toDp() }
}
