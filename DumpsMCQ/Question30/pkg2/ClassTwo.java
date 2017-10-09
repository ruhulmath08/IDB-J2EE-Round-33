package Question30.pkg2;



public class ClassTwo extends Question30.pkg1.ClassOne{
    public static void main(String[] args) {
        char a = new Question30.pkg1.ClassOne().getVar();
        char b = new Question30.pkg1.ClassOne().getVar();
        System.out.println("a = "+a+"\n b = "+b);
    }
}
