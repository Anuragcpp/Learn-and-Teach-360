package com.example.learnandteach360.presentation.screens.dashbord

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.learnandteach360.presentation.Navigation.DashbordGraph
import com.example.learnandteach360.presentation.screens.dashbord.util.BottomNavItem
import com.example.learnandteach360.utality.endpoints.DestinationScreen

@Composable
fun DashbordScreen(navController: NavHostController = rememberNavController()) {

    val navItem = listOf(
        BottomNavItem(
            title = "Home",
            icon = Icons.Default.Home
        ),
        BottomNavItem(
            title = "My Progress",
            icon = Icons.Filled.Face
        ),
        BottomNavItem(
            title = "Coursers",
            icon = Icons.Default.DateRange
        ),
    )

    var selectedIndex by remember{ mutableIntStateOf(0) }

    Scaffold (
        bottomBar = {
            NavigationBar {
                navItem.forEachIndexed{ index, navItem ->
                    NavigationBarItem(
                        selected = index == selectedIndex,
                        onClick = {
                            selectedIndex = index
                            when(selectedIndex){
                                0 -> navController.navigate(DestinationScreen.HomeScreen.route)
                                1 -> navController.navigate(DestinationScreen.MyProgressScreen.route)
                                2 -> navController.navigate(DestinationScreen.Courses.route)
                            }
                        },
                        icon = { Icon(imageVector = navItem.icon, contentDescription = "nav Icon")},
                        label = { Text(text = navItem.title)}
                    )
                }
            }
        }
    ) { innerPadding ->

        DashbordGraph(navHostController = navController)

    }

}