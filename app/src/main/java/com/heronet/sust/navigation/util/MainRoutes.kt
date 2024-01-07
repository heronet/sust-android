package com.heronet.sust.navigation.util

sealed class MainRoutes(val route: String) {
    data object Campus: MainRoutes("Campus")
    data object Updates: MainRoutes("Updates")
    data object Calendar: MainRoutes("Calendar")
    data object Bus: MainRoutes("Bus")
}