1：创建maven工程quartzdemo，打包方式为war，导入jar包

2：自定义一个Job

3：提供Spring配置文件application-jobs.xml，配置自定义Job、任务描述、触发器、调度工厂等

- 创建JobDetail对象,作用是负责通过反射调用指定的Job，注入目标对象，注入目标方法 

- 注册一个触发器，指定任务触发的时间 

- 注册一个统一的调度工厂，通过这个调度工厂调度任务

4：web.xml中定义

- 启动web，自动加载spring容器。

5：启动tomcat完成测试