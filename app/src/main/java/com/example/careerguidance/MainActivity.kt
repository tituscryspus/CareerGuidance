package com.example.careerguidance

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.navigation.compose.rememberNavController
import com.example.careerguidance.navigation.Navigation
import com.example.careerguidance.ui.theme.CareerGuidanceTheme
import com.example.careerguidance.ui.viewmodel.CareerViewModel

class MainActivity : ComponentActivity() {
    private val viewModel: CareerViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CareerGuidanceTheme {
                val navController = rememberNavController()
                Navigation(
                    navController = navController,
                    viewModel = viewModel
                )
            }
        }
    }
}