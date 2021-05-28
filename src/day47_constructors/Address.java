package day47_constructors;

public class Address {
    private String street;
    private String city;
    private String state;
    private int zipcode;
    private String country = "USA";

    // constructor with no arguement
    public Address() {

    }

    public Address(String street, String city, String state, int zipcode) {
        this.zipcode = zipcode;
        this.street = street;
        this.state = state;
        this.city = city;

    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return street +
                ", " + city +
                ", " + state +
                " " + zipcode;
    }
}
