package edu.ccrm.domain;

/**
 * Represents a student in the Campus Course & Records Manager.
 */
public class Student {

    private final String regNo;
    private final String given;
    private final String family;
    private final String email;

    public Student(String regNo, String given, String family, String email) {
        this.regNo = regNo;
        this.given = given;
        this.family = family;
        this.email = email;
    }

    public String regNo() {
        return regNo;
    }

    public String given() {
        return given;
    }

    public String family() {
        return family;
    }

    public String email() {
        return email;
    }

    /**
     * Returns the student's full name.
     */
    public String fullName() {
        return given + " " + family;
    }

    /**
     * Small name object used by the existing comparator.
     */
    public Name name() {
        return new Name(given, family);
    }

    public static final class Name {

        private final String given;
        private final String family;

        public Name(String given, String family) {
            this.given = given;
            this.family = family;
        }

        public String full() {
            return given + " " + family;
        }
    }

    @Override
    public String toString() {
        return regNo + " | " + fullName() + " | " + email;
    }
}