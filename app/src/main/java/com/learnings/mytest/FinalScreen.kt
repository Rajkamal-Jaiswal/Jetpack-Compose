package com.learnings.mytest

import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ClipboardManager
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.learnings.mytest.ui.theme.primaryColor
import com.learnings.mytest.ui.theme.primaryLight

@Composable
@Preview
fun PreviewFinalListScreenView() {
    FinalScreen(item = "Love is the light that dissolves all walls between souls, families, and nations.")
}

@Composable
fun FinalScreen(navHostController: NavHostController? = null, item: String?) {

    Surface() {

        val clipboardManager: ClipboardManager = LocalClipboardManager.current
        // Get the context
        val context = LocalContext.current
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = primaryColor)
        ) {

            Column {
                MainToolBar(title = "Item Details") {
                    navHostController?.popBackStack()
                }
                Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

                    Column {

                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            shape = RoundedCornerShape(25.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = primaryLight.copy(0.8f)
                            ), border = BorderStroke(1.dp, color = Color.White)
                        ) {
                            Box(modifier = Modifier.fillMaxWidth()) {
                                Text(
                                    text = item.toString(),
                                    modifier = Modifier
                                        .align(Alignment.Center)
                                        .fillMaxWidth()
                                        .padding(25.dp),
                                    color = Color.White,
                                    style = TextStyle(
                                        fontSize = 18.sp,
                                        textAlign = TextAlign.Center,
                                        fontWeight = FontWeight.Bold
                                    )
                                )
                            }
                        }

                        Row(
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Card(
                                modifier = Modifier
                                    .size(60.dp, 45.dp)
                                    .clickable {
                                        shareText(context, item.toString())
                                    },
                                shape = RoundedCornerShape(15.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = primaryLight.copy(
                                        0.7f
                                    )
                                )
                            ) {

                                Box(
                                    modifier = Modifier.fillMaxSize(),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Icon(
                                        painterResource(id = R.drawable.ic_share),
                                        contentDescription = "", tint = Color.White
                                    )
                                }
                            }


                            Card(
                                modifier = Modifier
                                    .size(60.dp, 45.dp)
                                    .clickable {
                                        clipboardManager.setText(AnnotatedString(item.toString()))
                                        Toast
                                            .makeText(context, "Text Copied", Toast.LENGTH_SHORT)
                                            .show()
                                    },
                                shape = RoundedCornerShape(15.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = primaryLight.copy(
                                        0.7f
                                    )
                                )
                            ) {

                                Box(
                                    modifier = Modifier.fillMaxSize(),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Icon(
                                        painterResource(id = R.drawable.ic_copy),
                                        contentDescription = "", tint = Color.White
                                    )
                                }
                            }
                        }
                    }


                }
            }
        }


    }


}

fun shareText(context: Context, text: String) {
    val intent = Intent().apply {
        action = Intent.ACTION_SEND
        putExtra(Intent.EXTRA_TEXT, text)
        type = "text/plain"
    }
    val shareIntent = Intent.createChooser(intent, null)
    context.startActivity(shareIntent)
}
