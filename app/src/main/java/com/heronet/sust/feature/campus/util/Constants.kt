package com.heronet.sust.feature.campus.util

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Agriculture
import androidx.compose.material.icons.filled.Apartment
import androidx.compose.material.icons.filled.Biotech
import androidx.compose.material.icons.filled.Hub
import androidx.compose.material.icons.filled.MeetingRoom
import androidx.compose.material.icons.filled.Memory
import androidx.compose.material.icons.filled.NightShelter
import androidx.compose.material.icons.filled.Payments
import androidx.compose.material.icons.filled.PriceChange
import androidx.compose.material.icons.filled.RocketLaunch
import androidx.compose.material.icons.filled.SocialDistance
import com.heronet.sust.feature.campus.domain.model.Department
import com.heronet.sust.feature.campus.domain.model.School

object Constants {
    val campusItems = listOf(
        CampusItemType(
            CampusRoutes.Schools.name,
            "School of Physical, Applied, Life Sciences etc.",
            Icons.Default.Apartment
        ),
        CampusItemType(
            CampusRoutes.Offices.name,
            "Offices of VC, Treasurer, Library etc.",
            Icons.Default.MeetingRoom,
        ),
        CampusItemType(
            CampusRoutes.Centers.name,
            "Computer and Information Center, Research Center etc.",
            Icons.Default.Hub,
        ),
        CampusItemType(
            CampusRoutes.Halls.name,
            "Shah Paran Hall, First Ladies Hall etc.",
            Icons.Default.NightShelter,
        )
    )

    val schools = listOf(
        School(
            title = "Physical Sciences",
            imageVector = Icons.Default.RocketLaunch,
            description = "Physics, Chemistry, Mathematics etc."
        ),
        School(
            title = "Applied Sciences & Technology",
            imageVector = Icons.Default.Memory,
            description = "CSE, EEE, CEP etc."
        ),
        School(
            title = "Life Sciences",
            imageVector = Icons.Default.Biotech,
            description = "GEB, BMB etc."
        ),
        School(
            title = "Management & Business Administration",
            imageVector = Icons.Default.PriceChange,
            description = "Departments like BBA"
        ),
        School(
            title = "Agriculture & Mineral Sciences",
            imageVector = Icons.Default.Agriculture,
            description = "FES, GEE etc."
        ),
        School(
            title = "Social Sciences",
            imageVector = Icons.Default.SocialDistance,
            description = "PSS, PAD, SCW etc."
        )
    )

}