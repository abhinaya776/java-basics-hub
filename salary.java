import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    Double basic=sc.nextDouble();
	    Double hra=sc.nextDouble();
	    Double da=sc.nextDouble();
	    Double aw= sc.nextDouble();
	    Double deduct=sc.nextDouble();
	    Double salary=basic+hra+da+aw - deduct;
	    System.out.println(salary);
	}
}
