import java.util.Scanner;
public class Main
{ 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(); int bin=0;int place=1;
		while(num!=0){
		    int digit=num%2;
		    bin=bin+digit*place;
		    place=place*10;
		        num/=2;
		    }
		
		System.out.println("binary :" +bin);
			}
}
