import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter body temperature: ");
        double temp = sc.nextDouble();

        if (temp > 100) {
            System.out.println("Fever detected");
        } else {
            System.out.println("Normal temperature");
        }

        sc.close();
    }
}
