# simm-framework
本项目为一个扩展工具包，封装一些支持特殊场景的工具类，欢迎大家一起补充

#### 2018.09.22 1.0.1
##### 1.添加大任务切分成多条子线程执行，并与主线程通讯，保证子线程事务同时提交或回滚；
##### 2.添加利用futureTask和thread.stop两种方式，完成方法的超时终止功能。方法启用事务的情况下，借助于@Transactional(timeout)属性完成事务的即时回滚；

#### 2018.08.09  1.0.0
##### JSON不对称反序列化映射方案: 利用反射+注解的方式，让程序自动去匹配不对等的属性，自行完成数据适配的过程
