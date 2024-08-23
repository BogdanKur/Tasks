package com.example.tasks

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModel

class TaskViewModelFactory(private val dao: TaskDao)
    :ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(TaskViewModel::class.java)) {
                return TaskViewModel(dao) as T
            }
            throw IllegalArgumentException("Unknown ViewModel")
        }
}