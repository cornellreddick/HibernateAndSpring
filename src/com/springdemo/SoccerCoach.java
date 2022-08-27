package com.springdemo;

public class SoccerCoach implements Coach {

    private FortuneService fortuneService;

    // crate a no-arg constructor
    public SoccerCoach() {
        System.out.println("SoccerCoach: inside no-arg constructor");
    }

    // our setter method that will be called by Spring that will inject the dependency
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("SoccerCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice net kicks and defence for 30 minutes.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
