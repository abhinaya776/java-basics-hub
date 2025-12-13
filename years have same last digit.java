import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int year1=sc.nextInt();
        int year2=sc.nextInt();
        int last1=year1%10;
        int last2=year2%10;
       if (last1==last2){
          System.out.println("last digits are same"); 
       }
       else {
           System.out.println("last digits are diff");
       }
    }}
