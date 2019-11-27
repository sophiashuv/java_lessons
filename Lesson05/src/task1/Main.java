package task1;

public class Main {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Cow cow = new Cow();
		Dog dog = new Dog();
		cat.voice();
		cow.voice();
		dog.voice();
		
		// task 3
		System.out.printf("in scientific notation float MAX_VALUE: %.18g\n", Float.MAX_VALUE );
		System.out.printf("in scientific notation double MAX_VALUE: %.18g\n", Double.MAX_VALUE );
		System.out.printf("in scientific notation float MIN_VALUE: %.18g\n", Float.MIN_VALUE );
		System.out.printf("in scientific notationbdouble MIN_VALUE: %.18g\n", Double.MIN_VALUE );
	}

}

