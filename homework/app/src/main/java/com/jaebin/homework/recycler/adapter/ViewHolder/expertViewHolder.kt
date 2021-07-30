package com.jaebin.homework.recycler.adapter.ViewHolder

import androidx.annotation.Dimension
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jaebin.homework.AppContext
import com.jaebin.homework.R
import com.jaebin.homework.data.Expert
import com.jaebin.homework.data.Tag
import com.jaebin.homework.data.TagX
import com.jaebin.homework.data.Title
import com.jaebin.homework.databinding.ExpertItemBinding
import com.jaebin.homework.recycler.adapter.convertHelper
import kotlin.math.exp

class expertViewHolder(val expertItem: ExpertItemBinding) : RecyclerView.ViewHolder(expertItem.root),
    convertHelper {


    fun bind(item: Expert){
        if(makeTagXString(item.tagList) == ""){
            expertItem.tagX.text = item.companyName
            expertItem.tagX.setTextSize(Dimension.SP,12F)
        } else{
            expertItem.tagX.text = makeTagXString(item.tagList)
            expertItem.hospitalName.text = item.companyName
        }
        expertItem.doctorNameKind.text = item.name+"("+item.typeName+")"
        Glide.with(AppContext.instance)
            .load(item.profileImagePath)
            .placeholder(R.color.grey)
            .into(expertItem.doctorFace)

    }

    override fun makeTagXString(item: List<TagX>): String {
        var str =""

        for (i in 0 until  item.size){
            if (item[i] !=null){
                str+="#"+item[i].name+" "
            }
            else{
                str =""
            }
        }
        return str
    }

    override fun makeTagString(item: List<Tag>): String {
        return ""
    }
    override fun longtoDateTime(time: Long): String {
        return ""
    }


}





