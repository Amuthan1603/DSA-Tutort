package problems;

public class NextGreaterElementii503 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			nextGreaterElements(new int [] {1,2,3,4,3});
	}
	
	 public static int[] nextGreaterElements(int[] nums) {
	        int[] result = new int[nums.length];
	        for(int i=0;i<nums.length;i++){
	            result[i]=-1;
	            for(int j=1;j<nums.length;j++){
	                int nextIndex = (i + j) % nums.length;
	                if(nums[nextIndex]>nums[i]){
	                    result[i]=nums[nextIndex];
	                    break;
	                }
	            }
	            System.out.println(result[i]);
	        }
	        return result;
	    }

}
