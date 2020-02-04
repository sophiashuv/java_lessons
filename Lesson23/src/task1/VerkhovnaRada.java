package task1;

import java.util.ArrayList;
import java.util.Optional;


public class VerkhovnaRada {
	
	private ArrayList<Fraction> fractions = new ArrayList<>();
	
	public VerkhovnaRada() {}

	public int size() {
		return fractions.size();
	}
	
	public Optional <Fraction> getFraction(String fractionName) {
		return fractions.stream().filter(i -> i.getFractionName().equals(fractionName)).findFirst();
	}
	
	public void addFraction(Fraction fraction){
		fractions.add(fraction);
	    }

	public void deleteFraction(String fraction_name){
		Optional <Fraction> k = getFraction(fraction_name);
		k.ifPresent(f -> fractions.remove(f));
	    }
	
	public void clearFraction(String fraction_name){
		 Optional <Fraction> k = getFraction(fraction_name);
		 k.ifPresent(f -> f.clearFraction());
	}
		
	public void printFractions(){
		System.out.println("All fractions in VerkhovnaRada:\n");
		fractions.forEach((i) -> System.out.println(i.getFractionName()));
	    }

	public void printFraction(String fraction_name){
	    System.out.println(getFraction(fraction_name));
	    }

	public void addDeputy(Deputy deputy, String fraction_name){
		Optional <Fraction> k = getFraction(fraction_name);
		k.ifPresent(f -> f.addDeputy(deputy));
	    }

	public void deleteDeputy(String fraction_name, String deputy_name){
		Optional <Fraction> k = getFraction(fraction_name);
		k.ifPresent(f -> f.deleteDeputy(deputy_name));
	    }

	public void printFractionBribers(String fraction_name){
		Optional <Fraction> k = getFraction(fraction_name);
		k.ifPresent(f -> f.printBribers());
	    }

	public void printMainFractionBriber(String fraction_name){
		Optional <Fraction> k = getFraction(fraction_name);
		k.ifPresent(f -> f.printMaxBriber());
	    }
	
	public void printBribers(){
		fractions.forEach((i) -> printFractionBribers(i.getFractionName()));
	    }
	
	public void printMainBriber(){
		fractions.forEach((i) -> printMainFractionBriber(i.getFractionName()));
	}

	public void printhAllFractionDeputy(String fraction_name){
		Optional <Fraction> k = getFraction(fraction_name);
		k.ifPresent(f -> f.printAll());
	    }
}
