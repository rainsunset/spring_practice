/**
 * Company
 * Copyright (C) 2004-2018 All Rights Reserved.
 */
package com.ligw.creatbean;

/**
 * @author ligw
 * @version $Id Car.java, v 0.1 2018-01-21 21:25 ligw Exp $$
 */
public class Car {

    private String brand;

    private double price;

    public Car() {
    }

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override public String toString() {
        return "Car{" + "brand='" + brand + '\'' + ", price=" + price + '}';
    }
}
