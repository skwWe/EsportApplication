package com.example.supabasesimpleproject.Presentation.Navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.supabasesimpleproject.Presentation.Screens.MainSreen.MainScreen
import com.example.supabasesimpleproject.Presentation.Screens.SigInScreen.SignInScreen
import com.example.supabasesimpleproject.Presentation.Screens.SignUpScreen.SignUpScreen
import com.example.supabasesimpleproject.Presentation.Screens.SplashScreen.SplashScreen


/**
 *Реализация навигации в приложении
 * */


@Composable
fun NavHost() {
    val navController = rememberNavController() //это функция Compose, которая запоминает экземпляр NavController между перекомпозициями, обеспечивая сохранение состояния навигации

    Surface(color = MaterialTheme.colorScheme.background) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            NavHost(navController = navController, startDestination = NavigationRoutes.SPLASH) {
                //Это функция, которая определяет composable-маршрут внутри NavHost. Каждый composable  соответствует определенному экрану приложения

                composable(NavigationRoutes.SPLASH)
                {
                    SplashScreen(navController)
                }
                composable(NavigationRoutes.SIGNIN)
                {
                    SignInScreen(navController)
                }
                composable(NavigationRoutes.SIGNUP)
                {
                    SignUpScreen(navController)
                }
                composable(NavigationRoutes.MAIN)
                {
                    MainScreen(navController)
                }
            }
        }
    }
}