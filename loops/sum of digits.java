import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    long sum=0;
	    int n=sc.nextInt();
	    for (int i=0;i<=n ;i++ ) {
	        int digit=n%10;
	        sum+=digit;
	        n/=10;
	    }
		System.out.println(sum);;
	}
}
