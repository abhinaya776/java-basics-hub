import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
	    int temp=a;
	     while(temp>=10){
	         temp=temp/10;
	     }
	     int fdigit=temp;
		int ldigit=a%10;
		System.out.println(fdigit+ldigit);
	}
}
