import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
       if (year%100==0){
          System.out.println("Century year"); 
       }
       else {
           System.out.println("Not a Century year");
       }
       }
}
