package listExampleProject;

import java.util.ArrayList;
import java.util.List;

public class AppClass {

    public static void main(String[] args) {
        Persion persion1 = new Persion(1, "Urmi", Gender.FEMAIL);
        Persion persion2 = new Persion(2, "Sohan", Gender.MALE);
        Persion persion3 = new Persion(3, "Atiq", Gender.MALE);
        Persion persion4 = new Persion(4, "Ruhul", Gender.MALE);

        List<Persion> personList = new ArrayList<>();
        personList.add(persion1);
        personList.add(persion2);
        personList.add(persion3);
        personList.add(persion4);
        System.out.println("Size : "+personList.size());
        for (Persion p : personList) {
            if (p.getGender() == (Gender.FEMAIL)) {
                System.out.println("ID : " + p.getId());
                System.out.println("Name : " + p.getName());
                System.out.println("Gender : " + p.getGender());
                System.out.println(" ");
            }
        }
    }
}
