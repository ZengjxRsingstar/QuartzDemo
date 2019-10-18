package com.zengjx.job;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author zengjx
 * @Company zengjx
 * @Date 2019/10/18  11:48
 * @Version V1.0
 */
//方式2   用main 方式 启动
//  方式1  用 maven  tomcat
public class App {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("application-jobs.xml");
    }
}
