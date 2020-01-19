import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
	public static void main(String[] args) {
		try {
			Class<?> targetClass = Class.forName("Human");
			System.out.println("Class: " + targetClass.getClass());
			System.out.println("Class name: " + targetClass.getName());
			System.out.println("MODIFIER: " + Modifier.toString(targetClass.getModifiers()));
		    System.out.println("PACKAGE: " + targetClass.getPackage());
			System.out.println("SUPERCLASS: " + targetClass.getSuperclass());
			Field[] fields = targetClass.getDeclaredFields();
			System.out.println("-----------------------------------------------------------------");
			System.out.print("FIELDS: ");
			for (Field field : fields) {
				System.out.print(field + "  ");
				}
			System.out.println("\nFIELDS AMOUNT: " + fields.length);
			System.out.println("PUBLIC FIELDS: ");
			Field[] publicFields = targetClass.getFields();
			for (Field field : publicFields) {
				System.out.print(field + "  ");
				}
			System.out.println("PUBLIC FIELDS AMOUNT: " + publicFields.length);
			System.out.println("-----------------------------------------------------------------");
			System.out.print("CONSTRUCTORS: ");
			Constructor[] constructors = targetClass.getConstructors();
			for (Constructor constructor : constructors) {
				System.out.print(constructor + "  ");
				}
			System.out.println("\nCONSTRUCTORS AMOUNT: " + constructors.length);
			System.out.println("-----------------------------------------------------------------");
			System.out.println("METHODS: ");
			Method[] methods = targetClass.getMethods();
			for (Method method : methods) {
				System.out.println(method );
				}
			System.out.println("METHODS AMOUNT: " + methods.length);
			System.out.println("-----------------------------------------------------------------");
			System.out.println("New human: ");
			Constructor<?> constructor = targetClass.getConstructor(String.class, int.class);
			Human humanl = (Human) constructor.newInstance("Ivan", 13);
			System.out.println(humanl);
			System.out.println("Change name:");
			Method method = targetClass.getMethod("setName", String.class);
			method.invoke(humanl, "Max");
			System.out.println(humanl);
			} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			}
		catch (NoSuchMethodException e) {
			e.printStackTrace();
			} 
		catch (SecurityException e) {
			e.printStackTrace();
			} 
		catch (InstantiationException e) {
			e.printStackTrace();
			} 
		catch (IllegalAccessException e) {
			e.printStackTrace();
			} 
		catch (IllegalArgumentException e) {
			e.printStackTrace();
			} 
		catch (InvocationTargetException e) {
			e.printStackTrace();
			} 
		}
	}
