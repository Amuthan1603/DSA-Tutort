package learningFromClass;

public class CheckPrimeNumber {
	public static void main(String[] args ) {
		System.out.println(checkPrimeNumber(8));
	}

	private static boolean checkPrimeNumber(int n) {
		// TODO Auto-generated method stub
		
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
