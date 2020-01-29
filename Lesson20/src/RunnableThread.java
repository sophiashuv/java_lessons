import java.util.Scanner;

public class RunnableThread  implements Runnable {

	private Scanner sc;

	@Override
	public void run() {
		sc = new Scanner(System.in);
		System.out.println("Anount:");
		int amount= sc.nextInt();

		int curr = 0;
		int next = 1;
		int prev = 0;

		System.out.print("Reversed fibonacci numbers: ");
		for (int i = 0; i < amount - 1; i++) {
			prev = curr;
			curr = next;
			next = prev + next;
		}
		for (int i = 0; i < amount; i++) {
			System.out.print(curr + " ");
			next = curr - prev;
			curr = prev;
			prev = next;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


