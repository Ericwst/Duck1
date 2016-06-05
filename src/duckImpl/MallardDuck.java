package duckImpl;

import duck.Duck;
import fly.FlyWithWings;
import quack.Quack;

public class MallardDuck extends Duck {
	public MallardDuck() {
		// TODO Auto-generated constructor stub
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	public void display() {
		System.out.println("我是野鸭子");
	}
}
