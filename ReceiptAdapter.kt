package com.example.wealthwise.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val fullName: String,
    val username: String,
    val email: String,
    val passwordHash: String,
    val points: Int = 0,
    val level: Int = 1,
    val streak: Int = 0,
    val lastLoginDate: String? = null
)
