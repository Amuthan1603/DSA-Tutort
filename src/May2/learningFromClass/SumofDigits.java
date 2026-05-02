package learningFromClass;

public class SumofDigits {
	public static void main(String[] args ) {
		System.out.println(sumOfDigits(54321));
	}

	private static int sumOfDigits(int i) {
		// TODO Auto-generated method stub
		int sum=0;
		while(i>0) {
			int mod=i%10;
			sum=sum+mod;
			i=i/10;
		}
		return sum;
	}

}
