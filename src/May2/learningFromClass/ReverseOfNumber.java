package learningFromClass;

public class ReverseOfNumber {
	public static void main(String[] args ) {
		System.out.println(reverse(54321));
	}

	private static int reverse(int i) {
		// TODO Auto-generated method stub
		int sum=0;
		while(i>0) {
			int mod=i%10;
			sum=sum*10+mod;
			i=i/10;
		}
		return sum;
	}
}
