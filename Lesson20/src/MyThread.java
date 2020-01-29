import java.util.Scanner;

public class MyThread extends Thread{
	
	private Scanner sc;

	@Override
	public void run() {
		sc = new Scanner(System.in);
		System.out.println("Anount:");
		int amount = sc.nextInt();
		
		int current = 0;
		int next = 1;
		int prev;

		System.out.print("Fibonacci numbers: ");
		for (int i = 0; i < amount; i++) {
			System.out.print(current + " ");
			prev = current;
			current = next;
			next = prev + next;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
