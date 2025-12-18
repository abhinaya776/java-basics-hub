import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt(); 
        for(int i=1;i<=n;i++){
            int sum=0; int count=0;int temp=i;
            int t=i;
            while(t>0){
                count++;
                t/=10;
            }
            while(temp>0){
                int digit=temp%10;
                sum=sum+(int)Math.pow(digit,count);
                temp/=10;
            }
            if(sum==i){
                System.out.println(i+" ");
            }
            
    }
}
}
