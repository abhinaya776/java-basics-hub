import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int marks=sc.nextInt();
	     if(marks>=90)
	      System.out.println("A grade");
	    else if(marks>=70)
	      System.out.println("B grade");
	    else if(marks>=50)
	      System.out.println("C grade");
	    else
	      System.out.println("Fail");
	    
	    }
}
