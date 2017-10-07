package thirdchapter;

import thirdchapter.com.Animal;

/**
 *
 * @author J2EE-33
 */
public class ThirdChapter extends Animal{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog tommy = new Dog("Tommy", "Red", 3.2);
        System.out.println("Name : "+tommy.getName()+ ", Color : "+tommy.getColor()+ ", Height : " +tommy.getHeight());
        
        Dog pitbul = new Dog();
        pitbul.setName("Pitbull");
        pitbul.setColor("Black");
        pitbul.setHeight(2.7);
        System.out.println("Name : "+pitbul.getName()+ ", Color : "+pitbul.getColor()+ ", Height : " +pitbul.getHeight());
    }
    
}
