package com.example.googleauth.presentation

data class SignInState(
    val isSignInSuccessful: Boolean = false,
    val signInError: String? = null
)
