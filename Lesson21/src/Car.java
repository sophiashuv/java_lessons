
public class Car {

	@MyAnnotation(params= "Car brand")
	private String brand;
	
	private double price;
	
	@MyAnnotation(params = "Car color")
	private String color;
	
	public Car(String brand, double price, String color) {
		super();
		this.brand = brand;
		this.setPrice(price);
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}