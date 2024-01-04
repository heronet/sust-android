package com.heronet.sust

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.DirectionsBus
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Timeline
import androidx.compose.material.icons.outlined.CalendarMonth
import androidx.compose.material.icons.outlined.DirectionsBus
import androidx.compose.material.icons.outlined.School
import androidx.compose.material.icons.outlined.Timeline
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.heronet.sust.feature.campus.util.CampusNavItem
import com.heronet.sust.feature.campus.util.CampusRoutes

@Composable
fun BottomNavBar(navController: NavHostController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    val navItems = listOf(
        CampusNavItem(CampusRoutes.Campus.name, Icons.Filled.School, Icons.Outlined.School),
        CampusNavItem(CampusRoutes.Updates.name, Icons.Filled.Timeline, Icons.Outlined.Timeline),
        CampusNavItem(
            CampusRoutes.Calendar.name,
            Icons.Filled.CalendarMonth,
            Icons.Outlined.CalendarMonth
        ),
        CampusNavItem(
            CampusRoutes.Bus.name,
            Icons.Filled.DirectionsBus,
            Icons.Outlined.DirectionsBus
        ),
    )
    NavigationBar {
        navItems.forEach { campusNavItem ->
            val selected = currentDestination?.hierarchy?.any { dest ->
                dest.route == campusNavItem.route
            } == true

            NavigationBarItem(
                label = { Text(text = campusNavItem.route) },
                selected = selected,
                onClick = {
                    navController.navigate(campusNavItem.route)
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