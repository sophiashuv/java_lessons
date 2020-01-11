package task1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Check weather entered word is a Palindrome.
		System.out.println("Enter a 5-letter word: ");
		Scanner scanner = new Scanner(System.in);
		String word = scanner.next();
		int n = 5;
		boolean b = true;
		if (word.length() == n) {
			for (int i = 0; i < n/2; i++) if (word.toLowerCase().charAt(i) != word.toLowerCase().charAt(n - i - 1)) b = false;
			if(b) System.out.println("Palindrome!");
			else System.out.println("NOT a Palindrome!");
		} 
		else System.out.println("You need to enter a 5-letter word!");
	}
}