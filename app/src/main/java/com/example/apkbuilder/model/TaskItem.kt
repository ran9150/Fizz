package com.example.apkbuilder.model

import java.util.UUID

enum class Priority {
    LOW, MEDIUM, HIGH
}

data class TaskItem(
    val id: String = UUID.randomUUID().toString(),
    val title: String,
    val category: String,
    val priority: Priority = Priority.MEDIUM,
    val isCompleted: Boolean = false,
    val createdAt: Long = System.currentTimeMillis()
)