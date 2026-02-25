package com.jtrobbins.mywebsite.presentation.feature.resume

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.jtrobbins.mywebsite.presentation.common.components.AwardCard
import com.jtrobbins.mywebsite.presentation.common.components.CategoryItem
import com.jtrobbins.mywebsite.presentation.common.components.EducationCard
import com.jtrobbins.mywebsite.presentation.common.components.ExperienceCard
import com.jtrobbins.mywebsite.presentation.common.components.Footer
import com.jtrobbins.mywebsite.presentation.common.components.PublicationCard
import com.jtrobbins.mywebsite.presentation.common.components.SkillCard

@Composable
fun ResumeScreen() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        CategoryItem(title = "Education") {
            EducationCard(
                degree = "B.S. in Computer Science",
                school = "University of Maryland, College Park",
                concentration = null,
                date = "Jan 2017 - Dec 2020",
                location = "College Park, Maryland"
            )
            EducationCard(
                degree = "B.F.A in Visual Effects",
                school = "Savannah College of Art and Design",
                concentration = "Technical Direction",
                date = "Sep 2010 - May 2014",
                location = "Savannah, Georgia"
            )
        }
        CategoryItem(title = "Experience") {
            ExperienceCard(
                position = "Software Developer II",
                company = "Henry M. Jackson Foundation for the Advancement of Military Medicine",
                support = "Supporting the Biotechnology High Performance Computing Software Applications Institute",
                date = "Oct 2021 - Present",
                location = "Frederick, Maryland"
            )
            ExperienceCard(
                position = "Software Developer I",
                company = "Henry M. Jackson Foundation for the Advancement of Military Medicine",
                support = "Supporting the Biotechnology High Performance Computing Software Applications Institute",
                date = "Jan 2021 - Sep 2021",
                location = "Frederick, Maryland"
            )
        }
        CategoryItem(title = "Publications") {
            PublicationCard(
                authors = "Frock, A., J. T. Robbins, F. G. Vital-Lopez, V. Desai, G. Doros, B. E. Sands, A. Prabhakaran, C. Nemeth, G. T. Rule, J. L. Sperry, F. X. Guyette, S. R. Wisniewski, E. E. Moore, M. Schreiber, B. Joseph, C. T. Wilson, B. Cotton, D. Ostermayer, B. G. Harbrecht, M. B. Patel, S. Tamang, S. Malunjkar, D. A. Spain, A. T. Reisner, J. D. Stallings, and J. Reifman. ",
                title = "A case study of AI-enabled Software as a Medical Device cleared by the FDA for assessing hemorrhage risk index (APPRAISE-HRI) after trauma.",
                publication = "New England Journal of Medicine AI. 2025 October 16; 2(11):AIcs2401170."
            )
        }
        CategoryItem(title = "Skills") {
            SkillCard(
                category = "Programming:",
                skills = listOf("Kotlin", "Python", "Dart", "Java", "SQL")
            )
            SkillCard(
                category = "Tools:",
                skills = listOf("Android", "Flutter", "Jetpack Compose", "Docker", "Git",)
            )
        }
        CategoryItem(title = "Awards") {
            AwardCard(
                name = "Outstanding Research Accomplishment Team/Military",
                granter = "Military Health System Research Symposium",
                date = "2025",
                description = "In recognition of outstanding research contributions supporting the warfighter with a " +
                        "significant accomplishment of high impact by means of the development, submission, and " +
                        "subsequent FDA clearance of The APPRAISE-HRI."
            )
            AwardCard(
                name = "Certificate of Appreciation",
                granter = "Henry M. Jackson Foundation for the Advancement of Military Medicine",
                date = "2024",
                description = "In recognition of expertise, dedication, and hard work, which provided a significant " +
                        "contribution to the development, submission, and subsequent FDA clearance of The APPRAISE-HRI."
            )
        }
        Footer()
    }
}