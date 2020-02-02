package task2;

public class Main {

	public static void main(String[] args) {
		Coin coin = new Coin();
		Coins coins = () -> {if (coin.isValue()) return "The coin shows Head.\n";
		else return "The coin shows Tail.\n";};
	
		System.out.println(coins.print());
	}
}