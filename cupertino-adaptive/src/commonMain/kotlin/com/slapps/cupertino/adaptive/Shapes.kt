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

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.dp
import com.slapps.cupertino.theme.ScalableRoundedShape
import com.slapps.cupertino.theme.toScalableShape
import com.slapps.cupertino.theme.Shapes as CupertinoShapes
import androidx.compose.material3.Shapes as MaterialShapes
@Immutable
class Shapes(
    val extraSmall: ScalableRoundedShape = ScalableRoundedShape(4.dp),
    val small: ScalableRoundedShape = ScalableRoundedShape(8.dp),
    val medium: ScalableRoundedShape = ScalableRoundedShape(12.dp),
    val large: ScalableRoundedShape = ScalableRoundedShape(16.dp),
    val extraLarge: ScalableRoundedShape = ScalableRoundedShape(28.dp),
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
        extraLarge = extraLarge
    )
}

fun Shapes.toMaterial() : MaterialShapes = MaterialShapes(
    extraSmall = extraSmall.originalShape,
    small = small.originalShape,
    medium = medium.originalShape,
    large = large.originalShape,
    extraLarge = extraLarge.originalShape
)

fun Shapes.toCupertino() : CupertinoShapes = CupertinoShapes(
    extraSmall = extraSmall,
    small = small,
    medium = medium,
    large = large,
    extraLarge = extraLarge
)

fun CupertinoShapes.toMaterial() : MaterialShapes = MaterialShapes(
    extraSmall = extraSmall.originalShape,
    small = small.originalShape,
    medium = medium.originalShape,
    large = large.originalShape,
    extraLarge = extraLarge.originalShape
)

fun CupertinoShapes.toAdaptive() : Shapes = Shapes(
    extraSmall = extraSmall,
    small = small,
    medium = medium,
    large = large,
    extraLarge = extraLarge
)


