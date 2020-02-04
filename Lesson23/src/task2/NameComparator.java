package task2;

import java.util.Comparator;

public class NameComparator implements Comparator<Tovar>{
	
	@Override
	public int compare(Tovar o1, Tovar o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

