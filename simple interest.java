import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    Double principal=sc.nextDouble();
	    Double interest=sc.nextDouble();
	    Double time=sc.nextDouble();
	    Double si= (principal*interest*time)/100;
	    System.out.println(si);
	}
}
