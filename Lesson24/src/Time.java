import java.util.Scanner;

public class Time implements Comparable<Time>{
	private int min;
	private int hour;
	
	public Time() throws WrongTimeException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter hour: ");
		int hour = sc.nextInt();
		System.out.print("Enter min: ");
		int min = sc.nextInt();
		setMin(min);
		setHour(hour);
	}

	public Time(int hour, int min) throws WrongTimeException {
		setMin(min);
		setHour(hour);
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) throws WrongTimeException {
		if (min >= 0 && min < 60) this.min = min;
		else throw new WrongTimeException();
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) throws WrongTimeException {
		if (hour >= 0 && hour < 24) this.hour = hour;
		else throw new WrongTimeException();
	}
	
	public static Time sum(Time time1, Time time2) throws WrongTimeException {
		int hour = time1.getHour() + time2.getHour();
		int min = time1.getMin() + time2.getMin();
		if (min >= 60) {
			hour += 1;
			min -= 60;
		} if (hour >= 24) hour -= 24;
		return new Time(hour, min);
	}
	
	public boolean equals(Time t) {
		if (hour == t.getHour()) return min == t.getMin();
		else return false;
	}

	@Override
	public String toString() {
		return hour + ":" + min;
	}
	
	@Override
	public int compareTo(Time t) {
		return hour * 60 + min - t.getHour() * 60 - t.getMin();	
	}
	
}
