package com.heronet.sust.feature.campus.presentation.school

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.heronet.sust.feature.campus.domain.model.Department
import com.heronet.sust.feature.campus.presentation.CampusViewModel

@Composable
fun DepartmentsScreen(schoolName: String) {
    val campusViewModel = hiltViewModel<CampusViewModel>()
    val departments = remember {
        campusViewModel.getDepartments(schoolName)
    }

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(departments) {
            Department(department = it)
        }
    }
}

@Composable
fun Department(department: Department) {
    var expanded by remember {
        mutableStateOf(false)
    }

    Card(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = "Department of ${department.title}",
                style = MaterialTheme.typography.titleLarge,
                overflow = TextOverflow.Ellipsis,
            )
            Text(
                text = department.description,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier
                    .padding(vertical = 8.dp)
                    .animateContentSize()
                    .clickable { expanded = !expanded },
                overflow = TextOverflow.Ellipsis,
                maxLines = if (expanded) Int.MAX_VALUE else 4
            )
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Contacts")
            }
        }
    }
}

