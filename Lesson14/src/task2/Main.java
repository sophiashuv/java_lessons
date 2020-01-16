package task2;

import java.util.Scanner;

public class Main {
	
	private static Scanner scanner;

	private static void menu() {
	    System.out.println("Enter 1 to add product;\nEnter 2 to delete product;\nEnter 3 to replace product;"
	    		+ "\nEnter 4 to sort by name;\nEnter 5 to sort by length;\nEnter 6 to sort by width;"
	    		+ "\nEnter 7 to sort by weight;\nEnter 8 to output by index;\nEnter 9 to stop work.\n");
	    }
	
	public static void main(String[] args) {
		Commodity commodity = new Commodity();
		int n;
        scanner = new Scanner(System.in);
        boolean b = true;
        while (b) {
        	menu();
        	n = scanner.nextInt();
        	switch (n) {
        	case 1:
        		commodity.add();
        		System.out.println(commodity.toString());
        		break;
        	case 2:
        		commodity.delete();
        		System.out.println(commodity.toString());
        		break;
        	case 3:
        		commodity.replace();
        		System.out.println(commodity.toString());
        		break;
        	case 4:
        		commodity.sortByName();
        		System.out.println(commodity.toString());
        		break;
        	case 5:
        		commodity.sortByLength();
        		System.out.println(commodity.toString());
        		break;
        	case 6:
        		commodity.sortByWidth();
        		System.out.println(commodity.toString());
        		break;
        	case 7:
        		commodity.sortByWeight();
        		System.out.println(commodity.toString());
        		break;
        	case 8:
        		commodity.printElement();
        		break;	
        	case 9:
        		System.out.println("Exit!");
        		System.exit(0);
         
        	default:
        		System.out.println("Wrong input!");
        		break;
        		}
        	}
        }
	}