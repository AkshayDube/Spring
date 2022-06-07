package com.Spring.demo.dependencyInjection;

public class Test {
	
	public Test() {
		
	}

	public void doSome() {
		System.out.println("In init method of Test");
	}
	public void doFinishSome(){
		System.out.println("In destroy method of Test");
	}
}
