package com.imrul.navigationpractice

sealed class Routes(
    val route: String
){
    object MainScreenRoute: Routes("main_screen")
    object DetailScreenRoute: Routes("detail_screen")

    fun withArgs(vararg args: String):String{
        return buildString {
            append(route)
            args.forEach {
                append("/$it")
            }
        }
    }
}
