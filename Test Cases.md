Functional Test Cases
| Test Case ID | Requirement ID | Description | Steps | Expected Result | Actual Result | Status |
|-------------|---------------|-------------|-------|-----------------|---------------|--------|
| TC-001 | FR-001 | Patient books an appointment | 1. Log in 2. Select doctor 3. Choose time slot 4. Confirm | Appointment scheduled | TBD | TBD |
| TC-002 | FR-002 | Patient cancels an appointment | 1. Log in 2. Go to "My Appointments" 3. Click cancel 4. Confirm | Appointment canceled | TBD | TBD |
| TC-003 | FR-003 | Doctor updates schedule | 1. Log in 2. Navigate to schedule 3. Edit availability 4. Save changes | Schedule updated | TBD | TBD |
| TC-004 | FR-004 | AI reschedules a conflict | 1. AI detects conflict 2. Suggests new slot 3. Patient confirms 4. System updates | Appointment rescheduled | TBD | TBD |
| TC-005 | FR-005 | Notification is sent | 1. Book an appointment 2. Wait for notification | Notification received | TBD | TBD |


Non-Functional Test Cases
| Test Case ID | Category | Description | Steps | Expected Result | Actual Result | Status |
|-------------|----------|-------------|-------|-----------------|---------------|--------|
| TC-NF-001 | Performance | Handle 1,000 concurrent users booking appointments | Simulate 1,000 users | Response time ≤ 2 sec | TBD | TBD |
| TC-NF-002 | Security | Ensure patient data encryption | Access encrypted patient records | Data is securely encrypted | TBD | TBD |
