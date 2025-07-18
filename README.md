CS-320: Entry: Portfolio project reflection

How can I ensure that my code, program, or software is functional and secure?
To make sure my code works correctly, I use unit testing to check for both valid and invalid inputs. Writing JUnit tests helped me find mistakes early and verify that the logic followed the requirements. I also learned to include checks for edge cases, like null values and data format issues. While this course did not focus heavily on security, I now understand that validating input and preventing unexpected behavior are important first steps toward writing secure code.

How do I interpret user needs and incorporate them into a program?
In this course, the requirements were clearly defined by the customer. I learned how to turn those requirements into logic by writing validation rules and service methods that match what the user expects. For example, if a user needs a phone number to be exactly 10 digits, I had to write both the code and the tests to enforce that. This helped me think more about how users interact with software behind the scenes.

How do I approach designing software?
My design approach starts with breaking the problem into small parts. I start with the object class (like Contact or Appointment), define what it needs, and then build services around it. From there, I think about how to test each part separately before putting everything together. This step-by-step approach made the projects easier to manage and helped me build a stronger understanding of how different parts of the program connect.


------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
CS-300: Entry: Reflecting on my course work 

What was the problem you were solving in the projects for this course?
In this course, I worked on designing and implementing a course advising system that efficiently stores and retrieves course information. The main challenge was selecting the right data structures to manage a list of courses, ensuring that they could be accessed, sorted, and searched efficiently. In Project One, I analyzed different data structures—vector, hash table, and binary search tree to determine their efficiency. After that, I implemented a functional program that reads course data from a file, stores it in a data structure, and allows users to search for courses or view them in alphanumeric order.

How did you approach the problem? Consider why data structures are important to understand.
I started by analyzing the different data structures available and considering their advantages and trade-offs. Since performance and ease was a top priority, I compared runtime complexity (Big O notation) for operations like insertion, searching, and sorting. Understanding data structures is important because the way data is organized affects the speed and efficiency of a program. For instance, using a hash table allowed for quick lookups, while a sorted map ensured the course list remained ordered without extra sorting steps. Choosing the right data structure helped balance speed, efficiency, and readability in my implementation.

How did you overcome any roadblocks you encountered while going through the activities or project?
One of the biggest challenges I faced was ensuring that the course data was loaded correctly from the CSV file and formatted properly for display. At first, I encountered issues with reading the file, handling prerequisites, and maintaining case-insensitive searches. To overcome this, I added debugging statements to track file loading, validated inputs to handle errors, and used string manipulation functions to standardize user input. I also sought feedback and adjusted my approach based on best coding practices, which helped refine my program.

How has your work on this project expanded your approach to designing software and developing programs?
This project reinforced the importance of planning before coding. By first analyzing data structures and writing pseudocode, I was able to create a structured solution rather than coding blindly. It also showed me how real-world applications rely on efficient data handling, and how choosing the wrong approach can impact performance. I also gained a better understanding of how to break down a problem, test solutions, and refine my code through iteration.

How has your work on this project evolved the way you write programs that are maintainable, readable, and adaptable?
Throughout this course, I focused on writing clean, well-documented, and modular code. I used consistent naming conventions, added easy to read comments, and followed industry best practices for handling user input and errors. These habits not only made my code easier to debug but also ensured that it could be easily understood and modified in the future if I needed to do so. I also learned the importance of flexibility by structuring my code thoughtfully, making it easier to adapt and expand as new features or requirements arise.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

CS-255: Entry: Reflecting on the DriverPass Project

Project Summary
The DriverPass project involved designing a comprehensive training and scheduling system for DriverPass, a company that helps people prepare for their driving tests. The client, represented by DriverPass’s owner and IT officer, wanted a system that would allow customers to book and manage driving lessons, take online practice tests, and track their progress. My role in this project was to gather all of the business requirements in a document and, later, to create a system design that addressed the client’s needs and provided a reliable, user-friendly interface.

What I Did Well
I believe I did particularly well in analyzing the client’s requirements and creating clear, organized documentation for the system. In the business requirements document, I made sure each requirement was thoroughly detailed, ensuring that both functional and nonfunctional requirements were addressed. In the system design phase, I also feel I did a good job creating diagrams that visually communicated how the system would function, which helped make the design easier to understand and implement.

Potential Revisions
If I could choose one part of my work to revise, it would be the user interface specifications. While I focused on ensuring the system’s core functions were fully developed, I think I could have expanded on the user interface and user experience details to make the interface even more intuitive. Adding more mock-ups or design suggestions might help provide a better sense of the user journey and make the system easier to navigate.

Interpreting and Implementing User Needs
To interpret the user’s needs, I started by carefully reviewing the client’s requirements and understanding the pain points that users might experience. I prioritized creating a system that was easy to navigate and ensured that all core functions were straightforward, like scheduling lessons or taking practice tests. Considering the user’s needs is essential because the system must be practical and efficient for its intended users. By focusing on user-friendliness and functionality, I aimed to design a system that users would find helpful and easy to adopt.

Approach to Designing Software
In approaching software design, I focus on gathering detailed requirements first to understand the full scope of the project. Moving forward, I would continue to use structured analysis techniques and visual diagrams, like UML diagrams, to lay out the system. I would also incorporate user feedback and testing earlier in the design phase to make adjustments based on real interactions. In the future, I plan to apply iterative design strategies to continuously refine the system based on feedback, ensuring it aligns with both client expectations and user needs.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
CS-230:[CS 230 Project Software Design Final version 3.docx](https://github.com/user-attachments/files/16042718/CS.230.Project.Software.Design.Final.version.3.docx)
•	Briefly summarize The Gaming Room client and their software requirements. Who was the client? What type of software did they want you to design? 
The Gaming Room client wanted a versatile web-based software solution for their game "Draw It or Lose It." The software needed to operate across web, mobile, and console platforms, featuring a responsive user interface, client-server communication, and secure user authentication and authorization. The client emphasized platform independence and scalability to ensure a seamless and optimized gaming experience across different devices and platforms, all while maintaining the engaging and competitive core features of the original game and expanding its accessibility.

•	What did you do particularly well in developing this documentation?
In developing this documentation, I believe I did particularly well in fixating on the most important aspects of the project, such as the software requirements. My ability to clearly outline the client's requirements and translate them into actionable design constraints was a key strength. By emphasizing the importance of user experience, I ensured that the documentation focused on creating a user-friendly, intuitive interface that adapts to different devices and other aspects like screen sizes.

•	What about the process of working through a design document did you find helpful when developing the code?
Working through the design document was immensely helpful in providing a structured approach to the software development process. It clearly outlined the project requirements, ensuring a comprehensive understanding of what needed to be accomplished. This structured plan facilitated better organization and time management, allowing for a systematic breakdown of tasks. By providing a clear roadmap, it minimized confusion and ensured all team members were aligned, ultimately leading to a more efficient and effective development process.

•	If you could choose one part of your work on these documents to revise, what would you pick? How would you improve it?
If I were to revise one part of my work, it would be adding more detail to the Application Development Process. Specifically, I would enhance the section by including comprehensive insights into each phase, such as requirements gathering, design and development. This approach better aims to ensure mutual understanding and alignment between all sides, fostering a shared perspective on progression and goals.

•	How did you interpret the user’s needs and implement them into your software design? Why is it so important to consider the user’s needs when designing?
Interpreting user needs was pivotal in shaping the software design. By thoroughly understanding and prioritizing these needs, the I could ensure that the final product would be user-friendly and meet the intended purpose effectively. Considering the user's needs is crucial in designing software because it directly impacts user satisfaction and adoption rates. A final design that aligns with user expectations leads to a more intuitive and enjoyable experience, ultimately contributing to the software's success and longevity.

•	How did you approach designing software? What techniques or strategies would you use in the future to analyze and design a similar software application?
My approach to designing software involved understanding the client's requirements, using iterative design techniques, and focusing on a user-centered design. I ensured alignment with the client's vision through detailed discussions and requirement gathering. Iterative design allowed me to refine the application based on feedback and testing. I prioritized creating an intuitive, user-friendly interface adaptable to various devices and screen sizes. In the future, I plan to enhance my skills by exploring advanced user research methods, adopting Agile methodologies, utilizing new design tools and technologies, focusing on cross-platform compatibility, and deepening my understanding of security and data protection. This will improve my ability to design high-quality software that meets client requirements and provides exceptional user experiences.
[CS 230 Project Software Design Final version 3.docx](https://github.com/user-attachments/files/16042718/CS.230.Project.Software.Design.Final.version.3.docx)







•	How do I interpret user needs and implement them into a program? How does creating “user stories” help with this?

I Interpret user needs by understanding their specific requirements and translating them into actionable tasks. User stories facilitate this process by breaking down user needs into manageable chunks, maintaining focus on the user's perspective, and prioritizing features accordingly. Through the use of user stories, I can closely collaborate with stakeholders, ensuring alignment with user expectations while also delivering a positive user experience.

•	How do I approach developing programs? What agile processes do I hope to incorporate into my future development work?

I prioritize understanding the projects’ requirements and breaking tasks into more manageable steps. After learning agile processes, I aim to incorporate processes such as Scrum in order to help with organizing tasks through Sprint Planning, unsure regular communication, gathering feedback, and reflecting. By using Agile methodologies, I will add to collaboration among team members, adapt more effectively to changing project requirements, and ultimately deliver higher quality solutions.

•	What does it mean to be a good team member in software development?

Being a good team member in software development means effectively communicating, collaborating, and problem-solving with peers. This also includes having adaptability to changing circumstances, and a commitment to continuous learning in order to stay updated on new technologies. Most importantly, good team members respect their colleagues, create a supportive environment, and contribute positively to the team's success by sharing knowledge and expertise.

•	Summarize the project and what problem it was solving.

This project involved creating a program that reads the temperature data from the given Fahrenheit folder, which then converts those temperatures to Celsius while writing the converted temperatures to the output file.

•	What did you do particularly well?

I thought I did a good job with the structured approach of the code as it uses appropriate variables to store the city name, original temps, and converted temps. I also thought my uses of comments provided enough explanation for the purpose of the different sections of code as they made it more understandable, especially for future me to look. 
back at.

•	Where could you enhance your code? How would these improvements make your code more efficient, secure, and so on?

Error handling would’ve been a nice way to enhance my code. Such as checking if the files were successfully opened before proceeding as this would help prevent crashes due to file access issues.

•	Which pieces of the code did you find most challenging to write, and how did you overcome this? What tools or resources are you adding to your support network?

Off the top of my head one of the most challenging parts of working on this code was implementing the .txt files as I never had done that before. After being frustrated for some time, I took to google and did some research on how to add and work with the .txt files and quickly got familiar with them. Using online resources liked to google are key parts of problem solving for me as I continue to learn.

•	What skills from this project will be particularly transferable to other projects or course work? 

File input and output operations is something that will be transferable to future projects. Understanding how to read data from files, process it, and then write the results back is a skill applicable to any type of project involving data, processing, and more.

•	How did you make this program maintainable, readable, and adaptable?

For maintainability something I try to work on is separation of concerns when creating code. Splitting up different tasks into distinct sections, such as the file reading, temperature conversion, and file writing, makes the code easier to locate and modify specific functionalities without affection others. Finally, as for readability I added descriptive comments throughout the program 

