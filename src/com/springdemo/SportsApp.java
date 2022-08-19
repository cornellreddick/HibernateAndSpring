package com.springdemo;

public class SportsApp {
    public  static  void  main(String[] args){

        // create the object
        Coach basketballCoach = new BasketballCoach();
        Coach footBallCoach = new FootBallCoach();


        System.out.println(basketballCoach.getDailyWorkout());
        System.out.println(footBallCoach.getDailyWorkout());
    }

}
