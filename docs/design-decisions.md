\# Design Decisions \& Rationale



\## Campus Course \& Records Manager (CCRM)



This document explains the major design choices made while developing the CCRM application.



\## 1. Java 17



\### Decision



The project uses Java 17.



\### Rationale



Java 17 provides the language features and standard libraries required by the application while providing a stable development environment.



The project uses standard Java APIs for collections, file handling, input processing, and application development.



\---



\## 2. Command-Line Interface



\### Decision



The application uses a command-line interface instead of a graphical user interface.



\### Rationale



A CLI keeps the project focused on Java programming concepts and core application logic.



It also makes the application lightweight and easy to compile and execute without additional GUI frameworks.



\---



\## 3. CSV File Storage



\### Decision



Student and course records are stored in CSV files.



The application uses:



```text

students.csv

courses.csv

```



\### Rationale



CSV provides a simple human-readable format for persistent storage without requiring an external database system.



It also demonstrates Java file-handling concepts using the Java NIO API.



\---



\## 4. Package-Based Architecture



\### Decision



The source code is divided into packages:



```text

edu.ccrm

├── cli

├── domain

└── util

```



\### Rationale



Separating classes according to their responsibilities improves code organization and maintainability.



The `cli` package handles application interaction, the `domain` package represents records, and the `util` package contains reusable services and utilities.



\---



\## 5. Domain Model Classes



\### Decision



Separate `Student` and `Course` classes are used to represent academic records.



\### Rationale



Each class represents a distinct entity in the application.



This makes the code easier to understand and allows the application to work with strongly typed objects instead of manipulating raw strings throughout the program.



\---



\## 6. Repository Classes



\### Decision



Student and course file operations are separated into:



```text

StudentRepository

CourseRepository

```



\### Rationale



The repository classes isolate CSV loading and saving logic from the main application.



This reduces duplication and makes future replacement of CSV storage with another storage mechanism easier.



\---



\## 7. Utility Classes



\### Decision



Reusable operations are separated into utility classes:



```text

ArrayOperations

Comparators

FileUtils

AppConfig

```



\### Rationale



Separating reusable functionality keeps the main application class focused on application workflow.



For example:



\- `ArrayOperations` handles array processing.

\- `Comparators` provides sorting logic.

\- `FileUtils` handles recursive file-size calculation.

\- `AppConfig` centralizes CSV file locations.



\---



\## 8. Input Validation



\### Decision



Input is validated before student and course records are added.



\### Rationale



Validation prevents incomplete or duplicate records from being stored.



Examples include:



\- Duplicate registration number detection

\- Duplicate course code detection

\- Empty-field validation

\- Email validation

\- Positive credit validation



\---



\## 9. In-Memory Collections



\### Decision



Student and course records are maintained in Java collections while the application is running.



\### Rationale



Collections provide convenient operations for adding, removing, searching, and sorting records.



The records are persisted to CSV files when required.



\---



\## 10. Modular Design



\### Decision



The application is divided into multiple classes with specific responsibilities.



\### Rationale



A modular structure makes the project easier to:



\- Understand

\- Test

\- Maintain

\- Debug

\- Extend



Future functionality can be added without placing all application logic into a single class.



\## Design Summary



The overall design prioritizes:



\- Clear separation of responsibilities

\- Reusable Java classes

\- Simple persistent storage

\- Input validation

\- Maintainability

\- Extensibility

