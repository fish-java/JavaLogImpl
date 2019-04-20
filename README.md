# Log4j Impl

- 根据不同的环境来确定打印级别
  
  fatal、error、warn、info、debug、trace

- 配置输出的目的地
  
  控制台、文件。。。

- 配置输出的格式
 
  要不要加上时间、类名。。。

System.out.printLn 既影响性能，又不能满足上面的需求

## 配置文件
默认读取classpath里面的log4j.properties文件