import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter water consumption (in liters): ");
        int liters = sc.nextInt();
        double billAmount = 0;

        if (liters <= 1000) {
            billAmount = 0;   
        }
        else if (liters <= 3000) {
            
            billAmount = (liters - 1000) / 1000.0 * 5;
        }
        else {
            
            billAmount = (2000 / 1000.0 * 5) + ((liters - 3000) / 1000.0 * 10);
        }

        
        System.out.println("Total Water Bill:" + billAmount);

        sc.close();
    }
}
