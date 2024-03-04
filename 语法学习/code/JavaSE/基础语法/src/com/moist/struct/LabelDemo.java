package com.moist.struct;

public class LabelDemo {
    public static void main(String[] args) {
        //打印101~150之间所有的质数
        //质数是指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数

        for(int i = 101;i < 150;i++){
            int count = 0;
            for(int j = 2;j < i/2;j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 0){
                System.out.println(i);
            }
        }


        //不建议使用
        outer:for(int i = 101;i <= 150;i++){
            for(int j = 2;j < i/2;j++){
                if(i % j == 0){
                    continue outer;
                }
            }
            System.out.print(i + " ");
        }
    }
}
