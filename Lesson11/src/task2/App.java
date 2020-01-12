package task2;

import java.util.Arrays;
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
		Auto autos[][] = new Auto[randint(5)][randint(5)];
		for (int i = 0; i < autos.length; i++) 
			for (int j = 0; j < autos[i].length; j++) 
				autos[i][j] = new Auto();
		System.out.println(Arrays.deepToString(autos));
	}
	
	static void task_2() {
		System.out.println("TASK 2:\n");
		Auto auto = new Auto();
		Auto autos[] = new Auto[randint(5)];
		Arrays.fill(autos, auto);
		System.out.println(Arrays.deepToString(autos));
	}
	
	static int randint(int max) {
		Random randomValue = new Random();
		return randomValue.nextInt(max) + 1;
	}
}
