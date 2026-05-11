package learningFromClass;

public class CheckPrimeNumber {
	public static void main(String[] args ) {
		System.out.println(checkPrimeNumber(7));
		System.out.println(checkPrimeNumberUsingSqRoot(7));
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
	
	private static boolean checkPrimeNumberUsingSqRoot(int n) {
		// TODO Auto-generated method stub
		
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
