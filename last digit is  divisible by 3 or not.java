import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int last = num1%10;
        
        if(last%3==0){
           System.out.println("divisible");
           }
        else{
            System.out.println("not divible");
        }
        }
}
