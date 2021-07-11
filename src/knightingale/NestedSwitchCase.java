package knightingale;

public class NestedSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=3;
		int c=3;
		
		switch(t) {
		case 1:
			System.out.println("python");
			break;
		case 2 :
			switch(c) {
			case 1:
				System.out.println("J2EE");
				break;
			case 2:
				System.out.println("Advance Java");
			}
		}
		

	}

}
