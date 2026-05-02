package assignments;

public class NumberStarPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(5);
	}

	private static void pattern(int n) {
		// TODO Auto-generated method stub
		int s=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(s+" ");
				s++;
			}
			System.out.println("");
		}
	}
}
