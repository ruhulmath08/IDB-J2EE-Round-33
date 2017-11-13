package com.example.query;


import com.example.employees.Employees;
import java.util.List;
import sun.awt.EmbeddedFrame;

public class App {
    public static void main(String[] args) {
       List<Employees> employeeList = DataRetrieveService.getEmployees();
       for(Employees e : employeeList){
           System.out.println("Employee ID: "+e.getEmployeeID()+"\nLase Name: "+e.getLastName()); 
           System.out.println("");
       }
    }
  
}
