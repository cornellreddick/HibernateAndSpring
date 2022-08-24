package com.springdemo;

public class BasketballCoach implements Coach {

    // define a private field for the dependency
    private FortuneService fortuneService;

    // define a constructor for dependency injection
    public  BasketballCoach(FortuneService daFortuneService){
        fortuneService = daFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 45 minutes doing suicides!";
    }

    @Override
    public String getDailyFortune() {
        // use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }
}
