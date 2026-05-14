package assignments;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(6));
	}

	private static int factorial(int n) {
		// TODO Auto-generated method stub
		int sum=1;
		for(int i=1;i<=n;i++) {
			sum=sum*i;
		}
		return sum;
	}

}
