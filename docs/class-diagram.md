\# Class Diagram



\## Campus Course \& Records Manager (CCRM)



```text

&#x20;                        ┌──────────────────────────────┐

&#x20;                        │      CCRMApplication         │

&#x20;                        ├──────────────────────────────┤

&#x20;                        │ + main(String\[]): void       │

&#x20;                        │ + loadData(): void            │

&#x20;                        │ + saveStudents(): void        │

&#x20;                        │ + saveCourses(): void         │

&#x20;                        │ + viewStudents(): void        │

&#x20;                        │ + viewCourses(): void         │

&#x20;                        │ + addStudent(): void          │

&#x20;                        │ + addCourse(): void           │

&#x20;                        │ + searchStudent(): void       │

&#x20;                        │ + searchCourse(): void        │

&#x20;                        │ + removeStudent(): void       │

&#x20;                        └──────────────┬───────────────┘

&#x20;                                       │ uses

&#x20;                    ┌──────────────────┼──────────────────┐

&#x20;                    │                  │                  │

&#x20;                    ▼                  ▼                  ▼

&#x20;         ┌──────────────────┐ ┌──────────────────┐ ┌──────────────────┐

&#x20;         │     Student      │ │      Course      │ │   AppConfig      │

&#x20;         ├──────────────────┤ ├──────────────────┤ ├──────────────────┤

&#x20;         │ - regNo: String  │ │ - code: String   │ │ + projectDirectory│

&#x20;         │ - given: String  │ │ - title: String  │ │ + studentsFile()  │

&#x20;         │ - family: String │ │ - credits: int   │ │ + coursesFile()   │

&#x20;         │ - email: String  │ │ - instructor     │ └──────────────────┘

&#x20;         ├──────────────────┤ │ - semester       │

&#x20;         │ + regNo()        │ │ - department     │

&#x20;         │ + given()        │ ├──────────────────┤

&#x20;         │ + family()       │ │ + codeValue()    │

&#x20;         │ + email()        │ │ + title()        │

&#x20;         │ + fullName()     │ │ + credits()      │

&#x20;         │ + name()         │ │ + instructor()   │

&#x20;         └──────────────────┘ │ + semester()     │

&#x20;                              │ + department()   │

&#x20;                              └──────────────────┘





&#x20;      ┌───────────────────────────────┐

&#x20;      │      StudentRepository       │

&#x20;      ├───────────────────────────────┤

&#x20;      │ + load(Path): List<Student>  │

&#x20;      │ + save(Path,List<Student>)   │

&#x20;      └───────────────┬───────────────┘

&#x20;                      │ manages

&#x20;                      ▼

&#x20;                 students.csv





&#x20;      ┌───────────────────────────────┐

&#x20;      │       CourseRepository       │

&#x20;      ├───────────────────────────────┤

&#x20;      │ + load(Path): List<Course>   │

&#x20;      │ + save(Path,List<Course>)    │

&#x20;      └───────────────┬───────────────┘

&#x20;                      │ manages

&#x20;                      ▼

&#x20;                  courses.csv





&#x20;      ┌───────────────────────────────┐

&#x20;      │       Comparators             │

&#x20;      ├───────────────────────────────┤

&#x20;      │ + byName(): Comparator<Student>│

&#x20;      │ + byCode(): Comparator<Course> │

&#x20;      └───────────────────────────────┘





&#x20;      ┌───────────────────────────────┐

&#x20;      │      ArrayOperations          │

&#x20;      ├───────────────────────────────┤

&#x20;      │ + join(String\[],String): String│

&#x20;      │ + tail(String\[]): String\[]     │

&#x20;      └───────────────────────────────┘





&#x20;      ┌───────────────────────────────┐

&#x20;      │         FileUtils             │

&#x20;      ├───────────────────────────────┤

&#x20;      │ + sizeRecursive(Path): long   │

&#x20;      └───────────────────────────────┘

```



\## Class Responsibilities



\### CCRMApplication



The main command-line application. It displays the menu, accepts user input, performs operations, and coordinates the other classes.



\### Student



Represents a student record containing:



\- Registration number

\- Given name

\- Family name

\- Email address



\### Course



Represents a course record containing:



\- Course code

\- Course title

\- Credits

\- Instructor

\- Semester

\- Department



\### StudentRepository



Provides CSV-based loading and saving of student records.



\### CourseRepository



Provides CSV-based loading and saving of course records.



\### Comparators



Provides reusable comparison logic for:



\- Sorting students by name

\- Sorting courses by course code



\### ArrayOperations



Provides reusable array-processing methods:



\- Joining array elements

\- Obtaining the tail of an array



\### FileUtils



Provides recursive file and directory size calculation.



\### AppConfig



Centralizes the paths used by the application for its CSV data files.



\## Relationships



```text

CCRMApplication

&#x20;     │

&#x20;     ├── uses ──► StudentRepository ──► students.csv

&#x20;     │

&#x20;     ├── uses ──► CourseRepository ───► courses.csv

&#x20;     │

&#x20;     ├── uses ──► Comparators

&#x20;     │

&#x20;     ├── uses ──► ArrayOperations

&#x20;     │

&#x20;     ├── uses ──► FileUtils

&#x20;     │

&#x20;     └── uses ──► AppConfig



StudentRepository ──► Student

CourseRepository  ──► Course

Comparators       ──► Student / Course

```

