package com.example.learnandteach360.presentation.Navigation.endpoints

sealed class TeachScreenRoute (val route : String){
    object ImplementingProgramScreen : TeachScreenRoute("implementingScreen")
    object CompletedProgramScreen : TeachScreenRoute("completedScreen")
}