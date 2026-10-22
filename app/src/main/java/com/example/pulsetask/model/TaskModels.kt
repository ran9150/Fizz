package com.example.pulsetask.model

import java.util.UUID

enum class Priority {
    LOW, MEDIUM, HIGH, URGENT
}

enum class TaskCategory(val displayName: String, val iconName: String) {
    WORK("Work", "Briefcase"),
    PERSONAL("Personal", "User"),
    STUDY("Study", "BookOpen"),
    HEALTH("Health", "Heart"),
    FINANCE("Finance", "DollarSign")
}

data class TaskItem(
    val id: String = UUID.randomUUID().toString(),
    val title: String,
    val description: String = "",
    val category: TaskCategory = TaskCategory.WORK,
    val priority: Priority = Priority.MEDIUM,
    val isCompleted: Boolean = false,
    val dueDate: String = "Today",
    val estimatedMinutes: Int = 25,
    val createdAt: Long = System.currentTimeMillis()
)

data class ProductivityStats(
    val completedCount: Int = 12,
    val pendingCount: Int = 5,
    val streakDays: Int = 7,
    val focusMinutesToday: Int = 125,
    val weeklyCompletionRate: Float = 0.84f
)