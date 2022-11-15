package com.example.chatting_video

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chatting_video.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.loginButton.setOnClickListener {
            auth.signInWithEmailAndPassword(
                binding.loginEmail.toString(),
                binding.loginPassword.toString()
            )
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {

                    } else {
                    }
                }

        }


    }
}