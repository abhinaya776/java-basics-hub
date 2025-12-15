import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n; int calc=0;
		int count=0;
		while(temp!=0){
		    count++;
		    temp/=10;
		}
		temp=n;
		while(temp!=0){
		    int digit=temp%10;
		    calc=calc + (int)Math.pow(digit,count);
		    temp/=10;
		}
		if(n==calc)
		    System.out.println("Armstrong");
		else
		  System.out.println("Not Armstrong");
		
	}
}
