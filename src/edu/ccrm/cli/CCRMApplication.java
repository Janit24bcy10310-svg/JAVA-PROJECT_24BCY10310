package edu.ccrm.cli;

import edu.ccrm.domain.Course;
import edu.ccrm.domain.Student;
import edu.ccrm.util.AppConfig;
import edu.ccrm.util.ArrayOperations;
import edu.ccrm.util.Comparators;
import edu.ccrm.util.CourseRepository;
import edu.ccrm.util.FileUtils;
import edu.ccrm.util.StudentRepository;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Main command-line application for the
 * Campus Course & Records Manager (CCRM).
 */
public class CCRMApplication {

    private static final Scanner scanner = new Scanner(System.in);

    private static final List<Student> students = new ArrayList<>();
    private static final List<Course> courses = new ArrayList<>();

    public static void main(String[] args) {

        loadData();

        System.out.println("==========================================");
        System.out.println("   Campus Course & Records Manager");
        System.out.println("==========================================");

        boolean running = true;

        while (running) {
            showMenu();

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1" -> displayStudents();
                case "2" -> displayCourses();
                case "3" -> sortStudents();
                case "4" -> sortCourses();
                case "5" -> addStudent();
                case "6" -> searchStudent();
                case "7" -> removeStudent();
                case "8" -> addCourse();
                case "9" -> searchCourse();
                case "10" -> demonstrateArrayOperations();
                case "11" -> demonstrateFileUtility();
                case "12" -> running = false;
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("Thank you for using CCRM.");
        scanner.close();
    }

    private static void showMenu() {

        System.out.println();
        System.out.println("--------------- MENU ----------------");
        System.out.println("1. View Students");
        System.out.println("2. View Courses");
        System.out.println("3. Sort Students by Name");
        System.out.println("4. Sort Courses by Code");
        System.out.println("5. Add Student");
        System.out.println("6. Search Student");
        System.out.println("7. Remove Student");
        System.out.println("8. Add Course");
        System.out.println("9. Search Course");
        System.out.println("10. Test Array Operations");
        System.out.println("11. Calculate File/Directory Size");
        System.out.println("12. Exit");
        System.out.println("-------------------------------------");
        System.out.print("Enter your choice: ");
    }

    private static void loadData() {

        try {
            students.clear();
            courses.clear();

            students.addAll(
                    StudentRepository.load(AppConfig.studentsFile())
            );

            courses.addAll(
                    CourseRepository.load(AppConfig.coursesFile())
            );

            if (students.isEmpty()) {
                loadDefaultStudents();
                saveStudents();
            }

            if (courses.isEmpty()) {
                loadDefaultCourses();
                saveCourses();
            }

        } catch (Exception exception) {

            System.out.println(
                    "Warning: Could not load CSV data."
            );

            System.out.println(
                    "Using default data instead."
            );

            students.clear();
            courses.clear();

            loadDefaultStudents();
            loadDefaultCourses();
        }
    }

    private static void loadDefaultStudents() {

        students.add(new Student(
                "24BCY10001",
                "Maya",
                "Sharma",
                "maya@example.com"
        ));

        students.add(new Student(
                "24BCY10002",
                "Raj",
                "Kumar",
                "raj@example.com"
        ));

        students.add(new Student(
                "24BCY10003",
                "Ananya",
                "Singh",
                "ananya@example.com"
        ));
    }

    private static void loadDefaultCourses() {

        courses.add(new Course(
                "CS201",
                "Algorithms",
                4,
                "Dr. Sharma",
                "Fall",
                "Computer Science"
        ));

        courses.add(new Course(
                "CS202",
                "Operating Systems",
                4,
                "Dr. Kumar",
                "Fall",
                "Computer Science"
        ));

        courses.add(new Course(
                "CS203",
                "Database Management Systems",
                4,
                "Dr. Singh",
                "Spring",
                "Computer Science"
        ));
    }

    private static void saveStudents() {

        try {

            StudentRepository.save(
                    AppConfig.studentsFile(),
                    students
            );

        } catch (Exception exception) {

            System.out.println(
                    "Could not save students: "
                            + exception.getMessage()
            );
        }
    }

    private static void saveCourses() {

        try {

            CourseRepository.save(
                    AppConfig.coursesFile(),
                    courses
            );

        } catch (Exception exception) {

            System.out.println(
                    "Could not save courses: "
                            + exception.getMessage()
            );
        }
    }

    private static void displayStudents() {

        System.out.println();
        System.out.println("Student Records");
        System.out.println("-------------------------------");

        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void displayCourses() {

        System.out.println();
        System.out.println("Course Records");
        System.out.println("-------------------------------");

        if (courses.isEmpty()) {
            System.out.println("No course records found.");
            return;
        }

        for (Course course : courses) {
            System.out.println(course);
        }
    }

    private static void sortStudents() {

        students.sort(Comparators.byName());

        System.out.println();
        System.out.println("Students sorted alphabetically by name:");

        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void sortCourses() {

        courses.sort(Comparators.byCode());

        System.out.println();
        System.out.println("Courses sorted by course code:");

        for (Course course : courses) {
            System.out.println(course);
        }
    }

    private static void addStudent() {

        System.out.println();
        System.out.println("Add New Student");
        System.out.println("-------------------------------");

        System.out.print("Enter registration number: ");
        String regNo = scanner.nextLine().trim();

        if (regNo.isEmpty()) {
            System.out.println("Registration number cannot be empty.");
            return;
        }

        for (Student student : students) {

            if (student.regNo().equalsIgnoreCase(regNo)) {

                System.out.println(
                        "A student with this registration number already exists."
                );

                return;
            }
        }

        System.out.print("Enter given name: ");
        String given = scanner.nextLine().trim();

        System.out.print("Enter family name: ");
        String family = scanner.nextLine().trim();

        System.out.print("Enter email: ");
        String email = scanner.nextLine().trim();

        if (given.isEmpty()
                || family.isEmpty()
                || email.isEmpty()) {

            System.out.println(
                    "All student fields are required."
            );

            return;
        }

        if (!email.contains("@")) {

            System.out.println(
                    "Invalid email address."
            );

            return;
        }

        students.add(
                new Student(
                        regNo,
                        given,
                        family,
                        email
                )
        );

        saveStudents();

        System.out.println(
                "Student added successfully."
        );
    }

    private static void searchStudent() {

        System.out.println();
        System.out.println("Search Student");
        System.out.println("-------------------------------");

        System.out.print(
                "Enter registration number: "
        );

        String regNo = scanner.nextLine().trim();

        for (Student student : students) {

            if (student.regNo().equalsIgnoreCase(regNo)) {

                System.out.println();
                System.out.println("Student Found:");
                System.out.println(student);

                return;
            }
        }

        System.out.println(
                "No student found with registration number: "
                        + regNo
        );
    }

    private static void removeStudent() {

        System.out.println();
        System.out.println("Remove Student");
        System.out.println("-------------------------------");

        System.out.print(
                "Enter registration number: "
        );

        String regNo = scanner.nextLine().trim();

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i)
                    .regNo()
                    .equalsIgnoreCase(regNo)) {

                students.remove(i);

                saveStudents();

                System.out.println(
                        "Student removed successfully."
                );

                return;
            }
        }

        System.out.println(
                "No student found with registration number: "
                        + regNo
        );
    }

    private static void addCourse() {

        System.out.println();
        System.out.println("Add New Course");
        System.out.println("-------------------------------");

        System.out.print("Enter course code: ");
        String code = scanner.nextLine().trim();

        if (code.isEmpty()) {
            System.out.println("Course code cannot be empty.");
            return;
        }

        for (Course course : courses) {

            if (course.codeValue().equalsIgnoreCase(code)) {

                System.out.println(
                        "A course with this code already exists."
                );

                return;
            }
        }

        System.out.print("Enter course title: ");
        String title = scanner.nextLine().trim();

        System.out.print("Enter credits: ");
        String creditInput = scanner.nextLine().trim();

        int credits;

        try {
            credits = Integer.parseInt(creditInput);

            if (credits <= 0) {
                System.out.println(
                        "Credits must be greater than zero."
                );
                return;
            }

        } catch (NumberFormatException exception) {

            System.out.println(
                    "Credits must be a valid number."
            );

            return;
        }

        System.out.print("Enter instructor: ");
        String instructor = scanner.nextLine().trim();

        System.out.print("Enter semester: ");
        String semester = scanner.nextLine().trim();

        System.out.print("Enter department: ");
        String department = scanner.nextLine().trim();

        if (title.isEmpty()
                || instructor.isEmpty()
                || semester.isEmpty()
                || department.isEmpty()) {

            System.out.println(
                    "All course fields are required."
            );

            return;
        }

        courses.add(
                new Course(
                        code,
                        title,
                        credits,
                        instructor,
                        semester,
                        department
                )
        );

        saveCourses();

        System.out.println(
                "Course added successfully."
        );
    }

    private static void searchCourse() {

        System.out.println();
        System.out.println("Search Course");
        System.out.println("-------------------------------");

        System.out.print("Enter course code: ");

        String code = scanner.nextLine().trim();

        for (Course course : courses) {

            if (course.codeValue()
                    .equalsIgnoreCase(code)) {

                System.out.println();
                System.out.println("Course Found:");
                System.out.println(course);

                return;
            }
        }

        System.out.println(
                "No course found with code: "
                        + code
        );
    }

    private static void demonstrateArrayOperations() {

        String[] values = {
                "Java",
                "Programming",
                "CCRM"
        };

        String joined =
                ArrayOperations.join(values, " | ");

        String[] tail =
                ArrayOperations.tail(values);

        System.out.println();
        System.out.println("Array Operations");
        System.out.println("-------------------------------");
        System.out.println(
                "Joined: " + joined
        );

        System.out.println(
                "Tail: " + Arrays.toString(tail)
        );
    }

    private static void demonstrateFileUtility() {

        System.out.println();
        System.out.println("File Utility");
        System.out.println("-------------------------------");

        System.out.print(
                "Enter a file or directory path: "
        );

        String input = scanner.nextLine().trim();

        if (input.isEmpty()) {

            System.out.println(
                    "No path entered."
            );

            return;
        }

        try {

            long size =
                    FileUtils.sizeRecursive(
                            Path.of(input)
                    );

            System.out.println(
                    "Total size: "
                            + size
                            + " bytes"
            );

        } catch (Exception exception) {

            System.out.println(
                    "Could not calculate size: "
                            + exception.getMessage()
            );
        }
    }
}