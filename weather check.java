import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        int temp = sc.nextInt();

        if (temp < 15) {
            System.out.println("Weather is Cold");
        }
        else if (temp >= 15 && temp <= 25) {
            System.out.println("Weather is Pleasant");
        }
        else if (temp >= 26 && temp <= 35) {
            System.out.println("Weather is Hot");
        }
        else {
            System.out.println("Weather is Heatwave");
        }

        sc.close();
    }
}
