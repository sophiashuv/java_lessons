import java.io.Serializable;

public class Employee  implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	private static long idnum;
	private long id;
	private transient int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
		idnum++;
		this.id = idnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
}
