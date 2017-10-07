package person;

public class MainClass {

    public static void main(String[] args) {
        Department d = new Department("Softwere");
        Person p = new Person("Ruhul", 29, 30000.0, new Department("Softwere"));
        System.out.println("Name : " + p.getName()
                + ", Age : " + p.getAge()
                + ", Salary : " + p.getSalary()
                + ", Department Name : " + p.getDepartment().getDname());
    }
}
