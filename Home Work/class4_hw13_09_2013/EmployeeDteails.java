package class4_hw13_09_2013;

public class EmployeeDteails {

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
