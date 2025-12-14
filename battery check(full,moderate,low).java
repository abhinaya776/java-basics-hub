import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter battery percentage: ");
        int battery = sc.nextInt();

        if (battery<0 || battery>100) {
            System.out.println("Invalid battery percentage");
        }
        else if (battery >= 80) {
            System.out.println("Battery Status: Full");
        }
        else if (battery >= 30) {
            System.out.println("Battery Status: Moderate");
        }
        else {
            System.out.println("Battery Status: Low");
        }

        sc.close();
    }
}
