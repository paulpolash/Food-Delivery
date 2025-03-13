package com.example.fooddelivery.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val Pink = Color(0xFFF08FC9)
val Green = Color(0xFFB9D6AC)
val Yellow = Color(0xFFFFEB3B)
val LightYellow = Color(0xFFE4DDA5)
val Dark = Color(0xFF0D0E0D)

@Immutable
data class AppColors(
    val background: Color,
    val onBackground: Color,
    val surface: Color,
    val onSurface: Color,
    val secondarySurface: Color,
    val onSecondarySurface: Color,
    val regularSurface: Color,
    val onRegularSurface: Color,
    val actionSurface: Color,
    val onActionSurface: Color,
    val highlightSurface: Color,
    val onHighlightSurface: Color
)

val LocalAppColors = staticCompositionLocalOf {
    AppColors(
        background =  Color.Unspecified,
        onBackground = Color.Unspecified,
        surface = Color.Unspecified,
        secondarySurface = Color.Unspecified,
        onSecondarySurface = Color.Unspecified,
        regularSurface =  Color.Unspecified,
        onRegularSurface =  Color.Unspecified,
        actionSurface =  Color.Unspecified,
        onActionSurface = Color.Unspecified,
        highlightSurface = Color.Unspecified,
        onHighlightSurface = Color.Unspecified,
        onSurface = Color.Unspecified
    )
}

val extendedColors = AppColors(
    background = Color.White,
    onBackground = Dark,
    surface = Color.White,
    onSurface = Dark,
    secondarySurface = Pink,
    onSecondarySurface = Color.White,
    regularSurface = LightYellow,
    onRegularSurface = Dark,
    actionSurface = Yellow,
    onActionSurface = Pink,
    highlightSurface = Green,
    onHighlightSurface = Color.White
);
