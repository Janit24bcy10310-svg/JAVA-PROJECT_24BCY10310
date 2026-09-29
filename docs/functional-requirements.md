\# Functional Requirements



\## Campus Course \& Records Manager (CCRM)



\## 1. Student Management Module



\### FR-01: View Student Records



The system shall allow the user to view all currently loaded student records.



\*\*Input:\*\* None



\*\*Output:\*\* List of student registration numbers, names, and email addresses.



\### FR-02: Add Student



The system shall allow the user to add a new student record.



\*\*Input:\*\*

\- Registration number

\- Given name

\- Family name

\- Email address



\*\*Output:\*\* Confirmation message when the student is successfully added.



\### FR-03: Validate Student Data



The system shall validate student information before adding a record.



The system shall:

\- Reject an empty registration number.

\- Reject empty name fields.

\- Reject an invalid email without `@`.

\- Reject a duplicate registration number.



\### FR-04: Search Student



The system shall allow the user to search for a student using the registration number.



\*\*Input:\*\* Student registration number



\*\*Output:\*\* Matching student record or a not-found message.



\### FR-05: Remove Student



The system shall allow the user to remove a student using the registration number.



\*\*Input:\*\* Student registration number



\*\*Output:\*\* Confirmation when the student is removed.



\---



\## 2. Course Management Module



\### FR-06: View Course Records



The system shall allow the user to view all available course records.



\*\*Input:\*\* None



\*\*Output:\*\* List of course code, title, credits, instructor, semester, and department.



\### FR-07: Add Course



The system shall allow the user to add a new course.



\*\*Input:\*\*

\- Course code

\- Course title

\- Credits

\- Instructor

\- Semester

\- Department



\*\*Output:\*\* Confirmation when the course is successfully added.



\### FR-08: Validate Course Data



The system shall validate course information before adding a record.



The system shall:

\- Reject an empty course code.

\- Reject duplicate course codes.

\- Require credits to be a positive integer.

\- Reject empty course title.

\- Reject empty instructor.

\- Reject empty semester.

\- Reject empty department.



\### FR-09: Search Course



The system shall allow the user to search for a course using its course code.



\*\*Input:\*\* Course code



\*\*Output:\*\* Matching course record or a not-found message.



\---



\## 3. Sorting Module



\### FR-10: Sort Students



The system shall allow the user to sort student records alphabetically by student name.



\*\*Input:\*\* Existing student records



\*\*Output:\*\* Students displayed in sorted order.



\### FR-11: Sort Courses



The system shall allow the user to sort courses by course code.



\*\*Input:\*\* Existing course records



\*\*Output:\*\* Courses displayed in sorted order.



\---



\## 4. Data Persistence Module



\### FR-12: Load Student Data



The system shall load student records from `students.csv` when the application starts.



\### FR-13: Save Student Data



The system shall save student changes to `students.csv`.



\### FR-14: Load Course Data



The system shall load course records from `courses.csv` when the application starts.



\### FR-15: Save Course Data



The system shall save course changes to `courses.csv`.



\---



\## 5. Utility Module



\### FR-16: Array Operations



The system shall provide array utility operations including:



\- Joining array elements using a separator.

\- Obtaining the tail of an array.



\### FR-17: File and Directory Size



The system shall calculate the total size of files contained within a specified file or directory.



\---



\## 6. Application Control



\### FR-18: Menu Navigation



The system shall display a menu through which the user can select available operations.



\### FR-19: Exit Application



The system shall allow the user to terminate the application through the Exit option.



\---



\## Functional Module Summary



| Module | Main Functions |

|---|---|

| Student Management | View, add, search, remove, validate students |

| Course Management | View, add, search, validate courses |

| Sorting | Sort students by name and courses by code |

| Data Persistence | Load and save CSV records |

| Utility Operations | Array operations and file-size calculation |

| Application Control | Menu navigation and application exit |

