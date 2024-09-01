package Approach4_programming;

public class Train {
    private String trainNumber;
    private String trainName;
    private String boardingPoint;
    private String destinationPoint;
    private int trainSpeed; // in km/hr
    private int journeyDistance; // in km

    // Constructor
    public Train(String trainNumber, String trainName, String boardingPoint, String destinationPoint, int trainSpeed, int journeyDistance) {
        if (isValidTrainNumber(trainNumber, boardingPoint, destinationPoint) &&
            isValidTrainName(trainName, destinationPoint) &&
            isValidTrainSpeed(trainSpeed) &&
            isValidJourneyDistance(journeyDistance)) {
            
            this.trainNumber = trainNumber;
            this.trainName = trainName;
            this.boardingPoint = boardingPoint;
            this.destinationPoint = destinationPoint;
            this.trainSpeed = trainSpeed;
            this.journeyDistance = journeyDistance;
        } else {
            // If any validation fails, mark the train as invalid
            System.err.println("Invalid input for Train: " + trainNumber);
            this.trainNumber = "Invalid";
            this.trainName = "Invalid";
            this.boardingPoint = "Invalid";
            this.destinationPoint = "Invalid";
            this.trainSpeed = 0; // default value
            this.journeyDistance = 0; // default value
        }
    }

    // Validation methods
    private boolean isValidTrainNumber(String trainNumber, String boardingPoint, String destinationPoint) {
        // Check if trainNumber has exactly 6 characters
        if (trainNumber.length() != 6) {
            return false;
        }
        
        // Extract the expected prefixes from boardingPoint and destinationPoint
        String bpCode = boardingPoint.substring(0, 2).toUpperCase();
        String dpCode = destinationPoint.substring(0, 2).toUpperCase();
        String expectedPrefix = bpCode + dpCode;
        
        // Extract the actual prefix from trainNumber
        String actualPrefix = trainNumber.substring(0, 4).toUpperCase();
        
        // Compare the expected prefix with the actual prefix
        if (!expectedPrefix.equals(actualPrefix)) {
            return false;
        }
        
        // Extract and validate the random digits part
        try {
            int randomDigits = Integer.parseInt(trainNumber.substring(4));
            return randomDigits >= 0 && randomDigits <= 99;
        } catch (NumberFormatException e) {
            return false; // If parsing fails, return false
        }
    }


    private boolean isValidTrainName(String trainName, String destinationPoint) {
        return trainName != null && trainName.toLowerCase().startsWith(destinationPoint.toLowerCase()) && trainName.endsWith("Express");
    }

    private boolean isValidTrainSpeed(int trainSpeed) {
        return trainSpeed >= 60 && trainSpeed <= 120;
    }

    private boolean isValidJourneyDistance(int journeyDistance) {
        return journeyDistance >= 600 && journeyDistance <= 1000;
    }

    // Method to calculate time taken for journey
    public double calculateTimeTaken() {
        if (trainSpeed > 0) {
            return (double) journeyDistance / trainSpeed;
        } else {
            return 0.0;
        }
    }

    // Method to display train details
    public void display() {
        if (!trainNumber.equals("Invalid")) {
            System.out.println("-------Train " + trainNumber + " Details:-------");
        } else {
            System.out.println("-------Train Invalid Details:-------");
        }
        System.out.println("Train number: " + trainNumber);
        System.out.println("Train name: " + trainName);
        System.out.println("Train Boarding point: " + boardingPoint);
        System.out.println("Train Destination point: " + destinationPoint);
        System.out.println("Train speed: " + trainSpeed + " km/hr");
        System.out.println("Train distance: " + journeyDistance + " km");
        System.out.println("Time taken: " + calculateTimeTaken() + " hours");
        System.out.println();
    }
}
