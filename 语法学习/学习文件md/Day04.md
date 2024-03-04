# HelloWorld详解

1. 随便新建一个文件夹
2. 新建一个Java文件
   - 文件后缀名是.java
   - Hello.java
   - 【注意点】系统可能没有显示文件的后缀名，我们需要手动打开
3. 编写代码

```java
public class Hello{
	public static void main(String[] args){
		System.out.print("Hello,World!");
	}
}
```

4. 编译javac  java文件，会生成一个class文件
5. 运行class文件，java class文件
   - ![运行截图](..\学习图片\3.png)

## 可能会遇到的情况

1. 每个单词的大小不能出现问题，**java是大小写敏感的**
2. 尽量使用英文；
3. 文件名和类名必须保证一致
4. 符号使用了中文符号



# Java程序运行机制

- 编译型：翻译整本书                              **操作系统，C/C++（对速度要求高）**
- 解释型：边写边翻译                              **网页，JAVA/JS（对速度要求没那么高）**



- 程序运行机制

![java程序运行机制](..\学习图片\4.png)

java文件在执行之前通过Java编译器（javac）进行了一次预编译（介于机器码和java源代码之间的文件），然后进入JVM虚拟机



## IDE  集成开发环境

集成开发环境（IDE，Integrated Development Environment ）是用于提供程序开发环境的应用程序，一般包括代码编辑器、编译器、调试器和图形用户界面等工具。集成了代码编写功能、分析功能、编译功能、调试功能等一体化的开发软件服务套。所有具备这一特性的软件或者软件套（组）都可以叫集成开发环境。如微软的Visual Studio系列，Borland的C++ Builder、Delphi系列等。该程序可以独立运行，也可以和其它程序并用。IDE多被用于开发HTML应用软件。例如，许多人在设计网站时使用IDE（如HomeSite、DreamWeaver等），因为很多项任务会自动生成。



## IDEA优化

自行百度设置



# JAVA基础语法

## 1.注释、标识符、关键字

### 注释

平时我们编写代码，在代码量比较少的时候，我们还可以看懂自己写的，但是当项目结构一旦复杂起来，我们就需要用到注释了

注释并不会被执行。是给我们写代码的人看的

**书写注释是一个非常好的习惯**

平时写代码，一定要注意规范



#### java中注释有三种类型

- 单行注释		
- 多行注释
- 文档注释

```java
public class HelloWorld {
    public static void main(String[] args) {
        //单行注释：可以注释一行文字
        /*
        多行注释：可以注释一段文字
         */
        //JavaDoc:文档注释 /**  */
        /**
         * @Description HelloWorld
         * @Author sdumoist
         */
        System.out.println("Hello,World!");
        
        
        //有趣的代码注释
                /***
         *      ┌─┐       ┌─┐ + +
         *   ┌──┘ ┴───────┘ ┴──┐++
         *   │                 │
         *   │       ───       │++ + + +
         *   ███████───███████ │+
         *   │                 │+
         *   │       ─┴─       │
         *   │                 │
         *   └───┐         ┌───┘
         *       │         │
         *       │         │   + +
         *       │         │
         *       │         └──────────────┐
         *       │                        │
         *       │                        ├─┐
         *       │                        ┌─┘
         *       │                        │
         *       └─┐  ┐  ┌───────┬──┐  ┌──┘  + + + +
         *         │ ─┤ ─┤       │ ─┤ ─┤
         *         └──┴──┘       └──┴──┘  + + + +
         *                神兽保佑
         *               代码无BUG!
         */
    }
}

```



### 标识符

- 关键字
- ![java关键字](..\学习图片\5.png)
- Java所有的组成部分都需要名字。类名、变量名以及方法名都被成为标识符

#### 标识符注意点

- 所有的标识符都应该以字母（A-Z或者a-z），美元符（$），或者下划线（_)开始
- 首字母之后可以是字母（A-Z或者a-z），美元符（$），下划线（_)或者数字的任何字符组合

- **不能使用关键字作为变量名和方法名**
- **标识符是大小写敏感的**
- 合法标识符举例：age,$salary,_value,__1_value
- 非法标识符举例：123abc,-salary,#abc
- **可以使用中文命名，但是一般不建议这样去使用，也不建议使用拼音，很low**

```java
		String Ahello = "liushang";
        String hello = "liushang";
        String $hello = "liushang";
        String _hello = "liushang";
		//大小写敏感
        String Man = "moist";
        String man = "moist";

        //String 1hello = "liushang";
        //String #hello = "liushang";
        //String *hello = "liushang";
```

## 2.数据类型

1. **强类型语言**        要求变量的使用要严格符合规定，所有变量都必须先定义后才能使用
2. **弱类型语言**        VBScript，JavaScript



java的数据类型分为两大类

- 基本类型（primitive type）
- 引用类型（reference type）![java数据类型](..\学习图片\6.png)

### 什么是字节

- 位（bit）：是计算机内部数据储存的最小单位，11001100是一个八位二进制数
- 字节（byte）：是计算机中数据处理的基本单位，习惯上用大写的B来表示
- 1B（byte，字节）=  8bit（位）
- 字符：是指计算机中使用的字母、数字、字和符号



1bit表示1位

1Byte表示一个字节1B=8b

1024B=1KB

1024KB=1M;

1024M=1G; 

1024G=1T;



```java
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
```



#### 转义字符

1. 八进制转义序列：\ + 1到3位5数字；范围'\000'~'\377'      \0：空字符
2. Unicode转义字符：\u + 四个十六进制数字；0~65535       \u0000：空字符
3. 特殊字符：就3个
         \"：双引号
        \'：单引号
        \\：反斜线
4. 控制字符：5个
   \' 单引号字符
   \\ 反斜杠字符
   \r 回车
   \n 换行
   \f 走纸换页
   \t 横向跳格
   \b 退格
5. 点的转义：. ==> u002E
   美元符号的转义：$ ==> u0024
   乘方符号的转义：^ ==> u005E
   左大括号的转义：{ ==> u007B
   左方括号的转义：[ ==> u005B
   左圆括号的转义：( ==> u0028
   竖线的转义：| ==> u007C
   右圆括号的转义：) ==> u0029
   星号的转义：* ==> u002A
   加号的转义：+ ==> u002B
   问号的转义：? ==> u003F
   反斜杠的转义： ==> u005C



## 3.类型转换

- 由于java是强类型语言，所以要进行有些运算的时候，需要用到类型转换

​		低 -------------------------------------------------------------->高

​		byte, short, char -> int -> long -> float -> double

- 运算中，不同类型的数据先转化为同一类型，然后进行运算



- **强制类型转换**

- **自动类型转换**

```java
 		int i = 128;
        byte e = (byte) i;//内存溢出
        double d = i;
        //强制转换 （类型）变量名   高--低
        //自动转换  低--高

        System.out.println(i);//128
        System.out.println(e);//-128
        System.out.println(d);//128.0
        /*
        注意点：
        1.不能对布尔值进行转换
        2.不能把对象类型转换为不相干的类型
        3.在把高容量转换到低容量的时候，强制转换
        4.转换的时候可能存在内存溢出，或者精度问题
         */
        System.out.println("================================================");
        System.out.println((int)23.7);      //23
        System.out.println((int)-45.89f);   //-45

        System.out.println("================================================");
        char c = 'a';
        int x = c + 1;
        System.out.println(x);          //98
        System.out.println((char)x);    //b
```

```java
		//操作比较大的数的时候，注意溢出问题
        //JDK7新特性，数字之间可以用下划线分割
        int money = 10_0000_0000;
        System.out.println(money);
        int years = 20;
        int total = money * years;//-1474836480
        long total2 = money * years;//-1474836480   默认是int，转换之前已经出现问题了
        long total3 = money * (long)years;//20000000000
        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);
```





## 4.变量、常量

#### 变量

- 变量是什么：可以变化的量

- JAVA是一种强类型语言，每个变量都必须声明其类型

- JAVA变量是程序中最基本的存储单元，其要素包括变量名，变量类型和作用域

- ```java
  	type varname [=value] [{,varName[=value]}]
      //数据类型 变量名 = 值； 可以使用逗号隔开来声明多个同类型变量
  ```

- 注意事项

  - 每个变量都有类型，类型可以输基本类型，也可以是引用类型
  - 变量名必须是合法的标识符
  - 变量声明是一条完整的语句，因此每一个声明都必须以分号结束


#### 变量作用域

- 类变量
- 实例变量
- 局部变量

```java
public class Variable{
    static int allClicks=0;	//类变量
    String str = "Hello world";	//实例变量
    
    public void method(){
        int i = 0;	//局部变量
    }
}
```

```java
	//类变量   static
    static double salary = 2500;

    //属性：变量

    //实例变量:从属于对象; 如果不初始化对象,初始化为这个类型的默认值 0 0.0
    //布尔值：默认是false
    //除了基本类型，其余默认值都是null
    String name;
    int age;

    //main方法
    public static void main(String[] args) {

        //局部变量;必须声明和初始化值
        int i = 10;
        System.out.println(i);

        //变量类型  变量名字 = new Demo08();
        Demo08 demo08 = new Demo08();
        System.out.println(demo08.age);
        System.out.println(demo08.name);

        //类变量   static
        System.out.println(salary);
    }

    //其他方法
    public void add(){

    }
```



#### 常量

- 常量（Constant）：初始化（initialize）后不能再改变值！不会变动的值
- 所谓常量可以理解为一种特殊的变量，他的值被设定后，在程序运行过程中不允许被改变
  - final 常量名 = 值；
  - final double PI = 3.14;
- 常量名一般使用大写字符



#### 变量的命名规范

- 所有变量、方法、类名：**见名知意**
  - 类成员变量：首字母小写和驼峰原则：moneySalary		除了第一个单词以外，后面的单词首字母大写	lastName
- 局部变量：首字母小写和驼峰原则
- 常量：大写字母和下划线：MAX_VALUE
- 类名：首字母大写和驼峰原则：Man，GoodMan
- 方法名：首字母小写和驼峰原则：run(), runRun()



## 5. 运算符



Java语言支持以下运算符：

- 算数运算符：+，-，*，%，/，++，--
- 赋值运算符：=
- 关系运算符：>, <, >=, ==, != instanceof
- 逻辑运算符：&&，||，！
- 位运算符：&，|，……，~，>>, <<, >>>(了解)
- 条件运算符:   ? =
- 扩展赋值运算符：+=, -=, *=, /=

```java
 		//二元运算符
        //Ctrl + D : 复制当前行到下一行
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;

        System.out.println(a+b);//30
        System.out.println(a-b);//-10
        System.out.println(a*b);//200
        System.out.println(a/b);//0
        System.out.println(a/(double)b);//0.5
```

```java
		long a = 123123123123123L;
        int b =123;
        short c =10;
        byte d = 8;

        //运算规则：先将运算级统一成该运算中最高的数据类型后再运算
        //如果没有long，则前面的所有非int类型的，只要输出，得到的结果全部为int类型
        System.out.println(a+b+c+d);//Long
        System.out.println(b+c+d);//Int
        System.out.println(c+d);//Int
```

```java
		//关系运算符返回的结果：  正确，错误   布尔值

        int a = 10;
        int b = 20;
        int c = 21;

        //取余    模运算
        System.out.println(c%a);// 1

        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a!=b);
```

```java
		//自增++   --   自增，自减  一元运算符
        int a = 3;
        int b = a++;//b = a   a = a + 1 执行完这段代码后，先给b赋值，再自增

        System.out.println(a);

        int c = ++a;//a = a+1   c = a   执行完这段代码前，先自增，再给c赋值

        System.out.println(a);//5
        System.out.println(b);//3
        System.out.println(c);//5

        //幂运算 2^3   2*2*2=8  很多运算要使用一些工具类来操作
        double pow = Math.pow(2,3);
        System.out.println(pow);//8.0
```

```java
 		//与（and）    或（or）   非（取反）
        boolean a = true;
        boolean b = false;

        System.out.println("a && b:"+(a&&b));//逻辑与运算：两个变量都为真，结果才为true
        System.out.println("a || b:"+(a||b));//逻辑或运算：两个变量有一个为真，则结果才为true
        System.out.println("!(a && b):"+!(a&&b));//如果是真，则变为假；如果是假，则变为真

        //短路计算  
        int c = 5;
        boolean d = (c < 4)&&(c++<4);
        System.out.println(d);
        System.out.println(c);
```

```java
		/*
        A = 0011 1100
        B = 0000 1101
        -------------------
        A&B 0000 1100
        A/B 0011 1101
        A^B 0011 0001
        ~B  1111 0010

        2*8 = 16   2*2*2*2
        效率极高!!!!
        <<  *2
        >>  /2

        0000 0000       0
        0000 0001       1
        0000 0010       2
        0000 0011       3
        0000 0100       4
        0000 1000       8
        0001 0000       16
         */

        System.out.println(2<<3);//16
```

```java
 		int a = 10;
        int b = 20;

        a += b;//a = a+b
        System.out.println(a);//30
        a -= b;//a = a-b
        System.out.println(a);//10

        //字符串连接符    + , String
        System.out.println(a + b);//30
        System.out.println(""+a+b);//1020
        System.out.println(a+b+"");//30

```

```java
		//三元运算符 x ? y : z
        //如果x==true，则结果为y，否则为z

        int score = 80;
        String type = score < 60? "不及格":"及格";
        //if
        System.out.println(type);
```



![运算符优先级](..\学习图片\7.png)

> **单目乘除为关系，逻辑三目后赋值 **

单目：单目运算符+ –(负数) ++ -- 等 
乘除：算数单目运算符* / % + - 
为：位移单目运算符<< >> 
关系：关系单目运算符> < >= <= == != 
逻辑：逻辑单目运算符&& || & | ^ 
三目：三目单目运算符A > B ? X : Y 

- *三元运算符，冒号左右两边数据类型要相等，左边是double，右边的整型也会转为double,double默认如果是整数的小数点后面加一位0，如果是小数的后面就该是几位就是几位*

后：无意义，仅仅为了凑字数 
赋值：赋值=

[运算符优先级博客地址](https://www.cnblogs.com/gavin-yao/p/10595835.html)





