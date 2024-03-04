package com.hd.goaldigger.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface GoalDiggerDao {

    @Upsert
    suspend fun upsertTask(goalDiggerTask: GoalDiggerTask)

    @Delete
    suspend fun deleteTask(goalDiggerTask: GoalDiggerTask)

    @Query("DELETE FROM goalDigger_table" )
    suspend fun deleteAllTasks()

    @Query("SELECT * FROM goalDigger_table ORDER BY id ASC")
    fun getAllTask(): Flow<List<GoalDiggerTask>>

    @Query("SELECT * FROM goalDigger_table WHERE id=:taskId")
    fun getSelectedTask(taskId:Int): Flow<GoalDiggerTask>

    @Query("SELECT * FROM goalDigger_table WHERE title LIKE :searchQuery OR description LIKE :searchQuery")
    fun searchDatabase(searchQuery: String):Flow<List<GoalDiggerTask>>

    @Query("SELECT * FROM goalDigger_table ORDER BY CASE WHEN priority LIKE'L%' THEN 1 WHEN priority LIKE'M%' THEN 2 WHEN priority LIKE'H%' THEN 3 END")
    fun sortByLowPriority():Flow<List<GoalDiggerTask>>

    @Query("SELECT * FROM goalDigger_table ORDER BY CASE WHEN priority LIKE'H%' THEN 1 WHEN priority LIKE'M%' THEN 2 WHEN priority LIKE'L%' THEN 3 END")
    fun sortByHighPriority():Flow<List<GoalDiggerTask>>


}