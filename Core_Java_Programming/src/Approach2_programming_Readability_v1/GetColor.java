package Approach2_programming_Readability_v1;

public class GetColor {
    private static String ballonseller = "Raja";
    private static String ballongas = "Helium";
    private String balloncolor;

    public void color(String balloncolor) {
        if (balloncolor.equals("Black") || balloncolor.equals("White")|| balloncolor.equals("Red")|| balloncolor.equals("Orange")) {
            this.balloncolor = balloncolor;
        } else {
            System.err.println("Invalid Color");
        }
    };
    
    
    public void display() {
    	System.out.println("ballonseller name is "+ballonseller);
    	System.out.println("ballon gas is "+ballongas);
    	System.out.println("ballon color is "+balloncolor);
    	
    	
    }
}
