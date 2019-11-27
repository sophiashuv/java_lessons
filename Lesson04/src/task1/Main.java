package task1;

public class Main {
	public static void main(String[] args) {
		Robot [] arr = new Robot[4];
		Robot robot = new Robot();
		CoffeRobot cofferobot = new CoffeRobot();
		RobotCoocker robotcoocker = new RobotCoocker();
		RobotDancer robotdancer = new RobotDancer();
		arr[0]= robot;
		arr[1] = cofferobot;
		arr[2] = robotcoocker;
		arr[3] = robotdancer;
		for(int i = 0; i < arr.length; i++) arr[i].work();
	}
}
