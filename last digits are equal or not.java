import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int last1=num1%10;
        int last2=num2%10;
       if (last1==last2){
           System.out.println("Last digits of both num are equal");
          }
       else
           System.out.println("Last digits are not equal");
}
}
