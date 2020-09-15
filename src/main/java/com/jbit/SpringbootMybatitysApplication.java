package com.jbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootMybatitysApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatitysApplication.class, args);
    }
}
// https://baijiahao.baidu.com/s?id=1598595163822471051&wfr=spider&for=pc



//////////////// 学习

/*知识点：
            图灵学院学院架构师学习路线图：
            https://www.processon.com/view/link/5cb6c8a4e4b059e209fbf369#outline
            https://ke.qq.com/course/230866?flowToken=1009233&taid=3625450614261202

   1 spring事务
              https://blog.csdn.net/u010963948/article/details/82761383
              https://www.jianshu.com/p/2449cd914e3c
              https://www.2cto.com/database/201803/731014.html
   2 hashmap
              https://www.cnblogs.com/cjsblog/p/8207211.html
  3 redis缓存击穿，雪崩
              redis https://www.cnblogs.com/fengli9998/p/8630513.html
  4 rabbitmq
              https://www.dev-heaven.com/posts/36563.html
  5 mybatitys
             https://blog.csdn.net/hellozpc/article/details/80878563

  6 多线程下的其他组件之CyclicBarrier、CountDownLatch、Callable、Future和FutureTask

  7 sleep、 wait、await 、signal的区别

  8 线程的start和run的区别？

  9 join 和yield 的区别
    join方法的原理就是调用相应线程的wait方法进行等待操作的，例如A线程中调用了B线程的join方法，则相当于在A线程中调用了B线程的
    wait方法，当B线程执行完（或者到达等待时间），B线程会自动调用自身的notifyAll方法唤醒A线程，从而达到同步的目的。

  10 SimpleDateFormat 是怎么保证线程安全的？
    https://cloud.tencent.com/developer/news/250155

  11 spring事务注解实现原理？  手写spring事务视频
     动态代理：tomcat启动扫描注解 -------创建实例-------自动装配----------映射路径
  12 为什么mybatitys可以通过mapper接口直接访问数据库？  手写mybatitys视频
     https://blog.csdn.net/niunai112/article/details/80247901

  13 两种动态代理：
     https://blog.csdn.net/DoUUnderstand/article/details/78865385

  14 几种注入注解的区别













框架：
    1spring/springmvc/servlet/struts2 原理、是否线程安全？怎么控制线程安全？

    2高并发下如何实现幂等？
     https://my.oschina.net/vshcxl/blog/1841908
     https://blog.csdn.net/hellozpc/article/details/81347765
     a 跳转到订单详情请求时redis set token ，点击提交按钮时，先检查是否有token，没有就返回重复提交，有就删除，然后处理业务逻辑
     b 利用数据库版本控制----乐观锁

    3 jvm的理解？jvm调优？

















    mysql:
    1两种主要的存储引擎的区别？

    2数据锁的种类，区别？

    3 调优

      SpringCloud:
    1 SpringCloud微服务间安全调用实现
     http://www.imooc.com/article/25328


**/





























































