package com.practice.network_entities.endpoints.api.service

import com.practice.network_entities.endpoints.EndpointGroups.ROOT_SERVICE
import kotlinx.serialization.Serializable

object Categories {
    const val ENDPOINT = "$ROOT_SERVICE/categories"

    @Serializable
    data class Category(
        val name: String,
        val id: Long
    )
}