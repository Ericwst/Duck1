package test;

import duck.Duck;
import duckImpl.MallardDuck;
import duckImpl.RedheadDuck;
import duckImpl.RubberDuck;

public class DuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck duck1 = new MallardDuck();
		Duck duck2 = new RedheadDuck();
		Duck duck3 = new RubberDuck();

		duck1.display();
		duck1.performFly();
		duck1.performQuack();
		duck1.swim();
		System.out.println("----------");
		duck2.display();
		duck2.performFly();
		duck2.performQuack();
		duck2.swim();
		System.out.println("----------");
		duck3.display();
		duck3.performFly();
		duck3.performQuack();
		duck3.swim();

	}

}
