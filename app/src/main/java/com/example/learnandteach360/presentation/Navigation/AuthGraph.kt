package com.example.learnandteach360.presentation.Navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.learnandteach360.presentation.screens.autn.LoginScreen
import com.example.learnandteach360.presentation.screens.autn.SignUpScreen
import com.example.learnandteach360.presentation.Navigation.endpoints.DestinationScreen


fun NavGraphBuilder.authNavGraph(navController: NavController) {

    navigation(startDestination = DestinationScreen.LoginScreen.route,
        route = DestinationScreen.AuthGraph.route) {

        composable(DestinationScreen.LoginScreen.route){
            LoginScreen (
                navigateToSignUp = {
                    navController.navigate(DestinationScreen.SignUpScreen.route)
                                   }
            )
        }

        composable(DestinationScreen.SignUpScreen.route){
            SignUpScreen {
                navController.navigate(DestinationScreen.DeshbordGraph.route)
            }
        }
    }
}
