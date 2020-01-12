package task2;

import java.util.Random;

public class Wheel {
	private int diameter;
	private String material;
	
	public Wheel() {
		diameter = randint(50);
		material = randmaterial();
	}
	
	public Wheel(int _diameter, String _material) {
		diameter = _diameter;
		material = _material;
	}
	
	public String toString() {
		return "; Wheel Diameter = " + diameter + "; Wheel Material = " + material + "; ";
	}
	
	static int randint(int max) {
		Random randomValue = new Random();
		return randomValue.nextInt(max) + 1;
	}
	
	static String randmaterial() {
		String arr[] = {"Leather", "Not Leathet", "Completely not leather"};
		return arr[randint(3)-1];
	}
}
