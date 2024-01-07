package com.heronet.sust.navigation.util

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.DirectionsBus
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Timeline
import androidx.compose.material.icons.outlined.CalendarMonth
import androidx.compose.material.icons.outlined.DirectionsBus
import androidx.compose.material.icons.outlined.School
import androidx.compose.material.icons.outlined.Timeline

object Constants {
    val navItems = listOf(
        NavItem(MainRoutes.Campus.route, Icons.Filled.School, Icons.Outlined.School),
        NavItem(MainRoutes.Updates.route, Icons.Filled.Timeline, Icons.Outlined.Timeline),
        NavItem(
            MainRoutes.Calendar.route,
            Icons.Filled.CalendarMonth,
            Icons.Outlined.CalendarMonth
        ),
        NavItem(
            MainRoutes.Bus.route,
            Icons.Filled.DirectionsBus,
            Icons.Outlined.DirectionsBus
        ),
    )
}