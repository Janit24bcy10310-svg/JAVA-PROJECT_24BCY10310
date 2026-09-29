package edu.ccrm.util;

import java.nio.file.Path;

/**
 * Central configuration for CCRM file storage.
 */
public final class AppConfig {

    private AppConfig() {
    }

    public static Path projectDirectory() {
        return Path.of(System.getProperty("user.dir"));
    }

    public static Path studentsFile() {
        return projectDirectory().resolve("students.csv");
    }

    public static Path coursesFile() {
        return projectDirectory().resolve("courses.csv");
    }
}