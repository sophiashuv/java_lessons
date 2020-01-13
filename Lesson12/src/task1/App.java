package task1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		System.out.println("Enter 1 to see task 1!");
		System.out.println("Enter 2 to see task 2!");
		Scanner scanner = new Scanner(System.in);
		switch (scanner.nextInt()) {
		case 1: { 
			task_1();
			break;
		} case 2: {
			task_2();
			break;
		} default: {
			System.out.println("You entered wrong number!");
			break;
			}
		}
	}
	
	static void task_1() {
		System.out.println("TASK 1:\n");
		ArrayList <Auto> autosList = new ArrayList<Auto>(); 
		int k = randint(5);
		for (int i = 0; i < k; i++) {
			ArrayList <Auto> autosList1 = new ArrayList<Auto>();
			for (int j = 0; j < k; j++) autosList1.add(new Auto());
			autosList.addAll(autosList1);
		} System.out.println(autosList);
	}
	
	static void task_2() {
		System.out.println("TASK 2:\n");
		int k = randint(5);
		ArrayList <Auto> autoList = new ArrayList <Auto>();
		Auto auto = new Auto();
		for (int i = 0; i < k; i++) autoList.add(auto);
		System.out.println(autoList);
	}
	
	static int randint(int max) {
		Random randomValue = new Random();
		return randomValue.nextInt(max) + 1;
	}
}

