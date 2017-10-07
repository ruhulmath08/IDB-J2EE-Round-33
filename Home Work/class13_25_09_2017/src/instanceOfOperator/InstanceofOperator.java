package instanceOfOperator;

public class InstanceofOperator {

    public static void main(String[] args) {
        InstanceofOperator io = new InstanceofOperator();

        Engineer en = new Engineer();
        System.out.print("Instance of : ");
        io.doSomthing(en);
        
        Manager m = new Manager();
        System.out.print("Instance of : ");
        io.doSomthing(m);
        
        Employee em = new Manager();
        System.out.print("Instance of : ");
        io.doSomthing(m);
    }

    public void doSomthing(Employee e) {
        if (e instanceof Manager) {
            System.out.println("e instanceof Manager");
        } else if (e instanceof Engineer) {
            System.out.println("e instanceof Engineer");
        } else {
            System.out.println("e instanceof Employee");
        }
    }
}
