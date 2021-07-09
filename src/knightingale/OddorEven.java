package knightingale;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter an Integer number:");
		
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("The Integer is Even");
		}else {
			System.out.println("The Integer is Odd");
		}
		sc.close();
			

	}

}
