package com.jaebin.homework.recycler.adapter.ViewHolder

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jaebin.homework.AppContext
import com.jaebin.homework.R
import com.jaebin.homework.data.Company
import com.jaebin.homework.data.Expert
import com.jaebin.homework.data.Title2
import com.jaebin.homework.databinding.CompanyItemBinding
import com.jaebin.homework.databinding.CompanyListLayoutBinding
import com.jaebin.homework.recycler.adapter.companyAdapter

class companyViewHolder(val companyitem: CompanyItemBinding) : RecyclerView.ViewHolder(companyitem.root) {

    fun bind(item: Company){
        companyitem.hospitalAddr.text = item.address
        companyitem.hospitalAddrEtc.text = item.addressEtc
        companyitem.hospitalName.text = item.companyName
        Glide.with(AppContext.instance)
            .load(item.introPath)
            .into(companyitem.hospitalImg)
    }

}