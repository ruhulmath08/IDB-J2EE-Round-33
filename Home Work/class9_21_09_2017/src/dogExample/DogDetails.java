/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogExample;

/**
 *
 * @author J2EE-33
 */
public class DogDetails {
    private String name;
    private String color;
    private double hight;

    /*
    public DogDetails(String name, String color, double hight) {
        this.name = name;
        this.color = color;
        this.hight = hight;
    }
    */
    public DogDetails() {
    }
    
    

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }
    
    

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getHight() {
        return hight;
    }
    
    
}
