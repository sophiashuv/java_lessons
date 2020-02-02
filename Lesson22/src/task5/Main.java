package task5;

public class Main {
	public static void main(String[] args) {
		Amphibia eat = () -> System.out.println("I'm Amphibia - I'm eating.");
		Amphibia sleep = () -> System.out.println("I'm Amphibia - I'm sleeping.");
		Amphibia swim = () -> System.out.println("I'm Amphibia - I'm swimming.");
		Amphibia walk = () -> System.out.println("I'm Amphibia - I'm walking.");
		
		eat.print();
		sleep.print();
		swim.print();
		walk.print();
	}
}
