package com.moist.operator;

public class Demo07 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a += b;//a = a+b
        System.out.println(a);//30
        a -= b;//a = a-b
        System.out.println(a);//10

        //字符串连接符    + , String
        System.out.println(a + b);//30
        System.out.println(""+a+b);//1020
        System.out.println(a+b+"");//30


    }
}
