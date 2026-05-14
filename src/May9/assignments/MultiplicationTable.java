package assignments;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		table(9,10);
	}

	private static void table(int t,int n) {
		// TODO Auto-generated method stub
		for(int i=1;i<=n;i++) {
			int s=i*t;
			System.out.println(i+"X"+t+"="+s);
		}
	}

}
