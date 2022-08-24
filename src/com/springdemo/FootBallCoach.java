package com.springdemo;

public class FootBallCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Do 25 sprints!";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
