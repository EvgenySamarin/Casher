package com.example.casher.model.entity

/**
 * Description a cash check object. Is test POJO object
 *
 * @author EvgenySamarin
 * @since 2019.12.08 v1
 */
data class CasherItemEntity(
    val title: String = "title",
    val type: String,
    val description: String
)