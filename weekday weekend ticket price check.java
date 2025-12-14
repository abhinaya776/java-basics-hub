import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number (1-Mon to 7-Sun): ");
        int day = sc.nextInt();
        switch (day) {
                case 1: case 2: case 3: case 4: case 5: 
                System.out.println("Weekday");
                System.out.println("Ticket Price: ₹100");
                break;

            case 6: case 7: 
                System.out.println("Weekend");
                System.out.println("Ticket Price: ₹150");
                break;

            default:
                System.out.println("Invalid day number");
        }

        sc.close();
    }
}
