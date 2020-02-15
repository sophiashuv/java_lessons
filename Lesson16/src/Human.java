
public class Human implements Comparable<Human>{
	private String name;
	private int age;
	
	public Human() {
		name = "";
		age = 0;
	}
	
	public Human(String _name, int _age) {
		name = _name;
		age = _age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int compareTo(Human human) {
		if (age == human.getAge()) return name.compareTo(human.getName());
		else return age - human.getAge();
	}

	@Override
	public String toString() {
	    	return "Name = " + name + ", " +"age = " + age +"\n";
	  }
}
