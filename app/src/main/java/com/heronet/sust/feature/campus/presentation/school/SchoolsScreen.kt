package com.heronet.sust.feature.campus.presentation.school

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
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.heronet.sust.feature.campus.domain.model.School
import com.heronet.sust.feature.campus.presentation.CampusViewModel
import com.heronet.sust.feature.campus.util.CampusRoutes
import com.heronet.sust.navigation.util.MainRoutes

@Composable
fun SchoolsScreen(navController: NavHostController) {
    val campusViewModel = hiltViewModel<CampusViewModel>()
    val schools = remember {
        campusViewModel.getSchools()
    }

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(schools) { school ->
            SchoolItem(
                school,
                onNavigate = {
                    navController.navigate("${MainRoutes.Campus.route}/${CampusRoutes.Schools.route}/${school.title}")
                }
            )
        }
    }


}

@Composable
fun SchoolItem(school: School, onNavigate: () -> Unit) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onNavigate() }
    ) {
        Icon(
            imageVector = school.imageVector,
            contentDescription = school.title,
            modifier = Modifier
                .width(84.dp)
                .height(84.dp)
                .padding(horizontal = 16.dp)
        )
        Column {
            Text(
                text = school.title,
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = school.description,
                style = MaterialTheme.typography.bodySmall,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}