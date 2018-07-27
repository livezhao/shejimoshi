package com.test.behavior;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("no fly");
	}
	
}
