package task2;

import java.util.Scanner;
import java.util.ArrayList;


import task2.Seasons;
import task2.WrongInputConsoleParametersException;


public class App {
	
	static void menu() {
		System.out.println("Press 1 to check if a month is present:");
		System.out.println("Press 2 to see all months of this season:");
		System.out.println("Press 3 to display all months with the entered number of days:");
		System.out.println("Press 4 to display next and previous seasons of the year:");
	}
	
	static void ts1(ArrayList<Monthes> arrayListMonths) throws WrongInputConsoleParametersException {
		Scanner scanner =  new Scanner(System.in);
		
		boolean k = false;
		String s;
		System.out.println("Please enter a month: ");
		s = scanner.next();
		for(Monthes a: arrayListMonths) {
			if(a.name().equals(s.toUpperCase())) {
				k = true;
				break;
			}
		}
		if(k) System.out.println("GOOD");
		else {
			String message = "Wrong input!";
			throw new WrongInputConsoleParametersException(message);
		}
	}
	
	static void ts2(ArrayList<Seasons> arrayListSeasons) throws WrongInputConsoleParametersException {
		System.out.println("Please enter a season: ");
		Scanner scanner =  new Scanner(System.in);
		String s;
		s = scanner.next();
		int k = 0;
		boolean b = true;
		Monthes val[] = Monthes.values();
		for(Seasons a: arrayListSeasons) {
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
	
	static void ts3(ArrayList<Monthes> arrayListMonths) throws WrongInputConsoleParametersException {
		System.out.println("Please enter a days amount: ");
		Scanner scanner =  new Scanner(System.in);
		int s;
		boolean b = true;
		s = scanner.nextInt();
		for(Monthes a: arrayListMonths) {
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
	
	static void ts6(ArrayList<Seasons> arrayListSeasons) throws WrongInputConsoleParametersException {
		System.out.println("Please enter a season: ");
		Scanner scanner =  new Scanner(System.in);
		String s;
		s = scanner.next();
		Seasons val[] = Seasons.values();
		for(Seasons a: arrayListSeasons) {
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
		ArrayList<Monthes> arrayListMonths = new ArrayList<Monthes>();
		for (Monthes monthValue : Monthes.values()) {
			arrayListMonths.add(monthValue);
		}

		ArrayList<Seasons> arrayListSeasons = new ArrayList<Seasons>();
		for (Seasons seasonValue : Seasons.values()) {
			arrayListSeasons.add(seasonValue);
		}
		
		switch (sc.next()) {
		case "1": {
			System.out.println("1: ");
			ts1(arrayListMonths);
			break;
		}
		case "2": {
			System.out.println("2: ");
			ts2(arrayListSeasons);
			break;
		}
		case "3": {
			System.out.println("3: ");
			ts3(arrayListMonths);
			break;
		}
		case "4": {
			System.out.println("6, 7: ");
			ts6(arrayListSeasons);
			break;
			}
		}
		}
	}