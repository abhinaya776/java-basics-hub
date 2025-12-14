import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        double balance = 5000;

        System.out.print("Enter amount to withdraw: ");
        double withdraw = sc.nextDouble();

        if (withdraw > balance) {
            System.out.println("Insufficient balance!");
        } 
        else if (withdraw % 100 != 0) {
            System.out.println("Amount must be a multiple of 100!");
        } 
        else {
            balance = balance - withdraw;
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance: " + balance);
        }

        sc.close();
    }
}
