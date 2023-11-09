package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                DotaScreen()
            }
        }
    }
}

@Composable
fun Tag(text: String) {
    Box(
        modifier = Modifier
            .background(
                color = Color(0xFF44A9F4).copy(alpha = 0.24f),
                shape = RoundedCornerShape(30.dp)
            )
            .padding(10.dp, 5.dp)
    ) {
        Text(
            text = text.uppercase(),
            color = Color(0xFF4aA0E7),
            fontWeight = FontWeight(700),
            fontSize = 10.sp,
        )
    }
}

@Composable
fun Comment(name: String, date: String, text: String) {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(38.dp)
                    .clip(shape = RoundedCornerShape(50.dp))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.chel),
                    contentDescription = "",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(7.dp)
            ) {
                Text(
                    text = "Auguste Conte",
                    color = Color(0xFFA8ADB7),
                    fontWeight = FontWeight(400),
                    fontSize = 16.sp,
                )
                Text(
                    text = "February 14, 2019",
                    color = Color(0xFFA8ADB7).copy(alpha = 0.4f),
                    fontWeight = FontWeight(400),
                    fontSize = 12.sp,
                )
            }
        }
        Text(
            text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
            color = Color(0xFFA8ADB7),
        )
    }
}

val comments = arrayOf(1, 2);

@Composable
fun MainScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {

        Image(
            painter = painterResource(id = R.drawable.header),
            contentDescription = "",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxSize(),
            alignment = Alignment.TopCenter

        )
        Column (
            modifier = Modifier
                .padding(0.dp, 290.dp, 0.dp, 0.dp)
                .background(
                    color = Color(0xFF010413),
                    shape = RoundedCornerShape(
                        topStart = 0.dp,
                        topEnd = 0.dp
                    )
                )
                .padding(24.dp, 0.dp, 24.dp, 25.dp)
        ) {
            Column(

            ) {
                Row(
                    modifier = Modifier
                        .offset (
                            y = -10.dp,
                            x = 0.dp
                        ),
                    horizontalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Column(
                        verticalArrangement = Arrangement.Top
                    ) {
                        Box(
                            modifier = Modifier
                                .size(88.dp)
                                .clip(shape = RoundedCornerShape(10.dp))
                                .background(color = Color.Black)
                                .border(BorderStroke(0.dp, Color.Gray))
                                .border(
                                    width = 0.dp,
                                    color = Color.Gray,
                                    shape = RoundedCornerShape(10.dp)
                                ),
                            contentAlignment = Alignment.Center,


                            ) {
                            Image(
                                painter = painterResource(id = R.drawable.logo),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(54.dp)
                            )
                        }
                    }
                    Column(
                        modifier = Modifier.padding(0.dp, 34.dp, 0.dp, 16.dp),
                        verticalArrangement = Arrangement.spacedBy(7.dp)
                    ) {
                        Text(
                            text = "DoTA 2",
                            fontWeight = FontWeight(700),
                            fontSize = 20.sp,
                            color = Color.White
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_five_stars),
                                contentDescription = "",
                                modifier = Modifier
                                    .height(12.dp)
                                    .width(74.dp)
                            )

                            Text(
                                text = "70M",
                                fontWeight = FontWeight(400),
                                fontSize = 12.sp,
                                color = Color(0xFF45454D)
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Tag("MOBA")
                    Tag("multiplayer")
                    Tag("strategy")
                }
                Spacer(modifier = Modifier.height(30.dp))
                Box {
                    Text(
                        text = "DoTA 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
                        color = Color(0xFFEEF2FB).copy(alpha = 0.7f),
                        fontWeight = FontWeight(400),
                        fontSize = 12.sp,
                    )
                }
                Spacer(modifier = Modifier.height(15.dp))
                Row(
                    modifier = Modifier
                        .height(135.dp)
                        .fillMaxWidth()
                        .horizontalScroll(state = ScrollState(0)),
                    horizontalArrangement = Arrangement.spacedBy(15.dp)

                ) {
                    Box(
                        modifier = Modifier
                            .width(240.dp)
                            .height(135.dp)
                            .clip(shape = RoundedCornerShape(10.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Box(modifier = Modifier
                            .fillMaxSize()
                            .background(Color.Black.copy(alpha = 0.5f))
                            .zIndex(1f)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.prev1),
                            contentDescription = "",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .fillMaxSize()
                                .zIndex(0f)
                        )
                    }
                    Box(
                        modifier = Modifier
                            .width(240.dp)
                            .height(135.dp)
                            .clip(shape = RoundedCornerShape(10.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Box(modifier = Modifier
                            .fillMaxSize()
                            .background(Color.Black.copy(alpha = 0.5f))
                            .zIndex(1f)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.prev2),
                            contentDescription = "",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .fillMaxSize()
                                .zIndex(0f)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Column {
                    Text(
                        text = "Review & Ratings",
                        color = Color(0xFFEEF2FB),
                        fontWeight = FontWeight(700),
                        fontSize = 16.sp,
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "4.9",
                            color = Color(0xFFFFFFFF),
                            fontWeight = FontWeight(700),
                            fontSize = 48.sp,
                        )
                        Column(
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            //Stars
                            Row {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_five_stars),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .height(12.dp)
                                        .width(74.dp)
                                )
                            }
                            Text(
                                text = "70M Reviews",
                                color = Color(0xFFA8ADB7),
                                fontWeight = FontWeight(400),
                                fontSize = 12.sp,
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(30.dp))
                LazyColumn(
                    modifier = Modifier
                        .heightIn(0.dp, 700.dp),
                ) {
                    itemsIndexed(comments) { index, comment ->
                        Comment(name = "", date = "", text = "")
                        if( index < comments.size - 1)
                            Divider(
                                color = Color.White,
                                thickness = 1.dp,
                                modifier = Modifier
                                    .padding(0.dp,25.dp)
                            )
                    }
                }
                Spacer(modifier = Modifier.height(40.dp))
                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(75.dp),
                    shape = RoundedCornerShape(10.dp),
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.yellow))
                ) {
                    Text(
                        text = "Install",
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun DotaScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        MainScreen()
    }
}
