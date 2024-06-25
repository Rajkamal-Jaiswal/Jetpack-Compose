package com.learnings.mytest.Routing

sealed class MainRoutingItem(val route: String, val title: String) {

    object splashScreen : MainRoutingItem("splash", "Splash")
    object categoryScreen : MainRoutingItem("category", "Category")
    object mainListScreen : MainRoutingItem("my_list", "My List")
    object finalScreen : MainRoutingItem("final_screen", "Final Screen")
}