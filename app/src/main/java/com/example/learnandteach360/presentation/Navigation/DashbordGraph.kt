package com.example.learnandteach360.presentation.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.learnandteach360.presentation.screens.dashbord.CoursesScreen
import com.example.learnandteach360.presentation.screens.dashbord.home.HomeScreen
import com.example.learnandteach360.presentation.screens.dashbord.MyProgressScreen
import com.example.learnandteach360.presentation.Navigation.endpoints.DestinationScreen
import com.example.learnandteach360.presentation.screens.dashbord.home.learn.LearnBaseScreen

@Composable
fun DashbordGraph(navHostController: NavHostController) {


    NavHost(
        navController = navHostController,
        startDestination = DestinationScreen.HomeScreen.route,
        route = DestinationScreen.DeshbordGraph.route
    ) {

        composable(DestinationScreen.HomeScreen.route){
            HomeScreen{
                navHostController.navigate(DestinationScreen.LearnBaseScreen.route)
            }
        }

        composable(DestinationScreen.MyProgressScreen.route){
            MyProgressScreen()
        }

        composable(DestinationScreen.Courses.route){
            CoursesScreen()
        }

        composable(DestinationScreen.LearnBaseScreen.route){
            LearnBaseScreen()
        }
    }

}


