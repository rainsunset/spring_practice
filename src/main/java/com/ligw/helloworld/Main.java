/**
 * Company
 * Copyright (C) 2004-2018 All Rights Reserved.
 */
package com.ligw.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ligw
 * @version $Id Main.java, v 0.1 2018-01-11 23:21 ligw Exp $$
 */
public class Main {

    /**
     * 查看由Springr容器创建Bean的过程
     * @param args
     */
    public static void main(String[] args) {
//        创建Spring的IOC容器对象 会实例化配置文件中所有Bean(调用Bean对应的无参构造方法)
        ApplicationContext ctx = new ClassPathXmlApplicationContext("helloWorldContext.xml");
//        从IOC中取出Bean实例
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
//      调用方法
        helloWorld.sayHi();
    }

}
