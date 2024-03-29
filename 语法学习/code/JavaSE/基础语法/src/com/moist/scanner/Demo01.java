package com.moist.scanner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        //创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用next方式接收：");

        //判断用户有没有输入字符串
        if(scanner.hasNext()){
            String str = scanner.next();//hello world
            System.out.println("输出的内容为：" + str);//hello
        }

        //凡是属于IO流的类，如果不关闭就会一直占用资源。要养成好习惯用完就关闭
        scanner.close();//关闭scanner,释放内存资源
    }
}
