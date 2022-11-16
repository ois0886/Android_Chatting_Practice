package com.example.chatting_video

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.chatting_video.databinding.ActivityChatListBinding
import com.example.chatting_video.model.UserItem
import com.google.firebase.firestore.FirebaseFirestore
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder

class ChatListActivity : AppCompatActivity() {

    private val TAG = ChatListActivity::class.java.simpleName

    val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityChatListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = GroupAdapter<GroupieViewHolder>()


        db.collection("users")
            .get()
            .addOnSuccessListener { result ->
                for (document in result) {
                    adapter.add(UserItem(document.get("userName").toString()))
                    Log.d(TAG, "${document.id} => ${document.data}")
                }
                binding.recyclerView.adapter = adapter
            }
            .addOnFailureListener { exception ->
                Log.w(TAG, "Error getting documents.", exception)
            }

        adapter.setOnItemClickListener { item, view ->
            val intent = Intent(this, ChatRoomActivity::class.java)
            startActivity(intent)
        }


    }
}