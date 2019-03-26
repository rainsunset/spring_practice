/**
 * Company
 * Copyright (C) 2004-2018 All Rights Reserved.
 */
package com.ligw.helloworld;

/**
 * @author ligw
 * @version $Id HelloWord.java, v 0.1 2018-01-11 23:20 ligw Exp $$
 */
public class HelloWorld {

    private String grettings;

    public HelloWorld(){
        System.out.println("调用了无参构造器");
    }

    public String getGrettings() {
        return grettings;
    }

    public void setGrettings(String grettings) {
        System.out.println("调用了set方法");
        this.grettings = grettings;
    }

    public void sayHi(){
        System.out.println(grettings);
    }

}
