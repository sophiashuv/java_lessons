public class Main {
	public static void main(String[] args) throws InterruptedException {

		MyThread myThread = new MyThread();
		myThread.start();
		myThread.join();

		System.out.println();

		RunnableThread runnableThread = new RunnableThread();
		Thread thread = new Thread(runnableThread);
		thread.start();
	}
}
