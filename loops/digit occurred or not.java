import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();  int d=sc.nextInt();
	    boolean found=false;
	    while(num!=0){
	        int digit=num%10;
	        if(digit==d){
	          found=true;
	          break;
	        }
	        num/=10;
	    }
	    if(found)
	      System.out.println("Digit Occurred");
	     else
	     System.out.println("Digit not occurred");
	
}
}
