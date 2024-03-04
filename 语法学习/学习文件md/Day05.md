# 包机制

- 为了更好的组织类，Java提供了包机制，用于区分类名的命名空间
- 包语句的语法格式为：
  - package pkg1[. pkg2[. pkg3...]];

- 一般利用公司的域名倒置变为包名；www.baidu.com	com.baidu.www

- 为了能够使用某一个包的成员，我们需要在Java程序中明确导入该包。使用“import"语句可完成此功能

  - import package1[.package2...].(classname|*);

  - import com.moist.beta.*;//*是通配符，指导入文件夹下面所有的包

    

# JavaDoc

- JavaDoc命令是用来生成自己API文档的

- 参数信息
  - @author 作者名
  - @version 版本号
  - @since 指明需要最早使用的jdk版本
  - @param 参数名
  - @return 返回值情况
  - @throws 异常抛出情况

- 通过命令行生成JavaDoc文档

  - 在java文件所在文件夹路径前cmd
  - javadoc -encoding UTF-8 -charset UTF-8   某文件.java
  - 点击index.html

- 通过IDEA生成JavaDoc文档

  - 打开相应的选项面板

  ![打开相应的选项面板](https://images2017.cnblogs.com/blog/1251417/201712/1251417-20171208170651718-1838074366.jpg)

  - -encoding是java代码编码，-charset是对生成文档所用的编码。-windowtitle就是对应html的<title>标签

    > ```xml
    > -encoding UTF-8 -charset UTF-8 -windowtitle "test"
    > ```
  
    ![生成](https://images2017.cnblogs.com/blog/1251417/201712/1251417-20171208170738124-916446785.jpg)
  
    原博文地址:[通过IDEA生成JavaDoc文档](https://www.cnblogs.com/noKing/p/8006298.html)



