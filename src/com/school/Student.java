package com.school;

public class Student extends Person {
    private String gradeLevel;

    public Student(String name, String gradeLevel) {
        super(name); 
        this.gradeLevel = gradeLevel;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public int getStudentId() {
        return getId();  // This returns the id from the Person class
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Student, Grade Level: " + this.gradeLevel);
    }
}