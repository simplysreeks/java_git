package Approach4_programming;

public class Runner {
	private String RunnerName;
	private double speed;
	private int distance=10;
	public Runner(String RunnerName,double speed) {
		this.RunnerName=RunnerName;
		this.speed=speed;
	}
	
	public void display() {
		System.out.println(RunnerName +" runs 10 kms marathon at the speed of "+speed+" "+RunnerName+" completes the race in "+distance/speed +" hrs" );
	}
	
	

}
