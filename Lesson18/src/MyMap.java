import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap <K, V> extends MyEntry<K,V> {
	private Map<K, V> myMap;
	
	public MyMap(K k, V v) {
		super(k, v);
		this.myMap = new HashMap<K, V>();
		this.myMap.put(k, v);	
	}
	
	public void addNewEntry(K k, V v) {
		myMap.put(k, v);
	}

	public void removeKey(K k) {
		myMap.remove(k);
	}

	public void removeValue(V v) {
		myMap.values().remove(v);	
	}
	
	public Set<K> keysSet() {
		return myMap.keySet();
	}
	
	public ArrayList<V> valuesList() {
		ArrayList<V> valueList = new ArrayList<V>(myMap.values());
		return valueList;
	}

	@Override
	public String toString() {
		return myMap.toString();
	}
}
