package Approach2_programming_Readability_v2;

public class Train {
	private String trainNumber;
    private String trainName;
    private String boardingPoint;
    private String destinationPoint;
    private int trainSpeed;
    private int journeyDistance;
    public Train(String trainNumber,String trainName,String boardingPoint,String destinationPoint,int trainSpeed,int journeyDistance) {
    	

    public static void setTrainNumber(String n) {    
        trainNumber = n;
        System.out.println("The train number is " + n);
    }
    public static void setTrainName(String a) {    
        trainName = a;
        System.out.println("The train name is " + a);
    }
    public static void setBoardingPoint(String b) {    
        boardingPoint = b;
        System.out.println("The Boarding Point is " + b);
    }
    public static void setDestinationPoint(String c) {    
        destinationPoint = c;
        System.out.println("The Destination Point is " + c);
    }
    public static void setTrainSpeed(int a) {    
        trainSpeed = a;
        System.out.println("The Train Speed is " + a + " km/hr");
    }
    public static void setJourneyDistance(int b) {    
        journeyDistance = b;
        System.out.println("The Journey Distance is " + b + " Kms");
    }
}



}
