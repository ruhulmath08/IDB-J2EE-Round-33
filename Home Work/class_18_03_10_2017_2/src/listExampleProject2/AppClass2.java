package listExampleProject2;

import java.util.ArrayList;
import java.util.List;

public class AppClass2 {

    public static void main(String[] args) {
        Persion persion1 = new Persion(100, "Ruhul", Gender.MALE, new Country(6000, "Bangladesh"), 40000.0);
        Persion persion2 = new Persion(100, "Parvage", Gender.MALE, new Country(6000, "Bangladesh"), 55000.0);
        Persion persion3 = new Persion(110, "Urmi", Gender.FEMALE, new Country(6100, "America"), 50000.0);
        Persion persion4 = new Persion(120, "Smith", Gender.MALE, new Country(6200, "Austrilia"), 60000.0);
        Persion persion5 = new Persion(130, "Nuri", Gender.FEMALE, new Country(6300, "UK"), 70000.0);

        List<Persion> personList = new ArrayList<>();
        personList.add(persion1);
        personList.add(persion2);
        personList.add(persion3);
        personList.add(persion4);
        personList.add(persion5);
        
        for (Persion p : personList) {
            if ((p.country.getCountryName().equals("Bangladesh")) && p.getSalary()==55000) {

                System.out.println("ID : " + p.getId());
                System.out.println("Name : " + p.getName());
                System.out.println("Gender : " + p.getGender());
                System.out.println("Salary : " + p.getSalary());
                System.out.println("ID : " + p.country.getCounteyId());
                System.out.println("ID : " + p.country.getCountryName());
                System.out.println(" ");
            }
        }
    }
}
