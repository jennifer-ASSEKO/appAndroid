package com.example.appandroid.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appandroid.R
import com.example.appandroid.model.ModuleData
import com.example.appandroid.view.ModuleAdapter.ModuleViewHolder

class ModuleAdapter(val c:Context,  val moduleList:ArrayList<ModuleData>):RecyclerView.Adapter<ModuleAdapter.ModuleViewHolder>()
{

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModuleViewHolder {
       val inflater = LayoutInflater.from(parent.context)
        val v = inflater.inflate(R.layout.list_item,parent, false)
        return ModuleViewHolder(v)
    }

    override fun onBindViewHolder(holder: ModuleViewHolder, position: Int) {
        val newList = moduleList[position]
        holder.name.text = newList.moduleName

    }

    override fun getItemCount(): Int {
       return moduleList.size
    }


    inner class ModuleViewHolder(val v: View):RecyclerView.ViewHolder(v){
        val name = v.findViewById<TextView>(R.id.module1) }

}