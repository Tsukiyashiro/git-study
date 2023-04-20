package com.hainiu.homework2;

public class Regex2 {
    public static void main(String[] args) {
        String str = "张三的电话号码是：13877778888，李四的电话号码是：13966669999，王五的电话号码是：18898765432。";
        String regex = "1[3-9]\\d{9}";
        String s1 = str.replaceAll(regex, "****");
        System.out.println(s1);
        String s2 = str.replaceFirst(regex, "***");
        System.out.println(s2);

    }
}
