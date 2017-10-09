package Question25;

public class TestSuper {
    
    TestSuper(int i){
        
    }
}
class TestSub extends TestSuper{};  //no default constructor in TestSuper class
class TestAll{
    public static void main (String [] args) {
        new TestSub();
    }
}
