package com.heronet.sust.feature.campus.presentation.school

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.heronet.sust.feature.campus.util.CampusRoutes
import com.heronet.sust.navigation.util.MainRoutes

fun NavGraphBuilder.schoolsNav(navController: NavHostController) {
    navigation(
        startDestination = "${MainRoutes.Campus.route}/${CampusRoutes.Schools.route}/Schools",
        route = "${MainRoutes.Campus.route}/${CampusRoutes.Schools.route}"
    ) {
        composable("${MainRoutes.Campus.route}/${CampusRoutes.Schools.route}/Schools") {
            SchoolsScreen(navController)
        }

        composable(
            route = "${MainRoutes.Campus.route}/${CampusRoutes.Schools.route}/{school}",
            arguments = listOf(
                navArgument("school") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val school = backStackEntry.arguments?.getString("school")
            DepartmentsScreen(schoolName = school!!)
        }
    }
}