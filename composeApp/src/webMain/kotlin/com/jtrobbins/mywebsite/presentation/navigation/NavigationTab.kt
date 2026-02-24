package com.jtrobbins.mywebsite.presentation.navigation

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jtrobbins.mywebsite.presentation.feature.home.HomeScreen
import com.jtrobbins.mywebsite.presentation.feature.resume.ResumeScreen

enum class Destination(
    val route: String,
    val label: String
) {
    HOME("home", "home"),
    RESUME("resume", "resume")
}

@Composable
fun AppNavHost(
    navController: NavHostController,
    startDestination: Destination
) {
    NavHost(
        navController,
        startDestination = startDestination.route
    ) {
        Destination.entries.forEach { destination ->
            composable(destination.route) {
                when (destination) {
                    Destination.HOME -> HomeScreen()
                    Destination.RESUME -> ResumeScreen()
                }
            }
        }
    }
}

@Composable
fun HeaderWithTabs() {
    val navController = rememberNavController()
    val startDestination = Destination.HOME
    var selectedDestination by rememberSaveable { mutableIntStateOf(startDestination.ordinal) }

    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Text(text = "Jeff Robbins")

            PrimaryTabRow(
                selectedTabIndex = selectedDestination,
                modifier = Modifier.widthIn(max = 300.dp),
                containerColor = Color.Transparent,
                divider = {}
            ) {
                Destination.entries.forEachIndexed { index, destination ->
                    Tab(
                        selected = selectedDestination == index,
                        onClick = {
                            navController.navigate(route = destination.route)
                            selectedDestination = index
                        },
                        text = {
                            Text(
                                text = destination.label,
                                maxLines = 2,
                                overflow = TextOverflow.Ellipsis
                            )
                        }
                    )
                }
            }
        }
        HorizontalDivider(
            modifier = Modifier,
            thickness = DividerDefaults.Thickness,
            color = DividerDefaults.color
        )
        AppNavHost(
            navController = navController,
            startDestination = startDestination
        )
    }
}