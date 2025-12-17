import java.util.Scanner;
public class Main
{ 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int result=0; int times=Math.abs(b);
		for(int i=1;i<=times;i++){
		    result=result+a;
		}
		if(b<0){
		    result=-result;
		}
		System.out.println(result);
	}
}
