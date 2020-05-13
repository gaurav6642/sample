package com.example.sample

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recyler_layout.view.*

class RecyclerViewAdapter(private val context: MainActivity, private val arrylist: ArrayList<suitcase>) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.recyler_layout, parent, false))
    }
    override fun getItemCount(): Int {
        return arrylist.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.chapterName?.setImageResource(arrylist.get(position).img)
        holder.text.setText(arrylist.get(position).text)

    }
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val chapterName = view.profile_image
        val text = view.textView
    }
}