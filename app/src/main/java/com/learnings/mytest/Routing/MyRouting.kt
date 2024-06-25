package com.learnings.mytest.Routing


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.learnings.mytest.CategoryScreen
import com.learnings.mytest.FinalScreen
import com.learnings.mytest.MyListScreen
import com.learnings.mytest.SplashScreen

@Composable
fun MyRouting(navHostController: NavHostController) {
    NavHost(
        navController = navHostController, startDestination = MainRoutingItem.splashScreen.route
    ) {
        composable(MainRoutingItem.splashScreen.route) {
            SplashScreen(navHostController)
        }
        composable(MainRoutingItem.categoryScreen.route) {
            CategoryScreen(navHostController)
        }

        composable(MainRoutingItem.mainListScreen.route + "/{title}") {
            val title = it.arguments?.getString("title")
            MyListScreen(navHostController, title)
        }

        composable(MainRoutingItem.finalScreen.route+"/{item}") {
            val item = it.arguments?.getString("item")
            FinalScreen(navHostController,item)
        }
    }


}