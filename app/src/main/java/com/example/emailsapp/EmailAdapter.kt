package com.example.emailsapp



import android.widget.TextView

import com.example.emailsapp.R

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class EmailAdapter(private val emails: List<Email>) : RecyclerView.Adapter<EmailAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailAdapter.ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val contactView = inflater.inflate(R.layout.email_item, parent, false)
        // Return a new holder instance
        return ViewHolder(contactView)

    }

    override fun onBindViewHolder(holder: EmailAdapter.ViewHolder, position: Int) {

        val email = emails[position]
        // Set item views based on views and data model
        holder.senderTextView.text = email.sender
        holder.titleTextView.text = email.title
        holder.summaryTextView.text = email.summary
    }


    override fun getItemCount(): Int {
        return emails.size

    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val senderTextView: TextView = itemView.findViewById(R.id.sender)
        val titleTextView: TextView = itemView.findViewById(R.id.title)
        val summaryTextView: TextView = itemView.findViewById(R.id.summary)


    }
}



