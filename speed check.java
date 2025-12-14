import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vehicle speed (km/h): ");
        int speed = sc.nextInt();

        if (speed > 100) {
            System.out.println("Overspeeding! Slow down.");
        }
        else if (speed >= 0) {
            System.out.println("Speed is within the limit.");
        }
        else {
            System.out.println("Invalid speed");
        }

        sc.close();
    }
}
