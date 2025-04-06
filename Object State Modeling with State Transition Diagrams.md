1. Appointment
The Appointment object transitions through various states based on user and system actions. It begins as Requested, moves to Scheduled upon doctor confirmation, and then either becomes Completed or Canceled. This diagram supports functional requirements FR-002 (appointment booking) and FR-005 (appointment cancellation), allowing visibility into the full appointment lifecycle.
![Appointment Diagram](https://github.com/nenenokuthula/AI-Medical-System/blob/main/Appointment%20Diagram.png?raw=true)

2. Patient
   The Patient object begins in the Registered state and becomes Active upon first login. If inactive for a long period, the state shifts to Inactive. The system allows reactivation through login or forced banning by admins. This supports FR-001 (registration and authentication) and security policies.
   ![Patient Diagram](https://github.com/nenenokuthula/AI-Medical-System/blob/main/Patient%20Diagram.png?raw=true)

3. Doctor
   The Doctor object moves between Available, Unavailable, and OnLeave. These transitions are important for dynamic scheduling and align with FR-003 (doctor availability management). They ensure the appointment system accurately reflects real-time doctor availability.
![Doctor Diagram](https://github.com/nenenokuthula/AI-Medical-System/blob/main/Doctor%20Diagram.png?raw=true)

4. Payment
   The Payment object handles transitions from Initiated to Processing, then to either Successful or Failed. This aligns with FR-006 (secure payment processing), ensuring traceability and clarity in financial transactions.
![Payment Diagram](https://github.com/nenenokuthula/AI-Medical-System/blob/main/Payment%20Diagram.png?raw=true)

5. Prescription
   The Prescription object follows a clinical workflow: Drafted, Finalized, Sent, and Archived. These states help ensure the integrity and lifecycle of prescriptions, supporting FR-007 (prescription management).
![Prescription Diagram](https://github.com/nenenokuthula/AI-Medical-System/blob/main/Pescription%20Diagram.png?raw=true)

6. Notification
   The Notification object is first Queued then Sent, Delivered, and finally Read. This ensures traceable communication flow between the system and stakeholders, supporting FR-008 (real-time notifications).
![Notification Diagram](https://github.com/nenenokuthula/AI-Medical-System/blob/main/Notification%20Diagram.png?raw=true)

 7. Medical Record
    The Medical Record object is created when a patient receives treatment, can be Updated, Archived, and then Retrieved when necessary. This fulfills FR-009 (medical record lifecycle management).
![Medical Record Diagram](https://github.com/nenenokuthula/AI-Medical-System/blob/main/Medical%20Record%20Diagram.png?raw=true)

 8. User Account
    The User Account object ensures a secure access flow from Created to Verified, Active, and handles Locked accounts due to failed logins. Admin intervention can restore access. This supports FR-001 (user authentication and recovery).
  ![User Account Diagram](https://github.com/nenenokuthula/AI-Medical-System/blob/main/User%20Account%20Diagram.png?raw=true)
  
