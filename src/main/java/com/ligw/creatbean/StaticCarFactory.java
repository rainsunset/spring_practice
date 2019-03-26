/**
 * Company
 * Copyright (C) 2004-2018 All Rights Reserved.
 */
package com.ligw.creatbean;

import java.util.HashMap;
import java.util.Map;

/**
 * Car 的静态工厂方法
 * @author ligw
 * @version $Id StaticCarFactory.java, v 0.1 2018-01-21 21:27 ligw Exp $$
 */
public class StaticCarFactory {

    private static Map<String, Car> cars = new HashMap<String, Car>();

    static {
        cars.put("aodi", new Car("aodi", 3000));
        cars.put("dazhong", new Car("dazhong", 5000));
    }

    public static Car getCar(String name){
        return cars.get(name);
    }
}
