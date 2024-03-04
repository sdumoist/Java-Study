# SQL入门

## 第一、SQL 的数据查询

数据查询是关系运算理论在SQL语言中的主要体现。
SQL的数据查询只一条SELECT语句，而且它是用途最广泛的一条语句，功能非常强大。
在学习时，应注意把SELECT语句和关系代数表达式联系起来考虑问题。

#### SELECT语句格式

一个完整的SELECT语句包括6个子句，其中前面的2个子句是必不可少的，其他子句可以省略。

SELECT 语句的完整格式如下：
SELECT [DISTINCT] 目标列名序列-----要查看的列
FROM 表名或视图名------------------数据来源
[WHERE 条件表达式]----------------查询条件
[GROUP BY + 列名] --------------------分组依据
[HAVING + 组条件表达式] ---------分组条件
[ORDER BY + 列名 + [ASC|DESC]序列]----排序依据

### 一、查询全部列

例3．查询**全体**学生的记录

```sql
SELECT` `学号, 姓名, 性别, 出生日期, 班号 ``FROM` `学生表
```

等价于：

```sql
SELECT` `* ``FROM` `学生表
```

***表示所有列**

#### 题解

题目：现在运营想要查看用户信息表中**所有的数据**，请你取出相应结果

```sql
SELECT` `* ``FROM` `user_profile
```

示例：user_profile

![img](https://uploadfiles.nowcoder.com/images/20210809/373115_1628487041842/95A6A6311DE036E4A2DA3A7EF91CF216)

根据示例，你的查询应返回以下结果:

![img](https://uploadfiles.nowcoder.com/images/20210809/373115_1628487090833/5BD980E2D0790DD54532EEDB78C0F862)



### 二、选择表中若干列

查询表中用户感兴趣的部分属性列。

例1：查询**全体**学生的**学号**与**姓名**。

```sql
SELECT` `学号,姓名 ``FROM` `学生表
```

例2：查询**全体**学生的**学号**、**课程号**和**成绩**。

```sql
SELECT` `学号,课程号,成绩 ``FROM` `成绩表
```

#### 题解

题目：现在运营同学想要**用户的设备id**对应的**年龄**、**性别**和**学校**的数据，请你取出相应数据

```sql
SELECT` `device_id,gender,age,university ``FROM` `user_profile
```

示例：user_profile

![img](https://uploadfiles.nowcoder.com/images/20210809/373115_1628477579504/95A6A6311DE036E4A2DA3A7EF91CF216)

根据示例，你的查询应返回以下结果

![img](https://uploadfiles.nowcoder.com/images/20210809/373115_1628477713095/D265EB971A68817292D38795B00E9FE1)



### 三、消除取值相同的记录

例4．在成绩表中查询有哪些学生修了课程，要求列出学生的学号。

```sql
SELECT` `学号 ``FROM` `成绩表
```

结果中有重复的行。
**用DISTINCT关键字可以去掉结果中的重复行**。
DISTINCT关键字放在SELECT词的后边、目标列名序列的前边。

```sql
SELECT` `DISTINCT` `学号 ``FROM` `成绩表
```

#### 题解

题目：现在运营需要查看用户来自于哪些学校，请从用户信息表中取出**学校**的**去重**数据。

```sql
SELECT` `DISTINCT` `university ``FROM` `user_profile
```

示例:user_profile

![img](https://uploadfiles.nowcoder.com/images/20210809/373115_1628487341699/95A6A6311DE036E4A2DA3A7EF91CF216)

根据示例，你的查询应返回以下结果：

![img](https://uploadfiles.nowcoder.com/images/20210825/999991344_1629882373697/3B82B6E2E9F62BCAAC7BB7DFE0BE9C18)



### 四、使用LIMIT限制结果集

LIMIT 子句可以被用于强制 SELECT 语句返回指定的记录数。
LIMIT 接受一个或两个数字参数。参数必须是一个整数常量。
如果只给定一个参数，它表示返回最大的记录行数目。
如果给定两个参数，第一个参数指定第一个返回记录行的偏移量，第二个参数指定返回记录行的最大数目。
为了检索从某一个偏移量到记录集的结束所有的记录行，可以指定第二个参数为 -1。
初始记录行的偏移量是 0(而不是 1)。

例5.检索记录行 6-10

```sql
SELECT` `* ``FROM` `table` `LIMIT 5,5
```

例6.检索记录行 11-last

```sql
SELECT` `* ``FROM` `table` `LIMIT 10,-1
```

例7.检索前 5 个记录行

```sql
SELECT` `* ``FROM` `table` `LIMIT 5
```

#### 题解

题目：现在运营只需要查看前2个用户明细设备ID数据，请你从用户信息表 user_profile 中取出相应结果。

```sql
SELECT` `device_id ``FROM` `user_profile ``ORDER` `BY` `id LIMIT 2
```

示例：

![img](https://uploadfiles.nowcoder.com/images/20210809/373115_1628487892322/95A6A6311DE036E4A2DA3A7EF91CF216)

根据输入，你的查询应返回以下结果：

![img](https://uploadfiles.nowcoder.com/images/20210825/999991344_1629879499883/9958CDA47C0BB5E2112FF11B7A9AA1DF)



### 五、改变列标题(取别名)

语法：

```sql
列名 | 表达式 [ AS ] 新列名
```

或：

```sql
新列名＝列名 | 表达式
```

例8.：

```sql
SELECT 姓名, year(getdate())-year(出生日期) AS 年龄 FROM 学生表
```

#### 题解

题目：现在你需要查看**2个**用户明细**设备ID**数据，并**将列名改为 'user_infors_example'**,，请你从用户信息表取出相应结果。

```sql
SELECT` `device_id ``AS` `user_infos_example ``FROM` `user_profile LIMIT 2
```

示例：user_profile

![img](https://uploadfiles.nowcoder.com/images/20210809/373115_1628488145840/95A6A6311DE036E4A2DA3A7EF91CF216)

根据示例，你的查询应返回以下结果：

![img](https://uploadfiles.nowcoder.com/images/20210825/999991344_1629882470450/57C3EAE8259BF9F5F78A41F2874FB26C)



















# DQL  DML  DDL  DCL


## **SQL语言的分类**

SQL语言共分为四大类：数据查询语言DQL，数据操纵语言DML，数据定义语言DDL，数据控制语言DCL。

### **1. 数据查询语言DQL(**Data QueryLanguage**)**
数据查询语言DQL基本结构是由SELECT子句，FROM子句，WHERE
子句组成的查询块：
SELECT <字段名表>
FROM <表或视图名>
WHERE <查询条件>

### **2 .数据操纵语言DML(**Data Manipulation Language**)**
数据操纵语言DML主要有三种形式：
\1) 插入：INSERT
\2) 更新：UPDATE
\3) 删除：DELETE

### **3. 数据定义语言DDL**(Data Definition Language)
数据定义语言DDL用来创建数据库中的各种对象-----表、视图、
索引、同义词、聚簇等如：
CREATE TABLE/VIEW/INDEX/SYN/CLUSTER
| | | | |
表 视图 索引 同义词 簇

DDL操作是隐性提交的！不能rollback 

### **4. 数据控制语言DCL(** (Data Control Language) **)**
数据控制语言DCL用来授予或回收访问数据库的某种特权，并控制
数据库操纵事务发生的时间及效果，对数据库实行监视等。如：

1. GRANT：授权。



2. ROLLBACK [WORK] TO [SAVEPOINT]：回退到某一点。
   回滚---ROLLBACK
   回滚命令使数据库状态回到上次最后提交的状态。其格式为：
   SQL>ROLLBACK;



3. COMMIT [WORK]：提交。


在数据库的插入、删除和修改操作时，只有当事务在提交到数据
库时才算完成。在事务提交前，只有操作数据库的这个人才能有权看
到所做的事情，别人只有在最后提交完成后才可以看到。
提交数据有三种类型：显式提交、隐式提交及自动提交。下面分
别说明这三种类型。



1. 显式提交
   用COMMIT命令直接完成的提交为显式提交。其格式为：
   SQL>COMMIT；



2. 隐式提交
   用SQL命令间接完成的提交为隐式提交。这些命令是：
   ALTER，AUDIT，COMMENT，CONNECT，CREATE，DISCONNECT，DROP，
   EXIT，GRANT，NOAUDIT，QUIT，REVOKE，RENAME。



3. 自动提交
   若把AUTOCOMMIT设置为ON，则在插入、修改、删除语句执行后，
   系统将自动进行提交，这就是自动提交。其格式为：
   SQL>SET AUTOCOMMIT ON；