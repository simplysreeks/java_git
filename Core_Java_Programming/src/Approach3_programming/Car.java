package Approach3_programming;

public class Car {
    private int speed;
    private double mileage;
    private int fuelCapacity;
    private String color;
    private String carNo;

    public  Car(int speed, double mileage, int fuelCapacity, String color, String carNo) {
        if (validateSpeed(speed)) {
            this.speed = speed;
        } else {
            System.err.println("Invalid speed");
        }
        if (verifyMileage(mileage) == 1) {
            this.mileage = mileage;
        } else {
            System.err.println("Invalid mileage");
        }
        if (checkFuelCapacity(fuelCapacity).equals("valid")) {
            this.fuelCapacity = fuelCapacity;
        } else {
            System.err.println("Fuel Low ..!!");
        }
        if (checkColor(color).equals("valid")) {
            this.color = color;
        } else {
            System.err.println("Invalid Color");
        }
        if (checkCarNumber(carNo).equals("valid")) {
            this.carNo = carNo;
        } else {
            System.err.println("Invalid Car No");
        }
    }

    private boolean validateSpeed(int speed) {
        return speed >= 60 && speed <= 150;
    }

    private int verifyMileage(double mileage) {
        return (mileage >= 12.5 && mileage <= 26.8) ? 1 : 0;
    }

    private String checkFuelCapacity(int fuelCapacity) {
        return (fuelCapacity >= 200 && fuelCapacity <= 800) ? "valid" : "invalid";
    }

    private String checkColor(String color) {
        return (color.equals("BLACK") || color.equals("WHITE") || color.equals("RED")) ? "valid" : "invalid";
    }

    private String checkCarNumber(String carNo) {
        if (carNo.length() == 8) {
            for (int i = 0; i < 2; i++) {
                char ch = carNo.charAt(i);
                if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                    return "valid";
                }
            }
            return "invalid";
        }
        return "invalid";
    }

    public void display() {
        System.out.println("Speed of car is " + speed + "km/hr");
        System.out.println("Mileage of car is " + mileage + "km/liter");
        System.out.println("Fuel Capacity of car is " + fuelCapacity + " litres");
        System.out.println("Color of car is " + color);
        System.out.println("Number of car is " + carNo);
    }
}
