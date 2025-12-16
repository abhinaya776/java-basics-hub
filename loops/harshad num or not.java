import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();  int sum=0;
		  int temp=n;
		  while(n!=0){
		      int digit=n%10;
		      sum+=digit;
		      n/=10;
		  }
		  if(sum!=0 && temp%sum==0)
		     System.out.println("Harshad number");
		  else
		     System.out.println("Not a Harshad number");
		}
}
