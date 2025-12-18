import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n= sc.nextInt(); 
        int value=1;
        while(value<=n){
            System.out.print(value+" ");
            value=value*2;
        }
    }
}
