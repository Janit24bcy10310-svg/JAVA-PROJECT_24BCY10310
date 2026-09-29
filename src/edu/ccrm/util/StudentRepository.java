package edu.ccrm.util;

import edu.ccrm.domain.Student;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Handles loading and saving student records using CSV storage.
 */
public final class StudentRepository {

    private StudentRepository() {
    }

    public static List<Student> load(Path file) throws IOException {

        List<Student> students = new ArrayList<>();

        if (!Files.exists(file)) {
            return students;
        }

        List<String> lines = Files.readAllLines(file);

    for (String line : lines) {

    if (line.isBlank() || line.startsWith("#")) {
        continue;
    }

    if (line.toLowerCase().startsWith("regno")) {
        continue;
    }

    String[] parts = line.split(",", -1);

            if (parts.length < 4) {
                continue;
            }

            students.add(new Student(
                    parts[0].trim(),
                    parts[1].trim(),
                    parts[2].trim(),
                    parts[3].trim()
            ));
        }

        return students;
    }

    public static void save(Path file, List<Student> students)
            throws IOException {

        List<String> lines = new ArrayList<>();

        for (Student student : students) {

            lines.add(
                    student.regNo() + ","
                            + student.given() + ","
                            + student.family() + ","
                            + student.email()
            );
        }

        Files.write(file, lines);
    }
}