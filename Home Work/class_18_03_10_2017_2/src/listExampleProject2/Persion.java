/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listExampleProject2;

/**
 *
 * @author J2EE-33
 */
public class Persion {
    private long id;
    private String name;
    private Gender gender;
    public Country country;
    private double salary;

    public Persion(long id, String name, Gender gender, Country country, double salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.country = country;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Country getCountry() {
        return country;
    }

    public double getSalary() {
        return salary;
    }
    
    
}
