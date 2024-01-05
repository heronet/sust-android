package com.heronet.sust

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.heronet.sust.navigation.BottomNavBar
import com.heronet.sust.navigation.MainNavHost

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()

    val navController = rememberNavController()

    var canNavigateBack by remember { mutableStateOf(false) }

    DisposableEffect(navController) {
        val listener = NavController.OnDestinationChangedListener { controller, _, _ ->
            canNavigateBack = controller.previousBackStackEntry != null
        }
        navController.addOnDestinationChangedListener(listener)
        onDispose {
            navController.removeOnDestinationChangedListener(listener)
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(R.string.app_name),
                        fontWeight = FontWeight.Bold
                    )
                },
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.Search, contentDescription = "Search")
                    }
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
        },
        bottomBar = {
            BottomNavBar(navController)
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .nestedScroll(scrollBehavior.nestedScrollConnection)
        ) {
            MainNavHost(navController)
        }
    }
}

