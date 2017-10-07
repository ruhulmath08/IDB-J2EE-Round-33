package listExampleProject2;

public class Country {
    private long counteyId;
    private String countryName;

    public Country(long counteyId, String countryName) {
        this.counteyId = counteyId;
        this.countryName = countryName;
    }

    public long getCounteyId() {
        return counteyId;
    }

    public String getCountryName() {
        return countryName;
    }
    
    
}
