import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n= sc.nextInt(); 
        for(int i=1;i<=n;i++){
             int num=i;
             while(num>9){
                 int sum=0;
                 while(num>0){
                 int digit=num%10;
                 sum+=digit;
                 num/=10;
            } 
             num=sum;
             }
             if(num==1)
               System.out.print(i+" ");
        }
    }
}
