package com.example.cvtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val setUser: ArrayList<User>) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtName: TextView = view.findViewById(R.id.txt_name)
        val txtDate: TextView = view.findViewById(R.id.txt_date)
        val txtTitleInformation: TextView = view.findViewById(R.id.txt_title_information)
        val txtDatePin: TextView = view.findViewById(R.id.txt_date_pin)
        val txtContentInformation: TextView = view.findViewById(R.id.txt_content_information)
        val btnAttachment : Button = view.findViewById(R.id.btn_attachment)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_information, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.txtName.text = setUser[position].txtName
        holder.txtDate.text = setUser[position].txtDate
        holder.txtTitleInformation.text = setUser[position].txtTitleInformation
        holder.txtDatePin.text = setUser[position].txtDatePin
        holder.txtContentInformation.text = setUser[position].txtContentInformation
        holder.btnAttachment.text = setUser[position].buttonAttachments
    }

    override fun getItemCount(): Int {
        return setUser.size
    }

}