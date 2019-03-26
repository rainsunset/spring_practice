/**
 * Company
 * Copyright (C) 2004-2018 All Rights Reserved.
 */
package com.ligw.beanprop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ligw
 * @version $Id Main.java, v 0.1 2018-01-13 22:45 ligw Exp $$
 */
public class Main {

    public static void main(String[] args) {
        //创建Spring的IOC容器
        //ApplicationContext : IOC 容器
        //ClassPathXmlApplicationContext为ApplicationContext的实现类 该实现类从类路径下加载配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beanPropContext.xml");
        //从IOC容器中获取对象 - 利用ID定位到IOC容器中的Bean
        Car car = (Car) ctx.getBean("car");
        //利用类型返回IOC容器中的Bean 当IOC容器里有两个相同类对象时会报错
//        Car car2 = ctx.getBean(Car.class);
        Person person = (Person) ctx.getBean("person4");
        Company company = (Company) ctx.getBean("company");
        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        Person person5 = (Person) ctx.getBean("person5");
        Address address3 = (Address) ctx.getBean("address3");
        Worker worker_dep = (Worker) ctx.getBean("worker_dep");
        //通过 属性文件配置的Bean
        Person person_prop = (Person) ctx.getBean("person_prop");
        //通过SpEl 配置的Bean
        Person person_spel = (Person) ctx.getBean("person_spel");
        System.out.println(person_spel.toString());



    }

}
