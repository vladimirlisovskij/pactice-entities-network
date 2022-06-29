package com.practice.network_entities.endpoints.api.service

import com.practice.network_entities.endpoints.EndpointGroups.ROOT_SERVICE
import kotlinx.serialization.Serializable

object Create {
    const val ENDPOINT = "$ROOT_SERVICE/create"

    @Serializable
    data class Body(
        val title: String,
        val description: String,
        val startTime: Long,
        val endTime: Long,
        val categories: List<Long>
    )
}

