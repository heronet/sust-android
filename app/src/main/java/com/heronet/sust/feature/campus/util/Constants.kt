package com.heronet.sust.feature.campus.util

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Agriculture
import androidx.compose.material.icons.filled.Apartment
import androidx.compose.material.icons.filled.Biotech
import androidx.compose.material.icons.filled.CenterFocusStrong
import androidx.compose.material.icons.filled.Domain
import androidx.compose.material.icons.filled.Hub
import androidx.compose.material.icons.filled.MeetingRoom
import androidx.compose.material.icons.filled.Memory
import androidx.compose.material.icons.filled.NightShelter
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PriceChange
import androidx.compose.material.icons.filled.RocketLaunch
import androidx.compose.material.icons.filled.SocialDistance
import com.heronet.sust.feature.campus.domain.model.Department

object Constants {
    val campusItems = listOf(
        CampusCategory(
            CampusRoutes.Schools.route,
            "School of Physical, Applied, Life Sciences etc.",
            Icons.Default.Apartment
        ),
        CampusCategory(
            CampusRoutes.Offices.route,
            "Offices of VC, Treasurer, Library etc.",
            Icons.Default.MeetingRoom,
        ),
        CampusCategory(
            CampusRoutes.Centers.route,
            "Computer and Information Center, Research Center etc.",
            Icons.Default.Hub,
        ),
        CampusCategory(
            CampusRoutes.Halls.route,
            "Shah Paran Hall, First Ladies Hall etc.",
            Icons.Default.NightShelter,
        )
    )

    val schools = listOf(
        CampusCategory(
            title = CampusSchools.PhysicalSciences.title,
            imageVector = Icons.Default.RocketLaunch,
            description = "Physics, Chemistry, Mathematics etc."
        ),
        CampusCategory(
            title = CampusSchools.AppliedSciencesAndTechnology.title,
            imageVector = Icons.Default.Memory,
            description = "CSE, EEE, CEP etc."
        ),
        CampusCategory(
            title = CampusSchools.LifeSciences.title,
            imageVector = Icons.Default.Biotech,
            description = "GEB, BMB etc."
        ),
        CampusCategory(
            title = CampusSchools.ManagementAndBusinessAdministration.title,
            imageVector = Icons.Default.PriceChange,
            description = "Departments like BBA"
        ),
        CampusCategory(
            title = CampusSchools.AgricultureAndMineralSciences.title,
            imageVector = Icons.Default.Agriculture,
            description = "FES, GEE etc."
        ),
        CampusCategory(
            title = CampusSchools.SocialSciences.title,
            imageVector = Icons.Default.SocialDistance,
            description = "PSS, PAD, SCW etc."
        )
    )

    val departments = listOf(
        // Physical Sciences
        Department(
            title = "Physics",
            description = "Shahjalal University of Science and Technology's Physics Department, established in 1991, boasts a diverse research portfolio encompassing Quantum Mechanics, BioOptics, and Atmospheric Physics. Led by Emeritus Professor Dr. Arun Kumar Basak and currently chaired by Professor Dr. Nazia Chawdhury, the department emphasizes cutting-edge research, with the first Ph.D. awarded in 1991. Well-equipped laboratories, including Nonlinear Optics and Bio-Optics, support this endeavor. The Physics Society organizes seminars, workshops, and cultural events. With 10 Professors, 4 Associate Professors, and various officers, the department nurtures a dynamic academic environment. Physics graduates find employment in diverse fields, reflecting the program's versatility and practical applications.",
            school = CampusSchools.PhysicalSciences.title
        ),
        Department(
            title = "Chemistry",
            description = "Welcome to the Department of Chemistry at Shahjalal University of Science and Technology (SUST), one of the university's oldest departments. With 350 students in disciplines like Inorganic Physical Chemistry, Inorganic Chemistry, Organic Chemistry, and Analytical Chemistry, the department, led by 28 dedicated faculty members, emphasizes research in health, energy, environment, and nanomaterial applications. Faculty members, recognized locally and internationally, actively contribute as reviewers for major research journals. Committed to undergraduate student training, the department provides hands-on research opportunities. Explore our updated research facilities and meet our faculty and graduate students, experiencing the dynamic environment of the Chemistry Department at SUST.",
            school = CampusSchools.PhysicalSciences.title
        ),
        Department(
            title = "Mathematics",
            description = "The Department of Mathematics at Shahjalal University of Science and Technology, established in 1992, boasts a rich history and a vibrant present. Offering B.Sc. (Honors) and M.Sc. programs since its inception, it aligns with the Graduate Ordinance, providing MS (General), MS (Thesis), M. Phil, and Ph.D. degrees. Notably, numerous MS (Thesis) and Ph.D. degrees have been awarded. Graduates are making impactful contributions globally. The department prioritizes global mathematics education and research, recognizing its significance for scientific development. Committed to excellence, its vision is to achieve and maintain excellence in mathematical education and research, producing skilled graduates and fostering high-quality research in diverse scientific fields.",
            school = CampusSchools.PhysicalSciences.title
        ),
        Department(
            title = "Statistics",
            description = "The Department of Statistics, established in 1991, is a pioneer with 23 faculty members and 366 students. Offering contemporary courses, MPhil, and PhD programs, it has produced 4 PhDs, 1 MPhil, 600 MS, and 785 B.Sc. (Honours) graduates. The department provides state-of-the-art facilities, including computer labs, a seminar library, and publishes research regularly. 'Parishankhyan Paribar,' its association, organizes extracurricular activities. With excellent employment prospects, graduates secure roles in research, government sectors, banks, NGOs, and international organizations. Grants and regular seminars contribute to its academic vibrancy and global recognition.",
            school = CampusSchools.PhysicalSciences.title
        ),
        Department(
            title = "Geography and Environment",
            description = "Established in 2010, Shahjalal University of Science and Technology's Department of Geography and Environment offers B.Sc. and M.S. degrees, emphasizing a balanced approach to research, teaching, and outreach. Integrating theoretical analysis with real-world problem-solving, students engage in community service and address environmental and social justice issues. Graduate majors utilize social and political theories, geovisualization, and data interpretation. Physical geographers explore environmental patterns, while human geographers focus on identity, social differences, and place-based transformations. Faculty expertise includes climatology, geomorphology, urbanization, globalization, and GIS applications, fostering an integrative perspective on the complex interrelationships between natural systems, human behavior, and governance.",
            school = CampusSchools.PhysicalSciences.title
        ),
        Department(
            title = "Oceanography",
            description = "The Department of Oceanography at Shahjalal University of Science and Technology (SUST) recognizes the vital role oceans play in sustaining life, providing food, energy, and minerals. With 97% of Earth's water, oceans face challenges due to population growth and climate change. Oceanography, a multidisciplinary field, studies physical, chemical, geological, and biological ocean processes. Bangladesh, with extensive marine territory, aims to harness sea resources sustainably. SUST's Oceanography Department focuses on developing skilled manpower, understanding ocean importance, exploring complex ocean interactions, generating knowledge on Bangladesh's oceanic environment, utilizing marine resources for national development, and fostering research collaborations at home and abroad. A degree from SUST equips students with a comprehensive understanding of oceanographic science.",
            school = CampusSchools.PhysicalSciences.title
        ),

        // Applied Sciences
        Department(
            title = "Computer Science & Engineering",
            description = "Established in 1992, the Department of Computer Science & Engineering (CSE) at Shahjalal University of Science and Technology has been a pioneer in producing skilled graduates who contribute to Bangladesh's IT sector and the global industry. Offering four-year undergraduate courses, the department ensures a balance of theoretical knowledge and practical skills. Under the leadership of Prof. Md. Masum, the dedicated faculty and staff focus on academic excellence. In addition to the undergraduate program, the department conducts various activities, including postgraduate diploma programs and certificates in computer applications. Engaging in research collaborations, the department explores areas like Bangla Computerization, Natural Language Processing, and Cellular Phone & Computer Interfacing. The Software House initiative provides students with a professional environment for software development, evolving into a significant entity.",
            school = CampusSchools.AppliedSciencesAndTechnology.title
        ),
        Department(
            title = "Electrical & Electronic Engineering",
            description = "Established in January 2011, the Department of Electrical & Electronic Engineering (EEE) at Shahjalal University of Science and Technology (SUST) offers a four-year undergraduate program and anticipates introducing a Master's Degree soon. The department's faculty, equipped with research and design expertise, ensures students receive cutting-edge education. The B.Sc. program combines theoretical and hands-on training in areas like Solid State devices, Nano Electronics, Control systems, VLSI, Robotics, Renewable Energy, Power System Analysis, and Optical Communication. A third-year industrial attachment program enhances practical experience. The EEE program primes students for diverse career paths, contributing to advancements in Solis State devices, Nano Electronics, and more.",
            school = CampusSchools.AppliedSciencesAndTechnology.title
        ),
        Department(
            title = "Chemical Engineering and Polymer Science",
            description = "Founded in 1993 as the ‘Department of Chemical Technology and Polymer Science’, Shahjalal University of Science and Technology (SUST) revamped its curriculum to meet national and global standards. Renamed the ‘Department of Chemical Engineering and Polymer Science’, it is the sole department in Bangladesh offering both chemical engineering and polymer science courses. Accredited by the ‘Board of Accreditation for Engineering and Technical Education’, it maintains updated undergraduate and graduate programs, incorporating industry-relevant training and internships. The department fosters international collaborations with institutions in Germany, Italy, China, and New Zealand, enhancing research initiatives. Graduates excel nationally and internationally, and the department aims to expand its global reach through student exchange programs and sustained research collaborations.",
            school = CampusSchools.AppliedSciencesAndTechnology.title
        ),
        Department(
            title = "Civil and Environmental Engineering",
            description = "Established in 1995, the Department of Civil and Environmental Engineering (CEE) at Shahjalal University of Science and Technology (SUST) is renowned for its excellence. Offering B.Sc. Engineering, M.Sc. Engineering, and Ph.D. programs, CEE boasts 25 faculty members specializing in Environmental and Water Resources Engineering, Structural and Construction Engineering, Geotechnical Engineering, and Transportation Engineering. The Environmental division provides testing, design, and consultancy services, addressing water and wastewater quality, waste management, and pollution measurement. The Structural division focuses on material testing and construction consultancy. Geotechnical Engineering examines soil characteristics for construction sites, and Transportation Engineering covers laboratory testing, training, and consultancy services. CEE engages in collaborative programs globally and locally, emphasizing disaster engineering, sanitation, and water management. The department aims to produce high-quality engineers contributing to sustainable infrastructure and environmental safety.",
            school = CampusSchools.AppliedSciencesAndTechnology.title
        ),
        Department(
            title = "Industrial and Production Engineering",
            description = "Established in 1995 as Bangladesh's first industrial engineering discipline, Shahjalal University of Science and Technology's Department of Industrial and Production Engineering (IPE) has earned recognition for its excellence and innovation in research and education. Focused on developing, improving, implementing, and evaluating integrated systems, IPE addresses waste reduction in manufacturing and service sectors. The department offers BSc, MSc, and Doctor of Philosophy degrees, all accredited by the Institute of Engineers Bangladesh (IEB). With a commitment to engineering analysis, design principles, and interdisciplinary approaches, IPE at SUST stands at the forefront of industrial engineering in the country.",
            school = CampusSchools.AppliedSciencesAndTechnology.title
        ),
        Department(
            title = "Mechanical Engineering",
            description = "The Department of Mechanical Engineering at Shahjalal University of Science and Technology aspires to achieve national and international recognition for providing exceptional mechanical engineering education. The program is committed to delivering high-quality, relevant education that equips students with the skills, knowledge, and attitudes essential for success as engineers and leaders. Focusing on fostering a spirit of lifelong learning, ethical conduct, and meeting career challenges, the department emphasizes the importance of maintaining a cutting-edge research enterprise. The ultimate goal is to prepare graduates who not only excel in their professions but also emerge as industrial and civic leaders with an entrepreneurial spirit.",
            school = CampusSchools.AppliedSciencesAndTechnology.title
        ),
        Department(
            title = "Petroleum and Mining Engineering",
            description = "The Department of Petroleum and Mining Engineering was established in 2004 and started its functioning on July 01, 2005 with an undergraduate program, and this is the first undergraduate program in petroleum and mining engineering in Bangladesh. The first B.Sc (Engineering) degree in Petroleum & Mining engineering was awarded in 2010",
            school = CampusSchools.AppliedSciencesAndTechnology.title
        ),
        Department(
            title = "Food Engineering & Tea Technology",
            description = "The Department of Food Engineering & Tea Technology at Shahjalal University of Science & Technology, established in 2004, is Bangladesh's first of its kind. Evolving from Tea Technology to Food & Tea Technology, it officially became Food Engineering & Tea Technology in 2010. Offering a contemporary curriculum, the department focuses on training students in food engineering, tea technology, and allied applied sciences. With a dynamic approach, it adapts to technological advancements in food and tea science, emphasizing food processing, safety management, and tea production. The curriculum prioritizes food for health, ensuring diversification for consumer satisfaction. The department integrates practical training, industrial attachments, and mandatory theses/projects, fostering well-rounded graduates employed globally in leading companies and research institutes.",
            school = CampusSchools.AppliedSciencesAndTechnology.title
        ),
        Department(
            title = "Architecture",
            description = "Architecture abbreviated as ARC is one of the prestigious departments in Shahjalal University of Science and Technology (SUST) which was established in 2004 with an objective of keeping a pioneering role in the built environment of Bangladesh, especially in the north-eastern region. Department of Architecture offers a five years long bachelor's degree, where courses are designed in such a way so that students graduating from this department have a balance of theory and practical skills to prepare themselves for the highly competitive multidisciplinary workplace in the country and beyond. Academics and students are participating in activities of international architectural organizations like ARCASIA, CAA and others. Design expositions are arranged by the department every year along with a seminar. Moreover, students are involved in co-curricular activities as a part of cultural groups inside the campus. In 2015 this school got accreditation from the Institute of Architects Bangladesh (IAB), which is the national body of professional architects",
            school = CampusSchools.AppliedSciencesAndTechnology.title
        ),

        // Life Sciences
        Department(
            title = "Genetic Engineering & Biotechnology",
            description = "The Genetic Engineering and Biotechnology (GEB) department at SUST, established in 2004, quickly became a hub for excellence in life sciences. Offering dynamic study and research programs, it prepares students for leadership roles. Over twelve years, the department forged collaborations with domestic and international universities and research centers, hosting national and international events. Supported by funding from USDA, TWAS, MOST, UGC, and SUST Research Center, it conducted successful projects and established sophisticated laboratories. Recently, GEB was honored as one of the first eight departments selected for Institutional Quality Assessment Cell in the university's initial phase.",
            school = CampusSchools.LifeSciences.title
        ),
        Department(
            title = "Biochemistry and Molecular Biology",
            description = "The Department of Biochemistry and Molecular Biology (BMB) at SUST originated to explore the chemical and molecular basis of life, initially focusing on researching diseases in plants, animals, and humans. Evolving into an applied science, it found applications in agriculture, food, disease diagnosis, fermentation, and pharmaceuticals. With the rapid growth of Molecular Biology research, it enabled scientists to understand and manipulate life processes. Recognizing the subject's significance, SUST opened its BMB department in 2010, responding to the demand for graduates in Bangladesh and abroad. Launched in 2011 with four teachers and 20 students, it contributes to the nation's economic development across health, agriculture, food, forensic science, and pharmaceuticals.",
            school = CampusSchools.LifeSciences.title
        ),

        // Agriculture and Mineral Sciences
        Department(
            title = "Forestry and Environmental Science",
            description = "The School of Agriculture and Mineral Sciences, initiated in 1998, began with the Department of Forestry and Environmental Science (FES), aiming to prepare graduates for diverse roles in natural resource management globally. FES offers BSc (Hons.) and MSc degrees in Forestry, producing an annual average of 50 graduates and 30 postgraduates. Alumni find employment in government and non-government institutions focusing on forest and environmental management, climate change, and biodiversity conservation. The school boasts well-equipped laboratories in plant genetics, biotechnology, remote sensing, GIS, forest ecology, and more. Research activities address contemporary environmental challenges, with outcomes regularly published in national and international journals. Collaborations include programs with Glasgow University, Oxfam, FAO, IUCN, and the Forest Department.",
            school = CampusSchools.AgricultureAndMineralSciences.title
        ),

        // Management
        Department(
            title = "Business Administration",
            description = "Established in 1998, the Department of Business Administration at Shahjalal University of Science and Technology (SUST) in Sylhet, Bangladesh, offers BBA and MBA programs under the School of Management and Business Administration. Providing specializations in Accounting, Finance, Marketing, Management, MIS, and HRM, the department has produced around a thousand graduates in 16 batches. Additionally, it pioneers a three-semester MBA by Research program, along with M. Phil and PhD programs. With a dedicated faculty of 19 members, the department emphasizes research and publications, contributing to its reputation as one of the best business schools in the country. Alumni excel in various organizations, reflecting the department's commitment to providing competitive, quality education for national and international success.",
            school = CampusSchools.ManagementAndBusinessAdministration.title
        ),

        // Social Sciences
        Department(
            title = "Anthropology",
            description = "The Department of Anthropology at SUST, established in 1995, has evolved into one of Bangladesh's oldest and most successful programs. Offering Bachelor and Master degrees since 1998, it has graduated over a thousand students. Hosting renowned anthropologists, the department has excelled in research, contributing significantly to social sciences. Emphasizing academic excellence, it aims to produce national leaders, blending tradition with innovation. Committed to values-based education, the department fosters an optimal learning environment, striving to expand knowledge and culture. With a rich heritage, it actively engages in mission-driven scholarship, promoting research, creative activities, and robust undergraduate and graduate education.",
            school = CampusSchools.SocialSciences.title
        ),
        Department(
            title = "Bengali",
            description = "The Bengali Department at SUST commenced in 2005-2006, aiming to promote understanding of Bengali culture, history, society, and literature. Initially, two short courses were integrated into all departments for language and grammar development. The expanded course, 'Bengali Language and Literature (Theoretical),' focuses on enhancing students' verbal and practical skills. Catering to English department students, 'BNG-103 Introduction to Bengali Literature' imparts basic knowledge. Sylhet, known for its blend of Hazrat Shah Jalal's ideals and Sri Chaitanya, enriches Bengali literature with folk songs and writings. The department actively engages in teaching, research, and publishing the annual research journal 'Language-Literature Lessons.' As of June 2022, it has produced 702 graduates, 485 postgraduates, and 1 MPhil degree, aiming to foster innovative thinking and life shaping through literature.",
            school = CampusSchools.SocialSciences.title
        ),
        Department(
            title = "Economics",
            description = "The Department of Economics at Shahjalal University of Science & Technology (SUST) in Sylhet, Bangladesh, celebrated its 25th academic year in 2015. With 16 faculty members, over 300 undergraduate students, and 50 graduate students, the department has pioneered integrated course systems, semester systems, and laboratory-based training in quantitative economics in Bangladesh. Notably, its students have been accepted into higher degree programs worldwide and hold prestigious positions. The faculty has secured research grants from the University Grants Commission (UGC), Bangladesh, and conducted projects funded by organizations like the Food and Agricultural Organization (FAO) and International Finance Corporation (IFC). Several faculty members have received awards for research and made notable contributions in high-ranked journals, strengthening the department's global reputation. Many alumni are actively contributing to academia, research, and socio-economic development in various capacities.",
            school = CampusSchools.SocialSciences.title
        ),
        Department(
            title = "English",
            description = "The Department of English at SUST, initiated in 2000, offers both Bachelor's and Master's programs, graduating over 500 students employed in diverse sectors. With 17 faculty members and a limited intake of 71 students per BA cycle, the department emphasizes literature, culture, language, and applied linguistics. Currently hosting around 400 students, it aims to equip them with communication skills, analytical abilities in literary expressions, and knowledge of TESOL and applied linguistics. The department envisions becoming a center for excellence, producing graduates with values and intellectuality, fostering a sense of community, and serving as a research hub to generate new knowledge.",
            school = CampusSchools.SocialSciences.title
        ),
        Department(
            title = "Political Studies",
            description = "Established in 1993, the Department of Political Studies at SUST began as \"Political Studies and Public Affairs,\" evolving to \"Political Studies and Public Administration\" in 2002. Bifurcated in 2005 into \"Political Studies\" and \"Public Administration,\" it has since thrived as Political Studies. Offering undergraduate, graduate, M.Phil., and Ph.D. programs, the department emphasizes practical experiences such as internships and mandates monograph/thesis completion at the Master's level. With a faculty of 17, including highly qualified individuals, the department's graduates hold diverse roles in public and private sectors. Engaging in extracurricular and charity activities, the department is renowned for its academic prowess and societal contributions.",
            school = CampusSchools.SocialSciences.title
        ),
        Department(
            title = "Public Administration",
            description = "The Department of Public Administration at Shahjalal University of Science & Technology, established in 2005, offers a BSS Honours degree. Emphasizing multidimensional perspectives, the program equips students with skills in public management, healthcare, non-profit, and environmental administration. Focused on theoretical and practical aspects, it addresses contemporary challenges in public organization administration, human resources, and public finance while emphasizing values and ethics. Covering areas like healthcare management, public policy analysis, gender issues, and more, the program fosters interdisciplinary communication and aims to produce competent administrators contributing to global development. Students are expected to demonstrate proficiency in effective communication across disciplines and diverse audiences.",
            school = CampusSchools.SocialSciences.title
        ),
        Department(
            title = "Social Work",
            description = "The Department of Social Work at SUST began its academic program in 1993-1994 to meet the demand for professional social workers in Sylhet. With three faculty members and two non-academic staff, Professor M. Habibur Rahman, later the Vice-Chancellor, served as the founding head. The department's effective international training and team spirit garnered attention from development organizations and social work academia. The first MSS graduates in 1997 made significant contributions locally and nationally, establishing the department's reputation. The \"Social Work Family\" tradition, initiated by faculty, staff, and students, continues to shape the department's identity and commitment to community development at SUST.",
            school = CampusSchools.SocialSciences.title
        ),
        Department(
            title = "Sociology",
            description = "Established in 1992-93, the Department of Sociology at Shahjalal University of Science and Technology (SUST) is one of the oldest and esteemed departments, having conferred degrees to approximately 1315 students. Graduates have excelled globally, pursuing higher degrees and establishing themselves in various fields such as education, bureaucracy, finance, health, and NGOs. The department offers Bachelors, Masters (General and Thesis), M.Phil, and Ph.D. degrees, covering diverse sociological issues. With a commitment to theoretical knowledge and applied skills, faculty members actively engage in research. The department, aiming for vibrant teaching and research, encourages sociological thinking and addresses pressing local, national, and international issues.",
            school = CampusSchools.SocialSciences.title
        )
    )

    // Halls
    val halls = listOf(
        CampusCategory(
            title = "Shah Paran Hall",
            description = "1st Gents Hall",
            imageVector = Icons.Default.Domain
        ),
        CampusCategory(
            title = "Bangabandhu Sheikh Mujibur Rahman Hall",
            description = "2nd Gents Hall",
            imageVector = Icons.Default.Domain
        ),
        CampusCategory(
            title = "Syed Mujtaba Ali Hall",
            description = "3rd Gents Hall",
            imageVector = Icons.Default.Domain
        ),
        CampusCategory(
            title = "Shahid Jononi Jahanara Imam Hall",
            description = "1st Ladies Hall",
            imageVector = Icons.Default.Domain
        ),
        CampusCategory(
            title = "Begum Sirajunnesa Chowdhury Hall",
            description = "2nd Ladies Hall",
            imageVector = Icons.Default.Domain
        ),
        CampusCategory(
            title = "Begum Fazilatunnesa Mujib Hall",
            description = "3rd Ladies Hall",
            imageVector = Icons.Default.Domain
        ),
    )

    val offices = listOf(
        CampusCategory(
            title = "Vice Chancellor",
            description = "good place to die",
            imageVector = Icons.Default.Person
        )
    )

    val centers = listOf(
        CampusCategory(
            title = "IQAC",
            description = "AQ",
            imageVector = Icons.Default.CenterFocusStrong
        )
    )

}