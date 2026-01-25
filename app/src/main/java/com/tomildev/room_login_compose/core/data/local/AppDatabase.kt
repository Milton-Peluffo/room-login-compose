package com.tomildev.room_login_compose.core.data.local

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.tomildev.room_login_compose.features.auth.data.local.dao.UserDao
import com.tomildev.room_login_compose.features.auth.data.local.entities.UserEntity

@Database(
    entities = [UserEntity::class],
    version = 2
)

abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}