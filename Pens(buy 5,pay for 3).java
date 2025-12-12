import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int price=sc.nextInt();
		int grp=n/5;
		int pay=grp*3;
		int rem=n%5;
		int totalnum=pay+rem;
		int totalamt=totalnum*price;
		
		System.out.println(totalnum);
		System.out.println(totalamt);
	
   }
}
