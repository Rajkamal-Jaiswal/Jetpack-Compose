@file:Suppress("UNUSED_EXPRESSION", "KotlinConstantConditions")

package com.learnings.mytest

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.learnings.mytest.Routing.MainRoutingItem
import com.learnings.mytest.ui.theme.primaryColor
import com.learnings.mytest.ui.theme.primaryLight

@Composable
fun CategoryScreen(navHostController: NavHostController) {
    Surface() {
        val context = LocalContext.current
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = primaryColor)
        ) {

            Column {
                MainToolBar("Category") { (context as? MainActivity)?.finish() }

                LazyColumn {
                    items(getList()) {
                        it
                        Card(
                            shape = RoundedCornerShape(20.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(75.dp)
                                .padding(top = 15.0.dp, start = 16.dp, end = 16.dp)
                                .clickable {
                                    navHostController.navigate(MainRoutingItem.mainListScreen.route + "/${it.title.toString()}")
                                },
                            colors = CardDefaults.cardColors(primaryLight)
                        ) {
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = it.title.toString(),
                                    style = TextStyle(fontWeight = FontWeight.Bold),
                                    fontSize = 18.sp,
                                    color = Color.White
                                )
                            }

                        }
                    }
                }
            }
        }

    }
}
