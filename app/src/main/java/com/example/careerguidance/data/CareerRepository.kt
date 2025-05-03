package com.example.careerguidance.data

import com.example.careerguidance.R
import com.example.careerguidance.model.CareerField
import com.example.careerguidance.model.Course

object CareerRepository {
    val careerFields = listOf(
        CareerField(
            id = 1,
            name = "Information Technology",
            description = "Explore the world of computers, software development, and digital innovation",
            imageResId = R.drawable.it_field,
            courses = listOf(
                Course(
                    id = 1,
                    name = "Computer Science",
                    description = "Study the fundamentals of computing, algorithms, and software development",
                    duration = "4 years",
                    imageResId = R.drawable.computer_science,
                    requirements = listOf(
                        "Strong mathematics background",
                        "Problem-solving skills",
                        "Programming aptitude"
                    ),
                    careerProspects = listOf(
                        "Software Developer",
                        "Data Scientist",
                        "Systems Analyst",
                        "AI Engineer"
                    )
                ),
                Course(
                    id = 2,
                    name = "Information Systems",
                    description = "Learn to design and manage information systems for businesses",
                    duration = "4 years",
                    imageResId = R.drawable.info_systems,
                    requirements = listOf(
                        "Business acumen",
                        "Technical skills",
                        "Analytical thinking"
                    ),
                    careerProspects = listOf(
                        "IT Consultant",
                        "Business Analyst",
                        "Database Administrator",
                        "IT Project Manager"
                    )
                )
            )
        ),
        CareerField(
            id = 2,
            name = "Healthcare",
            description = "Make a difference in people's lives through medical care and health services",
            imageResId = R.drawable.healthcare_field,
            courses = listOf(
                Course(
                    id = 3,
                    name = "Medicine",
                    description = "Study human health and disease to become a medical doctor",
                    duration = "6 years",
                    imageResId = R.drawable.medicine,
                    requirements = listOf(
                        "Strong science background",
                        "Excellent communication skills",
                        "Compassion and empathy"
                    ),
                    careerProspects = listOf(
                        "Medical Doctor",
                        "Surgeon",
                        "Medical Researcher",
                        "Healthcare Administrator"
                    )
                ),
                Course(
                    id = 4,
                    name = "Nursing",
                    description = "Learn to provide patient care and support in healthcare settings",
                    duration = "4 years",
                    imageResId = R.drawable.nursing,
                    requirements = listOf(
                        "Compassion",
                        "Physical stamina",
                        "Attention to detail"
                    ),
                    careerProspects = listOf(
                        "Registered Nurse",
                        "Nurse Practitioner",
                        "Clinical Nurse Specialist",
                        "Nurse Educator"
                    )
                )
            )
        ),
        CareerField(
            id = 3,
            name = "Business",
            description = "Develop skills in management, finance, and entrepreneurship",
            imageResId = R.drawable.business_field,
            courses = listOf(
                Course(
                    id = 5,
                    name = "Business Administration",
                    description = "Learn management principles and business operations",
                    duration = "4 years",
                    imageResId = R.drawable.business_admin,
                    requirements = listOf(
                        "Leadership skills",
                        "Analytical thinking",
                        "Communication abilities"
                    ),
                    careerProspects = listOf(
                        "Business Manager",
                        "Entrepreneur",
                        "Marketing Manager",
                        "Financial Analyst"
                    )
                ),
                Course(
                    id = 6,
                    name = "Finance",
                    description = "Study financial markets, investments, and corporate finance",
                    duration = "4 years",
                    imageResId = R.drawable.finance,
                    requirements = listOf(
                        "Mathematical aptitude",
                        "Analytical skills",
                        "Attention to detail"
                    ),
                    careerProspects = listOf(
                        "Financial Analyst",
                        "Investment Banker",
                        "Portfolio Manager",
                        "Financial Consultant"
                    )
                )
            )
        )
    )
} 