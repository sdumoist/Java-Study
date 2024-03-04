package com.moist.base;

public class Demo03 {
    public static void main(String[] args) {
        //整数拓展      进制      二进制     十进制     八进制0    十六进制0x
        int i = 10;
        int i2 = 010;//八进制
        int i3 = 0x10;//十六进制    0~9  A~F  16

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("=================================================================");
        //=================================================================
        //浮点数拓展？   银行业务怎么表示？钱
        //BigDecimal    数学工具类
        //=================================================================
        //float 有限  离散  舍入误差    大约  接近但不等于
        //double
        //最好完全避免使用浮点数进行比较
        //最好完全避免使用浮点数进行比较
        //最好完全避免使用浮点数进行比较

        float f = 0.1f;//0.1
        double d = 1.0/10;//0.1

        System.out.println(f==d);//false
        System.out.println(f);
        System.out.println(d);
        System.out.println("=================================================================");

        float d1 = 2323134231323113123f;
        float d2 = d1 + 1;
        System.out.println(d1==d2);//true
        System.out.println("=================================================================");


        //===============================================================================
        //字符拓展？
        //===============================================================================

        char c1 = 'a';
        char c2 = '中';

        System.out.println(c1);
        System.out.println((int)c1);
        System.out.println(c2);
        System.out.println((int)c2);

        //所有字符本质还是数字
        //编码    Unicode表:(a:97, A=65)    2字节     65536       Excel   2^16 = 65536
        //U0000    UFFFF

        char c3 = '\u0061';
        System.out.println(c3);//a

        //转义字符
        //  \t  制表符
        //  \n  换行符

        System.out.println("Hello\tWorld\n!");

        String sa = new String("hello world");
        String sb = new String("hello world");
        System.out.println(sa == sb);//false

        String sc = "hello world";
        String sd = "hello world";
        System.out.println(sc == sd);//ture

        //对象 从内存分析
        //布尔值拓展
        boolean flag = true;

        if(flag == true) {};
        if(flag){};
        //Less is More!     代码要精简易读
    }
}
