package task2;

public class SteeringWheel {

	protected String steeringwheel_type;
	protected double steeringwheel_radius;
	 
	public SteeringWheel() {};

	public SteeringWheel(String steeringwheel_type, double steeringwheel_radius) {
		this.steeringwheel_type = steeringwheel_type;
		this.steeringwheel_radius = steeringwheel_radius;
	    }

	public String getSteeringwheel_type() {
		return steeringwheel_type;
	}

	public void setSteeringwheel_type(String steeringwheel_type) {
		this.steeringwheel_type = steeringwheel_type;
	}

	public double getSteeringwheel_radius() {
		return steeringwheel_radius;
	}

	public void setSteeringwheel_radius(double steeringwheel_radius) {
		this.steeringwheel_radius = steeringwheel_radius;
	}

	@Override
	public String toString() {
		return "SteeringWheel [steeringwheel_type=" + steeringwheel_type + ", steeringwheel_radius="
				+ steeringwheel_radius + "]";
	}	
	public void incr_radius(int amount) {
		this.steeringwheel_radius += amount;
	}
	public void decr_size(int amount) {
		this.steeringwheel_radius -= amount;
	}
}