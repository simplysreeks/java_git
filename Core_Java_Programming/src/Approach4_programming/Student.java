package Approach4_programming;

public class Student {
    private String studentName;
    private double studentPercentage;
    private static final String SCHOOL_NAME = "Pullaiah"; // Made school name final since it is constant

    // Constructor
    public Student(String studentName, double studentPercentage) {
        if ((validateName(studentName) != null)&&(isPercentageValid(studentPercentage))) {
            this.studentName = studentName;
            this.studentPercentage = studentPercentage;
        }
        else {
        	System.out.println("Invalid input");
        }
    }

    
    private String validateName(String studentName) {
        for (int i = 0; i < studentName.length(); i++) {
            char ch = studentName.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                
                return "valid"; 
            }
        }
        return "invalid"; 
    }


    // Check if the percentage is valid
    private boolean isPercentageValid(double studentPercentage) {
        if (studentPercentage >= 35.0 && studentPercentage <= 99.0) {
            return true;
        } else {
            
            return false;
        }
    }

   
    public void display() {
        if (studentName != null && isPercentageValid(studentPercentage)) {
            System.out.println("Student name is " + studentName);
            System.out.println("Student percentage is " + studentPercentage);
            System.out.println("School name is " + SCHOOL_NAME);
        } else {
            System.err.println("Cannot display student details due to invalid input.");
        }
    }

    
   
}
