package com.heronet.sust.navigation

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.heronet.sust.navigation.util.Constants

@Composable
fun BottomNavBar(navController: NavHostController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination


    NavigationBar {
        Constants.navItems.forEach { campusNavItem ->
            val selected = currentDestination?.hierarchy?.any { dest ->
                dest.route == campusNavItem.route
            } == true

            NavigationBarItem(
                label = { Text(text = campusNavItem.route) },
                selected = selected,
                onClick = {
                    navController.navigate(campusNavItem.route) {
                        // Pop up to the start destination of the graph to
                        // avoid building up a large stack of destinations
                        // on the back stack as users select items
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        // Avoid multiple copies of the same destination when
                        // re-selecting the same item
                        launchSingleTop = true
                        // Restore state when re-selecting a previously selected item
                        restoreState = true
                    }
                },
                icon = {
                    Icon(
                        imageVector = if (selected)
                            campusNavItem.selectedIcon
                        else campusNavItem.unselectedIcon,
                        contentDescription = campusNavItem.route
                    )
                }
            )
        }
    }
}