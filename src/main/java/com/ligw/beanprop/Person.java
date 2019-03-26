/**
 * Company
 * Copyright (C) 2004-2018 All Rights Reserved.
 */
package com.ligw.beanprop;

/**
 * @author ligw
 * @version $Id Person.java, v 0.1 2018-01-15 22:48 ligw Exp $$
 */
public class Person{
    private String name;

    private Integer age;

    private Car car;

    public Person() {
    }

    public Person(String name, Integer age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + ", car=" + car + '}';
    }
}
