package com.example.learnandteach360.presentation.Navigation.endpoints

sealed class LearnScreenRoute (val route : String) {
    object OnlineProgram : LearnScreenRoute("onlineProgram")
    object OfflineProgram : LearnScreenRoute("offlineProgram")
    object Courses : LearnScreenRoute("courses")
    object ProgramDetailsScreen : LearnScreenRoute("programDetails")
    object RegistrationScreen : LearnScreenRoute("registrationScreen")
}