/**
 * Company
 * Copyright (C) 2004-2018 All Rights Reserved.
 */
package com.ligw.beanprop;

/**
 * @author ligw
 * @version $Id Worker.java, v 0.1 2018-01-16 21:21 ligw Exp $$
 */
public class Worker {

    private String name;
    private Integer age;
    private Car car;
    private Company company;

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

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override public String toString() {
        return "Worker{" + "name='" + name + '\'' + ", age=" + age + ", car=" + car + ", company=" + company + '}';
    }
}
