package com.epam.tamentoring.journeyplanner;

/**
 * Created by Botond_Balint on 2/27/2016.
 */
public class Address {
    private String zipCode;
    private String streetName;
    private String houseNumber;

    public Address(String zipCode, String streetName, String houseNumber) {
        this.zipCode = zipCode;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "zipCode='" + zipCode + '\'' +
                ", streetName='" + streetName + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                '}';
    }
}
