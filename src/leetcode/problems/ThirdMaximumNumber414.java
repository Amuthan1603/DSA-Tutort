package problems;

public class ThirdMaximumNumber414 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(thirdMax(new int[] {1,2,-2147483648}));
	}
	
	 public static int thirdMax(int[] nums) {
		 long m1 = Long.MIN_VALUE, m2 = Long.MIN_VALUE, m3 = Long.MIN_VALUE;
	        for (int n : nums) {
	            if (n == m1 || n == m2 || n == m3) continue;
	            if (n > m1) { m3 = m2; m2 = m1; m1 = n; }
	            else if (n > m2) { m3 = m2; m2 = n; }
	            else if (n > m3) { m3 = n; }
	        }
	        return (int) (m3 == Long.MIN_VALUE ? m1 : m3);
	    }

}
