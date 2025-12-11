import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
	    Boolean check=(n>0 )&& ((n&(n-1)) ==0);
	    System.out.println(String.valueOf(check).toUpperCase());
	 }
}
