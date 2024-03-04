package com.hd.goaldigger.navigation

import androidx.navigation.NavHostController
import com.hd.goaldigger.util.Action
import com.hd.goaldigger.util.Constants.LIST_SCREEN

class Screens(navControler:NavHostController) {
    val list: (Action) -> Unit ={action->
        navControler.navigate("list/${action.name}"){
            popUpTo(LIST_SCREEN){inclusive = true}
        }
    }
    val task: (Int)-> Unit={taskId->
        navControler.navigate("task/$taskId")
    }
}