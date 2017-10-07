/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propertyDetails;

public class Child extends Father {

    private String cName;
    private double cProperty;
    private double cCost;
    private double cIncom;
    private int age;

    public Child(String cName, double cCost, double cIncom, int age) {
        this.cName = cName;
        this.cCost = cCost;
        this.cIncom = cIncom;
        this.age = age;
    }

    public String getcName() {
        return cName;
    }

    public double getcProperty() {
        return fProperty + cIncom - cCost;
    }

    public int getAge() {
        return age;
    }
    
    public double fremainBalance(double fgcAmount){
        
        return (fProperty-fgcAmount);
    }
}
