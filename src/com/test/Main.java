package com.test;

import com.test.behavior.FlyRocketPowered;

public class Main {

	
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.preformFly();
		mallard.preformQuack();
		
		Duck model = new ModelDuck();
		model.preformFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.preformFly();
		//
	}
	
}
