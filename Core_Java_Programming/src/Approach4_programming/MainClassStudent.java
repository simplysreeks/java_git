package Approach4_programming;



public class MainClassStudent {
	public static void usage(Student student)
	{
		student.display();
	}

	public static void main(String[] args) {
		usage(new Student("Sreekaree",92));
		usage(new Student("Rohini",93));
		
		
	}

}
