import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mobile number: ");  
        String mobile = sc.next();
        int numlen=mobile.length();
        if (numlen== 10) {
            System.out.println("Valid Number");
        } else {
            System.out.println("Invalid Number");
        }

        sc.close();
    }
}
