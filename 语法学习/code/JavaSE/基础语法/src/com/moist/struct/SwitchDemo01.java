package com.moist.struct;

import java.util.Scanner;

public class SwitchDemo01 {
    public static void main(String[] args) {
        //case 穿透   switch 匹配一个具体的值
        char grade = 'D';

        switch (grade){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("及格");
                break;
            case 'D':
                System.out.println("不及格");
                break;
            default:
                System.out.println("未知等级");
        }
    }
}
