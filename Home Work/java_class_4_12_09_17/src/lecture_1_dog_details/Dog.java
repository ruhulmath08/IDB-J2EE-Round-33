/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture_1_dog_details;

/**
 *
 * @author J2EE-33
 */
public class Dog {

    private String name;
    private String color;
    private String race;
    private int age;

    public Dog(String name, String color, String race, int age) {
        this.name = name;
        this.color = color;
        this.race = race;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getRace() {
        return race;
    }

    public int getAge() {
        return age;
    }

}
