package knightingale;
import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		double r=sc.nextDouble();
		double area=Math.PI * (r*r);
		System.out.println("The area of circle is: "+area);
		double circumference=Math.PI * 2*r;
		System.out.println("The circumference of circle is: "+circumference);
		sc.close();

	}

}
