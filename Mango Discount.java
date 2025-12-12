import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int price=sc.nextInt();
		int grp=n/4;
		int pay=grp*3;
		int rem=n%4;
		int finalpay=pay+rem;
		int totalamt=finalpay*price;
		System.out.println(finalpay);
		System.out.println(totalamt);
	
   }
}
