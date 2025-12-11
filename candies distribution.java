import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    int candies=sc.nextInt();
	     int people =sc.nextInt();
	     int each=candies/people;
	     int left=candies%people;
	    System.out.println(each);
	    System.out.println(left);
	    
        }
     }
