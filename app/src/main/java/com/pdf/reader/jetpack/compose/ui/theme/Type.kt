package com.pdf.reader.jetpack.compose.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.pdf.reader.jetpack.compose.R

val Urbanist = FontFamily(
    Font(R.font.urbanist_thin, FontWeight.Thin),
    Font(R.font.urbanist_thinitalic, FontWeight.Thin, style = FontStyle.Italic),
    Font(R.font.urbanist_extralight, FontWeight.ExtraLight),
    Font(R.font.urbanist_extralightitalic, FontWeight.ExtraLight, style = FontStyle.Italic),
    Font(R.font.urbanist_light, FontWeight.Light),
    Font(R.font.urbanist_lightitalic, FontWeight.Light, style = FontStyle.Italic),
    Font(R.font.urbanist_regular, FontWeight.W400),
    Font(R.font.urbanist_medium, FontWeight.Medium),
    Font(R.font.urbanist_mediumitalic, FontWeight.Medium, style = FontStyle.Italic),
    Font(R.font.urbanist_semibold, FontWeight.SemiBold),
    Font(R.font.urbanist_semibolditalic, FontWeight.SemiBold, style = FontStyle.Italic),
    Font(R.font.urbanist_bold, FontWeight.Bold),
    Font(R.font.urbanist_bolditalic, FontWeight.Bold, style = FontStyle.Italic),
    Font(R.font.urbanist_extrabold, FontWeight.ExtraBold),
    Font(R.font.urbanist_extrabolditalic, FontWeight.ExtraBold, style = FontStyle.Italic),
    Font(R.font.urbanist_black, FontWeight.Black),
    Font(R.font.urbanist_blackitalic, FontWeight.Black, style = FontStyle.Italic)
)

// Set of Material typography styles to start with
val Typography = Typography(
    headlineSmall = TextStyle(
        fontFamily = Urbanist,
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp,
        lineHeight = 32.sp,
        letterSpacing = 0.sp
    ),
    titleLarge = TextStyle(
        fontFamily = Urbanist,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = Urbanist,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.15.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = Urbanist,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    ),
    labelMedium = TextStyle(
        fontFamily = Urbanist,
        fontWeight = FontWeight.SemiBold,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
)