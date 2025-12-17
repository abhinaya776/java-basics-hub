import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();  
        boolean asc=true;
        int prev=10;
        while(num!=0){
            int current=num%10;
            if(current>=prev){
                asc=false;
                break;
            }
            prev=current;
            num=num/10;
            }
        if(asc)
         System.out.println("Ascending");
        else
         System.out.println(" Not in Ascending");
	    
}
}
