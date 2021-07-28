package com.jaebin.homework.recycler.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jaebin.homework.data.Datas
import com.jaebin.homework.data.PageMap
import com.jaebin.homework.data.Title
import com.jaebin.homework.data.Title2
import com.jaebin.homework.databinding.CompanyListLayoutBinding
import com.jaebin.homework.databinding.ConsultItemBinding
import com.jaebin.homework.databinding.ExpertListLayoutBinding
import com.jaebin.homework.recycler.adapter.ViewHolder.companyListViewHolder
import com.jaebin.homework.recycler.adapter.ViewHolder.consultViewHolder
import com.jaebin.homework.recycler.adapter.ViewHolder.expertListViewHolder
import java.lang.RuntimeException

class multiAdapter(val data: Datas,val pageMap: PageMap,val title: List<Title>,val title2: List<Title2>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    val consultType:Int = 0
    val expertType:Int = 1
    val comapanyType:Int = 2

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = ConsultItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val ebinding = ExpertListLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val cbinding = CompanyListLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return when(viewType)
        {
            consultType-> return consultViewHolder(binding)
            expertType->   return expertListViewHolder(ebinding)
            comapanyType->   return companyListViewHolder(cbinding)
            else -> throw RuntimeException()
        }

    }

    override fun getItemViewType(position: Int): Int {
        return when(position){
            data.expertListPosition-1 ->expertType
            data.companyListPosition-1 ->comapanyType
            else -> consultType
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (position==data.expertListPosition-1){
                for(i in 0 until title.size){
                    (holder as expertListViewHolder).bind(title[i])
                }
        }else if(position==data.companyListPosition-1){
            for(i in 0 until title2.size){
                (holder as companyListViewHolder).bind(title2[i])
            }

        }else {
            (holder as consultViewHolder).bind(data.consultList[position])
        }
    }


    override fun getItemCount(): Int = pageMap.totalCount
}