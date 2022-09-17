package com.example.fish.logic.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @author:SunShibo
 * @date:2022-09-17 11:42
 * @feature: this is database entity
 */

const val CURRENT_USER_ID = 0

@Entity
data class User(
    var appKey: String ?= null,
    var avatar: String ?= null,
    var id: String ?= null,
    var money: Int ?= null,
    var username: String ?= null
){
    @PrimaryKey(autoGenerate = false)
    var uid: Int = CURRENT_USER_ID
}
