package Approach2_programming_Readability_v1;

public class Student {
	private String studentName;
	
	
   
    private double studentPercentage;
    private static  String school_name = "pullaiah School";
    
     public String isName(String studentName) {
    	 this.studentName = ""; 
    	 
    	for(int i=0;i<studentName.length();i++) {
    		char ch=studentName.charAt(i);
    		if((ch>='A'&&ch<='Z')|| (ch>='a'&&ch<='z')){
    			this.studentName+=ch;
    		}
    		else {
    			System.err.println("Invalid name");
    			this.studentName = null;
    		}
    	}
    	return this.studentName; 
    	
    }
    public double isPercentage(double studentPercentage) {
    	if(studentPercentage>35.0 && studentPercentage<99.0) {
    		this.studentPercentage=studentPercentage;
    	}
    	return this.studentPercentage;
    	
    	
    }
   
    
    public void display() {
    	System.out.println("Student name is "+studentName);
    	System.out.println("student Percentage is "+studentPercentage);
    	System.out.println("School Name is "+school_name);
    	
    	
    	
    }
    
    
    
    
	}
	


