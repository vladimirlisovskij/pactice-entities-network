package com.practice.network_entities.response_status

import kotlinx.serialization.Serializable

@Serializable
enum class ErrorType {
    DEFAULT, SPECIFIC
}