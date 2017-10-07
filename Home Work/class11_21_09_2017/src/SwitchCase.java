
public class SwitchCase {

    private static int x = 2;

    public static int add(int value) {
        x += value;
        return x;
    }

    public static int subTract(int value) {
        x -= value;
        return x;
    }

    public static void main(String[] args) {
        switch(x){
            case 1:{
                System.out.println("x = "+x);
                System.out.println("After add 19 "+add(19));
                System.out.println("After substract 5 "+subTract(5));
            }
            break;
            case 2:{
                System.out.println("x = "+x);
                System.out.println("After add 19 : "+add(19));
                System.out.println("After substract 6 : "+subTract(6));
            }
            break;
            default:{
                System.out.println("Value not match");
            }
            break;
        }
    }
}
