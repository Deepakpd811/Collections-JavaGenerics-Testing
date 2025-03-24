package com.bridgelab.universitycourse;

abstract class CourseType {
    private String name;
    private String department;

    CourseType(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    abstract void evaluate();

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "name: " + name + " department " + department;
    }

}
