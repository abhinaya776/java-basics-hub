import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
	  String check = (a<0) ? "Negative" : "Positive";
	    System.out.println(check);
	 }
}
