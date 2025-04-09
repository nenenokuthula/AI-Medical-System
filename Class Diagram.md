classDiagram

class Patient {
  -patientId: String
  -name: String
  -email: String
  -phone: String
  -dateOfBirth: Date
  +register()
  +bookAppointment()
  +viewAppointments()
}

class Doctor {
  -doctorId: String
  -name: String
  -specialty: String
  -email: String
  -availabilitySchedule: String
  +updateAvailability()
  +viewAppointments()
  +approveAppointment()
}

class Appointment {
  -appointmentId: String
  -date: Date
  -time: String
  -status: String
  -reason: String
  +cancel()
  +reschedule()
  +sendReminders()
}

class UserAccount {
  -userId: String
  -username: String
  -passwordHash: String
  -role: String
  +authenticate()
  +resetPassword()
}

class Notification {
  -notificationId: String
  -message: String
  -timestamp: Date
  -recipientId: String
  -status: String
  +send()
  +markAsRead()
}

class Scheduler {
  +generateOptimalSchedule()
  +detectConflicts()
}

class MedicalRecord {
  -recordId: String
  -diagnosis: String
  -treatment: String
  -dateCreated: Date
  +addEntry()
  +viewHistory()
}

Patient "1" --> "1" UserAccount
Doctor "1" --> "1" UserAccount
Patient "1" --> "0..*" Appointment
Doctor "1" --> "0..*" Appointment
Appointment "1" --> "0..*" Notification
Notification "1" --> "1" UserAccount
Doctor "1" --> "0..*" MedicalRecord
Patient "1" --> "0..*" MedicalRecord
Scheduler --> Doctor
Scheduler --> Appointment
