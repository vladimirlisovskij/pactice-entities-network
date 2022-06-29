package com.practice.network_entities.endpoints.api.service

import com.practice.network_entities.endpoints.EndpointGroups.ROOT_SERVICE
import kotlinx.serialization.Serializable

object ServiceList {
    const val ENDPOINT = "$ROOT_SERVICE/list"

    object Param {
        const val CATEGORY = "CATEGORY"
        const val PAGE = "PAGE"
        const val CURRENT_USER = "CURRENT_USER"
    }

    @Serializable
    data class Service(
        val id: Long,
        val title: String,
        val description: String
    )
}