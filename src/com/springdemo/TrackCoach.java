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

    // add an init method
    public  void  doMyStartUpStuff(){
        System.out.println("TrackCoach: inside doMyStartUpStuff");

    }

    // add a destroy method
    public  void  doMyCleanUpStuff(){
        System.out.println("TrackCoach: inside doMyCleanUpStuff");

    }

}
