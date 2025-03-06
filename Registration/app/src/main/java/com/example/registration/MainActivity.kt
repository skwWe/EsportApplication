package com.example.registration

import android.os.Bundle
import android.util.Log
import io.github.jan.supabase.postgrest.query.PostgrestBuilder
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import io.github.jan.supabase.postgrest.query.PostgrestResult
import io.github.jan.supabase.postgrest.postgrest
import com.example.registration.ui.theme.RegistrationTheme
import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.supabaseJson
import io.ktor.websocket.WebSocketDeflateExtension.Companion.install
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen().apply {
            setKeepOnScreenCondition {
                !viewModel.isLoading.value
            }
        }

        enableEdgeToEdge()
        getData()
        setContent {
            RegistrationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

    private fun getData() {
        lifecycleScope.launch {
            val client = getClient()
            val SupabaseReponse = client.postgrest["users"].select()
            val data = SupabaseReponse.decodeList<User>()
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
    val user_name: String = "",
    val real_name: String = "",
    val email: String = "",
    val country: String = "",
    val avatar_url: String = ""
)





@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RegistrationTheme {
        Greeting("Android")
    }
}