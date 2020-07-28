public class Address {
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String country;


    public Address(String street, String city, String state, String postalCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }

    // getters and setters
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    public boolean setStreet(String street) {
        this.street = street;
        return true;
    }

    public boolean setCity(String city) {
        this.city = city;
        return true;

    }

    public boolean setState(String state) {
        this.state = state;
        return true;

    }

    public boolean setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return true;
    }

    public boolean setCountry(String country) {
        this.country = country;
        return true;
    }
}
