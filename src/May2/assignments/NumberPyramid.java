package assignments;

public class NumberPyramid {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(7);
	}

	private static void pattern(int n) {
		// TODO Auto-generated method stub
		for(int i=1;i<=n;i++) {
			int dif=n-i;
			for(int j=0;j<i+dif;j++) {
				if(j<dif) {
					System.out.print(" ");	
				}
				else {
					System.out.print( i+" ");	
					}
				
			}
			System.out.println("");
		}
	}
}
