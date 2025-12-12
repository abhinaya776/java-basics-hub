import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    Double selling=sc.nextDouble();
	    Double loss=sc.nextDouble();
	    Double cost= selling+ loss;
	    System.out.println(cost);
	}
}
