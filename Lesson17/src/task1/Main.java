package task1;

public class Main {

	public static void main(String[] args) {
		Number[] array = RandomArray();
		ForwardIterator(array);
		System.out.println();
		BackwardIterator(array);
		System.out.println();
		AnonymousIterator(array);
		System.out.println();
		LocalIterator(array);
		System.out.println();
		StaticIterator(array);
		
		}
	
	public static void ForwardIterator(Number[] array) {
		System.out.println("\nArray with odd elements replaced by 0: ");
		Collection collection = new Collection(array);
		Collection.ForwardIterator iteratorForward = collection.createForwardIterator();
		while (iteratorForward.hasNext()) {
			Number next = iteratorForward.next();
			System.out.print(next + " ");
		}
	}
	
	public static void BackwardIterator(Number[] array) {
		System.out.println("Array from last element to first with step: 2:");
        Collection collection = new Collection(array);
		Collection.BackwardIterator iteratorBackward = collection.createBackwardIterator();
		while (iteratorBackward.hasNext()) {
			Number next = iteratorBackward.next();
			System.out.print(next + " ");
		}
	}
	
	public static void AnonymousIterator(Number[] array) {
		System.out.println("Array of even numbers from last element to first with step: 3: ");
		Collection collection = new Collection(array);
		Iterator anonymousIterator = collection.createAnonymousIterator();
		while (anonymousIterator.hasNext()) {
			Number next = anonymousIterator.next();
			System.out.print(next + " ");
		}
	}
	
	public static void LocalIterator(Number[] array) {
		System.out.println("Array with even numbers with step: 5: ");
		Collection collection = new Collection(array);
		Iterator localIterator = collection.createLocalIterator();
		while (localIterator.hasNext()) {
			Number next = localIterator.next();
			System.out.print(next + " ");
		}
	}
	
	public static void StaticIterator(Number[] array) {
		System.out.println("Array with with all odd numbers: ");
		Collection collection = new Collection(array);
		Collection.StaticIterator staticIterator = collection.createStaticIterator();
		while (staticIterator.hasNext()) {
			Number next = staticIterator.next();
			System.out.print(next + " ");
		}
	}
	
	public static Number[] RandomArray() {
		System.out.println("Random numbers array: ");
		int max = 20;
		int len = 11;
		Number[] array = new Number[len];
        	int range = max + 1; 
        	for (int i = 0; i < len; i++) { 
            		int rand = (int)(Math.random() * range); 
            		array[i] = rand;
            		System.out.print(array[i] + " ");
        	} return array;
	}
}
