import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int first=num1/100;
        if(first%2==0){
           System.out.println("Even");
           }
        else{
            System.out.println("Odd");
        }
        }
}
