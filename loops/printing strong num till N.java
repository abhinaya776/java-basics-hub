import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt(); 
        for(int i=1;i<=n;i++){
            int sum=0; int temp=i;
            
            while(temp>0){
                int digit=temp%10;
                int fact=1;
              for(int j=1;j<=digit;j++){
                  fact*=j;
              }
                sum+=fact;
                temp/=10;
            }
            if(sum==i){
                System.out.println(i+" ");
            }
     }
  }
}
