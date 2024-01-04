package com.heronet.sust

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.heronet.sust.feature.campus.presentation.CampusScreen
import com.heronet.sust.feature.campus.util.CampusRoutes

@Composable
fun MainNavHost(navController: NavHostController) {

    NavHost(navController = navController, startDestination = CampusRoutes.Campus.name) {
        composable(CampusRoutes.Campus.name) {
            CampusScreen()
        }
        composable(CampusRoutes.Updates.name) {
            Text(text = CampusRoutes.Updates.name)
        }
        composable(CampusRoutes.Calendar.name) {
            Text(text = CampusRoutes.Calendar.name)
        }
        composable(CampusRoutes.Bus.name) {
            Text(text = CampusRoutes.Bus.name)
        }
    }
}