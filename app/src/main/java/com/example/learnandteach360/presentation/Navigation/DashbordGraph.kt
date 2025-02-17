package com.example.learnandteach360.presentation.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.learnandteach360.presentation.screens.dashbord.CoursesScreen
import com.example.learnandteach360.presentation.screens.dashbord.HomeScreen
import com.example.learnandteach360.presentation.screens.dashbord.MyProgressScreen
import com.example.learnandteach360.utality.endpoints.DestinationScreen

@Composable
fun DashbordGraph(navHostController: NavHostController) {


    NavHost(
        navController = navHostController,
        startDestination = DestinationScreen.HomeScreen.route,
        route = DestinationScreen.DeshbordGraph.route
    ) {

        composable(DestinationScreen.HomeScreen.route){
            HomeScreen()
        }

        composable(DestinationScreen.MyProgressScreen.route){
            MyProgressScreen()
        }

        composable(DestinationScreen.Courses.route){
            CoursesScreen()
        }
    }

}


