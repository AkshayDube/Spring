package com.Spring.demo.dependencyInjection;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;
	
	private CoachInfo info;
	
	@Override
	public String getDailyWorkout() {
		return "Spend 1 hour daily for running practice";
	}
	
	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public void setInfo(CoachInfo info) {
		this.info=info;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	@Override
	public String getCoachInfo() {
		return "Coach Name : "+info.getName() + "\nCoach Experience : "+info.getExperience()+" years" ;
	}

	
}
