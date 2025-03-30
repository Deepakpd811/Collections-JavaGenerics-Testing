package com.bridgelab.reflection.basiclevel.dynamically_create_objects;

public class Student {
    private String name;


    public Student(String name) {
        this.name = name;
    }
    public void display() {
        System.out.println("Student Name: " + name);
    }
}