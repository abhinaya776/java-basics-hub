import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        n = Math.abs(n);       
        int max = 0;
        if (n == 0) {
            max = 0;
        } else {
            while (n != 0) {
                int digit = n % 10;   

                if (digit > max) {
                    max = digit;
                }

                n = n / 10;           
            }
        }

        System.out.println("Largest digit: " + max);
        sc.close();
    }
}
