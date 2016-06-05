package duckImpl;

import duck.Duck;
import fly.FlyWithRocket;
import quack.Squeak;

public class RedheadDuck extends Duck {

	public RedheadDuck() {
		// TODO Auto-generated constructor stub
		quackBehavior = new Squeak();
		flyBehavior = new FlyWithRocket();

	}

	public void display(){
		System.out.println("我是火箭红头鸭");
	}
}
