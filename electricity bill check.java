import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double unit = sc.nextDouble();
        double bill=0; double surcharge=0;
        if(unit<100)
           bill=0;
        else if(unit<300)
           bill=(unit-100)*5;
        else if(unit>300)
           bill=(200*5)+((unit-300)*10);
           
        if(unit>500)
          surcharge=200;
         
        double totalbill=bill+surcharge;
        System.out.println("Bill amount :" +bill);
        System.out.println("Surcharge :" +surcharge);
        System.out.println("Total Electricity bill :" +totalbill);
        sc.close();
    }
}
