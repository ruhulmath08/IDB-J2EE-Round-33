package fatherChild;

public class AppClas {

    public static void main(String[] args) {
        Father father = new  Father();
        father.setfName("Abdur Rahman");
        father.setfProperty(50000000.0);
        father.setFgcproperty(50000000.0);
        System.out.println("Father Detals : ");
        System.out.println("Father name : "+father.getfName());
        System.out.println("Father total property : "+father.getfProperty());
        System.out.println("Father remaining property : "+father.getFgcproperty());
        
        System.out.println("Child details");
        Child child = new Child("Tito", 10000000.0, 20000000.0, 25);
        System.out.println("Child name : "+child.getcName());
        System.out.println("Child Property : "+child.getcProperty());
        System.out.println("Child age : "+child.getcAge());
    }
    
}
