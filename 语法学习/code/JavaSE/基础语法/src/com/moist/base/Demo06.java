package com.moist.base;

public class Demo06 {
    public static void main(String[] args) {
        //操作比较大的数的时候，注意溢出问题
        //JDK7新特性，数字之间可以用下划线分割
        int money = 10_0000_0000;
        System.out.println(money);
        int years = 20;
        int total = money * years;//-1474836480
        long total2 = money * years;//-1474836480   默认是int，转换之前已经出现问题了
        long total3 = money * (long)years;//20000000000
        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);
    }
}
