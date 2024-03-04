package com.hd.goaldigger.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.hd.goaldigger.navigation.destinations.listComposable
import com.hd.goaldigger.navigation.destinations.taskComposable
import com.hd.goaldigger.util.Constants.LIST_SCREEN

@Composable
fun SetupNavigation(navController: NavHostController){
    val screen = remember(navController) {
        Screens(navController)
    }
    NavHost(navController = navController, startDestination = LIST_SCREEN){
        listComposable(navigateToTaskScreen = screen.task)
        taskComposable(navigateToListScreen = screen.list)
    }
}