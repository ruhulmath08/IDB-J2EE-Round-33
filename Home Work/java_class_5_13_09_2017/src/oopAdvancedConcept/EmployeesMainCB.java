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
public class EmployeesMainCB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employees employees = new Employees(100, "Ruhul", new Department("IT", new Location("Building One")), 40000.0);
        
        System.out.println("Id : "+employees.getId());
        System.out.println("Name : "+employees.getName());
        System.out.println("Department : "+employees.getDepartment().getDeptName());
        System.out.println("Salary : "+employees.getSalary());
        System.out.println("Location : "+employees.getDepartment().getLocation().getLocationName());
        
    }
    
}
