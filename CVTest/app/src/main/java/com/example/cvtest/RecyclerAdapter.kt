package com.example.cvtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val setUser: ArrayList<User>) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textFirst: TextView = view.findViewById(R.id.textView6)
        val textSecond: TextView = view.findViewById(R.id.textView7)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_infor, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {

        holder.textFirst.text = setUser[position].titleFirst
        holder.textSecond.text = setUser[position].titleSecond
    }

    override fun getItemCount(): Int {
        return setUser.size
    }

}