import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); int temp=n;
		while(temp>9){
		    int sum=0;
		    while(temp!=0){
		        int digit=temp%10;
		        sum=sum+digit;
		        temp/=10;
		    }
		    temp=sum;
		}
		if(temp==1)
		    System.out.println("Magic number");
		else
		    System.out.println("Not a magic number");
		}
}
