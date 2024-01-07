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
import com.heronet.sust.core.presentation.components.SimpleClickableItem
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
            SimpleClickableItem(
                title = school.title,
                description = school.description,
                imageVector = school.imageVector,
                onClick = {
                    navController.navigate("${MainRoutes.Campus.route}/${CampusRoutes.Schools.route}/${school.title}")
                }
            )
        }
    }


}
