package com.hd.goaldigger.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.hd.goaldigger.ui.screens.TaskScreen
import com.hd.goaldigger.util.Action
import com.hd.goaldigger.util.Constants.TASK_ARGUMENT_KEY
import com.hd.goaldigger.util.Constants.TASK_SCREEN

fun NavGraphBuilder.taskComposable(
    navigateToListScreen: (Action)->Unit
){
    composable(
        route=TASK_SCREEN,
        arguments= listOf(navArgument(TASK_ARGUMENT_KEY){
            type = NavType.IntType
        })
    ){
        TaskScreen()
    }
}
