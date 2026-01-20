package com.tomildev.room_login_compose.core.data.local

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.tomildev.room_login_compose.features.auth.data.local.dao.UserDao
import com.tomildev.room_login_compose.features.auth.data.local.entities.UserEntity

@Database(
    entities = [UserEntity::class],
    version = 1
)

abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: android.content.Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "user_database"
                ).fallbackToDestructiveMigration(false).build()

                INSTANCE = instance
                instance
            }
        }
    }
}