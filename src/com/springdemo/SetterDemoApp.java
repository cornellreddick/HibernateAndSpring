package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public  static  void  main(String[] args){

        // load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        SoccerCoach soccerCoach = context.getBean("mySoccerCoach", SoccerCoach.class);


        // call methods on the bean
        System.out.println(soccerCoach.getDailyFortune());

        System.out.println(soccerCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
