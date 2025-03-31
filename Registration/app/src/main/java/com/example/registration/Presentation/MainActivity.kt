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
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleCoroutineScope
import com.example.registration.Presentation.Navigation.Navigation
import com.example.registration.Presentation.theme.RegistrationTheme
import com.example.registration.Domain.Utils.SupabaseClient
import io.github.jan.supabase.auth.auth
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.postgrest.postgrest

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

    private fun getData() {
        LifecycleScope.launch {
            val client = SupabaseClient
            val supabaseReponse = client.supabase.postgrest["users"].select()
            val data = supabaseReponse.decodeList<User>()
            Log.e("supabase", data.toString())
            }
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



