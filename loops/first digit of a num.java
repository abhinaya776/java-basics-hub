import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();  
	    num=Math.abs(num);
		while(num>=10){
		  num=num/10;
		   }
		  
		System.out.println(num);
}
}
