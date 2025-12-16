import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();  int sum=0;
		  int sq=n*n; int temp=sq;
		  while(sq!=0){
		      int digit=sq%10;
		      sum+=digit;
		      sq/=10;
		  }
		  if(n==sum)
		     System.out.println("Neon number");
		  else
		     System.out.println("Not a Neon number");
		}
}
