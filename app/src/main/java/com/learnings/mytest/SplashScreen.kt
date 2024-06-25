package com.learnings.mytest

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.learnings.mytest.Routing.MainRoutingItem
import com.learnings.mytest.ui.theme.orangeColor
import com.learnings.mytest.ui.theme.primaryColor
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navHostController: NavHostController) {
    Surface() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = primaryColor)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
            ) {
                Image(
                    painterResource(R.drawable.logo),
                    contentDescription = null,
                    modifier = Modifier.size(120.dp)
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(15.dp),
                contentAlignment = Alignment.BottomCenter
            ) {
                CircularProgressIndicator(
                    modifier = Modifier
                        .size(55.dp)
                        .padding(10.dp),
                    strokeWidth = 5.dp,
                    color = orangeColor
                )


            }

            /*  Handler().postDelayed(Runnable {
                  navHostController.navigate(MainRoutingItem.categoryScreen.route)
              }, 3500)*/

            LaunchedEffect(Unit) {
                delay(2000) // Delay for 2 seconds (simulate loading)
                navHostController.navigate(MainRoutingItem.categoryScreen.route) {
                    popUpTo(MainRoutingItem.splashScreen.route) {
                        inclusive = true
                    } // Remove "splash" from the back stack
                }
            }


        }
    }
}