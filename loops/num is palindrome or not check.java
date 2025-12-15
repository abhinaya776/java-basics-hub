import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		int temp=n;
		while(n!=0){
		    int digit=n%10;
		    rev=rev*10+digit;
		     n/=10;
		}
		if(rev==temp)
		    System.out.println("palindrome");
		else
		System.out.println("Not a palindrome");
		
		sc.close();
	}
}
