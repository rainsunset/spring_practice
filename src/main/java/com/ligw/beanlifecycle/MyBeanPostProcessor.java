/**
 * Company
 * Copyright (C) 2004-2018 All Rights Reserved.
 */
package com.ligw.beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author ligw
 * @version $Id MyBeanPostProcessor.java, v 0.1 2018-01-18 22:37 ligw Exp $$
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override public Object postProcessBeforeInitialization(Object bean, String neanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization:"+bean+","+neanName);

        if ("penson_lifecycle".equals(neanName)){
            System.out.println("后置处理器 init 之前过滤处理");
        }

        return bean;
    }

    @Override public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("postProcessAfterInitialization:"+o+","+s);
        Penson penson = new Penson();
        penson.setName("huanghuang");
        return penson;
    }
}
