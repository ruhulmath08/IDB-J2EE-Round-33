package enumClass;

public class EnumDemo {
    public static void main(String[] args) {
        Person person = new Person("Urmi Apu", 21, Gender.FEMALE);
        System.out.println("Name : "+person.getName());
        System.out.println("Age : "+person.getAge());
        System.out.println("Name : "+person.getGender());
    }
}
