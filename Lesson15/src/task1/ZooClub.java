package task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ZooClub {
	Map<Person, List<Animal>> map = new HashMap<>();
	private Scanner sc;
	private Scanner sc2;
	private Scanner sc3;
	private Scanner sc4;
	
	public void addMember() {
		map.put(new Person(), new ArrayList<Animal>());
	}
	
	public void addAnimalToMember() {
		sc = new Scanner(System.in);
		System.out.println("Enter person name: ");
		String member = sc.nextLine();
		Animal animal = new Animal();
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().getName().equals(member)) next.getValue().add(animal);
		}	
	}
	
	public void removeAnimal() {
		sc2 = new Scanner(System.in);
		System.out.println("Enter member name: ");
		String member = sc2.nextLine();
		Animal animal = new Animal();
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().getName().equals(member)) {
				List<Animal> animals = next.getValue();
				Iterator<Animal> iter = animals.iterator();
				while (iter.hasNext()) {
					Animal nextAnimal = iter.next();
					if (nextAnimal.equals(animal)) iter.remove();
					}
				}
			}
		}
	
	public void removeMember () {
		System.out.println("Enter name: ");
		sc3 = new Scanner(System.in);
		String name = sc3.nextLine();	
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {	
			Entry<Person, List<Animal>> next = iterator.next();
			if(next.getKey().getName().equals(name)) iterator.remove();
			}
		}
	
	public void remoeAnimalFormAllMembers() {
		System.out.println("Enter type of Animal: ");
		sc4 = new Scanner(System.in);
		String type = sc4.nextLine();
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			List<Animal> animals = next.getValue();
			Iterator<Animal> iter = animals.iterator();
			while(iter.hasNext()) {
				Animal current = iter.next();
				if(current.getType().equals(type)) iter.remove();
			}	
		}	
	}
	
	public void displeyClub() {
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			System.out.println("Person " + next.getKey()  + " / club: " + next.getValue());
		}	
	}
}
