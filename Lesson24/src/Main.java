import java.util.Scanner;

public class Main {
	
	static void menu() {
		System.out.println("Enter 1 to add a movie to movielibrary;");
		System.out.println("Enter 2 to add a new seance to the schedule;");
		System.out.println("Enter 3 to remove a movie from the movies library and the schedule;");
		System.out.println("Enter 4 to remove a movie from a schedule on a particular day of the week;");
		System.out.println("Enter 5 to see all cinema;");
		System.out.println("Enter 6 to exit.");
	}
	
	public static void main(String[] args) throws WrongTimeException {
		Cinema cinema = new Cinema();
		while(true) {
			boolean b = true;
	        while (b) {
	        	menu();
				switch (new Scanner(System.in).nextInt()) {
				case 1:
					cinema.addMovie();
					break;
				case 2: 
					cinema.addSeance();
					break;
				case 3 :
					cinema.removeMovie();
					break;
				case 4:
					cinema.removeSeance();
					break;
				case 5:
					System.out.println(cinema);
					break;
				case 6:
					System.out.println("Exit!");
	        		System.exit(0);
				default:
					System.exit(0);
				}
	        }
		}
	
	}

}