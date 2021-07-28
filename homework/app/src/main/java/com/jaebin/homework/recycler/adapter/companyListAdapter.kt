package com.jaebin.homework.recycler.adapter

import com.jaebin.homework.databinding.CompanyListLayoutBinding
import com.jaebin.homework.recycler.adapter.ViewHolder.companyViewHolder
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jaebin.homework.data.Title2
import com.jaebin.homework.recycler.adapter.ViewHolder.companyListViewHolder

class companyListAdapter (val data:List<Title2>): RecyclerView.Adapter<companyListViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): companyListViewHolder {
        val binding = CompanyListLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return companyListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: companyListViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }


}