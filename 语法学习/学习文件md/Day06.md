# Java流程控制

## 1.用户交互Scanner

- 之前我们学的基本语法中我们并没有实现程序和人的交互，但是java给我们提供了一个工具类，我们可以获取用户的输入。

​		java.util.Scanner是Java5的新特征，我们可以通过Scanner类来获取用户的输出

- 基本语法

  - ```java
    Scanner s = new Scanner(System.in);
    ```

- 通过Scanner类的next()与nextLine()方法获取输入的字符串，在读取前我们一般需要使用hasNext()与hasNextLine()判断是否还有输入的数据



### next()

1. 一定要读取到有效字符后才可以结束输出
2. 对输入有效字符之前遇到的空白，next()方法会自动将其去掉
3. 只有输入有效字符后才能将其后面输入的空白作为分隔符或者结束符
4. next()不能得到带有空格的字符串

``` java
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
```



### nextLine()

1. 以Enter为结束符，也就是nextLine()方法返回的是输入回车之前的所有字符
2. 可以获得空白

```java
		//我们可以输入多个数字，并求其总和和平均数，每输入一个数字用回车确认，通过输入非数字来结束输入并输出执行结果
        Scanner scanner = new Scanner(System.in);

        //和
        double sum = 0;
        //计算输入了多少数字
        int m = 0;

        //通过循环判断是否还有输入，并在里面对每一次进行求和和统计
        while (scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            m = m + 1;//m++
            sum += x;
            System.out.println("你输入了第" + m +"个数据，当前结果为sum =" + sum);
        }

        System.out.println(m + "个数的和是：" + sum);
        System.out.println(m + "个数的平均数是：" + (sum/m));

        scanner.close();
```

```java
		Scanner scanner= new Scanner(System.in);

        //从键盘接收数据
        int i = 0;
        float f = 0.0f;
        System.out.println("请输入整数:");
        if(scanner.hasNextInt()){
            i = scanner.nextInt();
            System.out.println("整数数据: " + i);
        }else {
            System.out.println("输入的不是整数数据！");
        }
        //如果...那么
        System.out.println("请输入小数:");
        if(scanner.hasNextFloat()){
            f = scanner.nextFloat();
            System.out.println("小数数据: " + f);
        }else {
            System.out.println("输入的不是小数数据！");
        }

        scanner.close();
```

```java
 		//我们可以输入多个数字，并求其总和和平均数，每输入一个数字用回车确认，通过输入非数字来结束输入并输出执行结果
        Scanner scanner = new Scanner(System.in);

        //和
        double sum = 0;
        //计算输入了多少数字
        int m = 0;

        //通过循环判断是否还有输入，并在里面对每一次进行求和和统计
        while (scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            m = m + 1;//m++
            sum += x;
            System.out.println("你输入了第" + m +"个数据，当前结果为sum =" + sum);
        }

        System.out.println(m + "个数的和是：" + sum);
        System.out.println(m + "个数的平均数是：" + (sum/m));

        scanner.close();
```





## 2. 顺序结构

- Java的基本结构就是顺序结构，除非特别指明，否则就按照顺序一句一句执行
- 顺序结构是最简单的算法结构
  - ![顺序结构](..\学习图片\10.png)
- 语句与语句之间，框与框之间是按从上到下的顺序进行的，它是由若干个依次执行的处理步骤组成的，它是任何一个算法都离不开的算法结构

```java
		//从上到下依次进行
        System.out.println("Hello1");
        System.out.println("Hello2");
        System.out.println("Hello3");
        System.out.println("Hello4");
        System.out.println("Hello5");
```



## 3.选择结构

### if单选择结构

- 我们很多时候需要去判断一个东西是否可行，然后我们才去执行，这样一个过程在程序中用if语句来表示

- 语法：

  ```java
  if (布尔表达式)
  {
      //如果布尔表达式为true将执行的语句
  }
  ```

- 结构：![if单选择结构](..\学习图片\11.png)

- 代码

  - ```java
      Scanner scanner = new Scanner(System.in);
      
            System.out.println("请输入内容：");
            String s = scanner.nextLine();
      
            //equals判断字符串是否相等
            if(s.equals("Hello")){
                System.out.println(s);
            }
            System.out.println("End");
            scanner.close();
    ```

### if双选择结构

- 语法：

  - ```java
    if(布尔表达式){
    	//如果布尔表达式的值为true
    }else{
        //如果布尔表达式的值为false
    }
    ```

- 代码

  - ```java
     		Scanner scanner = new Scanner(System.in);
      
            System.out.println("请输入成绩：");
            int score = scanner.nextInt();
      
            if(score > 60){
                System.out.println("及格！");
            }   else{
                System.out.println("不及格！");
            }
      
            scanner.close();
    ```

### if多选择结构

- 语法

  - ```java
    if(布尔表达式 1）{
        //如果布尔表达式 1的值为true执行代码
    }else if(布尔表达式 2){
        //如果布尔表达式 2的值为true执行代码
    }else if(布尔表达式 3){
        //如果布尔表达式 3的值为true执行代码
    }else{
        //如果以上布尔表达式都不为true执行代码
    }
    ```

  - 结构：![多选择结构](..\学习图片\12.png)



### 嵌套的if结构

- 使用嵌套的 if...else 语句是合法的。也就是说你可以在另一个 if 或者 else if 语句中使用 if 或者 else if语句。

- 可以像嵌套 if 语句一样嵌套 else if...else

- 语法：

  - ```java
    if(布尔表达式 1){
    	//如果布尔表达式 1的值为true执行代码
    	if(布尔表达式 2){
            //如果布尔表达式 2的值为true执行代码
        }
    }
    ```



### switch多选择结构

- 多选择结构还有一个实现方式是switch语句

- switch case语句判断一个变量与一系列值中某个值是否相等，每一个值称为一个分支

- switch语句中的变量类型可以是：

  - byte short int 或者char
  - 从Java SE 7开始
  - switch支持字符串String类型了
  - 同时case标签必须为字符串常量或字面量

- 语法：![13](..\学习图片\13.png)

  ```java
  switch(expression){
      case value :
          //语句
          break;//可选
      case value :
          //语句
          break;//可选
      //你可以有任意数量的case语句
      default : //可选
          //语句
  }
  ```

  

- 代码

  - ```java
     		//case 穿透   switch 匹配一个具体的值
      		//不使用break,将继续执行case匹配value后的所有case
            char grade = 'D';
      
            switch (grade){
                case 'A':
                    System.out.println("优秀");
                    break;
                case 'B':
                    System.out.println("良好");
                    break;
                case 'C':
                    System.out.println("及格");
                    break;
                case 'D':
                    System.out.println("不及格");
                    break;
                default:
                    System.out.println("未知等级");
    ```

  - ```java
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
    ```

- 反编译（用IDEA）

  - 找到项目结构structrue      Ctrl + Shift + Alt + S
  - 寻找IDEA生成的class文件位置
  - 将class文件拖入IDEA
  - 点击查看反编译的文件

## 4. 循环结构

### while循环

- while循环是最基本的循环

- 结构：

  - ```java
    while(布尔表达式){
        //循环内容
    }
    ```

  - 只要布尔表达式为true，循环就会一直执行下去

  - 我们大多数情况是会让循环停止下来的，我们需要一个让表达式失效的方式来结束循环

  - 少部分情况需要循环一直执行，比如服务器的请求响应监听等

  - 循环条件一直为true就会造成无限循环（死循环），我们正常的业务编程中尽量避免死循环。会影响程序性能或者造成程序卡死崩溃

  - 思考：计算1+2+3+...+100=?

    - 代码

    ```java
    		//计算1+2+3+...+100=?
    
            int i = 1;
            int sum = 0;
    
            while(i < 101){
                sum += i;
                i++;
            }
            System.out.println(sum);
    ```

### do...while循环

- 对于while语句而言，如果不满足条件，则不能进入循环

- 但有时候我们需要即使是不满足条件，也至少执行一次

- do...while循环和while 循环相似，不同的是，do...whlie 循环至少会执行一次

- 代码

  - ```java
    do{
        //代码语句
    }while(布尔表达式)
    ```

- while 和 do...while 的区别

  - while先判断后执行。do...while是先执行后判断
  - do...while总是保证循环体会被至少执行一次！这是他们的主要区别
  - 代码

  ```java
  		int a = 0;
          while(a<0){
              System.out.println(a);
          }
          System.out.println("======================");
          do{
              System.out.println(a);
          }while(a < 0);
          
  ```

  

### for循环

- 虽然所有的循环结构都可以用while和do...while表示，但Java提供了另一种语句——for循环，使一些循环结构变得更加简单
- for循环语句是支持迭代的一种通用结构，**是最有效、最灵活的循环结构**
- for循环执行的次数是在执行前就确定的。
- 语法

```java
for(初始化;布尔表达式;更新){
    //代码语句
}
```

- 练习：
  - 计算0~100之间奇数和偶数的和
  
    - 代码

    ```java
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
    ```
  
    
  
  - 用while或者for循环输出1~1000之间能被5整除的数，并且每行输出3个
  
    - ```java
       	   //输出1~1000之间能被5整除的数字。并且每行输出3个
            
              int num = 0;
              for (int i = 1; i <= 1000; i++) {
                  if(i % 5 == 0){
                      num++;
                      System.out.print(i + "\t");
                      if (num % 3 == 0){
                          System.out.println();
                      }
                  }
              }
            
              //println   输出完会换行
              //print     输出完不会换行
            
              int a = 1;
              while(a <= 1000){
                  if(a % 5 == 0){
                      System.out.print(a + "\t");
                  }
                  if(a % (5 * 3) == 0){
                      System.out.println();
      //                System.out.print("\n");
                  }
                  a++;
              }
      ```
  
      
  
  - 打印九九乘法表
  
    - ```java
      		for (int i = 1; i < 10; i++) {
                  for (int j = 1; j <= i; j++) {
                      System.out.print(j + " * " + i + " = " + (i*j) + "\t");
                  }
                  System.out.println();
              }
      ```
  
- 在Java5中引入了一种主要用于数组的增强型for循环  for-each

### 增强for循环

- 数组时重点使用

- Java5引用了一种主要用于数组或集合的增强for循环

- 语法

  - ```java
    for(声明语句 : 表达式){
        //代码句子
    }
    ```

- 声明语句：声明新的局部变量，该变量的类型必须和数组元素的类型匹配。其作用域限定在循环语句块，其值与此时数组元素的值相等

- 表达式：表达式是要访问的数组名，或者是返回值为数组的方法

## 5.break & continue

- break在任何循环语句的主体部分，均可用break控制循环的流程。break用于强行退出循环，不执行循环中剩余的语句（break语句也在switch语句中使用）

- continue语句用在循环语句中，用于终止某次循环过程，即跳过循环体中尚未执行的语句，接着进行下一次是否执行循环的语句

- **关于goto关键字**
  - goto关键字很早就在程序设计语言中出现，尽管goto仍是Java的一个保留字，但并未在语言中得到正式使用；Java没有goto。然而，在break和continue这两个关键字的身上，我们仍能看出一些goto的影子——带标签的break和continue
  - “标签”是指后面跟一个冒号的标识符，例如：label：
  - 对Java来说唯一用到标签的地方是在循环语句之前。而在循环之前设置标签的唯一理由是：我们希望在其中嵌套另一个循环，由于break和continue关键字通常只中断当前循环。但若随同标签使用，他们就会中断到存在标签的地方
  - 代码
  
  ```java
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
  ```
  
  

## 6.练习

### 打印三角形

```java
//打印三角形
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入您想打印的三角形的行数:");
        int num = scanner.nextInt();
        while(num <= 0){
            System.out.println("请输入正整数");
            num = scanner.nextInt();
        }
        for(int i = 1;i <= num; i++){
            for(int j = num;j >= i;j--){
                System.out.print(" ");
            }
            for(int j = 1;j <= i;j++){
                System.out.print("*");
            }
            for(int j = 1;j < i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        scanner.close();
```

### 打印实心菱形

```java
//打印实心菱形
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入您想打印的菱形的行数:");
        int num = scanner.nextInt();
        while(num <= 0 || num % 2 == 0){
            System.out.println("请输入正奇数");
            num = scanner.nextInt();
        }
        for(int i = 1;i <= num/2 + 1; i++){
            for(int j = num/2 + 1;j >= i;j--){
                System.out.print(" ");
            }
            for(int j = 1;j <= i;j++){
                System.out.print("*");
            }
            for(int j = 1;j < i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1;i <= num/2; i++){
            for(int j = 1;j <= i+1;j++){
                System.out.print(" ");
            }
            for(int j = num/2;j >= i;j--){
                System.out.print("*");
            }
            for(int j = num/2;j >i;j-- ){
                System.out.print("*");
            }
            System.out.println();
        }


        scanner.close();
```





