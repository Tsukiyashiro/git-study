package com.pratice;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author HaiNiu
 * @description 往泛型声明为String的list集合中添加一个Integer数据
 */
public class Demo2 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("100");

        Class<ArrayList> clazz = (Class<ArrayList>) list.getClass();
        clazz.getDeclaredConstructor().newInstance();
        Method s = clazz.getMethod("add", Object.class);
        s.invoke(list,100);

        for (Object o : list) {
            System.out.println(o);
        }
    }
}
