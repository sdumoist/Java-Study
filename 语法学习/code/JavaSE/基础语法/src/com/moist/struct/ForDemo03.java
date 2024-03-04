package com.moist.struct;

public class ForDemo03 {
    public static void main(String[] args) {
        //输出1~1000之间能被5整除的数字。并且每行输出3个

        int num = 0;
        for (int i = 1; i <= 1000; i++) {
            if(i % 5 == 0){
                num++;
                System.out.print(i + "\t");
                if (num % 3 == 0){
                    System.out.println();
                }
            }
        }

        //println   输出完会换行
        //print     输出完不会换行

        int a = 1;
        while(a <= 1000){
            if(a % 5 == 0){
                System.out.print(a + "\t");
            }
            if(a % (5 * 3) == 0){
                System.out.println();
//                System.out.print("\n");
            }
            a++;
        }
    }
}
