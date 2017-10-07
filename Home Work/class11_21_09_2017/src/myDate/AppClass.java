package myDate;

public class AppClass {
    public static void main(String[] args) {
        MyDate myDate = new MyDate(23, 9, 2017);
        //myDate.addDay(5);
        System.out.println(myDate.toString());
        System.out.println(myDate.addDay(5));
    }
}
