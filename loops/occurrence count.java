import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();  int d=sc.nextInt();
	    int count=0;
	    if(num==0&&d==0){
	        count=0;
	    }
	    while(num!=0){
	        int digit=num%10;
	        if(digit==d){
	         count++;
	        }
	        num/=10;
	    }
	    System.out.println("occurrence count:" +count);
	
}
}
