\# Non-Functional Requirements



\## Campus Course \& Records Manager (CCRM)



Non-functional requirements describe the quality attributes and operational characteristics expected from the CCRM application.



\## NFR-01: Usability



The application shall provide a simple command-line menu so that users can select operations using numbered options.



The application shall display clear prompts, results, and error messages.



\## NFR-02: Reliability



The application shall handle invalid user input without terminating unexpectedly.



The application shall handle missing CSV files by allowing the application to initialize its required data.



\## NFR-03: Data Integrity



The application shall validate records before they are added.



The application shall prevent duplicate student registration numbers and duplicate course codes.



Student and course modifications shall be persisted to their respective CSV files.



\## NFR-04: Maintainability



The application shall use separate packages and classes for different responsibilities.



The project shall follow a modular structure containing:



\- CLI layer

\- Domain classes

\- Repository classes

\- Utility classes

\- Configuration class



This separation shall make the code easier to understand and modify.



\## NFR-05: Portability



The application shall use standard Java APIs and shall not depend on platform-specific libraries.



The application shall be designed to run on systems supporting Java 17 or later.



\## NFR-06: Performance



The application shall perform normal student and course operations efficiently for the expected small-to-medium academic record set.



Searching, sorting, loading, and saving operations shall complete without unnecessary processing.



\## NFR-07: Security



The application shall validate user-provided input before modifying records.



The application shall avoid accepting obviously incomplete student and course records.



The current version does not implement user authentication or role-based access control.



\## NFR-08: Extensibility



The application shall use reusable classes and methods so that additional functionality can be added in future versions.



Potential extensions include:



\- Student-course enrollment

\- Record update functionality

\- Database storage

\- Graphical user interface

\- User authentication

\- Automated testing



\## NFR Summary



| ID | Requirement | Description |

|---|---|---|

| NFR-01 | Usability | Clear menu, prompts, results, and error messages |

| NFR-02 | Reliability | Handles invalid input and missing CSV files |

| NFR-03 | Data Integrity | Validates records and prevents duplicates |

| NFR-04 | Maintainability | Uses modular packages and classes |

| NFR-05 | Portability | Uses standard Java APIs and Java 17+ |

| NFR-06 | Performance | Efficient for expected academic record sizes |

| NFR-07 | Security | Validates input; authentication is outside current scope |

| NFR-08 | Extensibility | Supports future functional expansion |

