import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    Double price=sc.nextDouble();
	    Double dis=sc.nextDouble();
	    Double dispercent=(price*dis)/100;
	    Double finalprice=price-dispercent;
	    System.out.println(finalprice);
        }
     }
