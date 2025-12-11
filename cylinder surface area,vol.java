import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    double r= sc.nextDouble();
	     
	      double h= sc.nextDouble();
	    double sa =2*3.14*r*(r+h) ;
        double v = 3.14*r*r*h;
        System.out.println(sa);
        System.out.println(v);
        }
     }
