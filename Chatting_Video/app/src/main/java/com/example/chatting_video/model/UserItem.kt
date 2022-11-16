package com.example.chatting_video.model

import android.widget.TextView
import com.example.chatting_video.R
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item

class UserItem(val name: String) : Item<GroupieViewHolder>() {
    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.itemView.findViewById<TextView>(R.id.name).text = name

    }

    override fun getLayout(): Int {
        return R.layout.message_list_row
    }


}