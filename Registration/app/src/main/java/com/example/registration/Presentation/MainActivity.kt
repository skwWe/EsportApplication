package com.example.registration.Presentation

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import android.window.SplashScreen
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.registration.Presentation.Navigation.Navigation
import com.example.registration.Presentation.theme.RegistrationTheme


class MainActivity : ComponentActivity() {

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //getData()
        setContent {
            RegistrationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
                    Navigation()
                }
            }
        }
    }
}

/*
    private fun getData() {
        lifecycleScope.launch {
            val client = getClient()
            val supabaseReponse = client.postgrest["users"].select()
            val data = supabaseReponse.decodeList<User>()
            Log.e("supabase", data.toString())
            }
        }
    }

    private fun getClient(): SupabaseClient {
        return createSupabaseClient(
            supabaseUrl = "https://rqykeqyzrofibweachlh.supabase.co",
            supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InJxeWtlcXl6cm9maWJ3ZWFjaGxoIiwicm9sZSI6ImFub24iLCJpYXQiOjE3Mzk4NjgxMTAsImV4cCI6MjA1NTQ0NDExMH0.zuMqazXD5GCiiit2WsqoA0Uhucr5O1gUVIM7q56khAQ",
        ) {
            install(Postgrest)
        }
    }

@kotlinx.serialization.Serializable
data class User(
    val id: Int = 0,
    val username: String = "",
    val realname: String = "",
    val email: String = "",
    val country: String = "",
    val avatarurl: String = ""
)
*/



