package com.example.registration.Presentation.Screens.Components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import java.lang.Error

@Composable

fun TextFieldEmail(value: String, onvaluechange: (String) -> Unit)
{
    androidx.compose.material3.TextField(
        value = value,
        textStyle = MaterialTheme.typography.displayMedium,
        onValueChange = {
            onvaluechange(it)
        },
        colors = TextFieldDefaults.colors(
            unfocusedContainerColor =  Color.LightGray,
            unfocusedTextColor = Color.Black,
            focusedContainerColor =  Color.LightGray,
            focusedTextColor = Color.Black,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            errorPlaceholderColor = Color.Red
        ),
        shape = RoundedCornerShape(15.dp),
    )
}

@Composable
fun TextFieldDefault(value: String, onvaluechange: (String) -> Unit) {
    androidx.compose.material3.TextField(
        value = value,
        textStyle = MaterialTheme.typography.displayMedium,
        onValueChange = {
            onvaluechange(it)
        },
        colors = TextFieldDefaults.colors(
            unfocusedContainerColor =  Color.LightGray,
            unfocusedTextColor = Color.Black,
            focusedContainerColor =  Color.LightGray,
            focusedTextColor = Color.Black,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent
        ),
        shape = RoundedCornerShape(15.dp),
    )
}