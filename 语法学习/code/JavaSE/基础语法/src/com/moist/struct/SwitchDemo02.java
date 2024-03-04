package com.moist.struct;

public class SwitchDemo02 {
    public static void main(String[] args) {
        String name = "流殇";
        //JDK7新特性，表达式的结果可以是字符串
        //字符的本质还是数字

        //反编译  java---class(字节码文件) ------反编译(IDEA)

        switch (name){
            case "流殇":
                System.out.println("流殇");
                break;
            case "润泽":
                System.out.println("润泽");
                break;
            case "馨娴":
                System.out.println("馨娴");
                break;
            default:
                System.out.println("没有搜索到目标");
        }
    }
}
