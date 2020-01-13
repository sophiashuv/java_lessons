package task1;

import java.util.Random;

import task1.Engine;
import task1.Wheel;

public class Auto {
	static int n = 0;
	int am;
	private int horse_power;
	private int year;
	private Wheel wheel;
	private Engine engine;
	
	public Auto() {
		horse_power = randint(250);
		year = randint(2020);
		wheel = new Wheel();
		engine = new Engine();
		n++;
		am = n;
	}
	
	public Auto(int _horse_power, int _year, Wheel _wheel, Engine _engine) {
		horse_power = _horse_power;
		year = _year;
		wheel = _wheel;
		engine = _engine;
		n++;
		am = n;
	}
	
	public String toString() {
		return "\n" + am + ") Horse power = " + horse_power + "; Year = " + year + wheel.toString() + engine.toString() + ".\n";
	}
	
	static int randint(int max) {
		Random randomValue = new Random();
		return randomValue.nextInt(max) + 1;
	}
}
