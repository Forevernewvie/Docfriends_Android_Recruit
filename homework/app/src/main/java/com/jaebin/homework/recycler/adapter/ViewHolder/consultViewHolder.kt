package com.jaebin.homework.recycler.adapter.ViewHolder

import androidx.recyclerview.widget.RecyclerView
import com.jaebin.homework.data.Consult
import com.jaebin.homework.data.Tag
import com.jaebin.homework.data.TagX
import com.jaebin.homework.databinding.ConsultItemBinding
import com.jaebin.homework.recycler.adapter.convertHelper
import java.text.SimpleDateFormat
import java.util.*

class consultViewHolder(val item: ConsultItemBinding) : RecyclerView.ViewHolder(item.root),convertHelper{

    fun bind(consultItem: Consult){
        item.answerCnt.text = consultItem.answerCnt.toString()
        item.context.text = consultItem.context
        item.title.text = consultItem.title
        item.timeStamp.text = longtoDateTime(consultItem.regDate)
        item.tag.text = makeTagString(consultItem.tagList)
    }

    override fun makeTagString(item: List<Tag>): String {
        var str =""
        var cnt = 0
        for (i in 0 until  item.size){
            if (item[i] !=null){
                if(cnt==4){
                    str+="#"+item[i].name+"\n"
                    cnt=0
                }
                str+="#"+item[i].name+" "
                cnt+=1
            }
            else{
                str =""
            }
        }
        return str
    }

    override fun makeTagXString(item: List<TagX>): String {
        return ""
    }

    override fun longtoDateTime(time: Long): String {
        val date = Date(time)
        val realTime = SimpleDateFormat("YYYY-MM-dd")
        return realTime.format(date)
    }

}