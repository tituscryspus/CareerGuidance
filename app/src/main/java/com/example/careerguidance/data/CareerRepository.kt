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
        ),
        CareerField(
            id = 4,
            name = "Engineering",
            description = "Design and build solutions to real-world problems",
            imageResId = R.drawable.engineering_field,
            courses = listOf(
                Course(
                    id = 7,
                    name = "Mechanical Engineering",
                    description = "Design and build mechanical systems and machines",
                    duration = "4 years",
                    imageResId = R.drawable.mechanical_engineering,
                    requirements = listOf(
                        "Strong physics and mathematics",
                        "Problem-solving abilities",
                        "Technical drawing skills"
                    ),
                    careerProspects = listOf(
                        "Mechanical Engineer",
                        "Design Engineer",
                        "Project Manager",
                        "Research Engineer"
                    )
                ),
                Course(
                    id = 8,
                    name = "Electrical Engineering",
                    description = "Work with electrical systems, electronics, and power generation",
                    duration = "4 years",
                    imageResId = R.drawable.electrical_engineering,
                    requirements = listOf(
                        "Mathematics and physics",
                        "Circuit analysis skills",
                        "Programming knowledge"
                    ),
                    careerProspects = listOf(
                        "Electrical Engineer",
                        "Power Systems Engineer",
                        "Electronics Engineer",
                        "Control Systems Engineer"
                    )
                ),
                Course(
                    id = 9,
                    name = "Civil Engineering",
                    description = "Design and construct infrastructure projects",
                    duration = "4 years",
                    imageResId = R.drawable.civil_engineering,
                    requirements = listOf(
                        "Structural analysis skills",
                        "Project management abilities",
                        "Technical drawing proficiency"
                    ),
                    careerProspects = listOf(
                        "Civil Engineer",
                        "Structural Engineer",
                        "Construction Manager",
                        "Transportation Engineer"
                    )
                )
            )
        ),
        CareerField(
            id = 5,
            name = "Arts & Design",
            description = "Express creativity and develop visual communication skills",
            imageResId = R.drawable.arts_design_field,
            courses = listOf(
                Course(
                    id = 10,
                    name = "Graphic Design",
                    description = "Create visual content for various media platforms",
                    duration = "4 years",
                    imageResId = R.drawable.graphic_design,
                    requirements = listOf(
                        "Creativity and artistic ability",
                        "Digital design skills",
                        "Communication skills"
                    ),
                    careerProspects = listOf(
                        "Graphic Designer",
                        "Art Director",
                        "UI/UX Designer",
                        "Brand Designer"
                    )
                ),
                Course(
                    id = 11,
                    name = "Fine Arts",
                    description = "Develop artistic skills and creative expression",
                    duration = "4 years",
                    imageResId = R.drawable.fine_arts,
                    requirements = listOf(
                        "Artistic talent",
                        "Creative thinking",
                        "Visual communication skills"
                    ),
                    careerProspects = listOf(
                        "Fine Artist",
                        "Art Teacher",
                        "Gallery Curator",
                        "Art Conservator"
                    )
                ),
                Course(
                    id = 12,
                    name = "Architecture",
                    description = "Design buildings and physical structures",
                    duration = "5 years",
                    imageResId = R.drawable.architecture,
                    requirements = listOf(
                        "Design skills",
                        "Technical knowledge",
                        "Spatial awareness"
                    ),
                    careerProspects = listOf(
                        "Architect",
                        "Urban Designer",
                        "Interior Designer",
                        "Project Manager"
                    )
                )
            )
        ),
        CareerField(
            id = 6,
            name = "Education",
            description = "Shape the future through teaching and educational leadership",
            imageResId = R.drawable.education_field,
            courses = listOf(
                Course(
                    id = 13,
                    name = "Elementary Education",
                    description = "Prepare to teach young children in primary schools",
                    duration = "4 years",
                    imageResId = R.drawable.elementary_education,
                    requirements = listOf(
                        "Patience and empathy",
                        "Communication skills",
                        "Classroom management"
                    ),
                    careerProspects = listOf(
                        "Elementary School Teacher",
                        "Special Education Teacher",
                        "Curriculum Developer",
                        "School Administrator"
                    )
                ),
                Course(
                    id = 14,
                    name = "Secondary Education",
                    description = "Specialize in teaching specific subjects at high school level",
                    duration = "4 years",
                    imageResId = R.drawable.secondary_education,
                    requirements = listOf(
                        "Subject expertise",
                        "Teaching skills",
                        "Leadership abilities"
                    ),
                    careerProspects = listOf(
                        "High School Teacher",
                        "Subject Specialist",
                        "Department Head",
                        "Educational Consultant"
                    )
                ),
                Course(
                    id = 15,
                    name = "Educational Psychology",
                    description = "Study how people learn and develop in educational settings",
                    duration = "4 years",
                    imageResId = R.drawable.educational_psychology,
                    requirements = listOf(
                        "Psychology background",
                        "Research skills",
                        "Analytical thinking"
                    ),
                    careerProspects = listOf(
                        "School Psychologist",
                        "Educational Researcher",
                        "Learning Specialist",
                        "Educational Consultant"
                    )
                )
            )
        )
    )
} 