package task2;
import java.util.Comparator;

public class LengthComparator implements Comparator<Tovar> {

	@Override
	public int compare(Tovar o1, Tovar o2) {
		return o1.getLength() - o2.getLength();
	}
}
