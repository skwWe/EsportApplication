package com.example.registration.Domain.Utils

import io.github.jan.supabase.auth.Auth
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest

object SupabaseClient {
    val supabase = createSupabaseClient(
        supabaseUrl = "https://rqykeqyzrofibweachlh.supabase.co",
        supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InJxeWtlcXl6cm9maWJ3ZWFjaGxoIiwicm9sZSI6ImFub24iLCJpYXQiOjE3Mzk4NjgxMTAsImV4cCI6MjA1NTQ0NDExMH0.zuMqazXD5GCiiit2WsqoA0Uhucr5O1gUVIM7q56khAQ"
    ) {
        install(Postgrest)
        install(Auth)
    }
}