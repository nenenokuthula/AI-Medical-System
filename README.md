# SmartMed - AI-Powered Medical Appointment System

## Description
SmartMed is an intelligent medical appointment system that allows patients to book consultations, doctors to manage schedules, and hospitals to optimize resource allocation. It features automated scheduling, real-time notifications, and integration with electronic health records (EHR).

## Project Files
- [System Specification (SPECIFICATION.md)](SPECIFICATION.md)
- [Architecture Documentation (ARCHITECTURE.md)](ARCHITECTURE.md)



Assignment 8
Task 3: Integration with Prior Work
Traceability
In this task, we are required to map the object state transition diagrams and activity workflow diagrams to the following elements from the previous assignments:

Functional Requirements (Assignment 4):

Mapping to Functional Requirements (FRs): The state transition diagrams and activity diagrams should directly address specific functional requirements identified in Assignment 4. For instance, in the case of the Patient Object, the state transitions between Registered, In Consultation, and Completed directly support FR-001, which states that the system must allow patients to book, attend, and complete consultations.

For each state transition or workflow, we should provide a reference to the functional requirement that it supports. For example:

Patient Registration Workflow: The workflow of registering a patient (from the "New" state to "Registered") directly supports FR-002, which specifies the registration process for patients.

Appointment Booking Workflow: This maps to FR-003, which ensures that patients can successfully book an appointment based on doctor availability.

User Stories and Sprint Tasks (Assignment 6):

Mapping to User Stories: Each workflow and state transition must be linked to specific user stories from Assignment 6. For example, a user story like "As a patient, I want to view available doctors so that I can book an appointment" should be reflected in the Doctor Availability Management Workflow.

Sprint Task Mapping: Each diagram must also tie to a specific sprint task. For example, the "Cancel Appointment" workflow might have been planned as a sprint task, aligning with the sprint planning process.
[Click here to view the Appointment Diagram](https://github.com/nenenokuthula/AI-Medical-System/blob/main/Appointment%20Diagram.png)

[Click here to view the Doctor Diagram](https://github.com/nenenokuthula/AI-Medical-System/blob/main/Doctor%20Diagram.png)

[Click here to view the Medical Record Diagram](https://github.com/nenenokuthula/AI-Medical-System/blob/main/Medical%20Record%20Diagram.png)

[Click here to view the Notification Diagram](https://github.com/nenenokuthula/AI-Medical-System/blob/main/Notification%20Diagram.png)

[Click here to view the Patient Diagram](https://github.com/nenenokuthula/AI-Medical-System/blob/main/Patient%20Diagram.png)

[Click here to view the Payment Diagram](https://github.com/nenenokuthula/AI-Medical-System/blob/main/Payment%20Diagram.png)

[Click here to view the Prescription Diagram](https://github.com/nenenokuthula/AI-Medical-System/blob/main/Pescription%20Diagram.png)

[Click here to view the User Account Diagram](https://github.com/nenenokuthula/AI-Medical-System/blob/main/User%20Account%20Diagram.png)

[Click here to view the Appointment Cancellation Diagram](https://github.com/nenenokuthula/AI-Medical-System/blob/main/Appiontment%20Cancellation%20Diagram.png)

[Click here to view the Appointment Booking Diagram](https://github.com/nenenokuthula/AI-Medical-System/blob/main/Appointment%20Booking%20Diagram.png)

[Click here to view the Doctor Availability Update Diagram](https://github.com/nenenokuthula/AI-Medical-System/blob/main/Doctor%20Availability%20Update%20Diagram.png)

[Click here to view the EHR Update Diagram](https://github.com/nenenokuthula/AI-Medical-System/blob/main/EHR%20Update.png)

[Click here to view the Notification Handling Diagram](https://github.com/nenenokuthula/AI-Medical-System/blob/main/Notification%20Handling%20Diagram.png)

[Click here to view the Patient Registration Diagram](https://github.com/nenenokuthula/AI-Medical-System/blob/main/Patient%20Registration%20Diagram.png)

[Click here to view the Payment Processing Diagram](https://github.com/nenenokuthula/AI-Medical-System/blob/main/Payment%20Processing%20Diagram.png)

[Click here to view the Prescription Generation Diagram](https://github.com/nenenokuthula/AI-Medical-System/blob/main/Prescription%20Generation%20Diagram.png)


Assignment 11
1. Repository Interface Design 
Generic Repository Interface (Repository<T, ID>)
Defines standard CRUD operations (save, findById, findAll, delete) in a reusable, type-safe manner.

Entity-Specific Interfaces
Example: BookRepository extends Repository<Book, String>.

Justification:

"Used generics to avoid duplication across entity repositories, promoting type safety and reusability."

2. In-Memory Implementation 
InMemoryBookRepository:
Implements BookRepository using a simple in-memory HashMap for object storage.

CRUD Operations:

save stores or updates objects.

findById retrieves objects.

findAll returns all stored objects.

delete removes objects.

Unit Tests:
Comprehensive JUnit tests under /tests/ validate all CRUD operations.

3. Storage Abstraction Mechanism 
Factory Pattern:
Implemented via RepositoryFactory to decouple services from storage backends.

Advantages:

Easily swap between InMemoryBookRepository, DatabaseBookRepository, or future repositories.

Centralizes repository creation logic.

Justification:

"Factory Pattern was chosen for its simplicity, flexibility, and ability to dynamically select repository implementations without tightly coupling services to specific storage types."

4. Future-Proofing 
Stub Implementation:
DatabaseBookRepository is prepared for future database integration.

Design Considerations:

Clear separation of repository interfaces and implementations.

Adding new backends (e.g., FileSystemRepository, APIRepository) will not affect existing service code.

Updated Class Diagram:
A Mermaid.js diagram visualizes the relationships between interfaces and implementations.

Why This Design Matters
Separation of Concerns:
Business logic remains clean, independent of how and where data is stored.

Scalability:
Easy to migrate from simple in-memory storage to databases like MySQL, MongoDB, or even remote APIs.

Testability:
In-memory repositories enable fast, lightweight unit testing without external dependencies.
