package com.example.learnandteach360.presentation.screens.dashbord.home.learn

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.learnandteach360.presentation.Navigation.endpoints.LearnScreenRoute

@Composable
fun LearnScreenNavigation(navController: NavHostController) {

    NavHost(navController = navController, startDestination = LearnScreenRoute.OnlineProgram.route ) {
        composable(LearnScreenRoute.OnlineProgram.route){
            OnlineProgramScreen{
                navController.navigate(LearnScreenRoute.ProgramDetailsScreen.route)
            }
        }

        composable(LearnScreenRoute.OfflineProgram.route){
            OfflineProgramScreen{
                navController.navigate(LearnScreenRoute.ProgramDetailsScreen.route)
            }
        }

        composable(LearnScreenRoute.Courses.route){
            CoursesScreen{
                navController.navigate(LearnScreenRoute.ProgramDetailsScreen.route)
            }
        }

        composable(LearnScreenRoute.ProgramDetailsScreen.route){
            ProgramDetailScreen{
                navController.navigate(LearnScreenRoute.RegistrationScreen.route)
            }
        }

        composable(LearnScreenRoute.RegistrationScreen.route){
            RegistrationScreen ()
        }




    }

}