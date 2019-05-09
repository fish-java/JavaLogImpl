# Java 日志框架

- 根据不同的环境来确定打印级别
  
  fatal、error、warn、info、debug、trace

- 配置输出的目的地
  
  控制台、文件。。。

- 配置输出的格式
 
  要不要加上时间、类名。。。

System.out.printLn 既影响性能，又不能满足上面的需求

## 框架分类
### 抽象层
- Slf4j

### 实现层
- log4j

  默认读取classpath里面的log4j.properties文件
  
- log4j2

- logback

## 参考资料
- 尚硅谷
  - https://www.bilibili.com/video/av20965295/?p=22
  - https://www.bilibili.com/video/av39954072
