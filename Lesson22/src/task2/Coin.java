package task2;

import java.util.Random;

public class Coin {

	protected boolean value;
	
	public Coin() {
		Random rd = new Random(); 
		this.value = rd.nextBoolean();
	    }

	public boolean isValue() {
		return value;
	}	
}

