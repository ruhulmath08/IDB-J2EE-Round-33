package finalStusentForm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Utils {
    public static void writeToFile(String fileName, List<Student> students) throws Exception{
        File destFile = new File(fileName+".txt");
        try {
            if (destFile.exists() == false) {
                System.out.println("Create a new file");
                destFile.createNewFile();
            }
            PrintWriter out = new PrintWriter(new FileWriter(destFile, true));
            for (Student s : students) {
                out.append(s.getName() + ", "+s.getEmail()+", "+s.getAge()+", "+s.getGender()+", "+s.getHobby()+", "+s.getRound()+", "+s.getNote()+"\n");
                out.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void displayStudentsdataFromFile(String fileName, DefaultTableModel model){
        String line;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(fileName+".txt"));
            while ((line = reader.readLine()) != null) {                
                model.addRow(line.split(", ")); //this has a comma and a space bc that  is how the file is written to
            }
            reader.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Buffered Reader issue.");
        }
    }
}
