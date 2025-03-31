package com.example.registration.Presentation.Screens.SignInScreen


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.registration.Presentation.Navigation.NavigationRoutes
import com.example.registration.Presentation.Screens.Components.TextFieldEmail
import com.example.registration.Presentation.Screens.Components.TextFieldDefault




@Composable
fun SignInScreen(navController: NavHostController) {
    val emailState = remember {
        mutableStateOf("")
    }
    val passwordState = remember {
        mutableStateOf("")
    }
    Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
    ){
        TextFieldEmail(value = emailState.value, onvaluechange = {
            emailState.value = it
        })
        Spacer(modifier = Modifier.height((10.dp)))
        TextFieldDefault(value = passwordState.value, onvaluechange = {
            passwordState.value = it
        })
        Spacer(modifier = Modifier.height((10.dp)))
        Button(onClick = {
        }) {
            Text(text = "Sign Up")
        }
    }
}

