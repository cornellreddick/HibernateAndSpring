package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeSpringApp {
    public  static  void  main(String[] args){

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach coach = context.getBean("myTrackCoach", Coach.class);

        // call methods on the bean
        System.out.println(coach.getDailyWorkout());

        // close the context
        context.close();


    }


}
