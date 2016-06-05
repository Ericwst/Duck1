package duckImpl;

import duck.Duck;
import fly.FlyNoWay;
import quack.MuteQuack;

public class RubberDuck extends Duck{

	public RubberDuck() {
		// TODO Auto-generated constructor stub
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	
	}
	public void display(){
		System.out.println("我是塑料鸭");			
	}	
	
}
