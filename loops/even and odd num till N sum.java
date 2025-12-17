import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N:");
        int n=sc.nextInt(); int Esum=0;int Osum=0;
        System.out.println("Even num sum");
        for(int i=0;i<=n;i+=2){
            Esum+=i;
            }
            System.out.println(Esum);
            System.out.println("Odd num sum");
            for(int i=1;i<=n;i+=2){
            Osum+=i;
            }
            System.out.println(Osum);
        }
}
