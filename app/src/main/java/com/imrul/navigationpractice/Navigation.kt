package com.imrul.navigationpractice

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.imrul.navigationpractice.screens.DetailScreen
import com.imrul.navigationpractice.screens.MainScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.MainScreenRoute.route ){
        composable(
            route = Routes.MainScreenRoute.route,
        ) {
            MainScreen(navController = navController)
        }
        composable(
            route = Routes.DetailScreenRoute.route+"/{nameString}",
            arguments = listOf(
                navArgument(name = "nameString"){
                    type = NavType.StringType
                }
            )
        ){
            DetailScreen(name = it.arguments?.getString("nameString"))
        }
    }
}