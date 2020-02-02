import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;

public class Main {

	public static void main(String[] args) throws IOException {
		
		String annotations = getAnnoationValue(Car.class);
		System.out.println(annotations);
		writeListInFile(annotations, new File("Annotation.txt"));
	}

	public static String getAnnoationValue(Class<?> SomeClass) throws IOException {
		Field[] fields = SomeClass.getDeclaredFields();
		String res = "";
		for (Field field: fields) {	
			if (field.getAnnotation(MyAnnotation.class) instanceof MyAnnotation) {
				res += field.getName() + " - " + field.getAnnotation(MyAnnotation.class).params() + "\n";	
			}
		}
		return res;
	}
	
	public static void writeListInFile(String res, File file) throws IOException {
		byte[] strToBytes = res.getBytes();
		Files.write(file.toPath(), strToBytes);
	}
	
}