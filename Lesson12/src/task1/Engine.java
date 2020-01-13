package task1;

import java.util.Random;

public class Engine {
	int cylinders_amount;
	
	public Engine() {
		cylinders_amount = randint(15);
	}
	
	public Engine(int _cylinders_amount) {
		cylinders_amount = _cylinders_amount;
	}
	
	public String toString() {
		return "Engine cylinders amount = " + cylinders_amount;
	}
	
	static int randint(int max) {
		Random randomValue = new Random();
		return randomValue.nextInt(max) + 1;
	}
}
