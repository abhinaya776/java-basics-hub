import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double discount=0;
    System.out.println("Enter the bill amount");
    double bill=sc.nextInt();
    if(bill<1000){
        discount =bill*5/100;
        }
    else if(bill>=1000&&bill<5000){
        discount =bill*10/100;
    }    
    else if(bill>=5000){
        discount=bill*20/100;
    }
    double finalprice=bill-discount;
    System.out.println("Final amount after discount:" +finalprice);
    }
}
