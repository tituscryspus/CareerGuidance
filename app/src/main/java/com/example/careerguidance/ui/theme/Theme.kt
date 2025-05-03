package com.example.careerguidance.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.core.view.WindowCompat

// Custom color scheme
private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF1976D2),      // Deep Blue
    secondary = Color(0xFF4CAF50),    // Green
    tertiary = Color(0xFFFFA000),     // Amber
    background = Color(0xFFF5F5F5),   // Light Gray
    surface = Color(0xFFFFFFFF),      // White
    onPrimary = Color(0xFFFFFFFF),    // White
    onSecondary = Color(0xFFFFFFFF),  // White
    onTertiary = Color(0xFF000000),   // Black
    onBackground = Color(0xFF000000), // Black
    onSurface = Color(0xFF000000)     // Black
)

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF2196F3),      // Light Blue
    secondary = Color(0xFF66BB6A),    // Light Green
    tertiary = Color(0xFFFFB74D),     // Light Amber
    background = Color(0xFF121212),   // Dark Gray
    surface = Color(0xFF1E1E1E),      // Dark Surface
    onPrimary = Color(0xFF000000),    // Black
    onSecondary = Color(0xFF000000),  // Black
    onTertiary = Color(0xFF000000),   // Black
    onBackground = Color(0xFFFFFFFF), // White
    onSurface = Color(0xFFFFFFFF)     // White
)

@Composable
fun CareerGuidanceTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    val view = LocalView.current
    
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}