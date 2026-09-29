package edu.ccrm.util;

import edu.ccrm.domain.Course;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Handles loading and saving course records using CSV storage.
 */
public final class CourseRepository {

    private CourseRepository() {
    }

    public static List<Course> load(Path file) throws IOException {

        List<Course> courses = new ArrayList<>();

        if (!Files.exists(file)) {
            return courses;
        }

        List<String> lines = Files.readAllLines(file);

        for (String line : lines) {

            if (line.isBlank() || line.startsWith("#")) {
                continue;
            }
if (line.toLowerCase().startsWith("code,")) {
    continue;
}

            String[] parts = line.split(",", -1);

            if (parts.length < 6) {
                continue;
            }

            int credits;

            try {
                credits = Integer.parseInt(parts[2].trim());
            } catch (NumberFormatException exception) {
                continue;
            }

            courses.add(new Course(
                    parts[0].trim(),
                    parts[1].trim(),
                    credits,
                    parts[3].trim(),
                    parts[4].trim(),
                    parts[5].trim()
            ));
        }

        return courses;
    }

    public static void save(Path file, List<Course> courses)
            throws IOException {

        List<String> lines = new ArrayList<>();

        for (Course course : courses) {

            lines.add(
                    course.codeValue() + ","
                            + course.title() + ","
                            + course.credits() + ","
                            + course.instructor() + ","
                            + course.semester() + ","
                            + course.department()
            );
        }

        Files.write(file, lines);
    }
}