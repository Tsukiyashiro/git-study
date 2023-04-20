package com.colleciton;

public class review01 {
    public static void main(String[] args) {
        System.out.println(drink(20, 3));

    }
    public static int drink(int m, int n) {
        // 喝到酒的总数和空酒瓶的总数初始值为均为已购买的m瓶酒
        int drinked = m;
        int empty = m;
        // 判断空瓶数量是否可以继续换酒
        while ((empty / n) != 0) {
            // 空瓶换酒
            int changed = empty / n;
            // 喝掉换来的酒
            drinked += changed;
            // 空瓶数量=换酒剩下的空瓶+喝掉换来的酒的空瓶
            empty = empty % n + changed;
        }
        return drinked;
    }
}
