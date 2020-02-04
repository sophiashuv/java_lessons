package task2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

public class Commodity {
	ArrayList<Tovar> tovars = new ArrayList<>();
	private Scanner sc;
	private Scanner sc2;
	private Scanner sc3;
	//ch
    public String names() {
    	return tovars.stream().map(e -> e.getName()).reduce("", String::concat);
	    }
    
    public void add(){
        tovars.add(new Tovar());
        }
    //ch
    public Optional<Tovar> search_by_name(String name) {
    	return tovars.stream().filter(tovar -> name.equalsIgnoreCase(tovar.getName())).findFirst();
        }

    @SuppressWarnings("unlikely-arg-type")
	public void delete(){
        System.out.println("Input name of Tovar to delete: (" + names() + ")");
        sc3 = new Scanner(System.in);
        String name = sc3.nextLine();
        tovars.remove(search_by_name(name));
    	}
    //ch
    public void replace(){
    	System.out.println("Input name of Tovar to replace: ("+ names() + ")");
    	sc2 = new Scanner(System.in);
        String name = sc2.nextLine();
    	System.out.println("Input new tovar:");
    	Tovar new_tovar = new Tovar();
    	
    	tovars.stream().filter(tovar -> name.equalsIgnoreCase(tovar.getName())).findFirst().ifPresent(k -> {k.setName(new_tovar.getName());	
    	k.setLength(new_tovar.getLength());
    	k.setWidth(new_tovar.getWidth());
    	k.setWeight(new_tovar.getWeight());
    	});
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
    //ch
    @Override
	public String toString() {
    	return tovars.stream().map(e -> e.toString()).reduce("\n", String::concat);
	    }
    
    
}