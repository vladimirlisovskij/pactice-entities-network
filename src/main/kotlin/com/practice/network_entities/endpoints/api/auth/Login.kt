package com.practice.network_entities.endpoints.api.auth

import com.practice.network_entities.endpoints.EndpointGroups.ROOT_AUTH
import kotlinx.serialization.Serializable

/**
 * endpoint
 *  @see com.practice.network_entities.endpoints.api.auth.Login.ENDPOINT
 *
 * query params:
 *  @see com.practice.network_entities.params.UserType
 *
 * body params:
 *  @see com.practice.network_entities.endpoints.api.auth.Login.Body.LoginDetails
 *
 * response:
 *  @see kotlin.String
 *
 * errors:
 *  @see com.practice.network_entities.endpoints.api.auth.Login.Error.INVALID_AUTH_COMBINATION
 */
object Login {
    const val ENDPOINT = "$ROOT_AUTH/login"

    object Body {
        @Serializable
        data class LoginDetails(
            val nickName: String,
            val password: String
        )
    }

    object Error {
        const val INVALID_AUTH_COMBINATION = 1
    }
}
