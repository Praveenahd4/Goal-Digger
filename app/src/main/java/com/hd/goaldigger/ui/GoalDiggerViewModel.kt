package com.hd.goaldigger.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hd.goaldigger.data.GoalDiggerRepository
import com.hd.goaldigger.data.GoalDiggerTask
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GoalDiggerViewModel @Inject constructor(private val repository: GoalDiggerRepository): ViewModel(){

    private val _allTasks =MutableStateFlow<List<GoalDiggerTask>>(emptyList())
    val allTask : StateFlow<List<GoalDiggerTask>> = _allTasks

    fun getAllTask() {
        viewModelScope.launch{
            repository.getAllTask.collect{
                _allTasks.value = it
            }
        }
    }


}