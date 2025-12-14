import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter day(1-7)\nstarts from sunday-saturday");
	    int days=sc.nextInt();
	    switch (days){
	        case 2: case 3: case 4: case 5: case 6:
	            System.out.println("Weekday");
	            break;
	       case 1: case 7:
	            System.out.println("Weekend");
	            break;
	   }
	    
	    }
}
