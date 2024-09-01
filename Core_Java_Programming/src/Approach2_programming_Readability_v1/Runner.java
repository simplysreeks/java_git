package Approach2_programming_Readability_v1;

public class Runner {
	private String RunnerName;
	private int speed;
	private int distance=10;
	public void isRunner(String RunnerName,int speed) {
		this.RunnerName=RunnerName;
	}
	
	public void display() {
		System.out.println(RunnerName +"runs 10 kms marathon at the speed of "+speed+" "+RunnerName+"completes the race in "+distance/speed +" hrs" );
	}
	
	

}
