import java.util.Scanner;

public class Seance implements Comparable<Seance>{
	
    private Movie movie;
	private Time startTime;
	private Time endTime;
	
	public Seance() throws WrongTimeException {
		this.movie = new Movie();
		System.out.println("Enter start Time:");
		this.startTime = new Time();
		this.endTime = Time.sum(startTime, movie.getDuration());
	}
	
	public Seance (Movie movie, Time startTime) throws WrongTimeException {
		this.movie = movie;
		this.startTime = startTime;
		this.endTime = Time.sum(startTime, movie.getDuration());
	}
	
	public Seance (Movie movie) throws WrongTimeException {
		this.movie = movie;
		this.startTime = new Time(0,0);
		this.endTime = new Time(0, 0);
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}
	
	public boolean equals(Seance s) {
		return movie.equals(s.movie);
	}
	
	public boolean equal(Seance s) {
		return movie.equals(s.movie) && startTime.equals(s.startTime) && endTime.equals(s.endTime);
	}
	
	@Override
	public String toString() {
		return movie + " (startTime:" + startTime + ", endTime:" + endTime + ")";
	}
	
	@Override
	public int compareTo(Seance s) {
		if(this.startTime.compareTo(s.getStartTime())!= 0 ) return this.startTime.compareTo(s.getStartTime());
		else return this.movie.compareTo(s.getMovie());
	}	
}
