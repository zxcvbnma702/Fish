package com.example.fish.logic.network.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @author:SunShibo
 * @date:2022-09-04 23:34
 * @feature:
 */

//it`s also the register response
data class VerifyResponse(
    val code: Int,
    val `data`: String,
    val msg: String
)

data class UserResponse(
    val code: Int,
    val `data`: Data,
    val msg: String
)

data class Data(
    val appKey: String,
    val avatar: String,
    val id: String,
    val money: Int,
    val username: String
)