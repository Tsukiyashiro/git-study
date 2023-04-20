package com.test;

import java.util.HashMap;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一段纯英文文本");
        String s = sc.nextLine();
        //把输入的字符串转换为字符串数组
        String[] sarr=new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            sarr[i]= String.valueOf(s.charAt(i));
        }
        //利用HashMap方法
        HashMap<String,Integer> map = new HashMap();
        //循环次数为单词的长度
        for (int i = 0; i < s.length(); i++) {
            //判断是否有该单词为键名的键，如果没有添加该按键，值为1
            if(!map.containsKey(sarr[i])) {
                map.put(sarr[i],1);
            }
            //如果有，获取该键的值并加1
            else {
                map.put(sarr[i],map.get(sarr[i])+1);
            }
        }
        //遍历输出
        map.forEach((k,v)-> System.out.println(k+"="+v));
    }
}