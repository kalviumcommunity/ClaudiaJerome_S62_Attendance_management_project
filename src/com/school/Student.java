package com.school;

public class Student extends Person implements Storable {
    // private  int nextStudentIdCounter=1;
    // int studentId;
    // String name;

    private String gradeLevel;

    public Student(String name,String gradeLevel) {
        // this.studentId = nextStudentIdCounter++; // using 'this' to refer to the instance variable
        // this.name=name;
        super(name);
        this.gradeLevel = gradeLevel;
    }

    // public void setDetails(int id, String studentName) {
    //     this.studentId = id; // using 'this' for clarity
    //     this.name = studentName;
    // }

    // public String getName() {
    //     return name;
    // }

    // public int getStudentId() {
    //     return studentId;
    // }

    public String getGradeLevel() {
        return gradeLevel;
    }

    // public void displayDetails() {
    //     System.out.println("Student ID: " + this.studentId + ", Name: " + this.name);
    // }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println(", Grade Level: " + gradeLevel+"(Role: Student)");
    }

    @Override
    public String toDataString() {
        return getId()+":"+getName()+","+getGradeLevel();
    }
}