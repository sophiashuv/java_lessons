package task3;

import java.util.Random;

public class App {

	public static void main(String[] args) {

		ArrayList arr = new ArrayList();
		
		System.out.println("Try add(value): ");
		for (int i  = 0; i < 10 ; i++) {
			arr.add(randint(10));
			System.out.println(arr.toString());
		}
		
		System.out.println("\nTry remove(value, index): ");
		int n = arr.getSize();
		for (int i = 0; i < n; i++) {
			arr.remove(0);
			System.out.println(arr.toString());
		}
		
		System.out.println("\nTry add(value, index): ");
		for (int i  = 0; i < 10 ; i++) {
			arr.add(randint(10), randint(10));
			System.out.println(arr.toString());
		}
	}
	
	static int randint(int max) {
		Random randomValue = new Random();
		return randomValue.nextInt(max) + 1;
	}
}