package task2;
import java.io.*; 
public class Main {

	public static void main(String[] args) throws Exception { 
		  File file = new File("/Users/sophiyca/eclipse-workspace/Lesson10/src/task2/text.txt"); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  String st;
		  char vowelArray[] = { 'a', 'o', 'e', 'y', 'i', 'u', 'A', 'O', 'E', 'Y', 'U'};
		  System.out.println("NEW TEXT:\n");
		  while ((st = br.readLine()) != null) {
			  for (int j = 0; j < vowelArray.length; j++) {
				  st = st.replace(vowelArray[j], '-');
				} System.out.println(st);
		  }
	  } 
	}
