package com.example.registration.Domain.models
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


class Profile (
    val username: String,
    val realname: String,
    val email: String,
    val country: String,
    val avatarurl: String?
)