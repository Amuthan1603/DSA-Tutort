package assignments;

public class numberPatterRightAngle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(6);
	}

	private static void pattern(int n) {
		// TODO Auto-generated method stub
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

}
