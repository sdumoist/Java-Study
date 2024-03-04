package com.moist.method;

import java.util.Scanner;

public class Demo07 {
    //作业 加减乘除运算器
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请选择您想进行的运算：1-加法，2-减法，3-乘法，4-除法, 0-退出");
        int choice = scanner.nextInt();
        while(choice != 0){
            switch (choice){
                case 1:
                    System.out.println("请输入第一个加数：");
                    double num1 = scanner.nextDouble();
                    System.out.println("请输入第二个加数：");
                    double num2 = scanner.nextDouble();
                    System.out.println(num1 + " + " + num2 + " = " + add(num1,num2));
                    System.out.println("请选择您想进行的运算：1-加法，2-减法，3-乘法，4-除法,0-退出");
                    choice = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("请输入被减数：");
                    double num3 = scanner.nextDouble();
                    System.out.println("请输入减数：");
                    double num4 = scanner.nextDouble();
                    System.out.println(num3 + " - " + num4 + " = " + subtract(num3,num4));
                    System.out.println("请选择您想进行的运算：1-加法，2-减法，3-乘法，4-除法,0-退出");
                    choice = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("请输入第一个乘数：");
                    double num5 = scanner.nextDouble();
                    System.out.println("请输入第二个乘数：");
                    double num6 = scanner.nextDouble();
                    System.out.println(num5 + " * " + num6 + " = " + multiply(num5,num6));
                    System.out.println("请选择您想进行的运算：1-加法，2-减法，3-乘法，4-除法, 0-退出");
                    choice = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("请输入被除数：");
                    double num7 = scanner.nextDouble();
                    System.out.println("请输入除数：");
                    double num8 = scanner.nextDouble();
                    while(num8 == 0){
                        System.out.println("除数不能为零!请输入不为零的除数：");
                        num8 = scanner.nextDouble();
                    }
                    System.out.println(num7 + " / " + num8 + " = " + divide(num7,num8));
                    System.out.println("请选择您想进行的运算：1-加法，2-减法，3-乘法，4-除法,0-退出");
                    choice = scanner.nextInt();
                    break;
                default:
                    System.out.println("请输入正确的数字进行选择：1-加法，2-减法，3-乘法，4-除法, 0-退出");
                    choice = scanner.nextInt();
            }
        }



        scanner.close();
    }

    public static double add(double a,double b){
        return a+b;
    }

    public static double subtract(double a, double b){
        return a-b;
    }

    public static double multiply(double a, double b){
        return a*b;
    }

    public static double divide(double a,double b){
        return a/b;
    }

}
