package com.example.listoffilms

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(film: Film) {
        val poster = itemView.findViewById<ImageView>(R.id.poster)
        val name = itemView.findViewById<TextView>(R.id.name)
        val hasOscar = itemView.findViewById<ImageView>(R.id.oscar)
        val rating = itemView.findViewById<TextView>(R.id.rating)

        Glide
            .with(itemView.context)
            .load(film.poster)
            .into(poster)
        name.text = film.name
        hasOscar.isVisible = film.hasOscar
        rating.text = film.rating.toString()
    }
}