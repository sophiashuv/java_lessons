package task2;

import java.util.Random;

public class Coin {

	protected boolean value;
	
	public Coin() {
		Random rd = new Random(); // creating Random object
		 this.value = rd.nextBoolean();
	    }

	public boolean isValue() {
		return value;
	}

	@Override
	public String toString() {
		if (value == true) return "The coin shows Head.\n";
		else return "The coin shows Tail.\n";
	}
}

