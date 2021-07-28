package com.jaebin.homework.recycler.adapter.ViewHolder

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jaebin.homework.AppContext
import com.jaebin.homework.R
import com.jaebin.homework.data.Title
import com.jaebin.homework.databinding.ExpertListLayoutBinding
import com.jaebin.homework.recycler.adapter.expertAdapter

class expertListViewHolder(val item: ExpertListLayoutBinding) : RecyclerView.ViewHolder(item.root) {

    fun bind(outItem: Title){
        item.childTitle.text = outItem.title
        item.listBtn.setImageResource(R.drawable.ic_viewlist)
        item.childExpertRecycler.adapter = expertAdapter(outItem.sumItemList)
        item.childExpertRecycler.layoutManager =
            LinearLayoutManager(AppContext.instance).also { it.orientation= LinearLayoutManager.HORIZONTAL }
        item.childExpertRecycler.setHasFixedSize(true)
    }

}