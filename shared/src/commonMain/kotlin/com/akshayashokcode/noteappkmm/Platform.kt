package com.akshayashokcode.noteappkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform