package com.school;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- School Attendance System ---");

        // Student[] students = new Student[2];
        // students[0] = new Student();
        // students[0].setDetails(1, "Alice Wonderland");
        // students[1] = new Student();
        // students[1].setDetails(2, "Bob The Builder");

        // Student student1 = new Student("Alice Wonderland");
        // Student student2 = new Student("Bob The Builder");
        // Student student3 = new Student("New Student");

        // Course[] courses = new Course[2];
        // courses[0] = new Course();
        // courses[0].setDetails("CS101", "Intro to Programming");
        // courses[1] = new Course();
        // courses[1].setDetails("MA202", "Linear Algebra");

        // Course course1 = new Course("Intro to Programming");
        // Course course2 = new Course("Linear Algebra");
        // Course course3 = new Course("New Course");

        // System.out.println("\nRegistered Students:");
        // student1.displayDetails();
        // // student2.displayDetails();
        // student3.displayDetails();

        // System.out.println("\nAvailable Courses:");
        // course1.displayDetails();
        // course2.displayDetails();
        // course3.displayDetails();
        
        
        // // System.out.println("\nSession 3: Constructor intialization and Auto-ID generation completed.");
        // List<AttendanceRecord> attendanceLog = new ArrayList<>();

        // // creating a valid student record and adding into log
        // AttendanceRecord record1 = new AttendanceRecord(student1.getStudentId(), course1.getCourseId(), "Present");
        // attendanceLog.add(record1);

        // // creating an invalid student record and adding into log
        // AttendanceRecord record2 = new AttendanceRecord(student2.getStudentId(), course1.getCourseId(), "Late");
        // attendanceLog.add(record2);

        // AttendanceRecord record3 = new AttendanceRecord(student2.getStudentId(), course2.getCourseId(), "Absent");
        // attendanceLog.add(record3);

        // for(AttendanceRecord record : attendanceLog) {
        //     record.displayDetails();
        // }

        // System.out.println("\nSession 4: Data encapsulationa dn Attendance recording completed.");

        Person[] person={
            new Student("Alice Wonderland", "10"),
            new Student("Bob The Builder", "9"),
            new Teacher(null, null),
            new Staff(null, null)
    
        };

        List<Student> Student = new ArrayList<>();
        Student student1 = (Student) person[0];
        Student student2 = (Student) person[1];
        Student.add(student1);
        Student.add(student2);
    
        for(Person p:person){
            p.displayDetails();
        }

        List<Course> Courses = new ArrayList<>();
        Course course1=new Course("Intro to Quantum Physics");
        Course course2=new Course("Advanced ALgorithms");
        Courses.add(course1);
        Courses.add(course2);
        // System.err.println("\nAvailable course");
        // course1.displayDetails();

        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        AttendanceRecord record1=new AttendanceRecord(person[0].getId(),course1.getCourseId(),"Present");
        AttendanceRecord record2=new AttendanceRecord(person[1].getId(),course2.getCourseId(),"Absent");
        AttendanceRecord record3=new AttendanceRecord(person[1].getId(),course2.getCourseId(),"Present");
        attendanceLog.add(record1);
        attendanceLog.add(record2);
        attendanceLog.add(record3);

        // String[] status={"Present","Daydreaming"};

        // for(int i=0;i<2;i++){
        //     Student student=(Student) person[i];
        //     AttendanceRecord record=new AttendanceRecord(student.getId(),course1.getCourseId(),status[i]);
        //     attendanceLog.add(record);
        // }

        // System.err.println("Attendance log----");

        // for(AttendanceRecord record:attendanceLog){
        //     record.displayDetails();
        // }

        // System.err.println("Session 5: Inheritance Hierarchy Established Complete. ");

        FileStorageService storageService = new FileStorageService();

        storageService.saveData(Student, "students.txt");
        storageService.saveData(Courses, "courses.txt");
        storageService.saveData(attendanceLog, "Attendance-log.txt");

        System.out.println("Interface-Driven Persistance (Saving) completed.");
        
    };
}
