# Dos命令

## 开启Dos控制台的几种方式

### 打开cmd的方式

1. 菜单：开始→windows系统 → 命令提示符
2. win + R  →  cmd
3. 在任意的文件夹下面，按住shift + 鼠标右键点击，在此处打开命令行窗口
4. 资源管理器的地址栏前面加上cmd+空格

### 管理员方式运行

菜单：开始→windows系统 → 命令提示符→右键点击选择以管理员身份运行



## 常用的Dos命令

```bash
#输入法调成英文模式
#盘符切换  C盘 D盘
	C:\> D:
#查看当前目录下的所有文件  dir
#创建文件夹 md
#删除文件夹 rd
#创建文件 cd>
#删除文件 del
#切换目录  cd  (change directory)  使用cd /d可以实现跨盘符操作  cd..可以返回上一级目录
	E:\>cd /d f:
#清理屏幕  cls  (clear screen)
#退出终端  exit
#查看电脑的ip  ipconfig
#打开应用  malc mspaint notepad
#ping命令 测试网络是否正常
	ping www.baidu.com  
#文件操作
	md 目录名
	rd 目录名
	cd> 文件名
	del 文件名
```



# 计算机语言发展史

## 机器语言

我们都知道计算机的基本计算方式都是基于二进制的方式

二进制：010011101011010101010111010101

这种代码是直接输入给计算机使用的，不经过任何的转换

## 汇编语言

解决人类无法读懂机器语言的问题

指令代替二进制

目前应用：

- 逆向工程
- 机器人
- 病毒

## 第三代语言

摩尔定律：当价格不变的时候，集成电路上可容纳的晶体管数目，约每隔18个月变回增加一倍，性能也将提高一倍。

​					换言之，每一美元所能买到的电脑性能，将每隔18个月翻两倍以上

## 高级语言

大体上分为：面向过程和面向对象两大类

C语言是最典型的面向过程的语言，C++和JAVA是典型的的面向对象的语言

聊聊各种原因：

- C语言（现代语言的鼻祖）
- C++语言
- JAVA语言
- C#语言
- Python、PHP、JavaScript
- ....



# 初识JAVA

## java帝国的诞生

### C&C++

1972年C语言诞生

- 贴近硬件，运行极快，效率极高
- 操作系统、编译器、数据库、网络系统等
- 指针和内存管理

1982年C++诞生

- 面向对象
- 兼容C
- 图形领域、游戏等

### java

我们要建立一个新的语言：

- 语法有点像C
- 没有指针
- 没有内存管理
- 真正的可移植性，编写一次，到处运行
- 面向对象
- 类型安全
- 高质量的类库
- ......

### java初生

1995年的网页简单而粗糙，缺乏互动性

图形界面的程序（Applet）



Bill Gates说：这是迄今为止设计的最好的语言



Java 2 标准版（J2SE）：去占领桌面

Java 2 移动版（J2ME）：去占领手机

Java 2 企业版（J2EE) ： 去占领服务器



### java发展

三高：高可用、高性能、高并发



他们基于Java开发了巨多的平台，系统，工具：

- 构建工具：Ant, Maven, Jekins
- 应用服务器：Tomcat, Jetty, Jboss, Websphere, weblogic
- Web开发：Struts, Spring, Hibernate, myBatis
- 开发工具：Eclipse, Netbean, intellij idea, Jbuilder
- .....

2006： Hadoop（大数据领域）

2008：Android（手机端）



## JAVA特性和优势

- 简单性
- 面向对象
- 可移植性  *Write once, run anywhere*
- 高性能
- 分布式   *URL*
- 动态性  *反射*
- 多线程   *交互行为和实时行为*
- 安全性   *去除指针和内存部分*，*捕获异常*
- 健壮性   



## JAVA的三大版本

JavaSE:  标准版 （桌面程序， 控制台开发）

JavaME：嵌入式开发（手机，小家电）

JavaEE：企业级开发（Web端，服务器开发）



## JDK、JRE、JVM

JDK：Java Development Kit                  java开发者工具

JRE:   Java Runtime Environment		 java运行环境

JVM:   JAVA Virtual Machine				  java虚拟机（实现跨平台）

![JDK](..\学习图片\2.png)



## JAVA开发环境的搭建

- JDK下载与安装
- 配置环境变量
- JDK目录介绍
- HelloWorld及简单语法规则
- Notepad++安装与使用



### 卸载JDK

1. 删除Java的安装目录
2. 删除Java_HOME
3. 删除path下关于Java的目录
4. java -version

### 安装JDK

1. 百度搜索JDK8，找到下载地址
2. 同意协议
3. 下载电脑对应的版本
4. 双击安装JDK
5. **记住安装的路径**
6. 配置环境变量
   - 我的电脑 -->右键 -->属性-->高级系统设置-->环境变量-->系统变量
   - 环境变量--> JAVA_HOME
   - 配置path变量
7. 测试JDK是否安装成功
   - 打开cmd
   - java -version
