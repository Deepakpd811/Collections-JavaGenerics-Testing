package com.bridgelab.inputOutputStreams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Employee implements Serializable {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class EmployeeSerialization {

    public static void serializeEmployees(List<Employee> employees, String filename) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
            oos.writeObject(employees);
            System.out.println("Employees serialized successfully to " + filename);
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Error in serialization" + e.getMessage());
            e.printStackTrace();
        }
    }

    public static List<Employee> deserializeEmployees(String filename) {
        List<Employee> employees = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            employees = (List<Employee>) ois.readObject();
            System.out.println("Employees deserialized successfully from " + filename);
        } catch (IOException e) {
            System.err.println("Error deserializing employees: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return employees;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Deepak", "Sales", 50000.0));
        employeeList.add(new Employee(2, "Ritick", "Engineering", 60000.0));
        employeeList.add(new Employee(3, "rohit", "HR", 55000.0));

        String filename = "employees.ser";

        serializeEmployees(employeeList, filename);

        List<Employee> deserializedEmployees = deserializeEmployees(filename);

        if (deserializedEmployees != null) {
            for (Employee employee : deserializedEmployees) {
                System.out.println(employee);
            }
        }
    }
}