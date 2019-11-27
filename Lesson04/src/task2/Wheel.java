package task2;

public class Wheel {

	protected String wheel_type;
	protected double wheel_radius;
	 
	public Wheel() {};

	public Wheel(String wheel_type, double wheel_radius) {
		this.wheel_type = wheel_type;
		this.wheel_radius = wheel_radius;
	    }

	public String getWheel_type() {
		return wheel_type;
	}

	public void setWheel_type(String wheel_type) {
		this.wheel_type = wheel_type;
	}

	public double getWheel_radius() {
		return wheel_radius;
	}

	public void setWheel_radius(double wheel_radius) {
		this.wheel_radius = wheel_radius;
	}

	@Override
	public String toString() {
		return "Wheel [wheel_type=" + wheel_type + ", wheel_radius=" + wheel_radius + "]";
	}	 
	public void incr_radius(int amount) {
		this.wheel_radius += amount;
	}
	public void decr_size(int amount) {
		this.wheel_radius -= amount;
	}

}

