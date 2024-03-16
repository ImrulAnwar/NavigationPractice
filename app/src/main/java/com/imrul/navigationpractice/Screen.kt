package com.imrul.navigationpractice

import android.util.Log

sealed class Screen(
    val route: String
){
    object MainScreenObject: Screen("main_screen")
    object DetailScreenObject: Screen("detail_screen")

    fun withArgs(vararg args: String):String{
        return buildString {
            append(route)
            args.forEach {
                Log.d("problemcheck", "goToDetailPage: ")
                append("/$it")
            }
        }
    }
}
