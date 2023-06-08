package com.sayam.composeuipractice.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.sayam.composeuipractice.ChatItem
import com.sayam.composeuipractice.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen( ){
    Scaffold(
        topBar = {
                 TopAppBar(
                     colors = TopAppBarDefaults.mediumTopAppBarColors(
                         containerColor = Color(0xff128C7E),
                         titleContentColor = Color.White,
                         actionIconContentColor = Color.White
                         ),

                     title = {
                         Text(
                             text = stringResource(id = R.string.app_name),
                             style = MaterialTheme.typography.headlineMedium,
                         )
                     },
                     actions = {
                         Icon(painter = painterResource(id = R.drawable.ic_camara),
                             contentDescription = "camara",
                             modifier = Modifier.padding(end= 8.dp)
                         )
                         Icon(imageVector = Icons.Rounded.Search,
                             contentDescription = null,
                             modifier = Modifier.padding(horizontal = 8.dp)
                         )
                         Icon(
                             painter  = painterResource(id = R.drawable.ic_more),
                             contentDescription = null,
                             modifier = Modifier
                                 .padding(horizontal = 8.dp)
                                 .size(20.dp),
                         )
                     }
                 )
        },
        floatingActionButton = {
                               Icon(
                                   modifier = Modifier
                                       .clip(
                                           RoundedCornerShape(50.dp)
                                       )
                                       .size(60.dp)
                                       .background(Color(0xff128C7E)),
                                   imageVector = Icons.Default.Add,
                                   contentDescription = null,
                                   tint = Color.White,
                               )
        },
        floatingActionButtonPosition = FabPosition.End,
        bottomBar = {
                    BottomAppBar(
                        tonalElevation = 12.dp,
                        containerColor = Color.Transparent,
                        contentColor = Color.Black
                    ) {
                        BottomIcons()
                    }
        },
        content = {paddingValues ->
            Surface(modifier = Modifier.padding(paddingValues)) {
                val list = listOf<ChatItem>(
                    ChatItem(Icons.Default.List,"Sayam","Hello My name is sayam",Icons.Default.ShoppingCart,true),
                    ChatItem(Icons.Default.List,"Tanisha","Hello My name is tanisha",Icons.Default.ShoppingCart,true),
                    ChatItem(Icons.Default.List,"Kanishka","Hello My name is kanishka",Icons.Default.ShoppingCart,true),
                    ChatItem(Icons.Default.List,"Prena","Hello My name is Prena",Icons.Default.ShoppingCart,false),
                    ChatItem(Icons.Default.List,"nitish","Hello My name is nitish",Icons.Default.ShoppingCart,false),
                    ChatItem(Icons.Default.List,"addi","Hello My name is addi",Icons.Default.ShoppingCart,false),
                    ChatItem(Icons.Default.List,"anubhav","Hello My name is anubhav",Icons.Default.ShoppingCart,false),
                    ChatItem(Icons.Default.List,"kunal","Hello My name is kunal",Icons.Default.ShoppingCart,false),
                    ChatItem(Icons.Default.List,"pranav","Hello My name is pranav",Icons.Default.ShoppingCart,false),
                    ChatItem(Icons.Default.List,"manish","Hello My name is manish",Icons.Default.ShoppingCart,false)
                )
                ChatScreen(list)
            }
        }
    )

}

@Composable
fun BottomIcons() {
    Row (
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ){
        Column(horizontalAlignment = Alignment.CenterHorizontally){
            Icon(painter = painterResource(id = R.drawable.chat),contentDescription = null, modifier = Modifier.size(20.dp))
            Text(text = "Chat",style = MaterialTheme.typography.titleMedium)
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally){
            Icon(imageVector = Icons.Rounded.Call,contentDescription = null, modifier = Modifier.size(20.dp))
            Text(text = "Calls",style = MaterialTheme.typography.titleMedium)
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally){
            Icon(painter = painterResource(id = R.drawable.ic_community),contentDescription = null, modifier = Modifier.size(20.dp))
            Text(text = "Community",style = MaterialTheme.typography.titleMedium)
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally){
            Icon(painter = painterResource(id = R.drawable.status),contentDescription = null, modifier = Modifier.size(20.dp))
            Text(text = "Status",style = MaterialTheme.typography.titleMedium)
        }

    }
}
