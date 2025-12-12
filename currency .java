import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int amt=sc.nextInt();
        int note2000=amt/2000;
        int rem1=amt%2000;
        int note500=rem1/500;
        int rem2=rem1%500;
        int note200=rem2/200;
        int rem3=rem2%200;
        int note100=rem3/100;
        int rem4=rem3%100;
        int note50=rem4/50;
        int rem5=rem4%50;
        int note20=rem5/20;
        int rem6=rem5%20;
        int note10=rem6/10;
        int rem7=rem6%10;
        System.out.println(note2000);
        System.out.println(note500);
        System.out.println(note200);
        System.out.println(note100);
        System.out.println(note50);
        System.out.println(note20);
        System.out.println(note10);
         }
}
