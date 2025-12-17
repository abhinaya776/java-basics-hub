import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch>='A'&& ch<='Z'){
		    System.out.println((char)(ch+32));
		}
		else
		   System.out.println("Not an uppercase letter");
	}
}
