/**
 * Company
 * Copyright (C) 2004-2018 All Rights Reserved.
 */
package com.ligw.beanprop;

/**
 * @author ligw
 * @version $Id Street.java, v 0.1 2018-01-16 22:29 ligw Exp $$
 */
public class Address {

    private String city;
    private String street;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override public String toString() {
        return "Address{" + "city='" + city + '\'' + ", street='" + street + '\'' + '}';
    }
}
