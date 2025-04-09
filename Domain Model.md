## 🧠 SmartMed Domain Model

| **Entity**       | **Attributes**                                                                 | **Methods**                                                      | **Relationships**                                                                 |
|------------------|---------------------------------------------------------------------------------|-------------------------------------------------------------------|-----------------------------------------------------------------------------------|
| **Patient**       | patientId, name, email, phone, dateOfBirth                                      | register(), bookAppointment(), viewAppointments()                | Has one UserAccount; Can book multiple Appointments                               |
| **Doctor**        | doctorId, name, specialty, email, availabilitySchedule                          | updateAvailability(), viewAppointments(), approveAppointment()   | Has one UserAccount; Can have multiple Appointments and MedicalRecords            |
| **Appointment**   | appointmentId, date, time, status, reason, patientId, doctorId                  | cancel(), reschedule(), sendReminders()                          | Linked to one Patient and one Doctor                                              |
| **UserAccount**   | userId, username, passwordHash, role (PATIENT/DOCTOR/ADMIN)                     | authenticate(), resetPassword()                                  | One-to-one with either a Patient or Doctor                                        |
| **Notification**  | notificationId, message, timestamp, recipientId, status (READ/UNREAD)           | send(), markAsRead()                                             | Sent to Patients or Doctors; triggered by Appointments                            |
| **Scheduler (AI)**| *(Service class, no persistent attributes)*                                     | generateOptimalSchedule(), detectConflicts()                     | Interacts with Doctor availability and Appointments                               |
| **MedicalRecord** | recordId, patientId, doctorId, diagnosis, treatment, dateCreated                | addEntry(), viewHistory()                                        | Linked to one Patient; Created/updated by a Doctor                                |



1. A Patient can have only **one active appointment** with the same Doctor per day.
2. A Doctor must define **availability** before appointments can be booked.
3. Notifications are sent:
   - **1 day before** an appointment.
   - **1 hour before** an appointment.
4. Only Doctors can **create or update** MedicalRecords.
5. Appointments can be **cancelled up to 2 hours** before the scheduled time.
6. Each UserAccount is linked to **either a Patient or a Doctor**, not both.
