package com.example.photofiltermodule

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.graphics.Paint

class PhotoFilter {

    fun applyGrayscaleFilter(): ColorMatrixColorFilter {

        val colorMatrix = ColorMatrix()
        colorMatrix.setSaturation(0f) // Convert to grayscale
        return ColorMatrixColorFilter(colorMatrix)

    }

    fun applySepiaFilter(): ColorMatrixColorFilter {

        val colorMatrix = ColorMatrix()
        colorMatrix.set(
            floatArrayOf(
                0.393f, 0.769f, 0.189f, 0f, 0f,
                0.349f, 0.686f, 0.168f, 0f, 0f,
                0.272f, 0.534f, 0.131f, 0f, 0f,
                0f, 0f, 0f, 1f, 0f
            )
        )

        return ColorMatrixColorFilter(colorMatrix)
    }

    fun applyInvertFilter(): ColorMatrixColorFilter {
        val colorMatrix = ColorMatrix()
        colorMatrix.set(
            floatArrayOf(
                -1f, 0f, 0f, 0f, 255f,
                0f, -1f, 0f, 0f, 255f,
                0f, 0f, -1f, 0f, 255f,
                0f, 0f, 0f, 1f, 0f
            )
        )

        return ColorMatrixColorFilter(colorMatrix)
    }

    fun applyVintageFilter(): ColorMatrixColorFilter {

        val colorMatrix = ColorMatrix()
        colorMatrix.set(
            floatArrayOf(
                1.5f, 0.0f, 0.0f, 0.0f, -10.0f,
                0.0f, 1.2f, 0.0f, 0.0f, -10.0f,
                0.0f, 0.0f, 1.0f, 0.0f, -10.0f,
                0.0f, 0.0f, 0.0f, 1.0f, 0.0f
            )
        )

        return ColorMatrixColorFilter(colorMatrix)
    }

    fun applyTangerineFilter(): ColorMatrixColorFilter{
        val colorMatrix = ColorMatrix(
            floatArrayOf(
                2f, 0f, 0f, 0f, 0f,
                0f, 1.5f, 0f, 0f, 0f,
                0f, 0f, 1.2f, 0f, 0f,
                0f, 0f, 0f, 1f, 0f
            )
        )
        return ColorMatrixColorFilter(colorMatrix)
    }

    fun applyCinematicFilter(): ColorMatrixColorFilter{
        val contrast = 1.2f
        val brightness = -10f
        val colorMatrix = ColorMatrix(
            floatArrayOf(
                contrast, 0f, 0f, 0f, brightness,
                0f, contrast, 0f, 0f, brightness,
                0f, 0f, contrast, 0f, brightness,
                0f, 0f, 0f, 1f, 0f
            )
        )
        return ColorMatrixColorFilter(colorMatrix)
    }

    fun applyDarkBrownFilter(): ColorMatrixColorFilter{
        val colorMatrix = ColorMatrix(
            floatArrayOf(
                1.4f, 0f, 0f, 0f, 0f,
                0f, 1.2f, 0f, 0f, 0f,
                0f, 0f, 1.0f, 0f, 0f,
                0f, 0f, 0f, 1f, 0f
            )
        )
        return ColorMatrixColorFilter(colorMatrix)
    }

    fun applyMetallicFilter(): ColorMatrixColorFilter{
        val colorMatrix = ColorMatrix(
            floatArrayOf(
                1.5f, 0f, 0f, 0f, 0f,
                0f, 1.5f, 0f, 0f, 0f,
                0f, 0f, 1.5f, 0f, 0f,
                0f, 0f, 0f, 1f, 0f
            )
        )
        return ColorMatrixColorFilter(colorMatrix)
    }

    fun applyMatteFilter(): ColorMatrixColorFilter{
        val colorMatrix = ColorMatrix(
            floatArrayOf(
                1.2f, 0f, 0f, 0f, 0f,
                0f, 1.2f, 0f, 0f, 0f,
                0f, 0f, 1.2f, 0f, 0f,
                0f, 0f, 0f, 1f, 0f
            )
        )
        return ColorMatrixColorFilter(colorMatrix)
    }

    fun applyFilmFilter(): ColorMatrixColorFilter{
        val redMultiplier = 1.5f
        val greenMultiplier = 0.8f
        val blueMultiplier = 0.5f

        val colorMatrix = ColorMatrix(
            floatArrayOf(
                redMultiplier, 0f, 0f, 0f, 0f,
                0f, greenMultiplier, 0f, 0f, 0f,
                0f, 0f, blueMultiplier, 0f, 0f,
                0f, 0f, 0f, 1f, 0f
            )
        )

        return ColorMatrixColorFilter(colorMatrix)
    }

    fun applyPeachFilter(): ColorMatrixColorFilter{

        val colorMatrix = ColorMatrix()
        colorMatrix.set(floatArrayOf(
            1.2f, 0f, 0f, 0f, 25f,    // Red
            0f, 1.1f, 0f, 0f, 15f,    // Green
            0f, 0f, 1.0f, 0f, 0f,     // Blue
            0f, 0f, 0f, 1.0f, 0f     // Alpha
        ))
        return ColorMatrixColorFilter(colorMatrix)

    }

    fun applyCharcoal(): ColorMatrixColorFilter{
        val colorMatrix = ColorMatrix()
        colorMatrix.set(floatArrayOf(
            0.393f, 0.769f, 0.189f, 0f, 0f,     // Red
            0.349f, 0.686f, 0.168f, 0f, 0f,     // Green
            0.272f, 0.534f, 0.131f, 0f, 0f,     // Blue
            0f, 0f, 0f, 1.0f, 0f               // Alpha
        ))
        return ColorMatrixColorFilter(colorMatrix)
    }


}