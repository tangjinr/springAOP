# springAOP
spring AOP 版本1.*为AspectJ定义AOP
spring AOP 版本2.*为Schema定义AOP
这里没有写Schema的，个人更常用AspectJ形式

两种形式：@AspectJ annotation-based和XML Schema-based
主要不同：annotation和XML，前者主要分散在类里面，后者主要在配置文件里面
它们比较重要的三个概念：
Aspect：定义完成什么功能，如：日志，事务之类
Pointcut：定义所匹配的函数
Advice：定义具体在哪个点（函数执行前或者函数执行后）完成日志或者事务的功能
