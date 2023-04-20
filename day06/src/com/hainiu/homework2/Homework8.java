package com.hainiu.homework2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Homework8 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));

        String s = sdf.format(date);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = sdf2.parse(s);
        System.out.println(date1);
    }
}
