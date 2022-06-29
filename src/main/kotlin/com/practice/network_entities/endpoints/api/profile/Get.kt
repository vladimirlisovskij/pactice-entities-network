package com.practice.network_entities.endpoints.api.profile

import com.practice.network_entities.endpoints.EndpointGroups.ROOT_PROFILE
import kotlinx.serialization.Serializable


/**
 * endpoint
 *  @see com.practice.network_entities.endpoints.api.profile.Get.ENDPOINT
 *
 * response:
 *  @see com.practice.network_entities.endpoints.api.profile.Get.Response.IndividualResponse
 *  @see com.practice.network_entities.endpoints.api.profile.Get.Response.LegalResponse
 */
object ProfileGet {
    const val ENDPOINT = "$ROOT_PROFILE/get"

    object Response {
        @Serializable
        data class IndividualResponse(
            val fullName: String
        )

        @Serializable
        data class LegalResponse(
            val organizationName: String
        )
    }
}