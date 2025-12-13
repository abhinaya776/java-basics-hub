import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
       // int num2=sc.nextInt();
        //int num3=sc.nextInt();
        int last=num1%10;
        if (last%2==0){
           System.out.println("Even");
           }
        else{
            System.out.println("Odd");
        }
        }
}
