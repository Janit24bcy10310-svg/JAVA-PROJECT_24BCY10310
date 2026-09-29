package edu.ccrm.domain;

/**
 * Represents a course offered by the campus.
 */
public class Course {

    private final String code;
    private final String title;
    private final int credits;
    private final String instructor;
    private final String semester;
    private final String department;

    public Course(
            String code,
            String title,
            int credits,
            String instructor,
            String semester,
            String department) {

        this.code = code;
        this.title = title;
        this.credits = credits;
        this.instructor = instructor;
        this.semester = semester;
        this.department = department;
    }

    public String codeValue() {
        return code;
    }

    /**
     * Small wrapper used by the existing comparator.
     */
    public Code code() {
        return new Code(code);
    }

    public String title() {
        return title;
    }

    public int credits() {
        return credits;
    }

    public String instructor() {
        return instructor;
    }

    public String semester() {
        return semester;
    }

    public String department() {
        return department;
    }

    /**
     * Represents a course code for comparison.
     */
    public static final class Code {

        private final String value;

        public Code(String value) {
            this.value = value;
        }

        public String code() {
            return value;
        }
    }

    @Override
    public String toString() {
        return code + " | "
                + title + " | "
                + credits + " credits | "
                + instructor + " | "
                + semester + " | "
                + department;
    }
}