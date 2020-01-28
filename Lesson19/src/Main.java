import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {

		public static void main(String[] args) throws Exception {

			File file = new File("Employee.txt");
			Employee employee = new Employee("Ivan", 7000);
			System.out.println("Before Serialization:");
			System.out.println(employee);
			
			System.out.println("After Serialization:");
			Methods.serialize(file, employee);
			System.out.println(Methods.deserealize(file));
			System.out.println();
			
			List<Employee> list = new ArrayList<>();
			list.add(employee);
			list.add(new Employee("Max", 6000));
			list.add(new Employee("Roman", 9000));
			list.add(new Employee("Sophia", 7000));
			list.add(new Employee("Arthur", 3000));
			
			System.out.println("Before Serialization:");
			for (Employee employee2 : list) System.out.println(employee2);
			
			Methods.serialize(file, (Serializable)list);
			List<Employee> listDeserialized = new ArrayList<Employee>();
			listDeserialized = (List<Employee>) Methods.deserealize(file);
			
			System.out.println("After Serialization:");
			for (Employee employee3 : listDeserialized) System.out.println(employee3);
		}
}