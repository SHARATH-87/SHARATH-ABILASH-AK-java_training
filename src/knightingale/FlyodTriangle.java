package knightingale;
import java.util.Scanner;

public class FlyodTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,n=1,c,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows for flyod's Triangle:  ");
		r=sc.nextInt();
		System.out.println("Flyod's Triangle");
		System.out.println("****************");
		for(c=1;c<=r;c++) {
			for(j=1;j<=c;j++) {
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}

	}

}
