import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int storedPIN = 1234;

       System.out.print("Enter your ATM PIN: ");
        int enteredPIN = sc.nextInt();

        if (enteredPIN == storedPIN) {
            System.out.println("PIN matched! You can proceed to withdrawal.");

            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();
            System.out.println("Please collect your cash: ₹" + amount);
        } else {
            System.out.println("Incorrect PIN! Access denied.");
        }

        sc.close();
    }
}
