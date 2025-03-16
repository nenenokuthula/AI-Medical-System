
Use Case Specifications
For each use case, detailed specifications are provided:

Use Case: Book Appointment
Actor: Patient
Description: Allows patients to book appointments with available doctors.
Preconditions:
Patient is registered and logged in.
Doctor availability is loaded in the system.
Postconditions:
Appointment is successfully scheduled.
Confirmation is sent to patient and doctor.
Basic Flow:
Patient logs in.
Patient selects doctor and date/time.
System verifies availability.
System schedules the appointment.
Confirmation notification is sent.
Alternative Flows:
Doctor Unavailable: Suggests the next available slots.
Patient Exceeds Appointment Limit: Displays a restriction message.
Use Case: Cancel Appointment
Actor: Patient
Description: Allows patients to cancel an upcoming appointment.
Preconditions:
Patient has an existing appointment.
Postconditions:
Appointment is removed from the system.
Notification is sent to the doctor.
Basic Flow:
Patient logs in.
Patient navigates to "My Appointments."
Patient selects the appointment to cancel.
System confirms cancellation.
Notification is sent to doctor and patient.
Alternative Flows:
Cancellation Deadline Exceeded: System denies cancellation.
Use Case: AI-Based Rescheduling
Actor: AI Scheduler
Description: Automatically reschedules appointments based on doctor availability and patient preference.
Preconditions:
Appointment exists and needs rescheduling.
Postconditions:
Appointment is rescheduled.
Notification is sent to all parties.
Basic Flow:
AI Scheduler detects schedule conflict.
AI suggests new time slots.
Patient confirms a new slot.
System updates appointment and notifies stakeholders.
Alternative Flows:
No Suitable Slots Available: Patient is asked to select a different doctor.
