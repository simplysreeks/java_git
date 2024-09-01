package Approach4_programming;



public class MainClassRunner {
	public static void usage(Runner runner)
	{
		runner.display();
	}
	public static void main(String[] args) {
		usage(new Runner("Sreeks",100));
		usage(new Runner("Amma",120));
		usage(new Runner("nana",130));
		
	}

}
