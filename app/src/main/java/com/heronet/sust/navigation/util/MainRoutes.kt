package com.heronet.sust.navigation.util

sealed class MainRoutes(val route: String) {
    data object Campus: MainRoutes("campus")
    data object Updates: MainRoutes("updates")
    data object Calendar: MainRoutes("calendar")
    data object Bus: MainRoutes("bus")
}