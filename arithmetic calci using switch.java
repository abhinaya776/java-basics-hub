import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter two num:");
	    int num1=sc.nextInt();
	    int num2=sc.nextInt();
	    System.out.println("Enter operator:");
	    char op=sc.next().charAt(0);
	    int arith=0;
	    
	    switch(op){
	        case  '+':
	            arith=num1+num2;
	            break;
	       case '-':
	            arith=num1-num2;
	            break;
	       case '*':
	           arith=num1*num2;
	           break;
	       case '/':
	           arith=num1/num2;
	           break;
	       case '%':
	           arith=num1%num2;
	           break;
	       default:
	        System.out.println("Invalid opeartor");
	        }
	        System.out.println("Calculated answer:" +arith);
}
}
