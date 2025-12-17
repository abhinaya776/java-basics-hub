import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();  
        boolean desc=true;
        int prev=-1;
        while(num!=0){
            int current=num%10;
            if(current<=prev){
                desc=false;
                break;
            }
            prev=current;
            num=num/10;
            }
        if(desc)
         System.out.println("Descending");
        else
         System.out.println(" Not in Descending");
	    
}
}
