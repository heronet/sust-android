package com.heronet.sust.navigation.util

import androidx.compose.ui.graphics.vector.ImageVector

data class NavItem(
    val route: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
)
