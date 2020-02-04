package task1;

import java.util.ArrayList;
import java.util.Optional;
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
	
	public Optional <Deputy> getDeputy(String deputyName) {
		return fraction.stream().filter(i -> i.getDeputyName().equals(deputyName)).findFirst();
		}
	
	public void inputFraction() {
		myObj = new Scanner(System.in);
	    System.out.println("Enter fraction Name: ");
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
		fraction.stream().filter(d -> d.isBriber()==true).findAny().ifPresent(System.out::println);
	    }
	
	public void printMaxBriber() {
		Optional<Deputy> maxBribe = fraction.stream().max((e1, e2) -> e1.getBribeSize()-e2.getBribeSize());
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
