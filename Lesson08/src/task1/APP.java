package task1;

import java.util.Scanner;

import task1.Seasons;

public class APP {
	
	static void ts1() {
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
		else System.out.println("NON....");
	}
	
	static void ts2() {
		System.out.println("Please enter a season: ");
		Scanner scanner =  new Scanner(System.in);
		String s;
		s = scanner.next();
		int k = 0;
		Monthes val[] = Monthes.values();
		for(Seasons a: Seasons.values()) {
			if(a.name().equals(s.toUpperCase())) {
				k = a.ordinal();
				break;
			}
		}System.out.println(s + " monthes are: " + val[k*3].toString() + ", " 
				+ val[k*3+1].toString() + ", "+ val[k*3+2].toString() + ".");
	}
	
	static int days_am(Monthes s) {
		if(s.equals(Monthes.FEBRUARY)) return 28;
		else if(1 <= s.ordinal() && s.ordinal() <= 7) return 30 + s.ordinal()%2;
		else return 30 + (s.ordinal()+1)%2;
	}
	
	static void ts3() {
		System.out.println("Please enter a days amount: ");
		Scanner scanner =  new Scanner(System.in);
		int s;
		s = scanner.nextInt();
		for(Monthes a: Monthes.values()) {
			if(s == days_am(a)) System.out.println(a);
		}
	}
	
	static void ts6() {
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
				}	
		}
	}
	
	public static void main(String[] args) {
		System.out.println("1: ");
		ts1();
		System.out.println("2: ");
		ts2();
		System.out.println("3: ");
		ts3();
		System.out.println("6, 7: ");
		ts6();
}
}
