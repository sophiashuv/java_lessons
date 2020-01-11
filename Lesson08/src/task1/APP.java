package task1;

import java.util.Scanner;

import task1.Seasons;
import task1.WrongInputConsoleParametersException;


public class APP {
	
	static void menu() {
		System.out.println("Press 1 to check if a month is present:");
		System.out.println("Press 2 to see all months of this season:");
		System.out.println("Press 3 to display all months with the entered number of days:");
		System.out.println("Press 4 to display next and previous seasons of the year:");
	}
	
	static void ts1() throws WrongInputConsoleParametersException {
		Scanner scanner =  new Scanner(System.in);
		boolean k = false;
		String s;
		System.out.println("Please enter a month: ");
		s = scanner.next();
		for(Monthes a: Monthes.values()) {
			if(a.name().equals(s.toUpperCase())) {
				k = true;
				break;
			}
		}
		if(k == true) System.out.println("GOOD");
		else {
			String message = "Wrong input!";
			throw new WrongInputConsoleParametersException(message);
		}
	}
	
	static void ts2() throws WrongInputConsoleParametersException {
		System.out.println("Please enter a season: ");
		Scanner scanner =  new Scanner(System.in);
		String s;
		s = scanner.next();
		int k = 0;
		boolean b = true;
		Monthes val[] = Monthes.values();
		for(Seasons a: Seasons.values()) {
			if(a.name().equals(s.toUpperCase())) {
				k = a.ordinal();
				b = true;
				break;
			} else b = false;
		} if(b) System.out.println(s + " monthes are: " + val[k*3].toString() + ", " 
				+ val[k*3+1].toString() + ", "+ val[k*3+2].toString() + ".");
		else {
			String message = "Wrong input!";
			throw new WrongInputConsoleParametersException(message);
		}
	}
	
	static int days_am(Monthes s) {
		if(s.equals(Monthes.FEBRUARY)) return 28;
		else if(1 <= s.ordinal() && s.ordinal() <= 7) return 30 + s.ordinal()%2;
		else return 30 + (s.ordinal()+1)%2;
	}
	
	static void ts3() throws WrongInputConsoleParametersException {
		System.out.println("Please enter a days amount: ");
		Scanner scanner =  new Scanner(System.in);
		int s;
		boolean b = true;
		s = scanner.nextInt();
		for(Monthes a: Monthes.values()) {
			if(s == days_am(a)) {
				System.out.println(a);
				b = true;
			} else b = false;
		}
		if (!b) {
			String message = "Wrong input!";
			throw new WrongInputConsoleParametersException(message);
		}
	}
	
	static void ts6() throws WrongInputConsoleParametersException {
		System.out.println("Please enter a season: ");
		Scanner scanner =  new Scanner(System.in);
		String s;
		s = scanner.next();
		Seasons val[] = Seasons.values();
		for(Seasons a: Seasons.values()) {
			if(a.name().equals(s.toUpperCase())) {
				if(a.ordinal() == 0) {
					System.out.println(val[a.ordinal()+1]);
					System.out.println(val[3]);
				}else if(a.ordinal() == 3) {
					System.out.println(val[0]);
					System.out.println(val[a.ordinal()-1]);
				}else {
					System.out.println(val[a.ordinal()+1]);
					System.out.println(val[a.ordinal()-1]);
				}
			} else {
				String message = "Wrong input!";
				throw new WrongInputConsoleParametersException(message);
			}	
		}
	}
	
	public static void main(String[] args) throws WrongInputConsoleParametersException{
		menu();
		Scanner sc = new Scanner(System.in);
		
		switch (sc.next()) {
		case "1": {
			System.out.println("1: ");
			ts1();
			break;
		}
		case "2": {
			System.out.println("2: ");
			ts2();
			break;
		}
		case "3": {
			System.out.println("3: ");
			ts3();
			break;
		}
		case "4": {
			System.out.println("6, 7: ");
			ts6();
			break;
			}
		}
		}
	}
