# warrior

#### Description
{**When you're done, you can delete the content in this README and update the file with details for others getting started with your repository**}

#### Software Architecture
我boot2.4.5下不下来，
可以像源码一样，用函数式编程，多用lambda表达式，全是接口，接口实现接口那样子
常量信息感觉基本可以拉若亿的好多东西，

后台的技术列一下，
先不算各种框架引擎啥的，这种业务性的东西，比如工作流，gis服务。

### java层面
线程部分，涉及安全性和可用性，大数据量高并发暂时不着急，可以尝试
读写一致性这种；
把同步、concurHashMap用起来，不在像以前一样光知道list、map；
代理模式：
工厂、单例、代理都给用起来，像源码一样的编程......


### 数据库层面
索引，序列，job，自动化建表维护等；
redis的数据结构，键值，过期啥的


#### 技术点

1. 可以自定义线程池工具类，里面有用到函数式编程 也就是lombda 表达式。主要用到的地方有自定义拒绝策略方面，还有很多。。。

2. 关系型数据库层面优化:

   1.  sql方面（可实现，通过索引实现，建复合索引）
   2.  分库分表 （暂不实现）
   3.  存储过程
   4.  建视图

3. 非关系型数据库

   1.  创建集中管理的key 和过期时间的类或者枚举或者接口
   2.  其实可以直接使用redis作为数据库，但是服务器的内存可能不够，只用来做储存热点数据，暂搁置。

4. 消息中间件

   1.  我建议去手写简单实现一个，在去用其他的中间件，[RocketMQ](https://www.jianshu.com/p/824066d70da8) 可以去用这个 ，阿里用java实现的，很有参考价值。

5. 数据库事务方面

   1.  7种传播特性，4种隔离级别，在service都要得到体现
   2.  自定义异常等等

6. webSocker

   1.  这个东西很重要，聊天必备的知识

7.  自动化建表（待研究）

   1.  

8. 数据库连接池先用德鲁伊的吧，后面可以自己去简单实现一个。

9. 定时任务，和线程池相关

10. 日志记录，目前采用的logback ，未做日志文件分流处理

11. 其实持久层框架可以用springdatajpa 

12. 文件流这块，最好能做到以最小的内存去处理大的数据，虽然说java不适合做数据处理。

13. 数据结构层面  二叉树 二叉排序树 红黑树 等等可以自己去实现，

14. 算法层面  所有排序和数据筛选在代码层实现，二分查找，快排、希尔、插入等等。

15. 代码规范就是使用阿里那个吧

16. 可以去调三方的其他接口

17. 自定义注解 可以去记录日志，做鉴权模块、做有些方法的增强（搭配aop去用）。

    1.  

    

#### webSocket 参考  [WebSocketChatServer](./web/src/main/java/com/study/web/web/WebSocketChatServer.java)

1.  建立连接，每个用户都会去创建一个对象，并将其根据名字和对象放入到map对象中
2.  保持连接，
3.  发送消息，发送的消息会以json串的新式过来，使用aliba 的json的对象解析，从json串中取到信息，和发送人名字，根据发送人名字在从map中取到收件人对象，做信息发送，此为线程不安全，应该做以考虑，这儿也做了全部人聊天室，传回的json串中无用户信息，则做全部发送
4.  注销连接 
>  问题，数据未做存储，刷新页面会丢数据，用户断线后，数据如何缓存，以及用户上线后，数据如何推送到用户这边。(这边应该不涉及wenSocket,只需要去查数据库就行了吧，应该是)
>  下次任务，完善前台单点页面，考量如何设计数据库缓存的用户信息表等

#### Contribution

1.  Fork the repository
2.  Create Feat_xxx branch
3.  Commit your code
4.  Create Pull Request


#### Gitee Feature

1.  You can use Readme\_XXX.md to support different languages, such as Readme\_en.md, Readme\_zh.md
2.  Gitee blog [blog.gitee.com](https://blog.gitee.com)
3.  Explore open source project [https://gitee.com/explore](https://gitee.com/explore)
4.  The most valuable open source project [GVP](https://gitee.com/gvp)
5.  The manual of Gitee [https://gitee.com/help](https://gitee.com/help)
6.  The most popular members  [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)
