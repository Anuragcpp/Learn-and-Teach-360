package com.example.learnandteach360.presentation.screens.dashbord.home.teach

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.learnandteach360.presentation.Navigation.endpoints.TeachScreenRoute

@Composable
fun TeachScreenNavigation(
    navHostController: NavHostController
) {

    NavHost(navController = navHostController, startDestination = TeachScreenRoute.ImplementingProgramScreen.route) {

        composable(TeachScreenRoute.ImplementingProgramScreen.route){
            ImplementingScreen()
        }

        composable(TeachScreenRoute.CompletedProgramScreen.route){
            CompletedScreen()
        }

    }
}