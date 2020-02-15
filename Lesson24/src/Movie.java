import java.util.Scanner;

public class Movie implements Comparable<Movie>{
	private String title;
	private Time duration;
	
	public Movie() throws WrongTimeException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Movie title: ");
		this.title = sc.nextLine();
		System.out.print("Enter Movie duration: ");
		this.duration = new Time();
	}
	
	public Movie( String title, Time duration) {
		this.title = title;
		this.duration = duration;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Time getDuration() {
		return duration;
	}
	
	public void setDuration(Time duration) {
		this.duration = duration;
	}
	
	public boolean equals(Movie m) {
		return title.equalsIgnoreCase(m.title) && duration.equals(m.getDuration());
	}
	
	@Override
	public String toString() {
		return "Movie: " + title + " - " + duration;
	}
	
	@Override
	public int compareTo(Movie m) {
		if(title.compareTo(m.getTitle())!= 0 )  return title.compareTo(m.getTitle());
		else return duration.compareTo(m.getDuration());
	}
}
