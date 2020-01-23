public class Main {
	
	public static void main(String[] args) {
		MyMap <String, Integer>myMap = new MyMap<String, Integer>("value1", 1);
		myMap.addNewEntry("value2", 2);
		myMap.addNewEntry("value3", 3);
		myMap.addNewEntry("value4", 4);
		myMap.addNewEntry("value5", 5);
		myMap.addNewEntry("value6", 6);
		myMap.addNewEntry("value7", 7);
		
		System.out.println(myMap.toString());
		System.out.println(myMap.keysSet());
		System.out.println(myMap.valuesList());
		myMap.removeKey("value4");
		System.out.println(myMap.toString());
		myMap.removeValue(6);
		System.out.println(myMap.toString());
	}
}
