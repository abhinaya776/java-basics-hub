import java.util.Scanner;

public class HexadecimalFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.print("Enter an integer number: ");
        int num = sc.nextInt();
        String hex = Integer.toHexString(num);
System.out.println("Hexadecimal value: " + hex.toUpperCase());
        
        
    }
}
