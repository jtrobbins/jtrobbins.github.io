package com.jtrobbins.mywebsite

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform