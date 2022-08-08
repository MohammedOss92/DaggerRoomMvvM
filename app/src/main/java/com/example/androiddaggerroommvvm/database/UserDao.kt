package com.example.androiddaggerroommvvm.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {

    @Query("Select * from user_entity order by id desc")
    fun getAllRecordsFromDB():List<UserEntity>?

    @Insert
    fun insertRecord(userEntity: UserEntity)
}