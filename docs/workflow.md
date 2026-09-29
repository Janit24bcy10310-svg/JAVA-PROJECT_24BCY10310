\# Process Flow / Workflow Diagram



\## Campus Course \& Records Manager (CCRM)



```text

&#x20;                        ┌───────────────────┐

&#x20;                        │      Start        │

&#x20;                        └─────────┬─────────┘

&#x20;                                  │

&#x20;                                  ▼

&#x20;                   ┌──────────────────────────┐

&#x20;                   │ Initialize Application   │

&#x20;                   │ and Load CSV Data        │

&#x20;                   └────────────┬─────────────┘

&#x20;                                │

&#x20;                                ▼

&#x20;                   ┌──────────────────────────┐

&#x20;                   │      Display Menu        │

&#x20;                   └────────────┬─────────────┘

&#x20;                                │

&#x20;                                ▼

&#x20;                   ┌──────────────────────────┐

&#x20;                   │     User Selects Option  │

&#x20;                   └────────────┬─────────────┘

&#x20;                                │

&#x20;             ┌──────────────────┼────────────────────┐

&#x20;             │                  │                    │

&#x20;             ▼                  ▼                    ▼

&#x20;      ┌──────────────┐   ┌──────────────┐    ┌──────────────┐

&#x20;      │   Student    │   │    Course    │    │   Utility    │

&#x20;      │  Operations  │   │  Operations  │    │  Operations  │

&#x20;      └──────┬───────┘   └──────┬───────┘    └──────┬───────┘

&#x20;             │                  │                    │

&#x20;             ▼                  ▼                    ▼

&#x20;      ┌──────────────┐   ┌──────────────┐    ┌──────────────┐

&#x20;      │ View / Add / │   │ View / Add / │    │ Array / File │

&#x20;      │ Search /     │   │ Search /     │    │ Operations   │

&#x20;      │ Remove /Sort │   │ Sort         │    │              │

&#x20;      └──────┬───────┘   └──────┬───────┘    └──────┬───────┘

&#x20;             │                  │                    │

&#x20;             ▼                  ▼                    │

&#x20;      ┌──────────────┐   ┌──────────────┐            │

&#x20;      │ Validate     │   │ Validate     │            │

&#x20;      │ Input        │   │ Input        │            │

&#x20;      └──────┬───────┘   └──────┬───────┘            │

&#x20;             │                  │                    │

&#x20;             ▼                  ▼                    │

&#x20;      ┌──────────────┐   ┌──────────────┐            │

&#x20;      │ Student      │   │ Course       │            │

&#x20;      │ Repository   │   │ Repository   │            │

&#x20;      └──────┬───────┘   └──────┬───────┘            │

&#x20;             │                  │                    │

&#x20;             ▼                  ▼                    │

&#x20;      ┌──────────────┐   ┌──────────────┐            │

&#x20;      │students.csv  │   │ courses.csv  │            │

&#x20;      └──────┬───────┘   └──────┬───────┘            │

&#x20;             │                  │                    │

&#x20;             └──────────────────┼────────────────────┘

&#x20;                                │

&#x20;                                ▼

&#x20;                   ┌──────────────────────────┐

&#x20;                   │    Display Result        │

&#x20;                   └────────────┬─────────────┘

&#x20;                                │

&#x20;                                ▼

&#x20;                   ┌──────────────────────────┐

&#x20;                   │     Return to Menu?      │

&#x20;                   └────────────┬─────────────┘

&#x20;                                │

&#x20;                        Yes ────┘

&#x20;                                │

&#x20;                                ▼

&#x20;                   ┌──────────────────────────┐

&#x20;                   │      Display Menu        │

&#x20;                   └──────────────────────────┘



&#x20;                        No

&#x20;                        │

&#x20;                        ▼

&#x20;                   ┌──────────────────────────┐

&#x20;                   │          Exit            │

&#x20;                   └──────────────────────────┘

```



\## Workflow Description



1\. The application starts through `CCRMApplication`.

2\. Existing student and course records are loaded from the CSV files.

3\. The main menu is displayed.

4\. The user selects an operation.

5\. Student operations handle viewing, adding, searching, removing, and sorting student records.

6\. Course operations handle viewing, adding, searching, and sorting course records.

7\. Input is validated before records are modified.

8\. Student changes are stored through `StudentRepository`.

9\. Course changes are stored through `CourseRepository`.

10\. Utility operations provide array processing and file-size calculation.

11\. The result of the selected operation is displayed.

12\. The application returns to the main menu until the user chooses to exit.

