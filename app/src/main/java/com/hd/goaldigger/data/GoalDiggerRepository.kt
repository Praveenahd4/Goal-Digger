package com.hd.goaldigger.data

import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class GoalDiggerRepository @Inject constructor(private val goalDiggerDao: GoalDiggerDao) {

    val getAllTask: Flow<List<GoalDiggerTask>> = goalDiggerDao.getAllTask()
    val sortByLowPriority: Flow<List<GoalDiggerTask>> = goalDiggerDao.sortByLowPriority()
    val sortByHighPriority: Flow<List<GoalDiggerTask>> = goalDiggerDao.sortByHighPriority()

    fun getSelectedTask(taskId:Int): Flow<GoalDiggerTask>{
        return goalDiggerDao.getSelectedTask(taskId)
    }

    suspend fun upsertTask(goalDiggerTask: GoalDiggerTask){
        goalDiggerDao.upsertTask(goalDiggerTask= goalDiggerTask)
    }
    suspend fun deleteTask(goalDiggerTask: GoalDiggerTask){
        goalDiggerDao.deleteTask(goalDiggerTask= goalDiggerTask)
    }
    suspend fun deleteAllTasks(){
        goalDiggerDao.deleteAllTasks()
    }
    fun searchDatabase(searchQuery:String): Flow<List<GoalDiggerTask>>{
        return goalDiggerDao.searchDatabase(searchQuery= searchQuery)
    }
}