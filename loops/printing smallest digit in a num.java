import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = Math.abs(n);       
        int min = 9;
        if (n == 0) {
            min = 0;
        } else {
            while (n != 0) {
                int digit = n % 10;   

                if (digit < min) {
                    min = digit;
                }

                n = n / 10;           
            }
        }

        System.out.println("Smallest digit: " + min);
        sc.close();
    }
}
