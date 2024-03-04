package com.moist.struct;

import java.util.Scanner;

public class TestDemo02 {
    public static void main(String[] args) {
        //打印实心菱形
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入您想打印的菱形的行数:");
        int num = scanner.nextInt();
        while(num <= 0 || num % 2 == 0){
            System.out.println("请输入正奇数");
            num = scanner.nextInt();
        }
        for(int i = 1;i <= num/2 + 1; i++){
            for(int j = num/2 + 1;j >= i;j--){
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
        for(int i = 1;i <= num/2; i++){
            for(int j = 1;j <= i+1;j++){
                System.out.print(" ");
            }
            for(int j = num/2;j >= i;j--){
                System.out.print("*");
            }
            for(int j = num/2;j >i;j-- ){
                System.out.print("*");
            }
            System.out.println();
        }


        scanner.close();

    }
}
