package com.pdf.reader.jetpack.compose.util

sealed class Screen(val route: String) {
    object HomeScreen : Screen("home")
    object PDFViewScreen : Screen("view_pdf")
}
