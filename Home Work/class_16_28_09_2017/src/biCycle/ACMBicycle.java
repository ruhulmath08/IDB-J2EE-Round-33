package biCycle;

public class ACMBicycle implements Bicycle{
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    @Override
    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    @Override
    public void changeGear(int newValue) {
        gear = newValue;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
    }
    
    void printStates(){
        System.out.println("Cadence : "+cadence+" Speed : "+speed+" Gear : "+gear);
    }
    
}