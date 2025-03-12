package com.example.registration.Presentation.Screens.SplashScreen

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.registration.Presentation.Navigation.NavigationRoutes
import com.example.registration.R

@Composable
fun SplashWithAnimation(modifier: Modifier = Modifier, navController: NavController) {
    var scale = remember {
        Animatable(0f)
    }

    var animateAgain by remember {
        mutableStateOf(false)
    }

    LaunchedEffect(key1 = true)
    {
        scale.animateTo(
            targetValue = 360f,
            animationSpec = tween(
                durationMillis = 2000,
                easing = {
                    OvershootInterpolator(2f).getInterpolation(it)
                }
            )
        )

        navController.navigate(NavigationRoutes.SIGNIN)
        {
            popUpTo(NavigationRoutes.SPLASH)
            {
                inclusive = true
            }
        }
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .imePadding()
    ) {
        Image(
            modifier = Modifier
                .size(200.dp)
                .weight(1f)
                .rotate(scale.value),
            painter = painterResource(id = R.drawable.gamepad),
            contentDescription = "logo"
        )
    }
}

