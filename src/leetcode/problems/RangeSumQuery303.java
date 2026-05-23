package problems;

public class RangeSumQuery303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumArray(new int[] {-2, 0, 3, -5, 2, -1});
		System.out.println(sumRange(0, 5));
	}
	
	 public static int[] prefixSums;
	public static void NumArray(int[] nums) {
	      prefixSums = new int[nums.length + 1];
	        for (int i = 0; i < nums.length; i++) {
	            prefixSums[i + 1] = prefixSums[i] + nums[i];
	        }   
	    }
	    
	    public static int sumRange(int left, int right) {
	        return prefixSums[right+1]-prefixSums[left];
	    }

}
