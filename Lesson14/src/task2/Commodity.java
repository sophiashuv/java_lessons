package task2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Commodity {
	ArrayList<Tovar> tovars = new ArrayList<>();
	private Scanner sc;
	private Scanner sc2;
	private Scanner sc3;
	
    public String names() {
	    String all_names = "";
	    for(Tovar tovar: tovars) all_names += tovar.getName() + " ";
	    return all_names;
	    }
    
    public void add(){
        tovars.add(new Tovar());
        }
    
    public Tovar search_by_name(String name) {
    	Tovar new_tovar = new Tovar("", 0, 0, 0);
    	for(Tovar tovar: tovars) if(name.equalsIgnoreCase(tovar.getName())) new_tovar = tovar;
    	return new_tovar;	
        }

    public void delete(){
        System.out.println("Input name of Tovar to delete: (" + names() + ")");
        sc3 = new Scanner(System.in);
        String name = sc3.nextLine();
        tovars.remove(search_by_name(name));
    	}

    public void replace(){
    	System.out.println("Input name of Tovar to replace: ("+ names() + ")");
    	sc2 = new Scanner(System.in);
        String name = sc2.nextLine();
    	System.out.println("Input new tovar:");
    	Tovar new_tovar = new Tovar();
    	for(Tovar tovar: tovars) if(name.equalsIgnoreCase(tovar.getName())) {
    		tovar.setName(new_tovar.getName());
    		tovar.setLength(new_tovar.getLength());
    		tovar.setWidth(new_tovar.getWidth());
    		tovar.setWeight(new_tovar.getWeight());
    		}
    	System.out.println("Changed successfully!!!");
    	}
    
    public void sortByName(){
    	Collections.sort(tovars, new NameComparator());
    	}

    public void sortByLength(){
    	Collections.sort(tovars, new LengthComparator());
    	}

    public void sortByWidth(){
    	Collections.sort(tovars, new WidthComparator());
    	}

    public void sortByWeight(){
    	Collections.sort(tovars, new WeightComparator());
    	}

    public void printElement(){
      System.out.println("Input index of Tovar: (0 - "+(tovars.size()-1)+")");
      sc = new Scanner(System.in);
      int index = sc.nextInt();
      System.out.println(tovars.toArray()[index]);
      }
    
    @Override
	public String toString() {
    	String s = "";
    	for(Tovar tovar: tovars) s += tovar.toString() + "\n";
    	return s;
	    }
    
    
}