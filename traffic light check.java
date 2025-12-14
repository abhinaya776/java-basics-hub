import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter traffic light color: ");
        String color = sc.next();
        color = color.toLowerCase();
        switch (color) {
            case "red":
                System.out.println("Stop");
                break;

            case "yellow":
                System.out.println("Ready");
                break;

            case "green":
                System.out.println("Go");
                break;

            default:
                System.out.println("Invalid traffic light color");
        }

        sc.close();
    }
}
