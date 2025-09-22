package com.school;

public class Teacher {
    private String subject;
    private int yearsOfExperience;

    public Teacher(String name, String subject, int yearsOfExperience) {
        super();
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getSubject() {
        return subject;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void displayDetails() {
        System.out.println("Role: Teacher, Subject: " + this.subject + ", Years of Experience: " + this.yearsOfExperience);
    }           
}
