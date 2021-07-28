package com.jaebin.homework.recycler.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jaebin.homework.data.Company
import com.jaebin.homework.databinding.CompanyItemBinding
import com.jaebin.homework.recycler.adapter.ViewHolder.companyViewHolder


class companyAdapter(val data: List<Company>) : RecyclerView.Adapter<companyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): companyViewHolder {
        val binding = CompanyItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return companyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: companyViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size
}
