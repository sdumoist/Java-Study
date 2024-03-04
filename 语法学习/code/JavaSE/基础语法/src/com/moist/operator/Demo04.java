package com.moist.operator;

public class Demo04 {
    public static void main(String[] args) {
        //自增++   --   自增，自减  一元运算符
        int a = 3;
        int b = a++;//b = a   a = a + 1 执行完这段代码后，先给b赋值，再自增

        System.out.println(a);

        int c = ++a;//a = a+1   c = a   执行完这段代码前，先自增，再给c赋值

        System.out.println(a);//5
        System.out.println(b);//3
        System.out.println(c);//5

        //幂运算 2^3   2*2*2=8  很多运算要使用一些工具类来操作
        double pow = Math.pow(2,3);
        System.out.println(pow);//8.0
    }
}
