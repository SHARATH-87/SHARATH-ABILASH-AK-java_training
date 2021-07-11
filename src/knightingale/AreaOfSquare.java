package knightingale;
import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of the square: ");
		double s=sc.nextDouble();
		double area=s*s;
		System.out.println("The Area of Square is: "+area);
		sc.close();

	}

}
