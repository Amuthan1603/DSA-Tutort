package assignments;

public class NumbericStarPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(5);
	}

	private static void pattern(int n) {
		// TODO Auto-generated method stub
		for(int i=n;i>0;i--) {
			int dif=n-i;
			for(int j=i+dif;j>0;j--) {
				if(j>i) {
					System.out.print(" ");
				}else {
				System.out.print(j);
				}
			}
			System.out.println("");
		}
	}

}
