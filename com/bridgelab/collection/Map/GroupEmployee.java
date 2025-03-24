package com.bridgelab.collection.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Group Employees by Department
class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

public class GroupEmployee {

    // Method to group employees by department
    public static Map<String, List<Employee>> groupEmployee(List<Employee> employees) {
        Map<String, List<Employee>> groupEmployee = new HashMap<>();

        for(Employee emp: employees){
            if(!groupEmployee.containsKey(emp.getDepartment())){
                groupEmployee.put(emp.getDepartment(), new ArrayList<>());
            }
            // if department exist get the key and add to the key which is a Arraylist
            groupEmployee.get(emp.getDepartment()).add(emp);
        }
        return groupEmployee;
    }

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", "HR"));
        employees.add(new Employee("Raj", "HR"));
        employees.add(new Employee("Smith", "Finance"));
        employees.add(new Employee("Alex", "IT"));

        Map<String, List<Employee>> groupEmployee = new HashMap<>();

        groupEmployee = groupEmployee(employees);

        // Print the group of employees
        for (Map.Entry<String, List<Employee>> entry : groupEmployee.entrySet()) {
            String key = entry.getKey();
            List<Employee> listemp = entry.getValue();
        
            System.out.print("[ " + key + "= {");
        
            for (int i = 0; i < listemp.size(); i++) {
                System.out.print(listemp.get(i).getName());
                if (i < listemp.size() - 1) {
                    System.out.print(", ");  // Add comma only if it's NOT the last element
                }
            }
        
            System.out.println("} ]");
        }
        

    }
}
