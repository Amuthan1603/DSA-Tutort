package assignments;

public class ElgibleForMarriage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eligible(21,17);
	}

	private static void eligible(int b, int g) {
		// TODO Auto-generated method stub
		if(b>=21&&g>=18) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}
