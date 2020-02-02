package task3;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		View flMax = () -> "in scientific notation float MAX_VALUE: " + Float.MAX_VALUE ;
		View flMin = () -> "in scientific notation float MIN_VALUE: " + Float.MIN_VALUE ;
		View dbMax = () -> "in scientific notation double MAX_VALUE: " + Double.MAX_VALUE ;
		View dbMin = () -> "in scientific notation double MIN_VALUE: " + Double.MIN_VALUE ;
		
		List <View> lst = Arrays.asList(flMax, flMin, dbMax, dbMin);
		lst.forEach(x -> System.out.println(x.print()));	
	}	
}
