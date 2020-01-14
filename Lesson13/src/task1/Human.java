package task1;

import java.util.Scanner;

public abstract class Human {
	protected int weight;
	protected int height;
	private Scanner myObj;

	public Human() {
	    weight = 0;
	    height = 0;
	}
	
	public Human(int _weight, int _height) {
	    weight = _weight;
	    height = _height;
	}
	
	public void inputHuman() {
	    myObj = new Scanner(System.in);
	    System.out.println("Enter weight: ");
	    weight = myObj.nextInt();
	    System.out.println("Height: ");
	    height = myObj.nextInt();
	}
}
