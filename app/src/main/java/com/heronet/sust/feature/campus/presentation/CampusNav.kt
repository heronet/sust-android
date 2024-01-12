package com.heronet.sust.feature.campus.presentation

import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutVertically
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.heronet.sust.feature.campus.presentation.center.CentersScreen
import com.heronet.sust.feature.campus.presentation.common.employee.EmployeesScreen
import com.heronet.sust.feature.campus.presentation.hall.HallsScreen
import com.heronet.sust.feature.campus.presentation.office.OfficesScreen
import com.heronet.sust.feature.campus.presentation.school.SchoolsScreen
import com.heronet.sust.feature.campus.presentation.school.departments.DepartmentsScreen
import com.heronet.sust.feature.campus.util.CampusRoutes
import com.heronet.sust.feature.campus.util.EmployeeTypes
import com.heronet.sust.navigation.util.MainRoutes

fun NavGraphBuilder.campusNav(navController: NavHostController) {
    navigation(
        startDestination = "${MainRoutes.Campus.route}/Campus",
        route = MainRoutes.Campus.route,
    ) {
        composable(
            "${MainRoutes.Campus.route}/Campus"
        ) {
            CampusScreen(navController)
        }

        // Schools Routes
        composable(
            "${MainRoutes.Campus.route}/${CampusRoutes.Schools.route}",
            enterTransition = { slideInHorizontally() + fadeIn() },
            exitTransition = { slideOutVertically() + fadeOut() }
        ) {
            SchoolsScreen(navController)
        }

        composable(
            route = "${MainRoutes.Campus.route}/${CampusRoutes.Schools.route}/{school}",
            arguments = listOf(
                navArgument("school") { type = NavType.StringType }
            ),
            enterTransition = { expandVertically() + fadeIn() },
            exitTransition = { shrinkVertically() + fadeOut() }
        ) { backStackEntry ->
            val school = backStackEntry.arguments?.getString("school")
            DepartmentsScreen(schoolName = school!!, navController)
        }
        composable(
            route = "${MainRoutes.Campus.route}/${CampusRoutes.Schools.route}/{school}/{${EmployeeTypes.Department.type}}",
            arguments = listOf(
                navArgument("school") { type = NavType.StringType },
                navArgument(EmployeeTypes.Department.type) { type = NavType.StringType },
            ),
            enterTransition = { expandVertically() + fadeIn() },
            exitTransition = { shrinkVertically() + fadeOut() }
        ) { backStackEntry ->
            val department = backStackEntry.arguments?.getString(EmployeeTypes.Department.type)
            EmployeesScreen(
                workplaceType = EmployeeTypes.Department.type,
                workplaceTitle = department!!
            )
        }

        // Office Routes
        composable(
            "${MainRoutes.Campus.route}/${CampusRoutes.Offices.route}",
            enterTransition = { slideInHorizontally() + fadeIn() },
            exitTransition = { slideOutVertically() + fadeOut() }
        ) {
            OfficesScreen(navController)
        }

        composable(
            route = "${MainRoutes.Campus.route}/${CampusRoutes.Offices.route}/{${EmployeeTypes.Office.type}}",
            arguments = listOf(navArgument(name = EmployeeTypes.Office.type) { type = NavType.StringType })
        ) { backStackEntry ->
            val office = backStackEntry.arguments?.getString(EmployeeTypes.Office.type)
            EmployeesScreen(workplaceType = EmployeeTypes.Center.type, workplaceTitle = office!!)
        }

        // Centers Routes
        composable(
            "${MainRoutes.Campus.route}/${CampusRoutes.Centers.route}",
            enterTransition = { expandVertically() + fadeIn() },
            exitTransition = { shrinkVertically() + fadeOut() }
        ) {
            CentersScreen(navController)
        }

        composable(
            route = "${MainRoutes.Campus.route}/${CampusRoutes.Centers.route}/{${EmployeeTypes.Center.type}}",
            arguments = listOf(navArgument(name = EmployeeTypes.Center.type) {
                type = NavType.StringType
            })
        ) { backStackEntry ->
            val center = backStackEntry.arguments?.getString(EmployeeTypes.Center.type)!!
            EmployeesScreen(workplaceType = EmployeeTypes.Center.type, workplaceTitle = center)
        }

        // Halls Routes
        composable(
            "${MainRoutes.Campus.route}/${CampusRoutes.Halls.route}",
            enterTransition = { slideInHorizontally() + fadeIn() },
            exitTransition = { slideOutVertically() + fadeOut() }
        ) {
            HallsScreen(navController)
        }

        composable(
            route = "${MainRoutes.Campus.route}/${CampusRoutes.Halls.route}/{${EmployeeTypes.Hall.type}}",
            arguments = listOf(navArgument(name = EmployeeTypes.Hall.type) {
                type = NavType.StringType
            })
        ) { backStackEntry ->
            val hall = backStackEntry.arguments?.getString(EmployeeTypes.Hall.type)
            EmployeesScreen(workplaceType = EmployeeTypes.Hall.type, workplaceTitle = hall!!)
        }
    }
}