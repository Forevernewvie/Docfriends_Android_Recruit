package com.jaebin.homework.recycler.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jaebin.homework.AppContext
import com.jaebin.homework.R
import com.jaebin.homework.data.Title
import com.jaebin.homework.databinding.ExpertListLayoutBinding
import com.jaebin.homework.recycler.adapter.ViewHolder.expertListViewHolder

class expertListAdapter (val data:List<Title>): RecyclerView.Adapter<expertListViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): expertListViewHolder {
        val binding = ExpertListLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return expertListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: expertListViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }


}