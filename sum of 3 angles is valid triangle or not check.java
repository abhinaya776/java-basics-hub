import java.util.Scanner;                      
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x =sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        if(x>0 && y>0 && z>0 &&(x+y+z==180)){
            System.out.println("valid triangle");
        }
        else
          System.out.println("invalid triangle");
        }
}
