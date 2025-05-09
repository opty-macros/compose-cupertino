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



package com.slapps.cupertino.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.slapps.cupertino.icons.CupertinoIcons

val CupertinoIcons.Outlined.EllipsisMessage: ImageVector
    get() {
        if (_ellipsisMessage != null) {
            return _ellipsisMessage!!
        }
        _ellipsisMessage =
            Builder(
                name = "EllipsisMessage",
                defaultWidth = 26.5781.dp,
                defaultHeight = 24.5508.dp,
                viewportWidth = 26.5781f,
                viewportHeight =
                24.5508f,
            ).apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(5.0859f, 24.5508f)
                    curveTo(6.668f, 24.5508f, 9.9023f, 22.957f, 12.2812f, 21.2578f)
                    curveTo(20.4492f, 21.4805f, 26.5781f, 16.793f, 26.5781f, 10.6523f)
                    curveTo(26.5781f, 4.7578f, 20.6719f, 0.0f, 13.2891f, 0.0f)
                    curveTo(5.9063f, 0.0f, 0.0f, 4.7578f, 0.0f, 10.6523f)
                    curveTo(0.0f, 14.4961f, 2.4609f, 17.9062f, 6.1641f, 19.6172f)
                    curveTo(5.6367f, 20.6367f, 4.6523f, 22.0195f, 4.125f, 22.7109f)
                    curveTo(3.5039f, 23.5312f, 3.8789f, 24.5508f, 5.0859f, 24.5508f)
                    close()
                    moveTo(6.3164f, 22.6055f)
                    curveTo(6.2227f, 22.6406f, 6.1875f, 22.5703f, 6.2461f, 22.4883f)
                    curveTo(6.9023f, 21.6797f, 7.8398f, 20.4609f, 8.2383f, 19.7109f)
                    curveTo(8.5664f, 19.1016f, 8.4844f, 18.5625f, 7.7344f, 18.2109f)
                    curveTo(4.0547f, 16.5f, 1.9453f, 13.7695f, 1.9453f, 10.6523f)
                    curveTo(1.9453f, 5.8477f, 6.9727f, 1.9336f, 13.2891f, 1.9336f)
                    curveTo(19.6172f, 1.9336f, 24.6445f, 5.8477f, 24.6445f, 10.6523f)
                    curveTo(24.6445f, 15.4453f, 19.6172f, 19.3594f, 13.2891f, 19.3594f)
                    curveTo(13.0547f, 19.3594f, 12.6914f, 19.3477f, 12.2227f, 19.3359f)
                    curveTo(11.7305f, 19.3359f, 11.3555f, 19.4883f, 10.9102f, 19.8398f)
                    curveTo(9.4688f, 20.8828f, 7.3828f, 22.1719f, 6.3164f, 22.6055f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(7.8281f, 12.4688f)
                    curveTo(8.7656f, 12.4688f, 9.5273f, 11.6953f, 9.5273f, 10.7578f)
                    curveTo(9.5273f, 9.8203f, 8.7539f, 9.0586f, 7.8281f, 9.0586f)
                    curveTo(6.8789f, 9.0586f, 6.1172f, 9.8203f, 6.1172f, 10.7578f)
                    curveTo(6.1172f, 11.6953f, 6.8789f, 12.4688f, 7.8281f, 12.4688f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(13.2891f, 12.4688f)
                    curveTo(14.2266f, 12.4688f, 15.0f, 11.6953f, 15.0f, 10.7578f)
                    curveTo(15.0f, 9.8203f, 14.2266f, 9.0586f, 13.2891f, 9.0586f)
                    curveTo(12.3516f, 9.0586f, 11.5781f, 9.8203f, 11.5781f, 10.7578f)
                    curveTo(11.5781f, 11.6953f, 12.3516f, 12.4688f, 13.2891f, 12.4688f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(18.7617f, 12.4688f)
                    curveTo(19.6992f, 12.4688f, 20.4609f, 11.6953f, 20.4609f, 10.7578f)
                    curveTo(20.4609f, 9.8203f, 19.6992f, 9.0586f, 18.7617f, 9.0586f)
                    curveTo(17.8125f, 9.0586f, 17.0508f, 9.8203f, 17.0508f, 10.7578f)
                    curveTo(17.0508f, 11.6953f, 17.8125f, 12.4688f, 18.7617f, 12.4688f)
                    close()
                }
            }.build()
        return _ellipsisMessage!!
    }

private var _ellipsisMessage: ImageVector? = null
