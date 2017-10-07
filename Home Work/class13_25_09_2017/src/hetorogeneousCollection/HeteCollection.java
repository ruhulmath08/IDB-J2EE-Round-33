package hetorogeneousCollection;

public class HeteCollection {
    public static void main(String[] args) {
        //Homogeneous
        int[] x = {2, 4, 6, 8, 10};
        
        //HeteCollection
        Employee[] staff = new Employee[1024];
        staff[0] = new Manager();
        staff[1] = new Employee();
        staff[2] = new Engineer();
    }
    
}
