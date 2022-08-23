package com.springdemo;

public class GolfCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "25 swings with the Driver.";
    }
}
