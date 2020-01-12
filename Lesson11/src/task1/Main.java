package task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Integer arr[] = new Integer[randint(50)];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = randint(1000);
		}
		System.out.println("ARRAY: \n" + Arrays.toString(arr) + "\n");
		Arrays.sort(arr);
		System.out.println("Sorted array: \n" + Arrays.toString(arr) + "\n");
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("Sorted array in descending order: \n" + Arrays.toString(arr) + "\n");
	}

	static int randint(int max) {
		Random randomValue = new Random();
		return randomValue.nextInt(max + 1);
	}
}
