package com.jaebin.homework.data

data class Consult(
    val answerCnt: Int,
    val context: String,
    val regDate: Long,
    val seq: Int,
    val tagList: List<Tag>,
    val title: String,
    val type:Int

)