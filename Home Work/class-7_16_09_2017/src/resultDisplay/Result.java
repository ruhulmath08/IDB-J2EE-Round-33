/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resultDisplay;

/**
 *
 * @author J2EE-33
 */
public class Result {
    public static void main(String[] args) {
        SubjectMarks subjectMarks =new SubjectMarks();
        subjectMarks.setBangla("Bangla");
        subjectMarks.getBangla();
        String c = subjectMarks.passFail(70);
        
        System.out.println("Subject : "+subjectMarks.getBangla()+ '\n'+"Pass or fail : "+c);
    }
}
