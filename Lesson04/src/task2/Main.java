package task2;

public class Main {
	public static void main(String[] args) {
		Car car = new Car();
		Wheel wheel = new Wheel("good", 30);
		car.setCar_brand("Audi");
		car.setCar_price(37.55);
		car.setWheel(wheel);
		car.getCar_price();
		System.out.println(car.toString());
	}
}

