package Approach4_programming;

public class MainClassTrain {
    public static void usage(Train train) {
        train.display();
    }

    public static void main(String[] args) {
        usage(new Train("kaba01", "bangaloreExpress", "kachiguda", "bangalore", 80, 650));
    }
}
