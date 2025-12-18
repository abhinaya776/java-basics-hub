import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n= sc.nextInt(); 
        for(int i=1;i*i<=n;i++){
            int sq=i*i;
              System.out.print(sq+" ");
             
        }
    }
}
