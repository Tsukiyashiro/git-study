package com.pratice;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        InputStream stream = ClassLoader.getSystemClassLoader().getResourceAsStream("obj.properties");
        Properties properties = new Properties();
        properties.load(stream);

        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        Class<?> clazz = Class.forName(className);
        Object o = clazz.getDeclaredConstructor().newInstance();
        Method method = clazz.getMethod(methodName);
        method.invoke(o);

    }
}
