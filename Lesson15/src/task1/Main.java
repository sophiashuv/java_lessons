package task1;

import java.util.Scanner;

public class Main {

	private static Scanner sc;
	
	static void menu() {
		System.out.println("Enter 1 to add a club member;\nEnter 2 to add an animal to a person;\n"
				+ "Enter 3 to delete an animal from person;\nEnter 4 to delete Person from club;\n"
				+ "Enter 5 to dlete an animal from all people;\nEnter 6 to see all zooclub;\nEnter 7 to exit.");
	}

	public static void main(String[] args) {
		ZooClub zoo = new ZooClub();
		while (true) {
			menu();
			sc = new Scanner(System.in);
			switch (sc.nextInt()) {
			case 1: {
				zoo.addMember();
				break;
			}

			case 2: {
				zoo.addAnimalToMember();
				break;
			}

			case 3: {
				zoo.removeAnimal();
				break;
			}

			case 4: {
				zoo.removeMember();
				break;
			}

			case 5: {
				zoo.remoeAnimalFormAllMembers();
				break;
			}

			case 6: {
				zoo.displeyClub();
				break;
			}

			case 7: {
				System.exit(0);
			}

			default: {
				System.out.println("You entered wrong number!");
				break;
			}

			}
		}

	}
}
