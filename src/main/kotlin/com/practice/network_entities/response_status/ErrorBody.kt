package com.practice.network_entities.response_status

import kotlinx.serialization.Serializable


@Serializable
data class ErrorBody(
    val errorType: ErrorType,
    val errorCode: Int,
    val message: String?
)