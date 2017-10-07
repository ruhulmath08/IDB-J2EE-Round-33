/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GetterSeeterEmployees;

/**
 *
 * @author J2EE-33
 */
public class EmployeeMainGS {
    public static void main(String[] args) {
        Employees employees = new Employees();
        
        employees.setId(200);
        employees.setName("Urmi");
        employees.setDepartment("Software");
        employees.setSalary(50000.0);
        
        System.out.println("Id : "+employees.getId());
        System.out.println("Name : "+employees.getName());
        System.out.println("Department : "+employees.getDepartment());
        System.out.println("Salary : "+employees.getSalary());
    }
    
}
