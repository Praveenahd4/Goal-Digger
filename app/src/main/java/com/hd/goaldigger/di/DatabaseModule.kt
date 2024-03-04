package com.hd.goaldigger.di

import android.content.Context
import androidx.room.Room
import com.hd.goaldigger.data.GoalDiggerDatabase
import com.hd.goaldigger.util.Constants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule{

    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    )= Room.databaseBuilder(context,GoalDiggerDatabase::class.java,DATABASE_NAME).build()

    @Singleton
    @Provides
    fun provideDao(database: GoalDiggerDatabase)= database.goalDiggerDao()
}