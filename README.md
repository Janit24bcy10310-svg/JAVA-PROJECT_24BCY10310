# Campus Course & Records Manager (CCRM)

Campus Course & Records Manager (CCRM) is a Java 17 command-line application for managing student and course records.

The application provides student and course management features, sorting, searching, CSV-based data persistence, array utilities, and file/directory size calculation.

The project is designed to demonstrate core Java programming concepts including classes and objects, encapsulation, collections, interfaces, comparators, exception handling, file handling, and modular package organization.

---

## Features

### 1. Student Management
- View student records
- Add a new student
- Search for a student using registration number
- Remove a student
- Validate student input
- Prevent duplicate registration numbers

### 2. Course Management
- View course records
- Add a new course
- Search for a course using course code
- Validate course input
- Prevent duplicate course codes

### 3. Sorting
- Sort students by name
- Sort courses by course code

### 4. Data Persistence
- Student records are stored in `students.csv`
- Course records are stored in `courses.csv`
- Records are loaded when the application starts
- Changes are saved back to the CSV files

### 5. Utility Operations
- Join array elements using a separator
- Generate the tail of an array
- Calculate the size of files/directories recursively

---

## Technologies Used

- Java 17
- Java Collections Framework
- Java NIO File API
- CSV files for data persistence
- Command Line Interface (CLI)
- Git/GitHub

No external Java libraries are required.

---

## Requirements

- Java Development Kit (JDK) 17 or later
- Command Prompt or PowerShell
- Git (optional)

Check the installed Java version:

```text
java -version
javac -version
```
Both commands should show Java 17 or a newer version.

---

## Project Structure

```text
JAVA-PROJECT_24BCY10310-main
│
├── courses.csv
├── students.csv
├── README.md
│
└── src
    └── edu
        └── ccrm
            ├── cli
            │   └── CCRMApplication.java
            │
            ├── domain
            │   ├── Course.java
            │   └── Student.java
            │
            └── util
                ├── AppConfig.java
                ├── ArrayOperations.java
                ├── Comparators.java
                ├── CourseRepository.java
                ├── FileUtils.java
                └── StudentRepository.java
```

---

## Main Class

The application starts from:

```text
edu.ccrm.cli.CCRMApplication
```

---

## Data Storage

The application uses CSV files located in the project root.

### students.csv

Student records use the following format:

```text
regNo,given,family,email
```

Example:

```text
REG2025,Maya,Sharma,maya@example.com
REG2026,Raj,Kumar,raj@example.com
```

### courses.csv

Course records use the following format:

```text
code,title,credits,instructor,semester,department
```

Example:

```text
CS201,Algorithms,4,Dr. Rao,FALL,CS
CS202,Operating Systems,3,Dr. Mehta,FALL,CS
```

The application loads existing records from these files when it starts.

---

## Compilation

Open a terminal in the project root directory.

### Windows PowerShell

Create the output directory:

```powershell
mkdir out
```

Compile all Java source files:

```powershell
javac -d out (Get-ChildItem -Recurse -Filter *.java).FullName
```

### Linux / macOS

Create the output directory:

```bash
mkdir -p out
```

Compile:

```bash
javac -d out $(find src -name "*.java")
```

---

## Running the Application

After successful compilation:

```text
java -cp out edu.ccrm.cli.CCRMApplication
```

The application displays a menu-driven interface.

---

## Application Menu

```text
1. View Students
2. View Courses
3. Sort Students by Name
4. Sort Courses by Code
5. Add Student
6. Search Student
7. Remove Student
8. Add Course
9. Search Course
10. Test Array Operations
11. Calculate File/Directory Size
12. Exit
```

---

## Validation and Error Handling

The application performs input validation for important operations.

Examples include:

- Empty student fields are rejected
- Empty course fields are rejected
- Duplicate student registration numbers are prevented
- Duplicate course codes are prevented
- Email input is checked for `@`
- Course credits must be a positive integer
- Invalid numeric input is handled
- Missing CSV files are handled
- Invalid CSV records can be skipped during loading
- File operation errors are handled using exceptions

---

## Java Concepts Demonstrated

The project demonstrates several core Java concepts:

### Classes and Objects

The `Student` and `Course` classes represent domain objects.

### Encapsulation

Data fields are private and accessed through methods.

### Packages

The application is organized into:

```text
edu.ccrm.cli
edu.ccrm.domain
edu.ccrm.util
```

### Interfaces and Comparators

The project uses Java's `Comparator` interface for sorting students and courses.

### Collections

`ArrayList` and `List` are used to manage records in memory.

### File Handling

Java NIO APIs such as `Files`, `Path`, and `Files.walk()` are used for CSV persistence and file operations.

### Exception Handling

File and input-related exceptions are handled to prevent the application from terminating unexpectedly during normal error conditions.

### Static Utility Methods

Reusable operations are implemented in utility classes such as:

```text
ArrayOperations
FileUtils
Comparators
```

---

## Testing

The application was tested using the following functional scenarios:

| Test Case | Result |
|---|---|
| View student records | Passed |
| View course records | Passed |
| Sort students by name | Passed |
| Sort courses by course code | Passed |
| Add student | Passed |
| Search student | Passed |
| Remove student | Passed |
| Add course | Passed |
| Search course | Passed |
| Save student records to CSV | Passed |
| Save course records to CSV | Passed |
| Array join operation | Passed |
| Array tail operation | Passed |
| File/directory size calculation | Passed |

---

## Example Array Utility Output

```text
Array Operations
-------------------------------
Joined: Java | Programming | CCRM
Tail: [Programming, CCRM]
```

---

## Example Course Search

```text
Course Found:
CS203 | Database Management Systems | 4 credits | Dr. Kumar | FALL | CS
```

---

## Example Student Records

```text
Student Records
-------------------------------
REG2025 | Maya Sharma | maya@example.com
REG2026 | Raj Kumar | raj@example.com
```

---

## Troubleshooting

### Java command not recognized

Make sure JDK 17 or later is installed and added to the system PATH.

Check using:

```text
java -version
javac -version
```

### Class not found error

Make sure the project has been compiled successfully and that the command is executed from the project root:

```text
java -cp out edu.ccrm.cli.CCRMApplication
```

### CSV records are not appearing

Check that:

```text
students.csv
courses.csv
```

are present in the project root and contain valid CSV records.

---

## Future Enhancements

Possible future improvements include:

- Student-course enrollment management
- Update student and course records
- Advanced searching and filtering
- Database integration
- GUI interface
- User authentication
- Automated unit testing
- Report generation
- Additional validation
- More advanced record management features

---

## License

This project is developed as an academic Java project.

License information can be added if a specific open-source license is selected.