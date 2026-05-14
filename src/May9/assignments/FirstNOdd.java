package assignments;

public class FirstNOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oddNumbers(10);
	}

	private static void oddNumbers(int n) {
		// TODO Auto-generated method stub
		
		int c=0;
		int i=1;
		while(c<=n) {
			System.out.println(i);
			i=i+2;
			c++;
		}
	}

}
