package com.example.fish.logic.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.fish.logic.db.entity.CURRENT_USER_ID
import com.example.fish.logic.db.entity.User

/**
 * @author:SunShibo
 * @date:2022-09-17 11:23
 * @feature:
 */

@Dao
interface UserDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(user: User): Long

    @Query("SELECT * FROM User WHERE uid = $CURRENT_USER_ID")
    fun getUser(): LiveData<User>
}