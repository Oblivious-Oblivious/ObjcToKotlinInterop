package com.example.objctokotlininterop

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform