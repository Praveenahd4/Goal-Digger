package com.hd.goaldigger.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [GoalDiggerTask::class], version = 1, exportSchema = false)
abstract class GoalDiggerDatabase:RoomDatabase() {
    abstract fun goalDiggerDao(): GoalDiggerDao
}