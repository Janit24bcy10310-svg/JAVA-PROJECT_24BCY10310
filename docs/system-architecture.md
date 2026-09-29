\# System Architecture Diagram



\## Campus Course \& Records Manager (CCRM)



```text

&#x20;                   ┌──────────────────────────┐

&#x20;                   │       User / Operator    │

&#x20;                   └────────────┬─────────────┘

&#x20;                                │

&#x20;                                ▼

&#x20;                   ┌──────────────────────────┐

&#x20;                   │   CCRMApplication.java   │

&#x20;                   │      CLI / Menu Layer     │

&#x20;                   └────────────┬─────────────┘

&#x20;                                │

&#x20;             ┌──────────────────┼──────────────────┐

&#x20;             │                  │                  │

&#x20;             ▼                  ▼                  ▼

&#x20;    ┌────────────────┐ ┌────────────────┐ ┌─────────────────┐

&#x20;    │ Student        │ │ Course         │ │ Utility         │

&#x20;    │ Management     │ │ Management     │ │ Operations      │

&#x20;    └───────┬────────┘ └───────┬────────┘ └────────┬────────┘

&#x20;            │                  │                   │

&#x20;            ▼                  ▼                   ▼

&#x20;    ┌────────────────┐ ┌────────────────┐ ┌─────────────────┐

&#x20;    │ Student        │ │ Course         │ │ ArrayOperations │

&#x20;    │ Repository     │ │ Repository     │ │ Comparators     │

&#x20;    └───────┬────────┘ └───────┬────────┘ │ FileUtils       │

&#x20;            │                  │          └─────────────────┘

&#x20;            ▼                  ▼

&#x20;    ┌────────────────┐ ┌────────────────┐

&#x20;    │ students.csv   │ │ courses.csv    │

&#x20;    └────────────────┘ └────────────────┘

```



\## Components



\### Presentation / CLI Layer



`CCRMApplication.java` provides the command-line menu and handles user interaction.



\### Domain Layer



The `domain` package contains:



\- `Student.java`

\- `Course.java`



These classes represent the main entities managed by the application.



\### Utility / Persistence Layer



The `util` package contains:



\- `StudentRepository.java` — loads and saves student records.

\- `CourseRepository.java` — loads and saves course records.

\- `ArrayOperations.java` — provides array operations.

\- `Comparators.java` — provides sorting comparators.

\- `FileUtils.java` — provides recursive file-size calculation.

\- `AppConfig.java` — provides project-level file path configuration.



\### Data Layer



The application stores records using:



\- `students.csv`

\- `courses.csv`

