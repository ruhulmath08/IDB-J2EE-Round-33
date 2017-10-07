/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass.pkg7_16_09_2017;

/**
 *
 * @author J2EE-33
 */
public class StudentInfo {
    private int studebtId;
    private String studentName;
    private String educationalInstitute;

    public StudentInfo(int studebtId, String studentName, String educationalInstitute) {
        this.studebtId = studebtId;
        this.studentName = studentName;
        this.educationalInstitute = educationalInstitute;
    }

    public int getStudebtId() {
        return studebtId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getEducationalInstitute() {
        return educationalInstitute;
    }

   
}
