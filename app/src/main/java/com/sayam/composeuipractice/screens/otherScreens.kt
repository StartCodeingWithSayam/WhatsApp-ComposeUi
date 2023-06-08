package com.sayam.composeuipractice.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sayam.composeuipractice.ChatItem

@Composable
fun ChatScreen(chats:List<ChatItem>) {
    Surface {
        LazyColumn{
            items(chats.size){
                ChatItem(chatItem = chats[it])
            }
        }
    }

}

@Composable
fun ChatItem(
    chatItem: ChatItem
) {
    Row {
        Column {
            Image(imageVector = chatItem.image, contentDescription = chatItem.heading)
            Text(text = chatItem.heading, style = MaterialTheme.typography.titleMedium)
            Text(text = chatItem.shortDisc,style=MaterialTheme.typography.bodyMedium)
            if (chatItem.isPinned)
                Image(imageVector = chatItem.pinnedImg, contentDescription = chatItem.shortDisc)
        }
    }
}
@Preview
@Composable
fun ChatPreview() {
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