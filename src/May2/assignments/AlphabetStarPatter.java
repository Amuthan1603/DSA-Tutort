package assignments;

public class AlphabetStarPatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(6);
	}

	private static void pattern(int n) {
		// TODO Auto-generated method stub
		int asci=65;
		for(int i=n;i>0;i--) {
			int dif=n-i;
			for(int j=1;j<=i;j++) {
				char character =  (char) ( asci+dif); 
				System.out.print(character+" ");
			}
			System.out.println("");
		}
	}

}
