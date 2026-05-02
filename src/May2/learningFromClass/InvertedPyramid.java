package learningFromClass;

public class InvertedPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(7);
	}

	private static void pattern(int n) {
		// TODO Auto-generated method stub
		for(int i=n;i>0;i=i-2) {
			int dif=n-i;
			for(int j=0;j<i+dif;j++) {
				if(j<dif) {
					System.out.print(" ");
					dif--;
				}else {
					System.out.print("*");	
				}
				
			}
			System.out.println("");
		}
	}

}
