package com.school;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- School Attendance System ---");

        // Create students using new constructor
        Student[] students = new Student[4];
        students[0] = new Student("Alice Wonderland");
        students[1] = new Student("Bob The Builder");
        students[2] = new Student("Charlie Brown");
        students[3] = new Student("Diana Prince");

        // Create courses using new constructor
        Course[] courses = new Course[4];
        courses[0] = new Course("Intro to Programming");
        courses[1] = new Course("Linear Algebra");
        courses[2] = new Course("Data Structures");
        courses[3] = new Course("Computer Networks");

        System.out.println("\nRegistered Students:");
        for (Student student : students) {
            if (student != null) student.displayDetails();
        }

        System.out.println("\nAvailable Courses:");
        for (Course course : courses) {
            if (course != null) course.displayDetails();
        }

        System.out.println("\n--- Demonstrating Auto-ID Generation ---");
        System.out.println("Creating additional students and courses...");
        
        Student newStudent = new Student("Eve Johnson");
        Course newCourse = new Course("Machine Learning");
        
        System.out.println("\nNew Student:");
        newStudent.displayDetails();
        System.out.println("New Course:");
        newCourse.displayDetails();

        System.out.println("\nSession 3: Constructor-based Initialization with Auto-ID Complete.");
    }
}