
package thirdchapter;

import thirdchapter.com.Animal;

/**
 *
 * @author J2EE-33
 */


public class Dog extends Animal{
    private String name;
    private String color;    
    private double height;

    public Dog(String name, String color, double height) {
        this.name = name;
        this.color = color;
        this.height = height;
    }

    public Dog(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    
    /**
     * @see class constructor
     */
    
}
