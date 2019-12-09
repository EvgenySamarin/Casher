package com.example.casher.model.repository

import com.example.casher.model.entity.CasherItemEntity
import com.example.casher.model.remote.ApiService
import javax.inject.Inject

/**
 * Implementation of the appropriate interface
 *
 * @author EvgenySamarin
 * @since 2019.12.08 v1
 */
class CheckRepositoryImpl @Inject constructor(private val apiService: ApiService) :
    CheckRepository {
    override fun getCheckInfo(): CasherItemEntity {
        return CasherItemEntity("stub_title", "stub_type", "stub_declaration")
    }
}