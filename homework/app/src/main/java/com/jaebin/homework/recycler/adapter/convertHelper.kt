package com.jaebin.homework.recycler.adapter

import com.jaebin.homework.data.Tag

interface convertHelper {
    fun makeTagString(item:List<Tag>):String
    fun longtoDateTime(time:Long):String
}