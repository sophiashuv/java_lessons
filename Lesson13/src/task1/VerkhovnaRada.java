package task1;

import java.util.ArrayList;


public class VerkhovnaRada {
	
	private ArrayList<Fraction> fractions = new ArrayList<>();
	
	public VerkhovnaRada() {}

	public int size() {
	    return fractions.size();
	}
	
	public Fraction getFraction(String fractionName) {
	    Fraction is = new Fraction();
	    for (Fraction i :fractions) if (i.getFractionName().equals(fractionName)) is = i;
	    return is;
	}
	
	public void addFraction(Fraction fraction){
	    fractions.add(fraction);
	}

	public void deleteFraction(String fraction_name){
	    fractions.remove(getFraction(fraction_name));
	}
	
	public void clearFraction(String fraction_name){
	    getFraction(fraction_name).clearFraction();
	}

	public void printFractions(){
	    System.out.println("All fractions in VerkhovnaRada:\n");
	    for (Fraction i :fractions) System.out.println(i.getFractionName());
	}

	public void printFraction(String fraction_name){
	    System.out.println(getFraction(fraction_name));
	}

	public void addDeputy(Deputy deputy, String fraction_name){
	    getFraction(fraction_name).addDeputy(deputy);
	}

	public void deleteDeputy(String fraction_name, String deputy_name){
	    getFraction(fraction_name).deleteDeputy(deputy_name);
	}

	public void printFractionBribers(String fraction_name){
	    getFraction(fraction_name).printBribers();
	}

	public void printMainFractionBriber(String fraction_name){
	    getFraction(fraction_name).printMaxBriber();
	}
	
	public void printBribers(){
	    for (Fraction i :fractions) printFractionBribers(i.getFractionName());
	}
	
	public void printMainBriber(){
	    for (Fraction i :fractions) printMainFractionBriber(i.getFractionName());
	}

	public void printhAllFractionDeputy(String fraction_name){
	    getFraction(fraction_name).printAll();
	}
}
