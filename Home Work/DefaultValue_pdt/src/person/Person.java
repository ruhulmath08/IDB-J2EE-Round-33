/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author J2EE-33
 */
public class Person {
    String name;
    int age;
    double salary;
    private Department department;

    public Person(String name, int age, double salary, Department department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department=department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }

    

    
    
    
}
