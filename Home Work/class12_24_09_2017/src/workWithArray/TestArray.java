package workWithArray;

public class TestArray {
    
    public char[] createArray(){
        char[] s;
        s = new char[26];
        for (int i = 0; i < 26; i++) {
            s[i] = (char)('A' +i);
        }
        return s;
    }
    public static void main(String[] args) {
        int[] y;
        y = new int[6];
        y = new int[7];
         TestArray testArray = new TestArray();
         System.out.println(testArray.createArray());
    }
}
