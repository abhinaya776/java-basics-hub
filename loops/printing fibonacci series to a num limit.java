import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int limit = sc.nextInt(); int a=0; int b=1;int c=0;
        while(a<=limit){
            System.out.print(a+" ");
            c=a+b;
            a=b;b=c;
            
        }
    }
}
