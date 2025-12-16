import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();  int sq=n*n; boolean isauto=true;
		  int temp=n;
		  
		  while(temp!=0){
		      if(temp%10!= sq%10 ){
		          isauto=false;
		          break;
		      }
		      temp/=10; sq/=10;
		  }
		  if(isauto)
		    System.out.println("Automorphic number");
		  else
		  System.out.println("Not an Automorphic number");
		  
}
}
