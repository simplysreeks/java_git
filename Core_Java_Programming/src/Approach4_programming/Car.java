package Approach4_programming;

public class Car {
private int carspeed;
private double mileage;
private int capacity;
private String color; 
private String carno;
public  Car(int carspeed,double mileage,int capacity,String color,String carno) {
	if(validateSpeed(carspeed)&&(validateMileage(mileage)==1)&& (validateCapacity(capacity).equals("validate"))&&(validateColor(color))&&(validateCarno(carno)==1)&&(validatehypen(carno,2)==1)&&(checkDigits(carno,3,4)==1)&&(validatehypen(carno,5)==1)&&(checkDigits(carno,6,7)==1) ) {
		this.carspeed = carspeed;
		this.mileage = mileage;
		this.capacity = capacity;
		this.color=color;
		this.carno=carno;
	}
	else {
		System.err.println("Invalid car number");
	}

}
private boolean validateSpeed(int carspeed) {
	if(carspeed >=60 && carspeed<=150) {
		return true;
	}
	else {
		return false;
	}
}
private int validateMileage(double mileage) {
	if(mileage>=12.5 && mileage<=26.8) {
		return 1;
	}
	else {
		return 0;
	}
}
private String validateCapacity(int capacity) {
	if(capacity>=200 && capacity<=800) {
		return "validate";
	}
	else {
		return "no";
	}
}
	private boolean validateColor(String color) {
		if(color.equals("BLACK") || color.equals("WHITE") || color.equals("RED")) {
			return true;
		}
		else {
			return false;
	}
	}
	private int validateCarno(String carno) {
		boolean b=false;
		if(carno.length()==8) {
			for(int i=0;i<=1;i++) {
				char ch= carno.charAt(i);
				if(Character.isAlphabetic(ch)) {
					b=true;
				}
				else {
					b=false;
					break;
				}
				
			}
			
			}
		if(b) {
			return 1;
		}
		else {
			return 0;
		}
		}
	private int validatehypen(String carno,int index) {
			char ch=carno.charAt(index);
			if(ch=='-') {
				return 1;
			}
			else {
				return 0;
			}
		}
	private int checkDigits(String carno,int f,int s) {
		boolean b=false;
		for(int i=f;i<=s;i++) {
			char ch=carno.charAt(i);
			if(Character.isDigit(ch)) {
				b=true;
			}
			else {
				b=false;
			}
		}
		if(b) {
			return 1;
		}
		else {
			return 0;
		}
	}
		
			
	
public void display() {
	System.out.println("The car speed is : "+carspeed+" KM/hr");
	System.out.println("The car mileage is : "+mileage+" KM/lt");
	System.out.println("The car fuel capacity is : "+capacity+" liters");
	System.out.println("the car color is "+color);
	System.out.println("The Car Number is "+carno);
}
}