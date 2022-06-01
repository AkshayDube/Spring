package com.Spring.demo.dependencyInjection;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Good Day! Let's seize the day";
	}

	
}
