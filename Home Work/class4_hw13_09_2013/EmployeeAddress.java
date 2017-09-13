package class4_hw13_09_2013;

public class EmployeeAddress {
    private String houseNumber;
    private String blockNumber;
    private String roadNumber;
    private String thana;
    private String district;
    private AddressType addressType;

    public EmployeeAddress(String houseNumber, String blockNumber, String roadNumber, String thana, String district, AddressType addressType) {
        this.houseNumber = houseNumber;
        this.blockNumber = blockNumber;
        this.roadNumber = roadNumber;
        this.thana = thana;
        this.district = district;
        this.addressType = addressType;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getBlockNumber() {
        return blockNumber;
    }

    public String getRoadNumber() {
        return roadNumber;
    }

    public String getThana() {
        return thana;
    }

    public String getDistrict() {
        return district;
    }

    public AddressType getAddressType() {
        return addressType;
    }
    
    
    
}
