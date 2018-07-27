package com.test;

import com.test.behavior.FlyWithWings;
import com.test.behavior.Quack;

// 绿头鸭
public class MallardDuck extends Duck{

	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	@Override
	void display() {
		 System.out.println("我是绿头鸭");
	}

}
