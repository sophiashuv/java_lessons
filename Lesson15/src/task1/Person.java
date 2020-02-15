package task1;

import java.util.Scanner;

public class Person {

	private String name;
	private int age;
	private Scanner sc;
	
	public Person () {
		sc = new Scanner(System.in);
		System.out.print("Name: ");
	    	name = sc.nextLine();
    		System.out.print("Age: ");
    		age = sc.nextInt();
	}
	
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "name = " + name + ", age = " + age;
	}
}
