package ru.store.online.model;

import ru.store.online.model.enums.Countries;

public class DeliveryAddress {

    private Countries countries;
    private String region;
    private String city;
    private String street;
    private String house;
    private String apartmentNumber;

    public DeliveryAddress(Countries countries, String region, String city,
                           String street, String house, String apartmentNumber) {
        this.countries = countries;
        this.region = region;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartmentNumber = apartmentNumber;
    }

    public Countries getCountries() {
        return countries;
    }
    public String getRegion() {
        return region;
    }
    public String getCity() {
        return city;
    }
    public String getStreet() {
        return street;
    }
    public String getHouse() {
        return house;
    }
    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setCountries(Countries countries) {
        this.countries = countries;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setHouse(String house) {
        this.house = house;
    }
    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }
}
