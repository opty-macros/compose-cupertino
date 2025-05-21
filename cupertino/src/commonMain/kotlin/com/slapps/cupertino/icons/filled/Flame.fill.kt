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

public val  CupertinoIcons.Filled.Flame: ImageVector
	get() {
		if (flame != null) {
			return flame!!
		}
		flame = ImageVector.Builder(
            name = "Flame.fill",
            defaultWidth = 32.9102.dp,
            defaultHeight = 42.dp,
            viewportWidth = 32.9102f,
            viewportHeight = 42f
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
					horizontalLineTo(32.9102f)
					verticalLineTo(45.8008f)
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
					moveTo(15.3516f, 42.2461f)
					curveTo(25.66410f, 42.24610f, 32.53910f, 35.27340f, 32.53910f, 24.76560f)
					curveTo(32.53910f, 7.28520f, 17.65620f, 00f, 7.32420f, 00f)
					curveTo(5.48830f, 00f, 4.31640f, 0.64450f, 4.31640f, 1.89450f)
					curveTo(4.31640f, 2.38280f, 4.53130f, 2.89060f, 4.94140f, 3.35940f)
					curveTo(7.26560f, 6.13280f, 9.58980f, 9.43360f, 9.62890f, 13.28120f)
					curveTo(9.62890f, 14.16020f, 9.53130f, 14.94140f, 8.90630f, 16.03520f)
					lineTo(9.88281f, 15.8398f)
					curveTo(9.00390f, 12.96880f, 6.64060f, 10.93750f, 4.57030f, 10.93750f)
					curveTo(3.76950f, 10.93750f, 3.22270f, 11.52340f, 3.22270f, 12.40230f)
					curveTo(3.22270f, 12.91020f, 3.35940f, 14.10160f, 3.35940f, 14.96090f)
					curveTo(3.35940f, 19.33590f, 00f, 21.89450f, 00f, 28.94530f)
					curveTo(00f, 36.93360f, 6.11330f, 42.24610f, 15.35160f, 42.24610f)
					close()
					moveTo(15.8008f, 36.7578f)
					curveTo(12.14840f, 36.75780f, 9.72660f, 34.55080f, 9.72660f, 31.26950f)
					curveTo(9.72660f, 27.8320f, 12.1680f, 26.60160f, 12.48050f, 24.39450f)
					curveTo(12.51950f, 24.21880f, 12.63670f, 24.16020f, 12.77340f, 24.27730f)
					curveTo(13.67190f, 25.07810f, 14.25780f, 26.05470f, 14.74610f, 27.18750f)
					curveTo(15.78120f, 25.78120f, 16.26950f, 22.81250f, 15.93750f, 19.60940f)
					curveTo(15.9180f, 19.43360f, 16.03520f, 19.33590f, 16.21090f, 19.39450f)
					curveTo(20.48830f, 21.40620f, 22.71480f, 25.66410f, 22.71480f, 29.47270f)
					curveTo(22.71480f, 33.33980f, 20.44920f, 36.75780f, 15.80080f, 36.75780f)
					close()
				}
}
		}.build()
		return flame!!
	}

private var flame: ImageVector? = null
