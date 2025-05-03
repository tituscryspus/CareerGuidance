package com.example.careerguidance.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.careerguidance.ui.screens.CourseDetailScreen
import com.example.careerguidance.ui.screens.CourseListScreen
import com.example.careerguidance.ui.screens.HomeScreen
import com.example.careerguidance.ui.viewmodel.CareerViewModel

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object CourseList : Screen("course_list")
    object CourseDetail : Screen("course_detail")
}

@Composable
fun Navigation(
    navController: NavHostController,
    viewModel: CareerViewModel
) {
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
            viewModel.selectedField.value?.let { field ->
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
            viewModel.selectedCourse.value?.let { course ->
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