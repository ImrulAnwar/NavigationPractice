package com.imrul.navigationpractice

import android.util.Log
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
    NavHost(navController = navController, startDestination = Screen.MainScreenObject.route ){
        composable(
            route = Screen.MainScreenObject.route
        ) {
            //still not sure what this is doing
            MainScreen(navController = navController)
        }
        composable(
            route = Screen.DetailScreenObject.route+"/{nameString}",
            arguments = listOf(
                navArgument(name = "nameString"){
                    type = NavType.StringType
                    defaultValue = "Imrul"
                }
            ),
            content = {
//                Log.d("problemcheck", "Navigation: ")
                DetailScreen(name = it.arguments?.getString("nameString"))
            }
        )
    }

}