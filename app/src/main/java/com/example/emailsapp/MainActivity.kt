package com.example.emailsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager


class MainActivity : AppCompatActivity() {
    private lateinit var emails: List<Email>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val emailsCView = findViewById<RecyclerView>(R.id.emailsCView)

        emails= EmailFetcher.getEmails()
        val adapter = EmailAdapter(emails)
        emailsCView.adapter = adapter
        emailsCView.layoutManager = LinearLayoutManager(this)




    }
}