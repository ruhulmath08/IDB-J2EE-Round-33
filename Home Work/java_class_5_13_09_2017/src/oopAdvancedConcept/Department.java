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
public class Department {
    private String deptName;
    private Location location;

    public Department(String deptName, Location location) {
        this.deptName = deptName;
        this.location = location;
    }

    public String getDeptName() {
        return deptName;
    }

    public Location getLocation() {
        return location;
    }

    
}
