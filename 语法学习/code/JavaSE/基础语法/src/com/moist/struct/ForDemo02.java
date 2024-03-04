package com.moist.struct;

public class ForDemo02 {
    public static void main(String[] args) {
        //练习1：计算0到100之间奇数和偶数的和

        int oddSum = 0;
        int evenSum = 0;

//        for (int i = 0; i <= 100; i+=2) {
//            evenSum += i;
//        }
//        for (int i = 1; i <= 100; i+=2) {
//            oddSum += i;
//        }
        for (int i = 0; i <= 100; i++) {
            if( i % 2 == 0){
                evenSum += i;
            }else{
                oddSum += i;
            }
        }
        System.out.println("0 到 100之间偶数的和为：" + evenSum);
        System.out.println("0 到 100之间奇数的和为：" + oddSum);
    }
}
