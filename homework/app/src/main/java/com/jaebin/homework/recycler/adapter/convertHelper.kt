package com.jaebin.homework.recycler.adapter

import com.jaebin.homework.data.Tag
import com.jaebin.homework.data.TagX

interface convertHelper {
    fun makeTagString(item:List<Tag>):String
    fun makeTagXString(item:List<TagX>):String
    fun longtoDateTime(time:Long):String
}