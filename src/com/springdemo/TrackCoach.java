package com.springdemo;

public class TrackCoach implements Coach{

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "15 minutes of stretches, and run a 10 mile run.";
    }

    @Override
    public String getDailyFortune() {
        return "Boss status " + fortuneService.getFortune();
    }
}
