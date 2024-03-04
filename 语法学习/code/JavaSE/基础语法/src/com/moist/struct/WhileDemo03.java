package com.moist.struct;

public class WhileDemo03 {
    public static void main(String[] args) {
        //计算1+2+3+...+100=?

        int i = 1;
        int sum = 0;

        while(i < 101){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
