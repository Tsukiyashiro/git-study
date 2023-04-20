package com.hainiu.homework3;

public class PhoneTest {
    public static void main(String[] args) {
        DumbPhone dp = new DumbPhone();
        dp.setBrand("nokia");
        dp.setPrice(499);
        System.out.println(dp.getBrand());
        System.out.println(dp.getPrice());
        System.out.println(dp);
        dp.call();
        dp.help();

        SmartPhone sp = new SmartPhone();
        sp.setBrand("huawei");
        sp.setPrice(4999);
        System.out.println(sp.getBrand());
        System.out.println(sp.getPrice());
        System.out.println(sp);
        sp.buy();
        sp.call();
    }
}
