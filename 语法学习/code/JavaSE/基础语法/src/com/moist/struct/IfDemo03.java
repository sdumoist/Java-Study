package com.moist.struct;

import java.util.Scanner;

public class IfDemo03 {
    public static void main(String[] args) {
        //考试分数大于60就是及格，小于60就是不及格
        Scanner scanner = new Scanner(System.in);

        /*
        if 语句至多有一个else语句，else语句在所有的else if语句之后
        if语句可以有若干个else if语句，他们必须在else语句之前
        一旦其中一个else if 语句检测为true，其他的else if以及else语句都将跳过执行
         */
        System.out.println("请输入成绩：");
        int score = scanner.nextInt();

        if(score == 100){
            System.out.println("恭喜满分！");
        }else if(score < 100 && score >=90){
            System.out.println("A级");
        }else if(score < 90 && score >=80){
            System.out.println("B级");
        }else if(score < 80 && score >=70){
            System.out.println("C级");
        }else if(score < 70 && score >=60){
            System.out.println("D级");
        }else if(score < 60 && score >=0){
            System.out.println("不及格");
        } else{
            System.out.println("成绩不合法");
        }

        scanner.close();
    }
}
