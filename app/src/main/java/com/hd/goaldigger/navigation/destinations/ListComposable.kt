package com.hd.goaldigger.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.hd.goaldigger.ui.screens.list.ListScreen
import com.hd.goaldigger.util.Constants.LIST_ARGUMENT_KEY
import com.hd.goaldigger.util.Constants.LIST_SCREEN

fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (taskId:Int) -> Unit
){
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENT_KEY){
            type = NavType.StringType
        })
    ){
        ListScreen(navigateToTaskScreen = navigateToTaskScreen)
    }
}