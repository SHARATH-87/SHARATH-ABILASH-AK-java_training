package knightingale;

public class PyramidReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=6;
		for(int i=1;i<=x;i++) {
			for(int j=x;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
