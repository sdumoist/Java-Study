# SQL语句

![23](\图片\23.png)

## SQL中的基本类型

- char(n).  固定长度的字符串，用户指定长度 n 
- varchar(n).可变长度的字符串，用户指定最大长度 n 
- int.  整数类型（和机器相关的整数的有限子集） 
- smallint.  小整数类型（和机器相关的整数类型的子集） 
- numeric(p,d).  定点数， 精度由用户指定 这个数有 p 位数字，其中 d 位数字在小数点右边  
- real, double precision.浮点数与双精度浮点数，精度与机器相关 
- float(n).浮点数，精度由用户指定，精度至少为 n 位 

## 创建表结构

```sql
create table instructor (ID     char(5),
                         name    varchar(20) not null,
                         dept_name  varchar(20),
                         salary  numeric(8,2))
insert into instructor  
   values (‘10211’, ’Smith’, ’Biology’, 66000);
insert into instructor  
   values (‘10211’, null, ’Biology’, 66000);

```

- 使用create table 命令创建一个SQL关系表：
  - r是关系名
  - 每个 Ai是关系模式 r 的一个属性名
  - Di是属性 Ai 的域的类型

```sql
create table r (A1 D1, A2 D2, ..., An Dn,
			(integrity-constraint1),
			...,
			(integrity-constraintk))
```

## 完整性约束

``` sql
create table instructor (
    ID                char(5),
    name           varchar(20) not null,
    dept_name  varchar(20),
    salary           numeric(8,2),
    primary key (ID),
    foreign key (dept_name) references department)

```

被声明为主码的属性自动被确保为not null

- not null
- primary key (A1, ..., An )
- foreign key (Am, ..., An ) references r

``` sql
create table course (
    course_id        varchar(8) primary key,
    title                  varchar(50),
    dept_name      varchar(20),
    credits             numeric(2,0),
    foreign key (dept_name) references department) );

```

可以像上面的例子一样，将主码的声明和属性的声明放在一起 

## 删除和更改表结构

``` sql
drop table student
删除表和它的内容
DANGER！！
撤消基本表后，基本表的定义、表中数据、索引都被删除，由此表导出的视图将无法继续使用

delete from student
删除表中的内容，但是保留表

alter table 
alter table r add A D
属性A是关系 r 将要增加的属性，D 是A的域 
对于关系 r 中的所有元组，在新增加的属性上的取值都为 null  
alter table r drop A     
其中 A 是关系 r 的一个属性名 
许多数据库不支持删除属性的操作 
alter table r modify A     

删除表中的约束
alter table 表名 drop constraint 约束名

alter table S drop constraint pk_s

```

