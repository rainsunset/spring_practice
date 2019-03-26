/**
 * Company
 * Copyright (C) 2004-2018 All Rights Reserved.
 */
package com.ligw.beanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ligw
 * @version $Id Main.java, v 0.1 2018-01-18 22:15 ligw Exp $$
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beanlifecycle.xml");
        Penson penson = (Penson) ctx.getBean("penson_lifecycle");
        System.out.println(penson.toString());

        //关闭容器
        ctx.close();
    }

}
