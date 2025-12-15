import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    long product=1;
	    int n=sc.nextInt();
        if(n==0){
            product=0;
        }
        else{
	    while(n!=0){
	        int digit=n%10;
	        product*=digit;
	        n/=10;
	    }
	    }
		System.out.println(product);
	
	}
}
