package knightingale;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int rev=0;
		System.out.println("Input the number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n!=0) {
			rev=rev*10;
			rev=rev+n%10;
			n=n/10;
		}
		System.out.println("Reverse of input number is: "+rev);
		sc.close();
		

	}

}
