package com.heronet.sust.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.heronet.sust.feature.campus.presentation.campusNav
import com.heronet.sust.navigation.util.MainRoutes

@Composable
fun MainNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = MainRoutes.Campus.route) {
        // Campus Graph
        campusNav(navController = navController)

        composable(MainRoutes.Updates.route) {
            Text(text = MainRoutes.Updates.route)
        }
        composable(MainRoutes.Calendar.route) {
            Text(text = MainRoutes.Calendar.route)
        }
        composable(MainRoutes.Bus.route) {
            Text(text = MainRoutes.Bus.route)
        }
    }
}