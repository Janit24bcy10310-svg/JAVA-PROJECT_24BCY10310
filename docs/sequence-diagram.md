\# Sequence Diagram



\## Campus Course \& Records Manager (CCRM)



\### Scenario: Add a Student



The following sequence shows how a new student record is added and persisted.



```text

User              CCRMApplication       StudentRepository       students.csv

&#x20;│                       │                       │                    │

&#x20;│  Select Add Student  │                       │                    │

&#x20;│─────────────────────►│                       │                    │

&#x20;│                       │                       │                    │

&#x20;│  Enter student data   │                       │                    │

&#x20;│─────────────────────►│                       │                    │

&#x20;│                       │                       │                    │

&#x20;│                       │ Validate input        │                    │

&#x20;│                       │───────────────┐       │                    │

&#x20;│                       │               │       │                    │

&#x20;│                       │◄──────────────┘       │                    │

&#x20;│                       │                       │                    │

&#x20;│                       │ Create Student object │                    │

&#x20;│                       │───────────────┐       │                    │

&#x20;│                       │               │       │                    │

&#x20;│                       │◄──────────────┘       │                    │

&#x20;│                       │                       │                    │

&#x20;│                       │ save(student list)    │                    │

&#x20;│                       │──────────────────────►│                    │

&#x20;│                       │                       │                    │

&#x20;│                       │                       │ Write records      │

&#x20;│                       │                       │───────────────────►│

&#x20;│                       │                       │                    │

&#x20;│                       │                       │     Saved           │

&#x20;│                       │                       │◄───────────────────│

&#x20;│                       │                       │                    │

&#x20;│                       │       Save complete   │                    │

&#x20;│                       │◄──────────────────────│                    │

&#x20;│                       │                       │                    │

&#x20;│  Display success      │                       │                    │

&#x20;│◄──────────────────────│                       │                    │

&#x20;│                       │                       │                    │

```



\### Scenario: Search for a Student



```text

User              CCRMApplication       StudentRepository       students.csv

&#x20;│                       │                       │                    │

&#x20;│ Select Search Student│                       │                    │

&#x20;│─────────────────────►│                       │                    │

&#x20;│                       │                       │                    │

&#x20;│ Enter registration no│                       │                    │

&#x20;│─────────────────────►│                       │                    │

&#x20;│                       │                       │                    │

&#x20;│                       │ Search loaded records│                    │

&#x20;│                       │───────────────┐       │                    │

&#x20;│                       │               │       │                    │

&#x20;│                       │◄──────────────┘       │                    │

&#x20;│                       │                       │                    │

&#x20;│                       │ Display matching      │                    │

&#x20;│                       │ student               │                    │

&#x20;│                       │                       │                    │

&#x20;│ Student information  │                       │                    │

&#x20;│◄──────────────────────│                       │                    │

```



\## Sequence Description



\### Add Student



1\. The user selects \*\*Add Student\*\* from the main menu.

2\. `CCRMApplication` collects the student's registration number, name, and email.

3\. The application validates the entered information.

4\. A `Student` object is created.

5\. The student is added to the in-memory student collection.

6\. `StudentRepository.save()` is called.

7\. The updated records are written to `students.csv`.

8\. The application displays a success message.



\### Search Student



1\. The user selects \*\*Search Student\*\*.

2\. The user enters a registration number.

3\. `CCRMApplication` searches the loaded student records.

4\. If a matching record exists, its details are displayed.

5\. If no matching record exists, the application reports that the student was not found.

