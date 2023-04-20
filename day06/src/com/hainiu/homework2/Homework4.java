package com.hainiu.homework2;

public class Homework4 {
    public static void main(String[] args) {
        String str = "hellojavaworldjavabigdatajavajava";
        String target = "java";
        int search = search(str, target);
        System.out.println(search);
        int i = search2(str, target);
        System.out.println(i);

    }

    public static int search(String str,String target) {
        int count = 0;
        int index;
        while ((index = str.indexOf(target))!=-1) {
            count++;
            str = str.substring(index + target.length());
        }
        return count;
    }

    public static int search2(String str,String target) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(target,index))!=-1) {
            count++;
            index = index + target.length();
        }
        return count;
    }
}
