package fatherChild;

public class Child extends Father{
    private String cName;
    private double cIncome;
    private double cCost;
    private double cProperty;
    private int cAge;

    public Child(String cName, double cIncome, double cCost, int cAge) {
        this.cName = cName;
        this.cIncome = cIncome;
        this.cCost = cCost;
        this.cAge = cAge;
    }

    public String getcName() {
        return cName;
    }

    public double getcProperty() {
        return (getfProperty()+cIncome-cCost);
    }

    public int getcAge() {
        return cAge;
    }
    
    
}
