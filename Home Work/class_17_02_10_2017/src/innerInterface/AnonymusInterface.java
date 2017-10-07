package innerInterface;

public class AnonymusInterface {
    public static void main(String[] args){
        Animal animal = new Animal() {
            @Override
            public void bite() {
                System.out.println("Animal cat bit");
            }

            @Override
            public void run() {
                System.out.println("Animal cat run");
            }
        };
        
        animal.bite();
        animal.run();
    }
}
