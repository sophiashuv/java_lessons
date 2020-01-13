package task2;

import task2.Seasons;

public enum Monthes {
	DECEMBER,
	JANUARY,
	FEBRUARY,
	MARCH,
	APRIL,
	MAY,
	JUNE,
	JULY,
	AUGUST,
	SEPTEMBER,
	OCTOBER,
	NOVEMBER;
	
	int days;
	Seasons season;
	
	void Monthes(int _days, Seasons _season){
		days = _days;
		season = _season;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public Seasons getSeason() {
		return season;
	}

	public void setSeason(Seasons season) {
		this.season = season;
	}
	
}
