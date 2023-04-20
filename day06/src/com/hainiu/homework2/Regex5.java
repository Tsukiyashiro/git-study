package com.hainiu.homework2;

public class Regex5 {
    public static void main(String[] args) {
        String s = "我..我....我.我...我.要.要...要...要..要...要.学..学.学...学.学.编...编.编..编...编...程程..程..程";
        s = s.replaceAll("\\.","");
        System.out.println(s);
        s = s.replaceAll("(.)\\1+","$1");
        System.out.println(s);
    }
}
