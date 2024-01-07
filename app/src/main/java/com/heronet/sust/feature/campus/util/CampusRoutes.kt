package com.heronet.sust.feature.campus.util

sealed class CampusRoutes(val route: String) {
    data object Schools: CampusRoutes("Schools")
    data object Offices: CampusRoutes("Offices")
    data object Centers: CampusRoutes("Centers")
    data object Halls: CampusRoutes("Halls")
}