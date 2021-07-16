package org.example.components;

public class Address {

    private String houseNumber;
    private String floorNumber;
    private String homeAddress;
    private String city;
    private String state;
    private String country;
    private String pincode;
    private String landmark;

    public Address() {
    }

    public Address(String houseNumber, String floorNumber, String homeAddress, String city, String state, String country, String pincode, String landmark) {
        this.houseNumber = houseNumber;
        this.floorNumber = floorNumber;
        this.homeAddress = homeAddress;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
        this.landmark = landmark;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }
}
