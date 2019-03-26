/**
 * Company
 * Copyright (C) 2004-2018 All Rights Reserved.
 */
package com.ligw.beanlifecycle;

/**
 * @author ligw
 * @version $Id Penson.java, v 0.1 2018-01-18 21:58 ligw Exp $$
 */
public class Penson {

    private String name;

    public Penson() {
        System.out.println("build with no param");
    }

    public Penson(String name) {
        System.out.println("build with param");
        this.name = name;
    }

    public String getName() {
        System.out.println("methord : get");
        return name;
    }

    public void setName(String name) {
        System.out.println("methord : set");
        this.name = name;
    }

    public  void initmethod(){
        System.out.println("init..........");
    }

    public void destorymeth(){
        System.out.println("destory。。。。。。。");
    }

    @Override public String toString() {
        return "Penson{" + "name='" + name + '\'' + '}';
    }
}
