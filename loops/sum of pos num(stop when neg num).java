import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;    
        int num;        
        System.out.println("Enter positive numbers (Enter a negative number to stop):");
        while (true) {
            num = sc.nextInt();   
            if (num < 0) {
                break;
            }
          sum = sum + num;     
        }
       System.out.println("Sum of positive numbers = " + sum);
    }
}
