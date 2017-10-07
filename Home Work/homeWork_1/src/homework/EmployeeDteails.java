/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author J2EE-33
 */
public class EmployeeDteails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmployeeAddress employeeAddress = new EmployeeAddress("117/A", "I3", "Dhanmundi 32", "Dhanmundi", "Dhaka", new AddressType("Parmenent"));
        
        System.out.println("House Number : "+employeeAddress.getHouseNumber());
        System.out.println("Block Number : "+employeeAddress.getBlockNumber());
        System.out.println("Road Number : "+employeeAddress.getRoadNumber());
        System.out.println("Thana : "+employeeAddress.getThana());
        System.out.println("Distict : "+employeeAddress.getDistrict());
        System.out.println("Address Type : "+employeeAddress.getAddressType().getAddressTypeName());

    }
    
}
