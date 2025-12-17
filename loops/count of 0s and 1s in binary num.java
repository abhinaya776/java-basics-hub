import java.util.Scanner;
public class Main
{ 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();int count1=0;int count0=0;
		while(num!=0){
		    int digit=num%10;
		    if(digit==1)
		        count1++;
		  else if(digit==0)   
		        count0++;
		        
		        num/=10;
		    }
		System.out.println("Count of 1's :" +count1);
		System.out.println("Count of 0's :" +count0);
	
	}
}
