package com.example.restservice.model;

public class Address {
    private int number;
    private String streetName;
    private City city;

    public Address(int number, String streetName, City city) {
        this.number = number;
        this.streetName = streetName;
        this.city = city;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
