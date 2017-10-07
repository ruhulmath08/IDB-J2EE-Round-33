package biCycle;

public class AppClass{
    public static void main(String[] args) {
        ACMBicycle acmb = new ACMBicycle();
        acmb.changeCadence(50);
        acmb.changeGear(3);
        acmb.speedUp(50);
        acmb.applyBrakes(2);
        acmb.printStates();
        
        acmb.changeCadence(150);
        acmb.changeGear(6);
        acmb.speedUp(120);
        acmb.applyBrakes(3);
        acmb.printStates();
    }
}
