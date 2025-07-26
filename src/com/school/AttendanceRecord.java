package com.school;

public class AttendanceRecord implements Storable {
    private 
    int studentID;
    int courseId;
    String Status;

    public AttendanceRecord(int studentID, int courseId, String status) {
        this.studentID = studentID;
        this.courseId = courseId;
        
        if("Present".equalsIgnoreCase(status) || "Absent".equalsIgnoreCase(status)) {
            this.Status = status;
        } else {
            this.Status="Invalid";
            System.out.println("Invalid status provided.");   
        }
    }

    public AttendanceRecord() {
    }

    public int getStudentId(){
        return studentID;
    }
    public int getCourseId(){
        return courseId;
    }
    public String getStatus() {
        return Status;
    }

    public void displayDetails() {
        System.out.println("Attendace: studentId "+ studentID + "in course ID " + courseId + " is " + Status);
    }

    public String toDataString() {
        return studentID + "," + courseId + "," + Status;
    }

}
