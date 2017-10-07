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
public class StudentAddress {
    
    private String roadNumber;
    private String houseNumber;
    private String city;
    private String country;
    StudentInfo studentInfo;

    public StudentAddress(String roadNumber, String houseNumber, String city, String country, StudentInfo studentInfo) {
        this.roadNumber = roadNumber;
        this.houseNumber = houseNumber;
        this.city = city;
        this.country = country;
        this.studentInfo = studentInfo;
    }

    public String getRoadNumber() {
        return roadNumber;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public StudentInfo getStudentInfo() {
        return studentInfo;
    }
    
    

    
}
