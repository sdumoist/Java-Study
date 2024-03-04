# Java方法详解

## 1.什么是方法

- System.out.println() 是什么？        类.对象.方法
  - System是一个类	out是System类下的一个输出对象	println()就是一个方法

- Java方法是语句的集合，他们在一起执行一个功能
  - 方法是解决一类问题的步骤的有序组合
  - 方法包含于类或者对象中
  - 方法在程序中被创建，在其他地方被引用
- 设计方法的原则：方法的本意是功能块，就是实现某个功能的语句块集合。我们设计方法的时候，最好保持方法的原子性，就是一个方法只完成1个功能，这样有利于我们后期的拓展

- 回顾：方法的命名规则？

```java
	//main方法
    public static void main(String[] args) {
        int sum = add(1,2);
        System.out.println(sum);
    }

    //加法
    public static int add(int a, int b){
        return a+b;
    }
```

```java
//main方法
    public static void main(String[] args) {
        int sum = add(1,2);
        System.out.println(sum);
        test();
    }

    //加法
    public static int add(int a, int b){
        return a+b;
    }
    public static void test(){
        for (int a = 1;a <= 1000;a++){
            if(a % 5 == 0){
                System.out.print(a + "\t");
            }
            if(a % (5 * 3) == 0){
                System.out.println();
//                System.out.print("\n");
            }
        }
```

## 2.方法的定义和调用

- Java的方法类似于其他语言的函数，是一段**用来完成特定功能的代码片段**，一般情况下，定义一个方法包含以下语法：

  - **方法包含一个方法头和一个方法体** 下面是一个方法的所有部分

    - **修饰符**：修饰符是可选的，告诉编译器如何调用该方法。定义了该方法的使用类型

    - **返回值类型**：方法可能存在返回值。returnValueType是方法返回值的数据类型。有些方法执行所需操作，但没有返回值。在这种情况下，returnValueType是关键字void

    - **方法名**：是方法的实际名称。方法名和参数表共同构成方法签名

    - **参数类型**：参数像是一个占位符。当方法被调用的时候，传递值给参数。这个值被称作实参或者变量。参数列表是指方法的参数类型、顺序和参数的个数。参数是可选的，方法可以不包含任何参数

      - **形式参数**：在方法被调用时用于接收外界输入的数据
      - **实参**：调用方法时实际传给方法的数据

    - **方法体**：方法体包含具体的语句，定义该方法的功能

    - **语法**：

      - ```java
        修饰符 返回值类型 方法名（参数类型 参数名）{
            ...
            方法体
            ...
            return 返回值;
           
        }
        ```
  
- 方法的调用

  - 调用方法：对象名.方法名（实参列表）
  - Java支持两种调用方法的方式，根据方法是否有返回值来选择
  - 当方法返回一个值的时候，方法调用通常被当做一个值。例如：

  ```java
  int larger = max(30,40);
  ```

  - 如果方法返回值是void，方法调用一定是一条语句

  ```java
  System.out.println("Hello, Moist!");
  ```

  - 课后拓展练习：值传递(Java是值传递）和引用传递
  
  

## 3.方法的重载

- 重载就是在一个类里，有相同的函数名称，但形参不同的函数
- 方法的重载的规则：
  - **方法名称必须相同**
  - **参数列表必须不同（个数不同、或类型不同、参数排列顺序不同等）**
  - 方法的返回值类型可以相同也可以不同
  - 仅仅返回类型不同不足以成为方法的重载
- 实现理论：
  - 方法名称相同时，编译器会根据调用方法的参数个数、参数类型等去逐个匹配，以选择对应的方法，如果匹配失败，则编译器报错

- **重载只根据参数不同（类型、个数）调用方法，与返回值无关**



## 4.命令行传参

- 有时候你希望运行一个程序时候再传递给他消息，这要靠传递命令行参数给main()函数实现

```java
public class CommandLine{
    public static void main(String args[]){
        for(int i=0;i<args.length;i++){
            System.out.println("args["+ i +"]:"+ args[i]);
        }
    }
}
```

- 要想通过命令行运行一个java文件，可以现在文件夹cmd，然后使用javac进行编译

​		但是要想运行编译出来的class文件，需要找到包的路径才能运行（即返回到src文件目录才能运行）

## 5.可变参数

- 从JDK1.5开始，Java支持传递同类型的可变参数给一个方法
- 在方法声明中，在指定参数类型后加一个省略号(...)
- 一个方法只能指定一个可变参数，它必须是方法的最后一个参数。任何普通的参数必须在它之前进行声明

```java
	public static void printMax(double...numbers){
        if(numbers.length == 0){
            System.out.println("No argument passed");
            return;
        }

        double result = numbers[0];

        //排序
        for(int i = 1;i < numbers.length;i++){
            if(numbers[i] > result){
                result = numbers[i];
            }
        }

        System.out.println("The max value is " + result);
    }
```



## 6.递归讲解

- A方法调用B方法，我们很容易理解

- 递归就是：A方法调用A方法！自己调用自己！

- 利用递归可以用简单的程序来解决一些复杂的问题。它通常把一个大型复杂的问题层层转化为一个与原问题相似的规模较小的问题来求解，递归策略只需少量的程序就可描述出解题过程所需要的多次重复计算，大大地减少了程序的代码量。递归的能力在于用有限的语句来定义对象的无限集合。

- **递归结构包括两个部分：**

  - **递归头：什么时候不调用自身方法。如果没有头，将陷入死循环**
  - **递归体：什么时候需要调用自身方法**

- 代码

  - ```java
    //阶乘
        public static void main(String[] args) {
            System.out.println(f(5));
        }
    
        public static int f(int n){
            if(n == 1){
                return 1;
            }else{
                return n * f(n-1);
            }
        }
    ```

- ![img](..\学习图片\14.png)

## 7.作业

- 写一个计算器，要求实现加减乘除功能，并且能够循环接收新的数据，通过用户交互实现
- 思路推荐
  - 写四个方法：加减乘除
  - 利用循环加switch进行用户交互
  - 传递需要操作的两个数
  - 输出结果









