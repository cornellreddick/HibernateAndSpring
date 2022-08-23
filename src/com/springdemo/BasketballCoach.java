package com.springdemo;

public class BasketballCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Spend 45 minutes doing suicides!";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
