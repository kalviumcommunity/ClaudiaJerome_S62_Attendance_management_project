package com.school;

public class Student {
    private  int nextStudentIdCounter=1;
    int studentId;
    String name;

    public Student(String name) {
        this.studentId = nextStudentIdCounter++; // using 'this' to refer to the instance variable
        this.name=name;
    }

    // public void setDetails(int id, String studentName) {
    //     this.studentId = id; // using 'this' for clarity
    //     this.name = studentName;
    // }

    public void displayDetails() {
        System.out.println("Student ID: " + this.studentId + ", Name: " + this.name);
    }
}