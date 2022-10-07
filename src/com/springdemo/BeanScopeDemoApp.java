package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public  static  void  main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve bean from spring container
        Coach asstCoach = context.getBean("myCoach", Coach.class);

        Coach headCoach = context.getBean("myCoach", Coach.class);
    }
}
