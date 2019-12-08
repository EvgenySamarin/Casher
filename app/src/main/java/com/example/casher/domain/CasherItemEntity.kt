package com.example.casher.domain

/**
 * Description a cash check object
 *
 * @author EvgenySamarin
 * @since 2019.12.08 v1
 */
data class CasherItemEntity(
    val title: String = "title",
    val type: String,
    val description: String
)