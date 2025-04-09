Reflection: Balancing Stakeholder Needs
Challenge 1: Patient Data Privacy vs. Accessibility
Issue: Patients want easy access to their medical history, but regulations require strict data protection.
Solution: Implement role-based access control (RBAC) and multi-factor authentication (MFA).
Challenge 2: Flexible Scheduling vs. Hospital Resource Optimization
Issue: Doctors prefer flexible scheduling, but hospitals need optimized resource usage.
Solution: AI-based scheduling to suggest alternative slots while maximizing hospital efficiency.
Challenge 3: System Downtime vs. Frequent Updates
Issue: IT staff require minimal downtime, but frequent system updates are necessary.
Solution: Use blue-green deployment to roll out updates without disrupting services.


Reflection on Agile User Stories, Backlog, and Sprint Planning 

Transitioning SmartMed to Agile development required breaking down system requirements into user stories organizing a backlog and planning the first sprint. While Agile offers flexibility it also presents challenges in prioritization, estimation and aligning development efforts with stakeholder needs. This reflection explores the difficulties I encountered and how I navigated them. 

Challenges in Prioritization 

One of the biggest challenges was prioritizing user stories using the MoSCoW method. Some features such as appointment booking and doctor availability were clear Must-haves since they form the core functionality of SmartMed. However features like report generation and advanced encryption were harder to classify. 

For example AES-256 encryption is essential for security and compliance but it does not directly affect the usability of the system for patients and doctors. On the other hand features like appointment reminders improve the user experience but are not absolutely necessary for an MVP. I had to balance security and usability ensuring that non-functional requirements (like encryption) did not delay the release of core features. 

To resolve this I kept Must-have stories focused on functionality critical to MVP (booking, availability and notifications). Security measures were prioritized as Must-have but planned in a way that wouldn’t block other features. Less urgent features such as report generation were classified as Could-have to be addressed in future sprints. 

Effort Estimation Difficulties 

Estimating effort for user stories was another challenge. Agile teams often use story points or the Fibonacci sequence for estimation but predicting effort for backend tasks like developing appointment booking APIs or implementing AES-256 encryption was difficult. Unlike frontend tasks which have a clearer scope backend development can be unpredictable due to database dependencies, API integrations and security considerations. 

For instance while appointment booking seems straightforward handling edge cases like overlapping schedules and cancellations adds complexity. Estimating this as a 3-point story initially seemed reasonable but after analyzing dependencies I realized it might require more effort. 

To improve accuracy I broke large user stories into smaller tasks such as "Develop booking API" and "Design appointment confirmation flow", assigning time estimates instead of abstract story points. This provided a clearer picture of workload distribution. 

Aligning Agile with Stakeholder Needs 

Since Agile encourages continuous stakeholder involvement I tried to anticipate the expectations of different users patients, doctors and administrators. However since I am the only stakeholder at this stage I had to simulate possible conflicting priorities. 

For example patients prioritize usability they want a simple and quick appointment booking process. Doctors however prioritize control over their schedules meaning the system must allow flexible availability management. Meanwhile hospitals want efficiency which requires appointment data analytics and resource allocation reports. 

Balancing these perspectives required careful backlog management. The MVP sprint focuses on high impact, patient-facing features while ensuring the system is scalable to accommodate future needs. 

This Agile sprint planning exercise revealed the complexities of balancing usability, security and technical feasibility. Breaking down work into user stories helped clarify priorities but estimating effort remains a challenge. Future sprints will refine the backlog based on real user feedback reinforcing Agile’s iterative nature. By maintaining flexibility and continuous improvement SmartMed can evolve to meet stakeholder expectations effectively. 

 
Reflection on Agile User Stories, Backlog, and Sprint Planning 

Transitioning SmartMed to Agile development required breaking down system requirements into user stories organizing a backlog and planning the first sprint. While Agile offers flexibility it also presents challenges in prioritization, estimation and aligning development efforts with stakeholder needs. This reflection explores the difficulties I encountered and how I navigated them. 

Challenges in Prioritization 

One of the biggest challenges was prioritizing user stories using the MoSCoW method. Some features such as appointment booking and doctor availability were clear Must-haves since they form the core functionality of SmartMed. However features like report generation and advanced encryption were harder to classify. 

For example AES-256 encryption is essential for security and compliance but it does not directly affect the usability of the system for patients and doctors. On the other hand features like appointment reminders improve the user experience but are not absolutely necessary for an MVP. I had to balance security and usability ensuring that non-functional requirements (like encryption) did not delay the release of core features. 

To resolve this I kept Must-have stories focused on functionality critical to MVP (booking, availability and notifications). Security measures were prioritized as Must-have but planned in a way that wouldn’t block other features. Less urgent features such as report generation were classified as Could-have to be addressed in future sprints. 

Effort Estimation Difficulties 

Estimating effort for user stories was another challenge. Agile teams often use story points or the Fibonacci sequence for estimation but predicting effort for backend tasks like developing appointment booking APIs or implementing AES-256 encryption was difficult. Unlike frontend tasks which have a clearer scope backend development can be unpredictable due to database dependencies, API integrations and security considerations. 

For instance while appointment booking seems straightforward handling edge cases like overlapping schedules and cancellations adds complexity. Estimating this as a 3-point story initially seemed reasonable but after analyzing dependencies I realized it might require more effort. 

To improve accuracy I broke large user stories into smaller tasks such as "Develop booking API" and "Design appointment confirmation flow", assigning time estimates instead of abstract story points. This provided a clearer picture of workload distribution. 

Aligning Agile with Stakeholder Needs 

Since Agile encourages continuous stakeholder involvement I tried to anticipate the expectations of different users patients, doctors and administrators. However since I am the only stakeholder at this stage I had to simulate possible conflicting priorities. 

For example patients prioritize usability they want a simple and quick appointment booking process. Doctors however prioritize control over their schedules meaning the system must allow flexible availability management. Meanwhile hospitals want efficiency which requires appointment data analytics and resource allocation reports. 

Balancing these perspectives required careful backlog management. The MVP sprint focuses on high impact, patient-facing features while ensuring the system is scalable to accommodate future needs. 

This Agile sprint planning exercise revealed the complexities of balancing usability, security and technical feasibility. Breaking down work into user stories helped clarify priorities but estimating effort remains a challenge. Future sprints will refine the backlog based on real user feedback reinforcing Agile’s iterative nature. By maintaining flexibility and continuous improvement SmartMed can evolve to meet stakeholder expectations effectively. 

 
Reflection on assignment 8
Challenges Faced:
Granularity of States & Actions:

Finding the right level of detail for state transitions was tricky. Too many states made diagrams complex, while too few made them less useful.

Example: Should "Appointment Requested" and "Appointment Pending" be separate states?

Aligning with Agile User Stories:

Ensuring diagrams reflected real user stories required adjustments.

Example: The Payment Processing workflow had to match real-world payment gateway behavior.

Comparison of State vs. Activity Diagrams:
State Transition Diagrams focus on object lifecycle changes. Example: Appointment moving from Requested to Scheduled.

Activity Diagrams model step-by-step processes. Example: How an appointment is booked, including decisions and parallel tasks.


Reflection – SmartMed Domain Modeling & Class Diagram
Creating the domain model and class diagram for the SmartMed system was an important step in turning our earlier ideas and requirements into a real software design. This process came with challenges, required decisions based on previous work, and taught me valuable lessons about object-oriented design.

1. Challenges Faced
One of the main challenges was figuring out the right level of detail for each class. At first, I added too many methods and attributes, which made the diagram too complex. After reviewing our earlier use cases and workflows, I simplified each class to include only what was essential.

Another challenge was dealing with relationships between entities. For example, one doctor can have many appointments, and each appointment must be linked to both a doctor and a patient. Getting the multiplicity right (like 1..* or 0..1) took some time. I also had to make sure that I didn’t create unnecessary or confusing connections between classes.

Defining methods for each class was also tricky. I had to balance between making the class useful and keeping it simple. For instance, Appointment needed just a few methods like cancel() and reschedule(), but they had to match the logic we described in earlier assignments.

2. Alignment with Previous Assignments
The class diagram lines up well with our earlier work. The Patient and Doctor classes match the actors we defined in our use case diagrams (Assignment 5). The actions they perform, like booking or managing appointments, are also represented in their methods.

Our state diagrams and activity workflows from Assignment 8 helped shape the behavior of classes like Appointment and Notification. The Scheduler class, which uses AI to suggest the best times, came from earlier discussions in our requirements document.

Overall, the class diagram fits nicely with the bigger picture of the SmartMed system and supports the features we planned.

3. Trade-offs Made
One key decision was choosing composition over inheritance. I originally thought about having a base User class with Patient and Doctor as subclasses. But this made things more complicated, especially with how both need access to a shared UserAccount. Instead, I kept Patient and Doctor separate and linked both to UserAccount, which made the model easier to understand and implement.

Another trade-off was keeping the Scheduler as a stateless class. I could have designed it with stored data or results, but keeping it simple as a logic-only service made the diagram clearer and more focused on core functionality.

4. Lessons Learned
This assignment taught me that a good domain model is not just a list of classes—it’s a way to visualize how the system works. I learned how important it is to think about responsibilities, not just data. It also helped me better understand how objects relate to each other and why clean design matters.

I also learned the value of iteration. My first version of the diagram had too many connections and was hard to read. After reviewing it and comparing it with earlier assignments, I was able to simplify it while keeping all important features.
