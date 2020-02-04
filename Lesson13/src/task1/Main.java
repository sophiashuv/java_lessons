package task1;

import java.util.Scanner;

public class Main {

	private static Scanner scanner;
	private static Scanner scanner1;
	private static Scanner scanner2;
	private static Scanner scanner3;
	private static Scanner scanner4;
	private static Scanner scanner5;

	static void menu() {
		System.out.println();
		System.out.println("Enter 1 to add deputy to fraction:\n" + 
				"Enter 2 to delete fraction: \n" + 
				"Enter 3 to output all fractions: \n" + 
				"Enter 4 to clear a fraction: \n" + 
				"Enter 5 to output a fraction: \n" + 
				"Enter 6 to add deputy to a fraction: \n" + 
				"Enter 7 delete deputy from a fraction: \n" + 
				"Enter 8 to output briberslist: \n" + 
				"Enter 9 to output all max bribers: \n");		
	}
	
	public static void main(String[] args) {
		VerkhovnaRada verkhovnaRada = new VerkhovnaRada();
		scanner = new Scanner(System.in);
		boolean k = true;
		while (k) {
			menu();
			switch (scanner.nextInt()) {
			case 1: {
				Fraction f = new Fraction();
				Deputy d = new Deputy();
				f.inputFraction();
				boolean b = true;
				while (b) {
					d.inputDeputy();
					f.addDeputy(d);
					System.out.println("Enter true, if you want to continue and false otherwise.");
					if (!scanner.nextBoolean()) b = false;
				}
				verkhovnaRada.addFraction(f);
				break;
			}
			case 2: {
				scanner1 = new Scanner(System.in);
				System.out.println("Enter fraction name: ");
				verkhovnaRada.deleteFraction(scanner1.nextLine());
				break;
			}
			case 3: {
				verkhovnaRada.printFractions();
				break;
			}
			case 4: {
				scanner2 = new Scanner(System.in);
				System.out.println("Enter fraction name: ");
				verkhovnaRada.clearFraction(scanner2.nextLine());
				break;
			}
			case 5: {
				scanner3 = new Scanner(System.in);
				System.out.println("Enter fraction name: ");
				verkhovnaRada.printhAllFractionDeputy(scanner3.nextLine());
				break;
			}
			case 6: {
				scanner4 = new Scanner(System.in);
				System.out.println("Enter fraction name: ");
				String name = scanner4.nextLine();
				if(verkhovnaRada.getFraction(name) != null) {
					Deputy d = new Deputy();
					d.inputDeputy();
					verkhovnaRada.addDeputy(d, name);
					break;
				}
			}
			case 7: {
				scanner5 = new Scanner(System.in);
				System.out.println("Enter fraction name: ");
				String fraction_name = scanner5.nextLine();
				System.out.println("Enter deputy name: ");
				String deputy_name = scanner5.nextLine();
				verkhovnaRada.deleteDeputy(fraction_name, deputy_name);
				break;
			}
			case 8: {
				verkhovnaRada.printBribers();
				break;
			}
			case 9: {
				verkhovnaRada.printMainBriber();
				break;
			}
			default: {
				System.out.println("Wrong input!");
				break;
			}
			}
		}
	}

}
