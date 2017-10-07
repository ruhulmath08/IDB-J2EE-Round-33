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
public class SubjectMarks {
    
    private String bangla, english, mathematics, physics;
    private int marks;
    //private boolean passFail;

    public SubjectMarks() {
    }

    public String getBangla() {
        return bangla;
    }

    public String getEnglish() {
        return english;
    }

    public String getMathematics() {
        return mathematics;
    }

    public String getPhysics() {
        return physics;
    }

    public void setBangla(String bangla) {
        this.bangla = bangla;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public void setMathematics(String mathematics) {
        this.mathematics = mathematics;
    }

    public void setPhysics(String physics) {
        this.physics = physics;
    }
    
    
    
    
    public String passFail(int marks){
        this.marks = marks;
        if (marks>80) {
            return "pass";
        }
        else{
        return "fail";
        }
 
    }
    
}
