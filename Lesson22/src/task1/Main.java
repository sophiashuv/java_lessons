package task1;

public class Main {

	public static void main(String[] args) {
		Pet cow = () -> "I'm a cow - moo-moo!";
		Pet cat = () -> "I'm a cat - myu-myu!";
		Pet dog = () -> "I'm a dog - how-how!";

		System.out.println(cow.voice());
		System.out.println(cat.voice());
		System.out.println(dog.voice());
		
	}
}
