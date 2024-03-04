package com.moist.struct;

public class ForDemo04 {
    public static void main(String[] args) {
        //1.打印第一列
        //2.我们把固定的1再用一个循环包起来
        //3.去掉重复项,i <= j
        //4.调整样式

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + (i*j) + "\t");
            }
            System.out.println();
        }
    }
}
