package com.hainiu.enumtest;

import static com.hainiu.enumtest.Phone.HUAWEI;

public class PhoneTest {
    public static void main(String[] args) {
        PhoneTest test = new PhoneTest(HUAWEI);
        test.test();
        Phone[] values = Phone.values();
        for (Phone value : values) {
            System.out.println(value);
        }

        Phone samsung = Phone.valueOf("SAMSUNG");
        System.out.println(samsung);

        System.out.println(Phone.SAMSUNG.compareTo(Phone.IPHONE));

        System.out.println(Phone.IPHONE.ordinal());


    }

    private Phone phone;

    public PhoneTest(Phone phone) {
        this.phone = phone;
    }
    public void test(){
        switch (phone){
            case HUAWEI:
                System.out.println("华为");
                break;
            case OPPO:
                System.out.println("OPPO");
                break;
            case VIVO:
                System.out.println("vivo");
                break;
            case ONEPLUS:
                System.out.println("一加");
                break;
            case SAMSUNG:
                System.out.println("三星");
                break;
            case IPHONE:
                System.out.println("苹果");
                break;
        }
    }
}
