package com.example.careerguidance

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.careerguidance.model.CareerField
import com.example.careerguidance.model.Course
import com.example.careerguidance.ui.screens.CourseDetailScreen
import com.example.careerguidance.ui.screens.CourseListScreen
import com.example.careerguidance.ui.screens.HomeScreen
import com.example.careerguidance.ui.theme.CareerGuidanceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CareerGuidanceTheme {
                CareerGuidanceApp()
            }
        }
    }
}

@Composable
fun CareerGuidanceApp() {
    var selectedField by remember { mutableStateOf<CareerField?>(null) }
    var selectedCourse by remember { mutableStateOf<Course?>(null) }

    when {
        selectedCourse != null -> {
            CourseDetailScreen(
                course = selectedCourse!!,
                onBackPressed = { selectedCourse = null }
            )
        }
        selectedField != null -> {
            CourseListScreen(
                careerField = selectedField!!,
                onCourseSelected = { course -> selectedCourse = course },
                onBackPressed = { selectedField = null }
            )
        }
        else -> {
            HomeScreen(
                onFieldSelected = { field -> selectedField = field }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CareerGuidanceAppPreview() {
    CareerGuidanceTheme {
        CareerGuidanceApp()
    }
}