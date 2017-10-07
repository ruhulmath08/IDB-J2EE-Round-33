package checkedException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class_18_03_10_2017 {

    public static void main(String[] args) {
        try { 
            FileReader fileReader = new FileReader("abc.text");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

}
