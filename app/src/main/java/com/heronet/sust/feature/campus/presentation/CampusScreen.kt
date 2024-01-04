package com.heronet.sust.feature.campus.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Apartment
import androidx.compose.material.icons.filled.Hub
import androidx.compose.material.icons.filled.MeetingRoom
import androidx.compose.material.icons.filled.NightShelter
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.heronet.sust.feature.campus.util.CampusItemType

@Composable
fun CampusScreen() {

    val campusItems = listOf(
        CampusItemType(
            "Departments",
            "Departments like Physics, CSE, Chemical Engineering etc.",
            Icons.Default.Apartment
        ),
        CampusItemType(
            "Offices",
            "Offices of VC, Treasurer, Library etc.",
            Icons.Default.MeetingRoom,
        ),
        CampusItemType(
            "Centers",
            "Computer and Information Center, Research Center etc.",
            Icons.Default.Hub,
        ),
        CampusItemType(
            "Halls",
            "Shah Paran Hall, First Ladies Hall etc.",
            Icons.Default.NightShelter,
        )
    )

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(campusItems) { item ->
            CampusItem(item)
        }
    }
}

@Composable
fun CampusItem(item: CampusItemType) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .clickable {  }
    ) {
        Icon(
            imageVector = item.imageVector,
            contentDescription = item.title,
            modifier = Modifier
                .width(84.dp)
                .height(84.dp)
                .padding(horizontal = 16.dp)
        )
        Column {
            Text(
                text = item.title,
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(text = item.description, style = MaterialTheme.typography.bodySmall)
        }
    }
}