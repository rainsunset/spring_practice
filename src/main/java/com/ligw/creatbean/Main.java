/**
 * Company
 * Copyright (C) 2004-2018 All Rights Reserved.
 */
package com.ligw.creatbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ligw
 * @version $Id Main.java, v 0.1 2018-01-21 21:37 ligw Exp $$
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("creatBean.xml");
        Car car = (Car) ctx.getBean("car_factoryCreat");
        System.out.println(car.toString());
    }

}
