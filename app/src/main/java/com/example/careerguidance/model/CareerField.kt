package com.example.careerguidance.model

data class CareerField(
    val id: Int,
    val name: String,
    val description: String,
    val imageResId: Int,
    val courses: List<Course>
)

data class Course(
    val id: Int,
    val name: String,
    val description: String,
    val duration: String,
    val imageResId: Int,
    val requirements: List<String>,
    val careerProspects: List<String>
) 