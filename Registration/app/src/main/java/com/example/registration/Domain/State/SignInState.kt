package com.example.registration.Domain.State

data class SignInState (
    val email: String = "",
    val password: String = "",
    var errorEmail:Boolean = false,
    val errorPassword:Boolean = false
)