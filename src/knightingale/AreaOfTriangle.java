package knightingale;
import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Rectangle: ");
		double length=sc.nextDouble();
		System.out.println("Enter the breadth of Rectangle: ");
		double breadth=sc.nextDouble();
		double area=length*breadth;
		System.out.println("Area of Traingle is "+area);
		sc.close();
		

	}

}
