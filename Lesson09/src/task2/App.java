package task2;

public class App {

	public static void main(String[] args) {
		Methods try1 = new Methods(-3, -5);
		System.out.println(try1.sum());
		Methods try2 = new Methods(0, -5);
		System.out.println(try2.minus());
		Methods try3 = new Methods(0, 0);
		System.out.println(try3.myltiply());
		Methods try4 = new Methods(8, 9);
		System.out.println(try4.div());

	}

}
