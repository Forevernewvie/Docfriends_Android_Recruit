package com.jaebin.homework.recycler.adapter.ViewHolder

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jaebin.homework.AppContext
import com.jaebin.homework.R
import com.jaebin.homework.data.Title
import com.jaebin.homework.data.Title2
import com.jaebin.homework.databinding.CompanyListLayoutBinding
import com.jaebin.homework.databinding.ExpertListLayoutBinding
import com.jaebin.homework.recycler.adapter.companyAdapter
import com.jaebin.homework.recycler.adapter.expertAdapter

class companyListViewHolder(val item: CompanyListLayoutBinding) : RecyclerView.ViewHolder(item.root) {

    fun bind(outItem: Title2) {
        item.childTitle.text = outItem.title
        item.listBtn.setImageResource(R.drawable.ic_viewlist)
        item.childRecyclerCompany.adapter = companyAdapter(outItem.subItemList)
        item.childRecyclerCompany.layoutManager =
            LinearLayoutManager(AppContext.instance).also {
                it.orientation = LinearLayoutManager.HORIZONTAL
            }
        item.childRecyclerCompany.setHasFixedSize(true)

    }
}