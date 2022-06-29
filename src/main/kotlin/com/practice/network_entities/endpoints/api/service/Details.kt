package com.practice.network_entities.endpoints.api.service

import com.practice.network_entities.endpoints.EndpointGroups.ROOT_SERVICE
import com.practice.network_entities.params.UserType
import kotlinx.serialization.Serializable

object Details {
    const val ENDPOINT = "$ROOT_SERVICE/details"

    object Param {
        const val ID = "ID"
    }

    @Serializable
    data class ServiceDetails(
        val title: String,
        val description: String,
        val startTime: Long,
        val endTime: Long,
        val owner: String,
        val ownerType: UserType,
        val categories: List<Long>
    )
}