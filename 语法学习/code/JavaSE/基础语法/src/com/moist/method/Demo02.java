package com.moist.method;

public class Demo02 {
    public static void main(String[] args) {
        int max1 =max(20,10);
        double max2 = max(20.0,10.0);
        double max3 = max(20,10);//返回值用的 double，但是传入的参数都是 int，
        // 它依然走的是 int 那个方法，只不过在输出的时候进行了值的自动转换
        //重载只根据参数不同调用方法，20.0是应为20转化为double类型了
        System.out.println(max1);//20
        System.out.println(max2);//20.0
        System.out.println(max3);//20.0
    }

    //比大小
    public static int max(int num1, int num2){
        int result = 0;

        if(num1 == num2){
            System.out.println("num1==num2");
            return 0;//终止方法
        }

        if(num1 > num2){
            result = num1;
        }else{
            result = num2;
        }

        return result;
    }

    public static double max(double num1, double num2){
        double result = 0;

        if(num1 == num2){
            System.out.println("num1==num2");
            return 0;//终止方法
        }

        if(num1 > num2){
            result = num1;
        }else{
            result = num2;
        }

        return result;
    }
}
