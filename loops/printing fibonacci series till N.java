import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt(); int a=0; int b=1;int c=0;
        if(n>=1)
          System.out.print(a+ " ");
        if(n>=2)
          System.out.print(b+" ");
        for(int i=3;i<=n;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;b=c;
            
        }
    }
}
