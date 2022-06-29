package com.practice.network_entities.endpoints.api.auth

import com.practice.network_entities.endpoints.EndpointGroups.ROOT_AUTH
import kotlinx.serialization.Serializable

/**
 * endpoint
 *  @see com.practice.network_entities.endpoints.api.auth.Registration.ENDPOINT
 *
 * query params:
 *  @see com.practice.network_entities.params.UserType
 *
 * body params:
 *  @see com.practice.network_entities.endpoints.api.auth.Registration.Body.Individual
 *  @see com.practice.network_entities.endpoints.api.auth.Registration.Body.Legal
 *
 * response:
 *  @see kotlin.String
 *
 * errors:
 *  @see com.practice.network_entities.endpoints.api.auth.Registration.Error.NICKNAME_ALREADY_USE
 */
object Registration {
    const val ENDPOINT = "$ROOT_AUTH/registration"

    object Body {
        @Serializable
        data class Individual(
            val fullName: String,
            val nickName: String,
            val password: String
        )

        @Serializable
        data class Legal(
            val organizationName: String,
            val nickName: String,
            val password: String
        )
    }

    object Error {
        const val NICKNAME_ALREADY_USE = 1
    }
}