/**
 * Company
 * Copyright (C) 2004-2018 All Rights Reserved.
 */
package com.ligw.beanprop;

import java.util.Properties;

/**
 * @author ligw
 * @version $Id DataSource.java, v 0.1 2018-01-16 0:14 ligw Exp $$
 */
public class DataSource {

    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override public String toString() {
        return "DataSource{" + "properties=" + properties + '}';
    }
}
