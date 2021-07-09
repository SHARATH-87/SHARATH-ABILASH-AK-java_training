package knightingale;

public class Swap2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float first=2.50f,second=4.50f;
		
		System.out.println("----BEFORE SWAP----");
		System.out.println("First Number= "+first);
		System.out.println("Second Number= "+second);
		
		float tmp=first;
		first=second;
		second=tmp;
		
		System.out.println("----AFTER SWAP----");
		System.out.println("First Number= "+first);
		System.out.println("Second Number= "+second);
		

	}

}
