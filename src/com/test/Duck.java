package com.test;

import com.test.behavior.FlyBehavior;
import com.test.behavior.QuackBehavior;

public abstract class Duck {

	FlyBehavior flyBehavior;
	
	QuackBehavior quackBehavior;
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}


	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}


	void swim() {
		System.out.println("我是一只会游泳的鸭子");
	}
	
	
	abstract void display();
	
	void preformQuack() {
		quackBehavior.quack();
	}
	
	void preformFly() {
		flyBehavior.fly();
	}
}
