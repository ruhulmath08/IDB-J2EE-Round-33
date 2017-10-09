package Question5;

public class Alpha1 {
    static Animal get(String choice){
        if (choice.equalsIgnoreCase("meat eater")) {
            return new Lion();
        }
        else{
            return new Elephant();
        }
    }
    /*
    public static void main(String[] args){
        new Alpha1().get("veggie").soundOff();
    }
    */
}
