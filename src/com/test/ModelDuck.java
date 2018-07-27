package com.test;

import com.test.behavior.FlyNoWay;
import com.test.behavior.Quack;

public class ModelDuck extends Duck{
	
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		
	}
	
	

}
