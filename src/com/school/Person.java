package com.school;

public class Person {
    private static int nextIdCounter = 1;
    protected  int id; 
    protected  String name;

    public Person(String name) {
        this.name = name;
        this.id = nextIdCounter++; // Auto-increment ID for each new person
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
    
}
