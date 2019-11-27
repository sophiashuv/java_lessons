package task3;

public class Main {
	
	public static void main(String[] args) {
		Animal animal = new Animal("Leotard", 20, 7);
		
		System.out.println("Animal name = " + animal.getName() + ", Animal speed = " + animal.getSpeed() + " km/hour, Animal age = " +  animal.getAge() + " years old.");
		animal.setName("Bull");
		animal.setSpeed(2);
		animal.setAge(14);
		System.out.println("----------------------------------------------");
		System.out.println("Animal name = " + animal.getName() + ", Animal speed = " + animal.getSpeed() + " km/hour, Animal age = " +  animal.getAge() + " years old.");
	}
}

