# SmartMed - Architectural Design

## 1. Overview
The SmartMed system follows a microservices architecture, with independent modules for user management, appointment scheduling, and notifications.

## 2. C4 Model Diagrams

### Context Diagram (Level 1)
```mermaid
C4Context
  title SmartMed System - Context Diagram
  Person(patient, "Patient", "Books and manages appointments")
  Person(doctor, "Doctor", "Manages availability and appointments")
  Person(admin, "Admin", "Oversees system operations")
  System(smartmed, "SmartMed", "Automated Medical Appointment System")
  
  patient -> smartmed : "Book Appointments"
  doctor -> smartmed : "Manage Schedules"
  admin -> smartmed : "Oversee Operations"
