package assignments;

public class NumberPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numberPattern(5);
	}

	private static void numberPattern(int n) {
		// TODO Auto-generated method stub
		for(int i=1;i<=n;i++) {
			int dif=n-i;
			for(int j=0;j<i+dif;j++) {
				if(j<dif) {
					System.out.print(" ");
				}else {
				System.out.print(j-dif+1+" ");
				}
			}
			System.out.println("");
		}
	}

}
