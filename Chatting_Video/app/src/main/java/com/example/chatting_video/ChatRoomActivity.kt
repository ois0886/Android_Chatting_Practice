package com.example.chatting_video

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chatting_video.databinding.ActivityChatRoomBinding
import com.example.chatting_video.model.ChatLeftYou
import com.example.chatting_video.model.ChatRightMe
import com.example.chatting_video.model.UserItem
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder

class ChatRoomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityChatRoomBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = GroupAdapter<GroupieViewHolder>()

        adapter.add(ChatLeftYou())
        adapter.add(ChatLeftYou())
        adapter.add(ChatRightMe())
        adapter.add(ChatLeftYou())
        adapter.add(ChatRightMe())
        adapter.add(ChatRightMe())
        adapter.add(ChatLeftYou())

        binding.recyclerViewChat.adapter = adapter


    }
}