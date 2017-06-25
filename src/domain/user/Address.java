/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.user;

import domain.DomainObject;

/**
 *
 * @author Filip
 */
public class Address implements DomainObject, Cloneable {

    private int id;
    private Country country;
    private String city;
    private String streetName;
    private String postalCode;
    private String streetNumber;

    public String getStreetName() {
        return streetName;
    }

    public Address setStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public Address setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
        return this;
    }

    public int getId() {
        return id;
    }

    public Address setId(int id) {
        this.id = id;
        return this;
    }

    public Country getCountry() {
        return country;
    }

    public Address setCountry(Country country) {
        this.country = country;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public Address setPostalCode(String postalCode) {
        this.postalCode = postalCode;

        return this;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Address()
                .setCity(city)
                .setCountry(country)
                .setId(id)
                .setPostalCode(postalCode)
                .setStreetName(streetName)
                .setStreetNumber(streetNumber);

    }

}
