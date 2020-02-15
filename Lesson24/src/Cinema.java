import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class Cinema {
	
	TreeMap<Days, Schedule>  schedule = new TreeMap<>();
	ArrayList<Movie> moviesLibrary = new ArrayList<>();
	Time open;
	Time close;
	
	public Cinema() throws WrongTimeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the time when the cinema will be opened!");
		this.open = new Time();
		System.out.println("Enter the time when the cinema will be closed!\n");
		this.close = new Time();
	}
	
	public void addMovie() throws WrongTimeException {
		Movie mov = new Movie();
		moviesLibrary.add(mov);	
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public boolean checkDay(String day) {
		boolean checkDay = false;
		for(Days a: schedule.keySet()) if (a.equals(day.toUpperCase())) checkDay = true;	
		return checkDay;	
	}
	
	public boolean checkMovie(Movie mov) {
		boolean checkMovie = false;
		for(Movie a: moviesLibrary) if (a.equals(mov)) checkMovie = true;	
		return checkMovie;	
	}
	
	public void addSeance() throws WrongTimeException {
		boolean checkDay = false, checkMovie = false;
		System.out.println("Enter the day of week:");
		Scanner sc = new Scanner(System.in);
		String dayOfWeek = sc.next();
		Seance newSeance = new Seance();
		for(Days a: Days.values()) if(a.name().equals(dayOfWeek.toUpperCase())) checkDay = true;
		for(Movie mov: moviesLibrary) if (newSeance.getMovie().equals(mov)) checkMovie = true;
		if(checkDay && checkMovie) {
			if(checkDay(dayOfWeek)) schedule.get(Days.valueOf(dayOfWeek.toUpperCase())).addSeance(newSeance);
			else schedule.put(Days.valueOf(dayOfWeek.toUpperCase()), new Schedule(newSeance));		
		} else 
			System.out.println("You entered wrong day of week, or movie is not in moviesLibrary");
	}
	
	public void removeMovie() throws WrongTimeException {
		System.out.println("Enter Movie to remove:");
		Movie mov = new Movie();
		Iterator<Movie> itr = moviesLibrary.iterator();            
		while(itr.hasNext()){
			Movie a = itr.next();
		    if(a.equals(mov)) itr.remove();
		}
		Seance sea = new Seance(mov);
		for(Days day: schedule.keySet()) schedule.get(day).removeSeance(sea);
	}
	
	public void removeSeance () throws WrongTimeException {
		System.out.println("Enter Seance to remove:");
		Seance sea = new Seance();
		System.out.println("Enter day of week:");
		Scanner sc = new Scanner(System.in);
		String dayOfWeek = sc.next();
		schedule.get(Days.valueOf(dayOfWeek.toUpperCase())).removeSeances(sea);
		//else System.out.println("You entered wrong day of week, or movie is not in moviesLibrary");	
	}

	@Override
	public String toString() {
		return "Cinema Schedule:\n" + schedule + "\nMoviesLibrary:" + moviesLibrary + "\n\nopen: " + open + ", close: "
				+ close;
	}
}
