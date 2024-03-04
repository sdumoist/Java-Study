package com.moist.struct;

import java.util.Scanner;

public class TestDemo01 {
    public static void main(String[] args) {
        //打印三角形
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入您想打印的三角形的行数:");
        int num = scanner.nextInt();
        while(num <= 0){
            System.out.println("请输入正整数");
            num = scanner.nextInt();
        }
        for(int i = 1;i <= num; i++){
            for(int j = num;j >= i;j--){
                System.out.print(" ");
            }
            for(int j = 1;j <= i;j++){
                System.out.print("*");
            }
            for(int j = 1;j < i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        scanner.close();

    }
}
