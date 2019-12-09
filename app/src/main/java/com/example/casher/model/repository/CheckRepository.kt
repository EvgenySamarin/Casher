package com.example.casher.model.repository

import com.example.casher.model.entity.CasherItemEntity

/**
 * Interface for interact view model with remote / cached data api
 *
 * @author EvgenySamarin
 * @since 2019.12.08 v1
 */
interface CheckRepository {
    fun getCheckInfo(): CasherItemEntity
}