package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public  static  void  main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve bean from spring container
        Coach asstCoach = context.getBean("myCoach", Coach.class);

        Coach headCoach = context.getBean("myCoach", Coach.class);

        // check if they are the same
        boolean results = (asstCoach == headCoach );

        // print out the results
        System.out.println("\nPointing to the same object: " + results);

        System.out.println("\nMemory location for assCoach: " + asstCoach);

        System.out.println("\nMemory location for headCoach: " + headCoach + "\n");

        // close the context
        context.close();
    }
}
