package com.example.casher.viewmodel

import androidx.lifecycle.ViewModel
import com.example.casher.model.repository.CheckRepository

class MainViewModel : ViewModel() {
    lateinit var repository: CheckRepository
}