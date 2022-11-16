package com.example.chatting_video.model

import android.widget.TextView
import com.example.chatting_video.R
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item

class ChatRightMe : Item<GroupieViewHolder>() {
    override fun bind(viewHolder: GroupieViewHolder, position: Int) {

    }

    override fun getLayout(): Int {
        return R.layout.chat_right_me
    }


}