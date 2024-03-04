package com.moist.struct;

public class DoWhileDemo02 {
    public static void main(String[] args) {
        int a = 0;
        while(a<0){
            System.out.println(a);//不输出
        }
        System.out.println("======================");
        do{
            System.out.println(a);// 0
        }while(a < 0);

    }
}
