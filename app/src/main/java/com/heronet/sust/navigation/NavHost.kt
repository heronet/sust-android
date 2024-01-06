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
    NavHost(navController = navController, startDestination = MainRoutes.Campus.name) {
        // Campus Graph
        campusNav(navController = navController)

        composable(MainRoutes.Updates.name) {
            Text(text = MainRoutes.Updates.name)
        }
        composable(MainRoutes.Calendar.name) {
            Text(text = MainRoutes.Calendar.name)
        }
        composable(MainRoutes.Bus.name) {
            Text(text = MainRoutes.Bus.name)
        }
    }
}