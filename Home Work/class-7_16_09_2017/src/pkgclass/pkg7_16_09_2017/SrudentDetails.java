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
public class SrudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentAddress studentAddress = new StudentAddress("121B", "117-A", "Rajshahi", "Bangladesh", new StudentInfo(1234652, "Ruhul", "Rajshahi College"));
        
        System.out.println("*** Student Information***");
        System.out.println("Student Id : "+studentAddress.getStudentInfo().getStudebtId());
        System.out.println("Student Name : "+studentAddress.getStudentInfo().getStudentName());
        System.out.println("Educational Institute: "+studentAddress.getStudentInfo().getEducationalInstitute());
        
        System.out.println('\n'+"*** Student Address***");
        System.out.println("Road Number : "+studentAddress.getRoadNumber());
        System.out.println("House Number : "+studentAddress.getHouseNumber());
        System.out.println("City Name: "+studentAddress.getCity());
        System.out.println("Country Name : "+studentAddress.getCountry());
    }
    
}
