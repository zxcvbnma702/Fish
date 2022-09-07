package com.example.fish.logic.model

/**
 * @author:SunShibo
 * @date:2022-09-04 23:34
 * @feature:
 */
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
    val id: Int,
    val money: Int,
    val username: String
)