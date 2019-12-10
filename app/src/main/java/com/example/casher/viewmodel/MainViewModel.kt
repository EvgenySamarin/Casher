package com.example.casher.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.casher.model.entity.CasherItemEntity
import com.example.casher.model.repository.CheckRepository
import com.example.casher.view.App
import javax.inject.Inject

class MainViewModel : ViewModel() {
    @Inject
    lateinit var repository: CheckRepository

    init {
        App.appComponent.inject(this)
    }

    private val _checkerData = MutableLiveData<CasherItemEntity>()
    val checkerData: LiveData<CasherItemEntity> = _checkerData

    fun getCheckerInfo() {
        _checkerData.value = repository.getCheckInfo()
    }

    fun updateCheckerData(entity: CasherItemEntity){
        _checkerData.value = entity
    }
}