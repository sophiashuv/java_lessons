package task2_3;

import java.util.Scanner;

public class app {
	
	static void task2() {
		Scanner number = new Scanner(System.in);  
		System.out.println("Enter number");
		try {
			int num = number.nextInt();
			if(num % 2  ==  0) System.out.println("EVEN!");
			else System.out.println("ODD!"); 
			} catch ( java.util.InputMismatchException e) {
				System.out.println("You entered wrong number!");
		 }
	}
	
	static void task3() {
		Scanner number = new Scanner(System.in);  
		System.out.println("Enter numbers");
		try {
			int num1 = number.nextInt();
			int num2 = number.nextInt();
			System.out.println("Result: "+ (num1+num2));
			} catch ( java.util.InputMismatchException e) {
				System.out.println("You entered wrong numbers!");
		 }
	}
	

	public static void main(String[] args) {
		task2(); 
		task3();
				 
	}

}
