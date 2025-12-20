import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  int a=sc.nextInt();
		  int b=sc.nextInt(); 
		  
		  while(b!=0){
		         int rem=a%b;
		           a=b;
		           b=rem;
		       }
		  System.out.println("GCD " +a);
		  sc.close();
	
	}
}
