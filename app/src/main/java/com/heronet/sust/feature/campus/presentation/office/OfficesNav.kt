package com.heronet.sust.feature.campus.presentation.office

import androidx.compose.material3.Text
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.heronet.sust.feature.campus.util.CampusRoutes
import com.heronet.sust.navigation.util.MainRoutes

fun NavGraphBuilder.officesNav(navController: NavHostController) {
    navigation(
        startDestination = "${MainRoutes.Campus.route}/${CampusRoutes.Offices.route}/Offices",
        route = "${MainRoutes.Campus.route}/${CampusRoutes.Offices.route}"
    ) {
        composable("${MainRoutes.Campus.route}/${CampusRoutes.Offices.route}/Offices") {
            OfficesScreen(navController)
        }

        composable(
            route = "${MainRoutes.Campus.route}/${CampusRoutes.Offices.route}/{office}",
            arguments = listOf(navArgument(name = "office") { type = NavType.StringType })
        ) {backStackEntry ->
            val office = backStackEntry.arguments?.getString("office")
            Text(text = "TODO: $office Employees")
        }
    }
}