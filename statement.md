\# Project Statement



\## Project Title



Campus Course \& Records Manager (CCRM)



\## Problem Statement



Managing student and course information manually can make it difficult to search, update, organize, and maintain records efficiently.



The Campus Course \& Records Manager (CCRM) is a Java-based command-line application developed to provide a simple system for managing student and course records.



The application provides operations for viewing, adding, searching, removing, and sorting records. It also provides CSV-based persistence so that student and course information can be stored and loaded between application runs.



\## Project Scope



The project focuses on managing basic academic records through a command-line interface.



The scope includes:



\- Student record management

\- Course record management

\- Student and course searching

\- Student and course sorting

\- CSV-based data persistence

\- Input validation

\- Array utility operations

\- File and directory size calculation



The project does not currently include a graphical user interface or database-backed storage.



\## Target Users



The intended users of the application are:



\- Students

\- Faculty members

\- Academic staff

\- Users who need a lightweight academic record management system



\## Objectives



The main objectives of the project are:



1\. To develop a modular Java application for managing student records.

2\. To provide basic course record management.

3\. To implement searching and sorting operations.

4\. To store records using CSV files.

5\. To demonstrate object-oriented programming concepts in Java.

6\. To implement input validation and error handling.

7\. To organize the application using a clear package structure.

8\. To demonstrate file handling and reusable utility classes.



\## High-Level Features



\### Student Management



\- View students

\- Add students

\- Search students using registration number

\- Remove students

\- Validate student information

\- Prevent duplicate registration numbers



\### Course Management



\- View courses

\- Add courses

\- Search courses using course code

\- Validate course information

\- Prevent duplicate course codes



\### Sorting



\- Sort students by name

\- Sort courses by course code



\### Data Persistence



\- Load student records from `students.csv`

\- Save student records to `students.csv`

\- Load course records from `courses.csv`

\- Save course records to `courses.csv`



\### Utility Functions



\- Join array elements

\- Generate the tail of an array

\- Calculate file or directory size recursively



\## Technology



\- Java 17

\- Java Collections Framework

\- Java NIO

\- CSV file storage

\- Command-line interface

\- Git/GitHub



\## Main Application Class



```text

edu.ccrm.cli.CCRMApplication

```



\## Package Structure



```text

edu.ccrm

├── cli

├── domain

└── util

```



The `cli` package contains the main application, the `domain` package contains student and course models, and the `util` package contains reusable utility and repository classes.



\## Expected Outcome



The completed application provides a functional command-line system through which users can manage student and course records, search and sort information, persist data using CSV files, and perform utility operations.



\## Future Scope



Future versions could include:



\- Student-course enrollment management

\- Record update operations

\- Database integration

\- Graphical user interface

\- User authentication

\- Automated unit testing

\- Advanced filtering and reporting

