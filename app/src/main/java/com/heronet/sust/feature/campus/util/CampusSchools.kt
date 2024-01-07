package com.heronet.sust.feature.campus.util

sealed class CampusSchools(val title: String) {
    data object PhysicalSciences: CampusSchools("Physical Sciences")
    data object AppliedSciencesAndTechnology: CampusSchools("Applied Sciences & Technology")
    data object LifeSciences: CampusSchools("Life Sciences")
    data object ManagementAndBusinessAdministration: CampusSchools("Management & Business Administration")
    data object AgricultureAndMineralSciences: CampusSchools("Agriculture & Mineral Sciences")
    data object SocialSciences: CampusSchools("Social Sciences")

}