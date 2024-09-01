package Approach4_programming;

public class Balloon {
	private static String gas="HELIUM";
	private String color;
	private static String name="RAJA";
	public Balloon(String color) {
		if (getColor(color)) {
			this.color = color;
		}
		else {
			System.err.println("Invalid Data");
		}
	}
	private boolean getColor(String color) {
		if (color.equals("RED")|| color.equals("ORANGE")|| color.equals("WHITE") || color.equals("BLACK")) {
			return true;
		}
		else {
			return false;
		}
	}
	public void display() {
		System.out.println("the balloon vendor name "+name);
		System.out.println("the ballon is filled with "+gas+" Gas");
		System.out.println("the balloon color is "+color);
		}


}