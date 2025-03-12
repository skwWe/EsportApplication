package com.example.registration.Presentation.Navigation

import android.app.Presentation
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.registration.Presentation.Screens.MainScreen.MainScreen
import com.example.registration.Presentation.Screens.SignInScreen.SignInScreen
import com.example.registration.Presentation.Screens.SplashScreen.SplashWithAnimation

@Composable
fun Navigation() {
    val navController = rememberNavController()
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        NavHost(navController = navController, startDestination = NavigationRoutes.SPLASH)
        {
            composable(NavigationRoutes.SPLASH)
            {
                SplashWithAnimation(navController = navController)
            }
            composable(NavigationRoutes.SIGNIN)
            {
                SignInScreen(navController = navController)
            }
            composable(NavigationRoutes.MAIN)
            {
                MainScreen(navController = navController)
            }
        }
    }
}