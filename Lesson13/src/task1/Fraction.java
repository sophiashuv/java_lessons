package task1;

import java.util.ArrayList;
import java.util.Scanner;


public class Fraction {
	ArrayList<Deputy> fraction = new ArrayList<Deputy>();
	private String fractionName;
	private Scanner myObj;

	public Fraction() {
	    fractionName = "";
	    }
	
	public Fraction(String _fractionName) {
	    fractionName = _fractionName;
	    }
	
	public Deputy getDeputy(String deputyName) {
		Deputy is = new Deputy();
		for (Deputy i :fraction) if (i.getDeputyName() == deputyName) is = i;
		return is;	
		}
	
	public void inputFraction() {
		myObj = new Scanner(System.in);
	    System.out.println("Enter fractionName: ");
	    fractionName = myObj.nextLine();
	    }
	
	public String getFractionName() {
		return fractionName;
		}
	
	public void addDeputy(Deputy deputy) {
		fraction.add(deputy);
		}
	
	public void deleteDeputy(String deputyName){
		fraction.remove(getDeputy(deputyName));
		}
	
	public void printBribers(){
	    for (Deputy d :fraction) if(d.isBriber()) System.out.println(d);
	    }
	
	public void printMaxBriber() {
		Deputy maxBribe = new Deputy();
	    for (Deputy i :fraction) if (maxBribe.getBribeSize() < i.getBribeSize()) maxBribe = i;
	    System.out.println("Max briber: \n" + maxBribe.toString());
	    }
	
	public void printAll() {
		System.out.println("All deputies in fraction " + fractionName + ":\n");
		for (Deputy i :fraction) System.out.println(i.toString());
	    }
	
	public void clearFraction(){
	    fraction.clear();
	    }
}
