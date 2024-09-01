package Approach2_programming_Readability_v1;

public class Car {
	private int speed;
	private double mileage;
	private int fuelCapacity;
	
	 public void speedOfCar(int speed,double mileage,int fuelCapacity) {
	        if (speed>=60 && speed<=150) {
	            this.speed = speed;
	        } else {
	            System.err.println("Invalid speed");
	        }
	        if (mileage>=12.5 && mileage<=26.8) {
	            this.mileage=mileage;
	        } else {
	            System.err.println("Invalid mileage");
	        }
	        if(fuelCapacity>=200 && fuelCapacity<=800 ) {
	        	this.fuelCapacity=fuelCapacity;
	        }
	        else {
	            System.err.println("Fuel Low ..!!");
	        }
	    };
	    
	    public void display(){
	    	System.out.println("Speed of car is "+speed+"km/hr");
	    	System.out.println("Mileague of car is "+mileage+"km/liter");
	    	System.out.println("Fuel Capacity of car is "+fuelCapacity+" litres");
	    	
	    	
	    	
	    }
	

}
