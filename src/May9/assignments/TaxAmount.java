package assignments;

public class TaxAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=40000;
		int tax=a>50000?10:5;
		System.out.println((a*tax)/100);
	}

}
