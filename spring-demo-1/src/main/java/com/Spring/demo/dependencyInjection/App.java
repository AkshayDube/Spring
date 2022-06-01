package com.Spring.demo.dependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		//Create A Spring Container
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retreive Bean from Spring Container
		Coach obj=context.getBean("coach",Coach.class);
		
		System.out.println(obj.getDailyWorkout());
		System.out.println(obj.getDailyFortune());
	

	}

}
