package com.heronet.sust.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(navController: NavHostController, scrollBehavior: TopAppBarScrollBehavior) {
    var canNavigateBack by remember { mutableStateOf(false) }
    var title by remember {
        mutableStateOf("SUST")
    }

    DisposableEffect(navController) {
        val listener = NavController.OnDestinationChangedListener { controller, _, _ ->
            canNavigateBack = controller.previousBackStackEntry != null
            title = getCurrentRoute(getRouteWithArguments(navController))
        }
        navController.addOnDestinationChangedListener(listener)
        onDispose {
            navController.removeOnDestinationChangedListener(listener)
        }
    }

    TopAppBar(
        title = {
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        },
        actions = {

        },
        scrollBehavior = scrollBehavior,
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = { navController.navigateUp() }) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Back"
                    )
                }
            }
        }
    )
}

private fun getRouteWithArguments(
    navController: NavHostController
): String {
    val destination = navController.currentDestination
    var route = destination?.route

    navController.currentBackStackEntry?.arguments?.let { bundle ->
        destination?.arguments?.keys?.forEach { key ->
            val value = destination.arguments[key]?.type?.get(bundle, key)?.toString() ?: "Null"
            route = route?.replaceFirst("{$key}", value)
        }
    }
    return route ?: "SUST"
}

private fun getCurrentRoute(longRoute: String): String {
    val parts = longRoute.split('/')

    return parts[parts.size - 1]
}