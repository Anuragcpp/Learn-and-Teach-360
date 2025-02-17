package com.example.learnandteach360.presentation.Navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.example.learnandteach360.presentation.screens.autn.LoginScreen
import com.example.learnandteach360.presentation.screens.autn.SignUpScreen
import com.example.learnandteach360.presentation.screens.dashbord.DashbordScreen
import com.example.learnandteach360.presentation.screens.dashbord.HomeScreen
import com.example.learnandteach360.utality.endpoints.DestinationScreen

@Composable
fun MainNavHost(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = DestinationScreen.AuthGraph.route ) {

        authNavGraph(navController)

        composable(DestinationScreen.DeshbordGraph.route){
            DashbordScreen()
        }

//        navigation(
//            startDestination = DestinationScreen.LoginScreen.route,
//            route = DestinationScreen.AuthGraph.route
//            )
//        {
//            composable(DestinationScreen.LoginScreen.route){
//                LoginScreen(){
//                    navController.navigate(DestinationScreen.HomeScreen.route)
//                }
//            }
//
//            composable(DestinationScreen.SignUpScreen.route){
//                SignUpScreen {
//                    navController.navigate(DestinationScreen.LoginScreen.route)
//                }
//            }
//
//        }
//
//        navigation(
//            startDestination = DestinationScreen.HomeScreen.route,
//            route = DestinationScreen.DeshbordGraph.route
//        ) {
//
//
//
//
//        }

    }
}