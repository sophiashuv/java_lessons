package task2;

public class Car {
	protected String car_brand;
	protected double car_price;
	protected Coachbuilder coachbuilder;
	protected SteeringWheel steeringwheel;
	protected Wheel wheel;
	
	public Car() {};

	public Car(String car_brand, int car_price) {
		 this.car_brand = car_brand;
		 this.car_price = car_price;
	    }
	 
	 public Car(String car_brand, int car_price, Coachbuilder coachbuilder, SteeringWheel steeringwheel, Wheel wheel) {
	        this(car_brand, car_price);
	        this.coachbuilder = coachbuilder;
			this.steeringwheel = steeringwheel;
			this.wheel = wheel;
	    }

	public String getCar_brand() {
		return car_brand;
	}

	public void setCar_brand(String car_brand) {
		this.car_brand = car_brand;
	}

	public double getCar_price() {
		return car_price;
	}

	public void setCar_price(double car_price) {
		this.car_price = car_price;
	}

	public Coachbuilder getCoachbuilder() {
		return coachbuilder;
	}

	public void setCoachbuilder(Coachbuilder coachbuilder) {
		this.coachbuilder = coachbuilder;
	}

	public SteeringWheel getSteeringwheel() {
		return steeringwheel;
	}

	public void setSteeringwheel(SteeringWheel steeringwheel) {
		this.steeringwheel = steeringwheel;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	
	@Override
	public String toString() {
		return "Car [car_brand=" + car_brand + ", car_price=" + car_price + "]";
	}
	
	public void discount(double interest) {
		this.car_price -= car_price*interest/100;
	}
}

