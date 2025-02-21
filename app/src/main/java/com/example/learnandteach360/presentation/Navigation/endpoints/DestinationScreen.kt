package com.example.learnandteach360.presentation.Navigation.endpoints

sealed class DestinationScreen (var route : String) {
    object SignUpScreen : DestinationScreen("signup")
    object LoginScreen : DestinationScreen("signin")
    object AuthGraph : DestinationScreen("auth")
    object DeshbordGraph : DestinationScreen("destinationGraph")
    object HomeScreen : DestinationScreen("home")
    object MyProgressScreen : DestinationScreen("myProgressScreen")
    object Courses : DestinationScreen("courses")
}