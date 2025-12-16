import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt(); int temp=n;
		  int sum=0; int fact=1;
		  while(n!=0){
		      int digit=n%10;
		       for(int i=1;i<=digit;i++){
		           fact*=fact;
		       }
		       sum=sum+fact;
		       n/=10;
		  }
		  if(temp==sum)
		      System.out.println("Strong number");
		  else
		    System.out.println("Not a Strong number");
		  
	}
}
