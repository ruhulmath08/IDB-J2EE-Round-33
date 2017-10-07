package animalnheritance;

public class App {

    public static void main(String[] args) {
        Mini mini = new Mini();
        Tommy tommy = new Tommy();

        Cat cat = new Cat();
        Cat cat1 = new Mini();

        Dog dog = new Dog();
        Dog dog1 = new Tommy();

        Animal animal = new Animal();
        Animal animal1 = new Dog();
        Animal animal2 = new Tommy();
        Animal animal3 = new Cat();
        Animal animal4 = new Mini();

        /*
            Precedence-> Animal, Dog, Tommy
         */
        Animal a0 = animal;
        Animal a1 = dog;
        Animal a2 = tommy;
        
        Dog d1 = tommy;
        Dog d2 = (Dog)animal;   //casting
    }
}
