import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    long count=0;
	    int n=sc.nextInt();
	    if(n==0){
	        count=1;
	    }
	    else{
	    for ( ;n!=0 ;) {
	       count ++;
	        n/=10;
	    }
		System.out.println(count);
	}
	}
}
