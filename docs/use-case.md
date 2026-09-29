\# Use Case Diagram



\## Campus Course \& Records Manager (CCRM)



```text

&#x20;                        ┌─────────────────────────────────────┐

&#x20;                        │   Campus Course \& Records Manager   │

&#x20;                        │                CCRM                 │

&#x20;                        │                                     │

User / Operator ────────►│  View Students                     │

&#x20;                        │  Add Student                       │

&#x20;                        │  Search Student                    │

&#x20;                        │  Remove Student                    │

&#x20;                        │  Sort Students by Name             │

&#x20;                        │                                     │

&#x20;                        │  View Courses                      │

&#x20;                        │  Add Course                        │

&#x20;                        │  Search Course                     │

&#x20;                        │  Sort Courses by Code              │

&#x20;                        │                                     │

&#x20;                        │  Test Array Operations             │

&#x20;                        │  Calculate File/Directory Size     │

&#x20;                        │  Exit Application                   │

&#x20;                        └─────────────────────────────────────┘

```



\## Actor



\### User / Operator



The primary actor is the user who interacts with the CCRM command-line application.



The user can:



\- View student records

\- Add student records

\- Search student records

\- Remove student records

\- Sort students by name

\- View course records

\- Add course records

\- Search course records

\- Sort courses by code

\- Test array operations

\- Calculate file/directory size

\- Exit the application



\## Use Case Groups



\### Student Management



Student-related use cases operate on the student records maintained by the application.



\- View Students

\- Add Student

\- Search Student

\- Remove Student

\- Sort Students by Name



\### Course Management



Course-related use cases operate on course records.



\- View Courses

\- Add Course

\- Search Course

\- Sort Courses by Code



\### Utility Operations



The application also provides general utility operations.



\- Test Array Operations

\- Calculate File/Directory Size



\### Application Control



\- Exit Application



\## Data Storage



Student and course operations use CSV files for persistent storage:



```text

Student Operations ─────► students.csv



Course Operations ──────► courses.csv

```

