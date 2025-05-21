/*
* Converted using https://composables.com/svgtocompose
*/

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.slapps.cupertino.icons.CupertinoIcons

public val CupertinoIcons.Filled.Wineglass: ImageVector
    get() {
        if (wineglass != null) {
            return wineglass!!
        }
        wineglass = ImageVector.Builder(
            name = "Wineglass",
            defaultWidth = 28.9258.dp,
            defaultHeight = 46.543.dp,
            viewportWidth = 28.9258f,
            viewportHeight = 46.543f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Black),
                    fillAlpha = 0f,
                    stroke = null,
                    strokeAlpha = 0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(28.9258f)
                    verticalLineTo(46.543f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFFFFFFF)),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(14.2578f, 46.5234f)
                    curveTo(21.32810f, 46.52340f, 25.58590f, 44.76560f, 25.58590f, 41.75780f)
                    curveTo(25.58590f, 39.00390f, 21.91410f, 37.28520f, 15.74220f, 37.03120f)
                    lineTo(15.7422f, 28.6523f)
                    curveTo(23.49610f, 28.10550f, 28.55470f, 23.14450f, 28.55470f, 15.87890f)
                    curveTo(28.55470f, 11.85550f, 26.85550f, 6.56250f, 24.39450f, 2.7930f)
                    curveTo(23.24220f, 0.99610f, 19.51170f, 00f, 14.27730f, 00f)
                    curveTo(9.00390f, 00f, 5.2930f, 0.99610f, 4.12110f, 2.7930f)
                    curveTo(1.66020f, 6.56250f, 00f, 11.85550f, 00f, 15.87890f)
                    curveTo(00f, 23.16410f, 5.05860f, 28.10550f, 12.81250f, 28.65230f)
                    lineTo(12.8125f, 37.0312f)
                    curveTo(6.62110f, 37.26560f, 2.94920f, 39.00390f, 2.94920f, 41.75780f)
                    curveTo(2.94920f, 44.76560f, 7.18750f, 46.52340f, 14.25780f, 46.52340f)
                    close()
                    moveTo(14.2773f, 4.82422f)
                    curveTo(9.82420f, 4.82420f, 6.83590f, 4.31640f, 6.83590f, 3.73050f)
                    curveTo(6.83590f, 3.16410f, 9.84380f, 2.67580f, 14.27730f, 2.67580f)
                    curveTo(18.71090f, 2.67580f, 21.71880f, 3.16410f, 21.71880f, 3.73050f)
                    curveTo(21.71880f, 4.31640f, 18.71090f, 4.82420f, 14.27730f, 4.82420f)
                    close()
                }
            }
        }.build()
        return wineglass!!
    }

private var wineglass: ImageVector? = null
