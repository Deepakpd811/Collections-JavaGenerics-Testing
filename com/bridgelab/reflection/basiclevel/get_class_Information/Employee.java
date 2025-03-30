package com.bridgelab.reflection.basiclevel.get_class_Information;

public class Employee {
    private String name;
    public int age;
    public int salary;

    Employee(String name,int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    public int getSalary(){
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}
