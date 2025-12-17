import java.util.Scanner;
public class Main
{ 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Vowels");
		for(char ch='A';ch<='Z';ch++){
		    if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		    System.out.print(ch+ " ");
		    }
		System.out.println(" ");
		System.out.println("Consonants");
		for(char ch='A';ch<='Z';ch++){
		    if(!(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
		    System.out.print(ch+ " ");
		    
		}
		System.out.println(" ");
	}
}
