package com.springdemo;

public class SoccerCoach implements Coach {

    private FortuneService fortuneService;

    // add new field for team and emailaddress
    private  String emailAddress;
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("SoccerCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("SoccerCoach: inside setter method - setTeam");
        this.team = team;
    }

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
