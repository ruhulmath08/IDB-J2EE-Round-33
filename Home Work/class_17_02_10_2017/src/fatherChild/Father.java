package fatherChild;

public class Father {
    private String fName;
    public double fProperty;
    private double fgcproperty;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public double getfProperty() {
        return fProperty;
    }

    public void setfProperty(double fProperty) {
        this.fProperty = fProperty;
    }

    public double getFgcproperty() {
        return (fProperty-fgcproperty);
    }

    public void setFgcproperty(double fgcproperty) {
        this.fgcproperty = fgcproperty;
    }

    
}
