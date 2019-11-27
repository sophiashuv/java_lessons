package task2;

public class Coachbuilder {

	 protected String coachbuilder_type;
	 protected int coachbuilder_size;
	 
	 public Coachbuilder() {};

	 public Coachbuilder(String coachbuilder_type, int coachbuilder_size) {
		 this.coachbuilder_type = coachbuilder_type;
		 this.coachbuilder_size = coachbuilder_size;
	    }

	public String getCoachbuilder_type() {
		return coachbuilder_type;
	}

	public void setCoachbuilder_type(String coachbuilder_type) {
		this.coachbuilder_type = coachbuilder_type;
	}

	public int getCoachbuilder_size() {
		return coachbuilder_size;
	}

	public void setCoachbuilder_size(int coachbuilder_size) {
		this.coachbuilder_size = coachbuilder_size;
	}

	@Override
	public String toString() {
		return "Coachbuilder [coachbuilder_type=" + coachbuilder_type + ", coachbuilder_size=" + coachbuilder_size
				+ "]";
	}
	public void incr_size(int amount) {
		this.coachbuilder_size += amount;
	}
	public void decr_size(int amount) {
		this.coachbuilder_size -= amount;
	}
	 
}

