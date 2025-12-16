import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  if(n<0){
		      System.out.println("Not a perfect square");
		  }
		   for(int i=0;i*i<=n;i++){
		          if(i*i==n){
		       System.out.print("Perfect square");
		           } 
		       else{
		           System.out.println("Not a perfect square");
		       }
		   }
		      
	}
}
