import java.util.Scanner;
public class Main
{ 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int bin=sc.nextInt(); int d=0;int place=1;
		while(bin!=0){
		    int digit=bin%2;
		    d=d+digit*place;
		    place=place*2;
		        bin/=10;
		    }
		
		System.out.println("Decimal :" +d);
	}
}
