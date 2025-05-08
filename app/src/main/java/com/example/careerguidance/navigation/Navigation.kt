package com.example.careerguidance.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.careerguidance.screens.CourseDetailScreen
import com.example.careerguidance.screens.CourseListScreen
import com.example.careerguidance.screens.HomeScreen
import com.example.careerguidance.ui.viewmodel.CareerViewModel
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle

sealed class Screen(val route: String) {
    data object Home : Screen("home")
    data object CourseList : Screen("course_list")
    data object CourseDetail : Screen("course_detail")
}

@Composable
fun Navigation(
    navController: NavHostController,
    viewModel: CareerViewModel
) {
    val selectedField by viewModel.selectedField.collectAsStateWithLifecycle()
    val selectedCourse by viewModel.selectedCourse.collectAsStateWithLifecycle()
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            HomeScreen(
                onFieldSelected = { field ->
                    viewModel.selectField(field)
                    navController.navigate(Screen.CourseList.route)
                }
            )
        }

        composable(Screen.CourseList.route) {
            selectedField?.let { field ->
                CourseListScreen(
                    careerField = field,
                    onCourseSelected = { course ->
                        viewModel.selectCourse(course)
                        navController.navigate(Screen.CourseDetail.route)
                    },
                    onBackPressed = {
                        navController.popBackStack()
                    }
                )
            }
        }

        composable(Screen.CourseDetail.route) {
            selectedCourse?.let { course ->
                CourseDetailScreen(
                    course = course,
                    onBackPressed = {
                        navController.popBackStack()
                    }
                )
            }
        }
    }
} 