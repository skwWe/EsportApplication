package com.example.registration.Domain.State

data class SignUpState (
    val email: String = "",
    val password: String = "",
    val confirmPassword: String = "",
    val username: String = "",
    val surname:String = "",
    val dateBirth: String? = null,
    var isEmailError:Boolean = false
)