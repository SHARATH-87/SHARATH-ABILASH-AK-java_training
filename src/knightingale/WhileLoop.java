package knightingale;
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,s=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("n Please Enter any integer value below 10: ");
		n=sc.nextInt();
		while(n<=10) {
			s=s+n;
			n++;
		}
		System.out.format("Sum of the Numbers From the While Loop is: %d ",s);
		sc.close();

	}

}

