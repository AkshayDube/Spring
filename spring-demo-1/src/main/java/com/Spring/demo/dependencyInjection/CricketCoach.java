package com.Spring.demo.dependencyInjection;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private CoachInfo info;
	
	@Override
	public String getDailyWorkout() {
		return "Spend 1 hour daily on Cricket Practice";
	}

	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void setInfo(CoachInfo info) {
		this.info=info;
	}
	
	@Override
	public String getCoachInfo() {
		return "Coach Name : "+info.getName() + "\nCoach Experience : "+info.getExperience()+" years" ;
	}
	
	//init-method
	public void doCrazyStart(){
		System.out.println("----------------------Starting Crazy Kiya Re---------------------------");
	}
	
	//destroy-method
	public void doCrazyStop() {
		System.out.println("--------------------------Stopping Crazy Kiya Re ----------------------");
	}
}
