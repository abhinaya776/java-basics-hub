import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    double l= sc.nextDouble();
	     double b= sc.nextDouble();
	      double h= sc.nextDouble();
	    double sa =2*(l*b + b*h +h*l) ;
        double v = l*b*h;
        System.out.println(sa);
        System.out.println(v);
        }
     }
