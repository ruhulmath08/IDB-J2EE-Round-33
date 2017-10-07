package class6_expression;

public class Expression {
    int x = 5+5;    //compound expression
    int y = 10; //simple expression
    
    
    
    public static void main(String[] args) {
        int x = 7;
        int y = 3;
        int z = 2;
        System.out.println("Greater Than : "+ (x>y));
        System.out.println("Less Than : "+ (x<y));
        System.out.println("Greater than or equal to : "+ (x >= y));
        System.out.println("Less than or equal to : "+ (x <= y));
        System.out.println("Not equal to : "+ (x != y));
        System.out.println("Equal to : "+ (x == y));
        
        boolean lor = (x>y || z>y);
        System.out.println("Relational and logical operator : "+lor);
        boolean land = (x>y && z>y);
        System.out.println("Relational and logical operator : "+land);
        
        
        
        
    }
    
}
