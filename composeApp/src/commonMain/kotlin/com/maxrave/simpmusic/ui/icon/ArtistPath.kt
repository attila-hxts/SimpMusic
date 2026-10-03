package com.maxrave.simpmusic.ui.icon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SimpIcons.ArtistPath: ImageVector
    get() {
        val cached = _ArtistPath
        if (cached != null) return cached
        val built =
            ImageVector
                .Builder(
                    name = "ArtistPath",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
                ).apply {
                    // Two dots joined by a bending line: a path between two artists.
                    path(
                        stroke = SolidColor(Color.Black),
                        strokeLineWidth = 2f,
                        strokeLineCap = StrokeCap.Round,
                    ) {
                        moveTo(6f, 18f)
                        curveTo(6f, 11f, 18f, 13f, 18f, 6f)
                    }
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(3.5f, 18f)
                        arcToRelative(2.5f, 2.5f, 0f, true, true, 5f, 0f)
                        arcToRelative(2.5f, 2.5f, 0f, true, true, -5f, 0f)
                        close()
                        moveTo(15.5f, 6f)
                        arcToRelative(2.5f, 2.5f, 0f, true, true, 5f, 0f)
                        arcToRelative(2.5f, 2.5f, 0f, true, true, -5f, 0f)
                        close()
                    }
                }.build()
        _ArtistPath = built
        return built
    }

private var _ArtistPath: ImageVector? = null
