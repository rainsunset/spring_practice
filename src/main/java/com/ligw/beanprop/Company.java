/**
 * Company
 * Copyright (C) 2004-2018 All Rights Reserved.
 */
package com.ligw.beanprop;

import java.util.List;
import java.util.Map;

/**
 * @author ligw
 * @version $Id Company.java, v 0.1 2018-01-15 23:49 ligw Exp $$
 */
public class Company {

    private String name;

    private List<Person> staff;

    private Map<String,Car> bus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getStaff() {
        return staff;
    }

    public void setStaff(List<Person> staff) {
        this.staff = staff;
    }

    public Map<String, Car> getBus() {
        return bus;
    }

    public void setBus(Map<String, Car> bus) {
        this.bus = bus;
    }

    @Override public String toString() {
        return "Company{" + "name='" + name + '\'' + ", staff=" + staff + ", bus=" + bus + '}';
    }
}
