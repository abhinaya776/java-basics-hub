import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        char ch2=sc.next().charAt(0);
        if(ch==ch2)
           System.out.println("Equal");
        else
           System.out.println("Not Equal");
}
}
