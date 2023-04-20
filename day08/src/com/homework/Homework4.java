package com.homework;

import java.util.Enumeration;
import java.util.Properties;

public class Homework4 {
    public static void main(String[] args) {
        Properties pp = new Properties();
        pp.setProperty("name", "rick");
        pp.setProperty("age", "60");
        pp.setProperty("address", "America");

        pp.forEach((k, v) -> {
            System.out.println(k + "=" + v);
        });
        Enumeration<?> enumeration = pp.propertyNames();
        while (enumeration.hasMoreElements()) {
            String key = (String) enumeration.nextElement();
            System.out.println(key + "=" + pp.getProperty(key));
        }
    }
}
