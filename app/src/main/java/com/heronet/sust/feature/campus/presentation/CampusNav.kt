package com.heronet.sust.feature.campus.presentation

import androidx.compose.material3.Text
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.heronet.sust.feature.campus.presentation.center.CentersScreen
import com.heronet.sust.feature.campus.presentation.hall.HallsScreen
import com.heronet.sust.feature.campus.presentation.office.OfficesScreen
import com.heronet.sust.feature.campus.presentation.school.DepartmentsScreen
import com.heronet.sust.feature.campus.presentation.school.SchoolsScreen
import com.heronet.sust.feature.campus.util.CampusRoutes
import com.heronet.sust.navigation.util.MainRoutes

fun NavGraphBuilder.campusNav(navController: NavHostController) {
    navigation(
        startDestination = "${MainRoutes.Campus.route}/Campus",
        route = MainRoutes.Campus.route
    ) {
        composable("${MainRoutes.Campus.route}/Campus") {
            CampusScreen(navController)
        }

        // Schools Routes
        composable("${MainRoutes.Campus.route}/${CampusRoutes.Schools.route}") {
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

        // Office Routes
        composable("${MainRoutes.Campus.route}/${CampusRoutes.Offices.route}") {
            OfficesScreen(navController)
        }

        composable(
            route = "${MainRoutes.Campus.route}/${CampusRoutes.Offices.route}/{office}",
            arguments = listOf(navArgument(name = "office") { type = NavType.StringType })
        ) {backStackEntry ->
            val office = backStackEntry.arguments?.getString("office")
            Text(text = "TODO: $office Employees")
        }

        // Centers Routes
        composable("${MainRoutes.Campus.route}/${CampusRoutes.Centers.route}") {
            CentersScreen(navController)
        }

        composable(
            route = "${MainRoutes.Campus.route}/${CampusRoutes.Centers.route}/{center}",
            arguments = listOf(navArgument(name = "center") { type = NavType.StringType })
        ) {backStackEntry ->
            val center = backStackEntry.arguments?.getString("center")
            Text(text = "TODO: $center Employees")
        }

        // Halls Routes
        composable("${MainRoutes.Campus.route}/${CampusRoutes.Halls.route}") {
            HallsScreen(navController)
        }

        composable(
            route = "${MainRoutes.Campus.route}/${CampusRoutes.Halls.route}/{hall}",
            arguments = listOf(navArgument(name = "hall") { type = NavType.StringType })
        ) {backStackEntry ->
            val hall = backStackEntry.arguments?.getString("hall")
            Text(text = "TODO: $hall Employees")
        }
    }
}