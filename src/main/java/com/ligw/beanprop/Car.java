/**
 * Company
 * Copyright (C) 2004-2018 All Rights Reserved.
 */
package com.ligw.beanprop;

/**
 * @author ligw
 * @version $Id Car.java, v 0.1 2018-01-13 22:44 ligw Exp $$
 */
public class Car {

    private String name;

    private String color;

    private Integer speed;

    private double price;

    public Car(){

    }

    public Car(String name,String color,Integer speed){
        this.name = name;
        this.color = color;
        this.speed = speed;
    }

    public Car(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override public String toString() {
        return "Car{" + "name='" + name + '\'' + ", color='" + color + '\'' + ", speed=" + speed + ", price=" + price
                + '}';
    }
}
