package MethodOverriding;

class Jspiders {
	
	public void course() {
		System.out.println("Jspiders provide Java full stack course");
	}
}
class Student extends Jspiders {
	@Override
	public void course() {
		System.out.println("Jspiders provide Python full stack course");
	}
	public void study() {
		System.out.println("students study here");
	}
	
}
public class MainClass9{
	public static void main(String[] args) {
		Jspiders s=(Jspiders) new Student();
		s.course();
	}
	
}

	


