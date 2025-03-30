package com.bridgelab.reflection.advanced_level.create_custom_object_mapper;

public class Person {
    private String name;
    private int age;

    // constructor
    Person(){};

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void display(){
        System.out.println("name: " + name + " Age: " + age);
    }


}
