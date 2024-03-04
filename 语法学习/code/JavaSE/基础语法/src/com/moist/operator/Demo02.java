package com.moist.operator;

public class Demo02 {
    public static void main(String[] args) {
        long a = 123123123123123L;
        int b =123;
        short c =10;
        byte d = 8;

        //运算规则：先将运算级统一成该运算中最高的数据类型后再运算
        //如果没有long，则前面的所有非int类型的，只要输出，得到的结果全部为int类型
        System.out.println(a+b+c+d);//Long
        System.out.println(b+c+d);//Int
        System.out.println(c+d);//Int
    }
}
