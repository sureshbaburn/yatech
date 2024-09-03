package com.yamtes.rest.webservices.restful.webservices.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    private String houseNumber;
    private String streetName;

    @Id
    private String phoneNumber;
    @Id
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
