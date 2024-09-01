package projectbank;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ATM atm = new ATM();
        int a = 0;

        while (a != 4) {
            System.out.println("Enter 1 for Withdraw of amount");
            System.out.println("Enter 2 for Deposit of amount");
            System.out.println("Enter 3 for Checking of Amount Balance");
            System.out.println("Enter 4 to exit from the application");
            System.out.println("Enter a number:..");
            a = s.nextInt();

            if (a == 1) {
                System.out.println("Enter the amount to withdraw");
                int withdrawAmount = s.nextInt();
                atm.withdraw(withdrawAmount);
            } else if (a == 2) {
                System.out.println("Enter the amount to deposit");
                int depositAmount = s.nextInt();
                atm.deposit(depositAmount);
            } else if (a == 3) {
                atm.showBalance();
            } else if (a == 4) {
                System.out.println("Exit from the application");
            } else {
                System.out.println("Invalid input, please try again.");
            }
        }
        
    }
}
