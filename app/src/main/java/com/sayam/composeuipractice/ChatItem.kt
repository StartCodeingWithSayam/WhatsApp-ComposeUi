package com.sayam.composeuipractice

import androidx.compose.ui.graphics.vector.ImageVector

data class ChatItem(
    var image:ImageVector,
    var heading:String,
    var shortDisc:String,
    var pinnedImg:ImageVector,
    var isPinned:Boolean
)
