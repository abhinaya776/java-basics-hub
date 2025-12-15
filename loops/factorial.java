import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    long fact=1;
	    int n=sc.nextInt();
	    for (int i=1;i<=n ;i++ ) {
	        fact=fact*i;
	    }
		System.out.println(fact);
	}
}
