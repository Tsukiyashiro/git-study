package com.hainiu.homework2;

public class Regex1 {
    public static void main(String[] args) {
        String regex = "^[a-z0-9A-Z]+[-|a-z0-9A-Z._]+@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-z]{2,}$";
        String email = "4564654@qq.com";
        String email2 = "djiasodu@163.com";
        String email3 = "iijjjii.@qq.com";
        String email4 = "165615143qq.com";
        System.out.println(email.matches(regex));
        System.out.println(email2.matches(regex));
        System.out.println(email3.matches(regex));
        System.out.println(email4.matches(regex));
    }
}
