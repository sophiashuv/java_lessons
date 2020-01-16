package task2;

import java.util.Scanner;

public class Tovar{
	private String name;
	private int length;
	private int width;
	private int weight;
	private Scanner sc;

	public Tovar(String _name, int _length, int _width, int _weight) {
		name = _name;
	    length = _length;
	    width = _width;
	    weight = _weight;
	    }
	
	public Tovar() {
	    sc = new Scanner(System.in);
		System.out.println("Name:");
	    name = sc.nextLine();
    	System.out.println("Length:");
		length = sc.nextInt();
		System.out.println("Width:");
		width = sc.nextInt();
		System.out.println("Weight:");
	    weight = sc.nextInt();
	    }

	public String getName() {
		return name;
	    }

	public void setName(String name) {
	    this.name = name;
	    }

	public int getLength() {
	    return length;
	  	}

	public void setLength(int length) {
	    this.length = length;
	  	}

	public int getWidth() {
	    return width;
	  	}

	public void setWidth(int width) {
	    this.width = width;
	  	}

	public int getWeight() {
	    return weight;
	  	}

	public void setWeight(int weight) {
	    this.weight = weight;
	  	}

	@Override
	public String toString() {
	    return "Name = " + name +", length = " + length +", width = " + width + ", weight = " + weight;
	    }
	
	}
