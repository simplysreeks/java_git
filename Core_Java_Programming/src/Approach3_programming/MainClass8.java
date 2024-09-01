package Approach3_programming;

public class MainClass8 {
    public static void main(String[] args) {
        // Creating two train objects with appropriate parameters
        Train train1 = new Train("kaba01", "bangaloreExpress", "kachiguda", "bangalore", 80, 650);
        Train train2 = new Train("kach02", "chennaiExpress", "kachiguda", "chennai", 100, 750);

        // Displaying details of both trains
        System.out.println("-------Train 1 Details:-------");
        train1.display();
        System.out.println("------Train 2 Details:-------");
        train2.display();
    }
}
