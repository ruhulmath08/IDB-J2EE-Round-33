/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopAdvancedConcept;

/**
 *
 * @author J2EE-33
 */
public class Employees {
    private int id;
    private String name;
    private Department department;
    private double salary;

    public Employees(int id, String name, Department department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

       
    
}
