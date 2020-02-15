package task1;

import java.util.Scanner;

public class Animal {
	private String type;
	private String name;
	private Scanner sc;

	public Animal() {
		sc = new Scanner(System.in);
		System.out.print("Type: ");
		type = sc.nextLine();
    	    	System.out.print("Name: ");
    	    	name = sc.nextLine();
	}
	
	public Animal(String type, String name) {
		this.type = type;
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean equals(Animal animal) {
		return type == animal.type && name == animal.name;
	}

	@Override
	public String toString() {
		return "type = " + type + ", name = " + name;
	}
}
