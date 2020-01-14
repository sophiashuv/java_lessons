package task1;

import java.util.Scanner;

public class Deputy extends Human {

	private String surname;
	private String name;
	private int age;
	private boolean bribeTaker;
	private int bribeSize = 0;
	private Scanner myObj;

	public Deputy() {
		super();
		surname = "";
		name = "";
		age = 0;
		bribeTaker = false;
	}

	public Deputy(String surname, String name, int age, int height, int weight, boolean bribeTaker) {
		super(weight, height);
		this.surname = surname;
		this.name = name;
		this.age = age;
		this.bribeTaker = bribeTaker;
	}
	
	public void inputDeputy() {
		myObj = new Scanner(System.in);
		System.out.println("Name: ");
	    name = myObj.nextLine();
	    System.out.println("Enter surname: ");
	    surname = myObj.nextLine();
	    System.out.println("Age: ");
	    age = myObj.nextInt(); 
	    inputHuman();
	    System.out.println("BribeTaker (true/false): ");
	    bribeTaker = myObj.nextBoolean(); 
	    if (bribeTaker) {
		    System.out.println("Bribe size: ");
		    bribeSize = myObj.nextInt(); 
	    }
	}
	
	public String getDeputyName() {
		return name + " " + surname;
	}
	
	public boolean isBriber() {
		return bribeTaker;
	}
	
	public int getBribeSize() {
		return bribeSize;
	}
	
	public void giveBribe(int bribe) {
		if(!bribeTaker) System.out.println("This deputy doesnt take bribes!");
		else {
			if (bribe > 5000) System.out.println("The police will imprison the deputy!");
			else bribeSize += bribe;
			}
		}
	
	public String bribeTakerToString() {
		if (bribeTaker) return "bribe taker";
		else return "NOT a bribe taker";
	}
	
	@Override
	public String toString() {
		return "name: " + surname + " " + name + ",\nage: " + age + ",\nheight: " + height + ",\nweight: " + weight
				+ ",\n" + bribeTakerToString() + ".\n";
	}
}
