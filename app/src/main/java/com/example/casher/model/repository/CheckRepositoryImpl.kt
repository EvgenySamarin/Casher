package com.example.casher.model.repository

import com.example.casher.model.entity.CasherItemEntity

/**
 * Implementation of the appropriate interface
 *
 * @author EvgenySamarin
 * @since 2019.12.08 v1
 */
class CheckRepositoryImpl : CheckRepository {
    override fun getCheckInfo(): CasherItemEntity {
        return CasherItemEntity("stub_title", "stub_type", "stub_declaration")
    }
}