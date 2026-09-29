\# Testing Approach



\## Campus Course \& Records Manager (CCRM)



Testing was performed by compiling and executing the application and manually verifying the output of the implemented menu operations.



\## 1. Compilation Test



\*\*Objective:\*\* Verify that the Java source code compiles successfully.



\*\*Method:\*\*

\- Compile the Java source files using JDK 17.

\- Verify that no compilation errors are reported.



\*\*Result:\*\* Passed



\---



\## 2. View Student Records



\*\*Objective:\*\* Verify that existing student records can be displayed.



\*\*Test Data:\*\*



```text

REG2025 | Maya Sharma | maya@example.com

REG2026 | Raj Kumar | raj@example.com

```



\*\*Expected Result:\*\* Existing student records are displayed.



\*\*Result:\*\* Passed



\---



\## 3. View Course Records



\*\*Objective:\*\* Verify that course records can be displayed.



\*\*Test Data:\*\*



```text

CS201 | Algorithms | 4 credits | Dr. Rao | FALL | CS

CS202 | Operating Systems | 3 credits | Dr. Mehta | FALL | CS

CS203 | Database Management Systems | 4 credits | Dr. Kumar | FALL | CS

```



\*\*Expected Result:\*\* All available courses are displayed.



\*\*Result:\*\* Passed



\---



\## 4. Add Course



\*\*Objective:\*\* Verify that a new course can be added.



\*\*Test Data:\*\*



```text

Course Code: CS203

Title: Database Management Systems

Credits: 4

Instructor: Dr. Kumar

Semester: FALL

Department: CS

```



\*\*Expected Result:\*\* The course is added successfully and appears in the course list.



\*\*Result:\*\* Passed



\---



\## 5. Course Persistence



\*\*Objective:\*\* Verify that an added course remains available after saving.



\*\*Method:\*\*



1\. Add course `CS203`.

2\. Save the course data.

3\. Verify the contents of `courses.csv`.



\*\*Expected Result:\*\* The `CS203` record is stored in `courses.csv`.



\*\*Result:\*\* Passed



\---



\## 6. Search Course



\*\*Objective:\*\* Verify course searching using the course code.



\*\*Test Input:\*\*



```text

CS203

```



\*\*Expected Result:\*\*



```text

Course Found:

CS203 | Database Management Systems | 4 credits | Dr. Kumar | FALL | CS

```



\*\*Result:\*\* Passed



\---



\## 7. Search Student



\*\*Objective:\*\* Verify student searching using the registration number.



\*\*Test Input:\*\*



```text

REG2025

```



\*\*Expected Result:\*\*



```text

Student Found:

REG2025 | Maya Sharma | maya@example.com

```



\*\*Result:\*\* Passed



\---



\## 8. Remove Student



\*\*Objective:\*\* Verify that a student can be removed.



\*\*Method:\*\*



1\. Add or identify a student record.

2\. Remove the record using its registration number.

3\. Verify that the record no longer appears in the student list or CSV file.



\*\*Expected Result:\*\* The selected student is removed successfully.



\*\*Result:\*\* Passed



\---



\## 9. Sort Students



\*\*Objective:\*\* Verify that students can be sorted by name.



\*\*Expected Result:\*\* Student records are displayed in alphabetical order according to the comparator.



\*\*Result:\*\* Passed



\---



\## 10. Sort Courses



\*\*Objective:\*\* Verify that courses can be sorted by course code.



\*\*Expected Result:\*\*



```text

CS201

CS202

CS203

```



\*\*Result:\*\* Passed



\---



\## 11. Array Operations



\*\*Objective:\*\* Verify the reusable array utility methods.



\*\*Test Output:\*\*



```text

Array Operations

\-------------------------------

Joined: Java | Programming | CCRM

Tail: \[Programming, CCRM]

```



\*\*Expected Result:\*\*

\- Array elements are joined using the specified separator.

\- The first element is removed when generating the tail.



\*\*Result:\*\* Passed



\---



\## 12. File/Directory Size Calculation



\*\*Objective:\*\* Verify recursive file and directory size calculation.



\*\*Method:\*\*



A valid project directory path was provided to the file-size utility.



\*\*Expected Result:\*\* The application calculates and displays the total size of files contained within the selected path.



\*\*Result:\*\* Passed



\---



\## Test Summary



| Test Case | Result |

|---|---|

| Compilation | Passed |

| View Students | Passed |

| View Courses | Passed |

| Add Course | Passed |

| Course Persistence | Passed |

| Search Course | Passed |

| Search Student | Passed |

| Remove Student | Passed |

| Sort Students | Passed |

| Sort Courses | Passed |

| Array Operations | Passed |

| File/Directory Size | Passed |



\## Testing Conclusion



The implemented CCRM functionality was tested through compilation and manual execution of the application's menu operations.



The tested operations produced the expected results, including record management, searching, sorting, CSV persistence, array processing, and file-size calculation.

