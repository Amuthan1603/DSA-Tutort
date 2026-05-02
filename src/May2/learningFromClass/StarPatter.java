package learningFromClass;

public class StarPatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(6);
	}

	private static void pattern(int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
