package com.hainiu.Homework4;

public class Test {
    public static void main(String[] args) {
        swimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("一起去游泳吧~");
            }
        });

        swimming(()->{
            System.out.println("天气不错，去海边看看吧");
        });
    }


    public static void swimming(Swimming swimming){
        swimming.swim();
    }
}
