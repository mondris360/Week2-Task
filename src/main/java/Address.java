public class Address {
    private String street;
    private String city;
    private String state;



    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
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


}
